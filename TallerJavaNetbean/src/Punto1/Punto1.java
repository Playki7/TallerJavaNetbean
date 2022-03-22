
package Punto1;




import java.util.Scanner;
import javax.swing.JOptionPane;
public class Punto1 {
    
    public static void main (String[] arg){
     Scanner entrada = new Scanner(System.in);
     
     int A[],B[],C[];
     
     A= new int[10];
     B= new int[10];
     C= new int[10];
     
     
        System.out.println("Digite el codigo de los productos vendidos en el dia");
        for (int i=0;i<10;i++){
            System.out.print ((i+1)+" Digite la cantidad ");
            A[i]=entrada.nextInt();
            
        }
        
        System.out.println("\nDigite el valor de los productos vendidos en el dia");
        for (int i=0;i<10;i++){
            System.out.print ((i+1)+" Digite el valor ");
            B[i]=entrada.nextInt();
            
        }
        
        int j=0;
        for (int i=0;i<10;i++){
            
            C[j]=A[i];
            j++;
            C[j]=B[i];
            j++;
            
        }
     
        System.out.print("\nEl total es : ");
        for (int i=0;i<10;i++){
            System.out.print (C[i]+"");
        }
        System.out.println();
        
        
        
        
    }  
    
}
