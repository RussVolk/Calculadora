
package calculadora;

import javax.swing.JOptionPane;


public class Calculadora {


    public static void main(String[] args) {
        int numero1,numero2,suma,resta,mult,div;
        char operacion;
        numero1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número: "));
        numero2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número: "));
        
        operacion = JOptionPane.showInputDialog("¿Qué operación deseas realizar?").charAt(0);
        
        
        switch (operacion){
            case 'a':
            case 'A':
            case 's':
            case 'S': suma=numero1+numero2;
            JOptionPane.showMessageDialog(null, "La suma es: "+suma);
                    break;
            case'r':
            case'R': resta=numero1-numero2;
            JOptionPane.showMessageDialog(null, "La resta es: "+resta);
                    break;
            case 'm':
            case'M':
            case 'p':
            case 'P': mult=numero1*numero2;
            JOptionPane.showMessageDialog(null, "La multiplicación es: "+mult);
                    break;
            case 'c':
            case 'C':
            case 'd':
            case 'D': div=numero1/numero2;
            JOptionPane.showMessageDialog(null, "La división es: "+div);
                    break;
            default: JOptionPane.showMessageDialog(null, "La operación indicada no se encuentra dentro del catálogo de opciones");
             break;               
        }
    }
    
}
