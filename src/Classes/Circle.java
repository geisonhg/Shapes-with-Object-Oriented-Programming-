/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author geiso
 */
public class Circle extends Figure{
    double radius;
    double diameter;
    double circumference;

    public Circle() {
    }

    public Circle(double radius, double diameter, double circumference) {
        this.radius = radius;
        this.diameter = diameter;
        this.circumference = circumference;
    }

    public Circle(double radius, double diameter, double circumference, String name, double area) {
        super(name, area);
        this.radius = radius;
        this.diameter = diameter;
        this.circumference = circumference;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void calculateArea(){
        this.area=3.141*Math.pow(this.radius, 2);
    }
    
    public void calculateDiameter(){
        this.diameter = this.radius*2;
    }
    
    public void calculateCircumference(){
        this.circumference=3.141*this.radius*2;
    }
    
    
}
