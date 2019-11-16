package com.nimeshfassignment;

public class Circle {

    private float radius;
    private float number;


    public Circle(float radius,float number)
    {
        this.radius=radius;
        this.number=number;
    }

    public float area()
    {
        return radius*number;
    }
}
