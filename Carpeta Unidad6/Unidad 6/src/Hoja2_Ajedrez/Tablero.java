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
        
        System.out.println("/********* FINAL *********/");
        verTablero(tablero);
        
        
        
    }// main
/* ------------------------------- Metodos ---------------------------------- */
    public static void verTablero(String tablero[][])
    {
        System.out.println(" 0 1 2 3 4 5 6 7  X*");
        for(int i = 0; i < tablero.length; i++)
        {
            System.out.print(i);
            for(int j = 0; j < tablero.length; j++)
            {
                System.out.print(tablero[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Y*");
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
                figuras[i] = new Alfil(x, y);
                ok = colocarFigura(figuras[i], tablero);
            }while(ok);
        }
        
        for(int i = 3; i < 6; i++) // colocar Torres
        {
            do{
                System.out.println("Figura --------------> "+(i+1));
                System.out.println("Posición una Torre"+" x,y respectivamente: ");
                    x = entrada.nextInt();y = entrada.nextInt();
                figuras[i] = new Torre(x, y);
                ok = colocarFigura(figuras[i], tablero);
            }while(ok);
        }
    }// colocarFiguras
    
    private static boolean colocarFigura(Figura figura,String tablero[][])
    {
        boolean ok = false; // controlar posicion repedita de figuras
        
        if(!tablero[figura.getyCord()][figura.getxCord()].equals("·"))
        {
            ok = true;
            System.out.println("!!!Ese lugar ya ha sido escogido!!!");
        }
        else if(figura instanceof Alfil)
        {
            if(((Alfil) figura).detectorAlfil(tablero))
            {
                tablero[figura.getyCord()][figura.getxCord()]="A";
                ok = false;
            }
            else
            {
                ok = true;
                System.out.println("!!!Cuidado,las fichas se pueden comer!!!"
                        + "\n (Ponla en otro lugar)");
            }
        }
        else if(figura instanceof Torre)
        {
            if(((Torre) figura).detectorTorre(tablero))
            {
                tablero[figura.getyCord()][figura.getxCord()]="T";
                ok = false;
            }
            else
            {
                ok = true;
                System.out.println("!!!Cuidado,las fichas se pueden comer!!!"
                        + "\n (Ponla en otro lugar)");
            }
        }
        
        verTablero(tablero);
        
        return ok;
    }// verTablero
    
    
}// class
