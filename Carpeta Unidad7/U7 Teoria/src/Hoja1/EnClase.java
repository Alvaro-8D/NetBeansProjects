package Hoja1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;



public class EnClase 
{
    public static void main(String[] args) 
    {
        // "C:\ejemplos\javi.txt"
        try
        {
            String frase;
            
            FileReader lectur = new FileReader("C:\\ejemplos\\javi.txt");
        
            BufferedReader entrada = new BufferedReader(lectur);
            
            frase = entrada.readLine();
            System.out.println(frase);
            
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        catch(RuntimeException e)
        {
            System.out.println(e.getMessage());
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        
        
        
        
    }// main
/* ------------------------------- Metodos ---------------------------------- */


}//class
