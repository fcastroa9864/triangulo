/*
 * 
 * Encuentra el área de un triángulo rectángulo. 
 * area = 1/2 b*h
 * 
 */
package triangulo;
import javax.swing.*;


/**
 *
 * @author FREDY CASTRO
 */
public class Triangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        // 
        JOptionPane.showMessageDialog(null,"triángulo rectángulo, por favor ingrese valores mayores a 0");
          


        float altura=Float.parseFloat(JOptionPane.showInputDialog("Ingrese altura:"));
        float base=Float.parseFloat(JOptionPane.showInputDialog("Ingrese base:"));
        
        TrianguloClass tri;
        tri = new TrianguloClass(altura,base);
        tri.lados();
        tri.area();
        tri.perimetro();
        
        
        
        
    }
    
}
