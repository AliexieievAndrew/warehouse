package com.example.warehouse.service.documentservice;

import com.example.warehouse.dto.DetailDTO;
import com.example.warehouse.entity.Detail;
import com.example.warehouse.entity.Document;
import com.example.warehouse.entity.DocumentType;
import com.example.warehouse.entity.Item;
import com.example.warehouse.repository.DocumentRepository;
import com.example.warehouse.repository.DocumentTypeRepository;
import com.example.warehouse.repository.ItemRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

@Service
public class DocumentService implements IDocumentService {

    @Autowired
    private DocumentRepository documentRepository;

    @Autowired
    private DocumentTypeRepository documentTypeRepository;

    @Autowired
    private ItemRepository itemRepository;

    @Override
    public Iterable<Document> findAll() {
        return documentRepository.findAll();
    }

    @Override
    public Document getById(int id) {
        return documentRepository.findById(id);
    }

    @Override
    public Iterable<Document> findAllByDocumentTypeId(int id){
        return documentRepository.findAllByDocumentTypeId(id);
    }

    @Override
    public double calcDebitByDocument(Document document){
        return document
                .getDetails()
                .stream()
                .mapToInt(detail -> detail.getDebit())
                .sum();
    }

    @Override
    public double calcCreditByDocument(Document document){
        return document
                .getDetails()
                .stream()
                .mapToInt(detail -> detail.getCredit())
                .sum();
    }

    @Override
    public double calcTotalPrice(Document document) {
        if(document.getDocumentType().equals("outcome invoice"))
            return 0;

        return document
                .getDetails()
                .stream()
                .mapToDouble(detail -> detail.getPrice() * detail.getDebit())
                .sum();
    }

    @Override
    public void createIncomeInvoice(List<DetailDTO> detailsDTO) {

        Document document = new Document();
        document.setDocumentType(documentTypeRepository.findById(1));

        processDocument(detailsDTO,document);
    }


    @Override
    public void createOutcomeInvoice(List<DetailDTO> detailsDTO) {
        Document document = new Document();
        document.setDocumentType(documentTypeRepository.findById(2));

        processDocument(detailsDTO,document);
    }

    private void processDocument(List<DetailDTO> detailsDTO, Document document) {
        document.setDate(OffsetDateTime.now());

        Set<Detail> details = detailsDtoToEntity(detailsDTO);
        details.forEach(detail -> detail.setDocument(document));
        document.setDetails(details);

        documentRepository.save(document);
    }

    private Set<Detail> detailsDtoToEntity(List<DetailDTO> details) {
        List<Item> itemList = itemRepository.findAll();
        Map<String,Item> itemMap =
                itemList
                        .stream()
                        .collect(Collectors.toMap(Item::getName, item -> item));

        return details.stream().map(dto -> detailDtoToEntity(dto,itemMap)).collect(Collectors.toSet());
    }

    private Detail detailDtoToEntity(DetailDTO dto, Map<String,Item> itemMap) {
        ModelMapper mapper = new ModelMapper();
        Detail detail = mapper.map(dto, Detail.class);
        detail.setItem(itemMap.get(dto.getItem()));
        return detail;
    }
}