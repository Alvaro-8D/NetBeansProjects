package P1_MUS;


public class Partida {
    public static void main(String[] args) 
    {
        Carta baraja[] = new Carta[40];
        Jugador jugadores[] = new Jugador[4];
        
        crearBaraja(baraja); // crea la baraja de cartas
        invitarJugadores(jugadores, baraja); // crea a los jugadores
        repartirCartas(baraja);
        
        
        jugadores[0].espiarJugador(); // ponder un "for()" aqui
        jugadores[1].espiarJugador();
        jugadores[2].espiarJugador();
        jugadores[3].espiarJugador();
        
        //verBaraja(baraja);
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
    
}// class
