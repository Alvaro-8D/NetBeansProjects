package excepciones;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ejemplo2 
{
    // Java program to demonstrate
    // FileNotFoundException
    
    public static void main(String args[])
    {
        try 
        {

                // Following file does not exist
                File file = new File("C:/prueba/kkkprueba.txt");

                FileReader fr = new FileReader(file);
        }
        catch (FileNotFoundException e) 
        {
                System.out.println("File does not exist");
        }
    }
/* ---------------------------- Constructores --------------------------------*/    

/* ------------------------------- Metodos ---------------------------------- */

}//class
