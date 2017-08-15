/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo;
import javax.swing.*;
import java.util.Scanner;

/**
 *
 * @author FREDY CASTRO
 */
public class TrianguloClass {
    private float base,altura,hipo,area,perimetro;
   
    public TrianguloClass(){
        this(0,0); 
    }
    public TrianguloClass(float valor_base, float valor_altura){
        if (valor_base > 0 && valor_altura > 0){
            
            base = valor_base;
            altura = valor_altura;
           
            area = 0;
            perimetro = 0;
            hipo =0;
            
        }else{ 
        }
    }
    public void lados(){
             
                
        hipo = (float) Math.pow(base, 2) + (float) Math.pow(altura, 2);
        hipo = (float) Math.sqrt(hipo);
                
        JOptionPane.showMessageDialog(null,"Base: "+base+"  Altura:"+altura+"  Hipotenusa:"+hipo);
        
        
        
        
    }
    public void area(){
        area = (base * altura) / 2;
        JOptionPane.showMessageDialog(null,"area: "+area);
        
        
    }
    public void perimetro(){
        perimetro = base + altura + hipo; 
        JOptionPane.showMessageDialog(null,"perímetro: "+perimetro);
        
    }
      
}
