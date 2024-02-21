package com.csc205.project2;

public class Cylinder extends Shape{
    private double radius;
    private double height;
    public Cylinder(){
        super();
        this.radius = 0.0;
        this.height = 0.0;
    }
    public Cylinder(double r, double h){
        super();
        this.radius = r;
        this.height = h;
    }

    public double getHeight(){
        return height;
    }

    public double getRadius(){
        return radius;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double surfaceArea(){
        return 2.0 * Math.PI * radius * (height + radius);
    }

    public double volume(){
        return Math.PI * Math.pow(radius, 2.0) * height;
    }

    public String toString(){
        final StringBuilder sb = new StringBuilder("Cylinder {");
        sb.append("radius = ").append(radius);
        sb.append(", height = ").append(height);
        sb.append(", surfaceArea = ").append(surfaceArea());
        sb.append(", volume = ").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
