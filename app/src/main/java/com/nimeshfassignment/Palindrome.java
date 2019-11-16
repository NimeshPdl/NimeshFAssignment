package com.nimeshfassignment;

public class Palindrome {


        private int number;

        public int getNumber() {
        return number;
    }

        public void setNumber(int number) {
        this.number = number;
    }

        public Boolean checknumber()
        {
            int palindrome=number;
            int reverse = 0;

            while (palindrome != 0) {
                int remainder = palindrome % 10;
                reverse = reverse * 10 + remainder;
                palindrome = palindrome / 10;
            }

            // if original and reverse of number is equal means
            // number is palindrome in Java
            if (number == reverse) {
                return true;
            }
            return false;

        }
    }