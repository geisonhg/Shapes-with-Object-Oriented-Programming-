/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Classes.Figure;

/**
 *
 * @author geiso
 */
public class Square extends Figure{
    public double lenght;
    public double height;

    public Square(double lenght, double height) {
        this.lenght = lenght;
        this.height = height;
    }

    public Square(double lenght, double height, String name, double area) {
        super(name, area);
        this.lenght = lenght;
        this.height = height;
    }

    public Square() {
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void calculateArea() {
        this.area=this.lenght*this.height;
    }
    
    
}
