package com.codewithrohan.shape;

class Shape{
    int dim1,dim2;
    Shape(int dim1,int dim2){
        this.dim1 =dim1;
        this.dim2 =dim2;
    }

    public int getDim1() {
        return this.dim1;
    }

    public int getDim2() {
        return this.dim2;
    }

    public void setDim1(int dim1) {
        this.dim1 = dim1;
    }

    public void setDim2(int dim2) {
        this.dim2 = dim2;
    }
}
class Rectangle extends Shape{
    Rectangle(int dim1,int dim2){
        super(dim1,dim2);
    }
    public int area(){
        return this.dim1*this.dim2;
    }
}

class Square extends Shape{
    Square(int dim1){
        super(dim1,-1);
    }
    public int area(){
        return this.dim1*this.dim1;
    }
}

class Circle extends Shape{
    Circle(int dim1){
        super(dim1,-1);
    }
    public double area(){
        return Math.PI*this.dim1*this.dim1;
    }
}
class Cylinder extends Shape{
    Cylinder(int dim1,int dim2){
        super(dim1,dim2);
    }
    public double area(){
        return 2*Math.PI*this.dim1*(this.dim2 + this.dim1);
    }
}

class Sphere extends Shape{
    Sphere(int dim1){
        super(dim1,-1);
    }
    public double area(){
        return 4*Math.PI*this.dim1*this.dim1;
    }
}
/*
Write this code in  Notepad!!!
you have to create a package named com.codewithrohan.shape
This package should have individual classes for Rectangle, Square, Circle,
Cylinder, Sphere. These classes should use inheritance to properly manage
the code! Include methods like volume,surface area and getters/setters
for dimensions.
 */

public class CWH_CH12_46_CustomPackage {
    public static void main(String[] args) {

    }
}
