/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometric;

import Classes.Square;
import javax.swing.JOptionPane;

/**
 *
 * @author geiso
 */
public class Geometric {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Square cuadrado=new Square();
        cuadrado.setHeight(4);
        cuadrado.setLenght(5);
        cuadrado.calculateArea();
        JOptionPane.showMessageDialog(null, "The area is : " + cuadrado.getArea());
    }
    
}
