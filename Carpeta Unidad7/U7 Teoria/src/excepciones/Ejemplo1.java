package excepciones;

/*
    excepcion o desbordamiento de un array
*/

public class Ejemplo1 
{
    public static void main(String[] args) 
    {
        try
        {
            int a[] = new int[5];

            for(int i = 0; i <= a.length; i++)
            {
                a[i] = i;
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array fuera de rango");
        }
        
        
        
        
        
    }// main
/* ---------------------------- Constructores --------------------------------*/    

/* ------------------------------- Metodos ---------------------------------- */
}//class
