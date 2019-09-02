package com.thoughtworks.split.expenses;

import java.util.List;

/**
 * This class has following state and behaviour which help to split expenses equal
 *
 * #state#
 * @param payerName
 * @param amount
 * @param grouplist
 * @param payerPartOfExpenses
 *
 * #behaviour#
 * checkSpendDetail
 * checkIfPayerIsMember
 * settelAccount
 */
public class SplitExpenses {

    private String payerName;
    private float amount;
    private List<String> groupList;
    private boolean payerPartOfExpense = false;

    public SplitExpenses(String payerName, boolean payerPartOfExpense, float amount, List<String> groupList) {
        this.payerPartOfExpense = payerPartOfExpense;
        this.payerName = payerName;
        this.amount = amount;
        this.groupList = groupList;
    }

    public float checkSpendDetail() {

        List<String> totalMember = groupList;
        float amountToBePaid = 0.0f;

        if (checkIfPayerIsMember() && (!payerPartOfExpense)) totalMember.remove(payerName);


        if (amount == 0) return amountToBePaid;

        amountToBePaid = amount / totalMember.size();


        settleAccount(amountToBePaid);
        return amountToBePaid;
    }

    public boolean checkIfPayerIsMember() {

        boolean ifPayerIsMember = false;
        if (groupList.contains(payerName)) ifPayerIsMember = true;

        return ifPayerIsMember;

    }

    public boolean settleAccount(float amountToBePaid) {
        for (String person : groupList) {
            System.out.println(person + " should be paying " + amountToBePaid + " to " + payerName);
        }
        return true;
    }
}
