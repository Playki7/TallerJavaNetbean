
package Punto2;

import java.util.Scanner;


public class Punto2 {
    public static void main(String[] args) {

int numeroCuenta;               
double saldoInicio;               
double depositos;               
double deduccionesApli;               
double limiteCredito;               
                
                
Scanner entrada = new Scanner(System.in);            
                
System.out.println("\nPor favor introduzca el numero de cuenta del cliente o -1 para terminar: \n");   
numeroCuenta = entrada.nextInt();              
                
while ( -1 != numeroCuenta)            
{           
System.out.println("\nPor favor introduzca el saldoInicial: \n");           
saldoInicio = entrada.nextDouble();              
                
System.out.println("\nPor favor introduzca los depositos hechos por el cliente: \n");       
depositos = entrada.nextDouble();              
                
System.out.println("\nPor favor introduzca los cargos hechos al cliente: \n");        
deduccionesApli = entrada.nextDouble();              
                
System.out.println("\nPor favor introduzca el limite de credito para el cliente: \n");      
limiteCredito = entrada.nextDouble();              
                
                
         
System.out.println("\nEl credito se ha excedido.");            
                
System.out.println("\nPor favor introduzca el numero de cuenta del cliente o -1 para terminar: \n");   
numeroCuenta = entrada.nextInt();              
                
}          
}            
                
public double Retorna( double saldoInic, double pagos, double cargos)        
{             
return saldoInic + pagos - cargos;           

    }
    
}
