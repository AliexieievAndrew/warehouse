package com.example.warehouse.dto;

import com.example.warehouse.entity.Item;

public class Balance {

    private Item item;
    private long debit;
    private long credit;
    private int balance;

    public Balance() {
    }

    public Balance(Item item, long debit, long credit) {
        this.item = item;
        this.debit = debit;
        this.credit = credit;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public long getDebit() {
        return debit;
    }

    public void setDebit(long debit) {
        this.debit = debit;
    }

    public long getCredit() {
        return credit;
    }

    public void setCredit(long credit) {
        this.credit = credit;
    }

    public long getBalance() {
        return debit - credit;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Balance{" +
                "item=" + item.getName() +
                ", debit=" + debit +
                ", credit=" + credit +
                ", balance=" + balance +
                '}';
    }
}
