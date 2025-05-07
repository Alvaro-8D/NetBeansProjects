package P1_MUS;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Jugador {

    private String nombre;
    private Carta mano[] = new Carta[4]; // mano de 4 cartas
    // Puntucacion "juego"
    private String juego1 = "no"; // si / no
    private int    juego2; // 31 a 40
    // Puntucacion "pares"
    private String pares1 = "no"; // si / no
    private String pares2; // par / medias / duples
    // "numJugadores" para guardar todos los jugadores en el fichero
    private static int numJugadores = 0; 
/* ---------------------------- Constructores --------------------------------*/    
    public Jugador(String nombre,Carta mano[]) {
        this.nombre = nombre;
        this.mano = mano;
    }
/* ------------------------------- Metodos ---------------------------------- */
    public void calularPares()
    {
        int numsFicticios[] = new int[13]; 
        int cuentaParejas = 0; // cuenta parejas para los "duples"
       
        for(int i = 0; i < mano.length; i++)
            numsFicticios[mano[i].getNumeroFicticio()] += 1;
        
        for(int j = 0; j < numsFicticios.length; j++)
        {
            if((numsFicticios[j] == 2)||(numsFicticios[j] == 4))
            {
                cuentaParejas ++;
                if((cuentaParejas == 2)||(numsFicticios[j] == 4))
                {
                    pares2 = "duples"; 
                    pares1 = "si";
                }
                else if(cuentaParejas == 1)
                {
                    pares2 = "par";
                    pares1 = "si";
                }
            }
            else if(numsFicticios[j] == 3)
            {
                pares2 = "medias";
                pares1 = "si";
            }
        }
    }// calularPares
    
    public void calularJuego()
    {
        for(int i = 0; i < mano.length; i++)
            juego2 += mano[i].getValor();
        
        if(juego2 >= 31)
            juego1 = "si";

    }// calularJuego
    
    public void espiarJugador()
    {
        FileWriter fw = null;
        try 
        {
            if(numJugadores == 0) // borra el fichero para sobreescribirlo
                fw = new FileWriter("c:/ficheros/salida.txt");
            else
                fw = new FileWriter("c:/ficheros/salida.txt",true);
            
            PrintWriter salida = new PrintWriter(fw);
            salida.flush();
            
            salida.println("##################################");
            salida.println("Jugador --> "+nombre+" <--"); 
            numJugadores++; // para guardar todos los jugadores en el fichero
            
            for(int i = 0; i < mano.length; i++)
                salida.println("+ "+mano[i].getNombre());

            if(juego2 >= 31)
                salida.println("Juego: "+juego1+" "+juego2);
            else
                salida.println("Juego: "+juego1);

            if(pares2 == null)
                salida.println("Pares: "+pares1);  
            else
                salida.println("Pares: "+pares1+" "+pares2);
            
            salida.flush();
        } 
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());                                                                   
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
            try {
                if ((fw != null)&&(numJugadores >= 4)) 
                    fw.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());                                                               
            }
        }
    }// espiarJugador

}// class
