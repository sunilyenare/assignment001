package com.thoughtworks.split.expenses;

import java.util.List;

public class SplitExpenses {

    private String payerName;
    private float amount;
    private List<String> groupList;

    public SplitExpenses(String payerName, float amount, List<String> groupList) {

        this.payerName = payerName;
        this.amount = amount;
        this.groupList = groupList;
    }

    public float spendDetail() {

        List<String> totalMember = groupList;
        float amountToBePaid = 0.0f;
        int dividableCount = totalMember.size();

        if (amount == 0) return amountToBePaid;

        amountToBePaid = amount / dividableCount;

        if (checkIfPayerIsMember()) totalMember.remove(payerName);

        return amountToBePaid;
    }

    public boolean checkIfPayerIsMember() {

        boolean ifPayerIsMember = false;
        if (groupList.contains(payerName)) ifPayerIsMember = true;

        return ifPayerIsMember;

    }
}
