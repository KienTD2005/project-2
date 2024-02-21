package com.csc205.project2;

public class Pyramid extends Shape{
    private double height;
    private double base;

    public Pyramid(){
        super();
        this.height = 0.0;
        this.base = 0.0;
    }
    public Pyramid(double height, double base) {
        super();
        this.height = height;
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBase(double base) {
        this.base = base;
    }
    @Override
    public double surfaceArea() {
        return (4 * base * height) + (Math.sqrt(3) / 4 * base * height * height);
    }

    @Override
    public double volume() {
        return (base * height) / 3;
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder("Pyramid {");
        sb.append("height = ").append(height);
        sb.append(", base = ").append(base);
        sb.append(", surface area = ").append(surfaceArea());
        sb.append(", volume = ").append(volume());
        sb.append('}');
        return sb.toString();

    }
}

/* I used AI Tabnine to help with creating methods like SurfaceArea and Volume.
I used this statement: Design a 3D Pyramid class
The only thing I might change is the formula and the toString() method.
 */