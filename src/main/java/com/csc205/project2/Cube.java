package com.csc205.project2;

public class Cube extends Shape{
    private double width;

    public Cube(){
        super();
        width = 0.0;
    }

    public Cube(double w){
        super();
        this.width = w;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }
    public double surfaceArea(){
        return 6.0 * Math.pow(width, 2.0); // six faces of a cube * the surface area (a square).
    }

    public double volume(){
        return Math.pow(width, 3.0);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cube {");
        sb.append("width = ").append(width);
        sb.append(", surface area = ").append(surfaceArea());
        sb.append(", volume = ").append(volume());
        sb.append('}');
        return sb.toString();
    }
}
