package com.nimeshfassignment;

public class SwapClass {
    private int x;
    private int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String swapnumber()
    {
        x = x ^ y; // x now becomes 15 (1111)
        y = x ^ y; // y becomes 10 (1010)
        x = x ^ y; // x becomes 5 (0101)
        return "After swap: x = "
                + x + ", y = " + y;
    }

}
