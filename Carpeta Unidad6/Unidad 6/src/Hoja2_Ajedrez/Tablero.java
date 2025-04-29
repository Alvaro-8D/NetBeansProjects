package Hoja2_Ajedrez;

import java.util.Scanner;


public class Tablero {
    public static void main(String[] args) 
    {
        String tablero[][] = new String[8][8];
        Figura figuras[]= new Figura[6];
        
        for(int i = 0; i < tablero.length; i++)
            for(int j = 0; j < tablero.length; j++)
                tablero[i][j] = "·";
        
        verTablero(tablero);
        preguntarFiguras(tablero,figuras);
        verTablero(tablero);
        
    }// main
/* ------------------------------- Metodos ---------------------------------- */
    private static void verTablero(String tablero[][])
    {
        System.out.println(" 0 1 2 3 4 5 6 7");
        for(int i = 0; i < tablero.length; i++)
        {
            System.out.print(i);
            for(int j = 0; j < tablero.length; j++)
            {
                System.out.print(tablero[i][j]+" ");
            }
            System.out.println("");
        }
    }// verTablero
    
    private static void preguntarFiguras(String tablero[][],Figura figuras[])
    {
        Scanner entrada = new Scanner(System.in);
        
        int x = 0;int y = 0;boolean ok = false;
        
        for(int i = 0; i < 3; i++) // colocar Alfiles
        {
            do{
                System.out.println("Figura --------------> "+(i+1));
                System.out.println("Posición de un Alfil"+" x,y respectivamente: ");
                    x = entrada.nextInt();y = entrada.nextInt();
                figuras[i] = new Alfil(y, x);
                ok = colocarFigura(figuras[i], tablero);
            }while(ok);
        }
        
        for(int i = 3; i < 6; i++) // colocar Torres
        {
            do{
                System.out.println("Figura --------------> "+(i+1));
                System.out.println("Posición una Torre+"+" x,y respectivamente: ");
                    x = entrada.nextInt();y = entrada.nextInt();
                figuras[i] = new Torre(y, x);
                ok = colocarFigura(figuras[i], tablero);
            }while(ok);
        }
    }// colocarFiguras
    
    private static boolean colocarFigura(Figura figura,String tablero[][])
    {
        boolean ok = false; // controlar posicion repedita de figuras
        
        if(!tablero[figura.getxCord()][figura.getyCord()].equals("·"))
        {
            ok = true;
            System.out.println("!!!Ese lugar ya ha sido escogido!!!");
        }
        else if(figura instanceof Alfil)
        {
            tablero[figura.getxCord()][figura.getyCord()]="A";
            ok = false;
        }
        else
        {
            tablero[figura.getxCord()][figura.getyCord()]="T";
            ok = false;
        }
        return ok;
    }// verTablero
    
    
}// class
