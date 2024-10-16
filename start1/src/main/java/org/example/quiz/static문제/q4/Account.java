package org.example.quiz.static문제.q4;

public class Account {
    private int accountId;
    private String owner;
    private int balance;


    public Account(int accountId, String owner, int balance) {
        this.accountId = accountId;
        this.owner = owner;
        this.balance = balance;
    }

    public int getAccountId() {
        return accountId;
    }

    @Override
    public String toString() {
        return  "계좌번호 : " + accountId +
                ", 소유자 : " + owner + '\'' +
                ", 잔액 : " + balance +
                '}';
    }
}
