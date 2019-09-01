package com.thoughtworks.split.expenses;

import java.util.List;

public class SplitExpenses {

    private String payer;
    private float amount;
    private List<String> groupList;

    public SplitExpenses(String payer, float amount, List<String> groupList) {

        this.payer = payer;
        this.amount = amount;
        this.groupList = groupList;
    }

    public float spendDetail() {
        List<String> totalMember = groupList;

        float amountToBePaid = 0.0f;
        int dividableCount = totalMember.size();

        if (amount == 0) return amountToBePaid;

        amountToBePaid = amount / dividableCount;
        boolean ifPayerIsMember = checkIfPayerIsMember();
        return amountToBePaid;
    }

    public boolean checkIfPayerIsMember() {

        boolean ifPayerIsMember = false;
        if (groupList.contains(payer)) ifPayerIsMember = true;

        return ifPayerIsMember;

    }
}
