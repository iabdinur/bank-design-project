package com.iabdinur.bankDesignProject;

public class CheckingAccount extends Account{
    private int nextCheckNumber;
    public int getNextCheckNumber(){
        nextCheckNumber = nextCheckNumber + 1;
        return nextCheckNumber;
    }
}
