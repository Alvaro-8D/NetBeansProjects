package P1_MUS;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Partida {
    public static void main(String[] args) 
    {
        
        
        Carta baraja[] = new Carta[40]; // guarda todas las cartas
        Jugador jugadores[] = new Jugador[4]; // guarda todos los jugadores
        
        crearBaraja(baraja); // crea la baraja de cartas
        invitarJugadores(jugadores, baraja); // crea a los jugadores
        
        for(int i = 0; i < jugadores.length; i++)
            jugadores[i].espiarJugador(); // visualiza el juego de cada jugador
        
        leerArchivo("c:/ficheros/salida.txt");
    }// main
/* ------------------------------- Metodos ---------------------------------- */
    private static void verBaraja(Carta baraja[])
    {
        for(int i = 0; i < baraja.length; i++)
        {
            System.out.println(baraja[i].toString());
            System.out.println("");
        }
    }// verBaraja
    
    private static void crearBaraja(Carta baraja[])
    {
        String palos[] = {"Oros","Copas","Espadas","Bastos"};
        int j = 0; int num1 = 0; String num2;
        
        for(int i = 0; i < baraja.length; i++)// crear baraja de cartas
        {
            num2 = (i+1)+"";
            if((i+1)%10 == 0)
                num1 = 10;
            else
                num1 = Integer.parseInt(num2.substring(num2.length()-1)) ;
            baraja[i]= new Carta(palos[j], num1);
            if(((i+1)%10 == 0)&& j < palos.length)
                j ++;
        }  
    }// crearBaraja
    
    private static void invitarJugadores(Jugador jugadores[],Carta baraja[])
    {
        for(int i = 0; i < jugadores.length; i++)// crear baraja de cartas
        {
            Carta cuatroCartas[] = repartirCartas(baraja);
            jugadores[i] = new Jugador("JUGADOR "+(i+1), cuatroCartas);
            jugadores[i].calularJuego();
            jugadores[i].calularPares();
        }
    }// invitarJugadores
    
    private static Carta[] repartirCartas(Carta baraja[])
    {
        Carta cuatroCartas[] = new Carta[4];
        boolean ok; // variable para contro al bucle
        for(int i = 0; i < 4; i++)// crear baraja de cartas
        {
            do{
                ok = true;
                int num = (int)(Math.random()*baraja.length);
                if(!baraja[num].isRepartida())
                {
                    cuatroCartas[i] = baraja[num];
                    baraja[num].setRepartida(true);
                    ok = false;
                }
            }while(ok);
        }
        return cuatroCartas;
    }// repartirCartas
    
    private static void leerArchivo(String directArchivo)
    {
        FileReader fr = null;
        try {
            fr = new FileReader(directArchivo);
            BufferedReader entrada = new BufferedReader(fr);
            String cadena = entrada.readLine();    //se lee la primera línea del fichero
            while (cadena != null) 
            {                                      //mientras no se llegue al final del fichero                   
                System.out.println(cadena);        //se nuestra por pantalla
                cadena = entrada.readLine();       //se lee la siguiente línea del fichero                        
            }
        } 
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
            try {
                if (fr != null) 
                    fr.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());                                                               
            }
        }
    }// leerArchivo
    
}// class
