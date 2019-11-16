package com.nimeshfassignment;

public class ReverseClass {
    private int n;

    public void setN(int n) {
        this.n = n;
    }

    public int reversenumber()
    {
        int reversed=0;
        int num = n;
        for(;num != 0; num /= 10) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }
        return reversed;
    }
}
