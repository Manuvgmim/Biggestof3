/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activity1_biggerof3;

import java.util.Scanner;

/**
 *
 * @author alumnot
 */
public class Activity1_biggerof3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int big;
                 
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Write a number");
        int variable_1 = scanner.nextInt();
        
        System.out.println("Write a second number");
        int variable_2 = scanner.nextInt();
        
        
        System.out.println("Write the thrid number");
        int variable_3 = scanner.nextInt();
               
        //He cambiado el variable_1 == variable_3 por un > para que el if funcione
        if(variable_1 > variable_2 && variable_1 > variable_3){
            big= variable_1;
            
            System.out.println("The biggest number is: " + big);
//He borrado el segundo y lo he juntado con el primero porque no servia ninguno de los dos            
        }else if(variable_2 > variable_1 && variable_2 > variable_3){
            big= variable_2;
            
            System.out.println("The biggest number is:" + big );
        
                
        //He borrado el segundo y lo he juntado con el primero porque no servia ninguno de los dos y he puesto que la variable_1 debe ser menor que la variable_2    
        }else if(variable_3 > variable_2 && variable_1 <  variable_2){
            big= variable_3;
            
                    
            System.out.println("The biggest number is:" + big);        
        //Y he creado este if para que si cabe la opcion de que todos sean iguales te lo ponga por pantalla    
        }else{
            System.out.println("All the numbers are equals");
                
                
        
            
    }
    }
    
}
