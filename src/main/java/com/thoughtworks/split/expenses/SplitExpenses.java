package com.thoughtworks.split.expenses;

import java.util.List;

public class SplitExpenses {

    private String payer;
    private double amount;
    private List<String> groupList;

    public SplitExpenses(String payer, double amount, List<String> groupList) {

        this.payer=payer;
        this.amount=amount;
        this.groupList=groupList;
    }

    public double spendDetail() {
        return amount= amount/groupList.size();
    }
}
