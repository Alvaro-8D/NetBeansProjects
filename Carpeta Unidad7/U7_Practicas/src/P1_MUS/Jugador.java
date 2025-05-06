package P1_MUS;


public class Jugador {
    
    private String nombre;
    private Carta mano[] = new Carta[4]; // mano de 4 cartas
    // Puntucacion "juego"
    private String juego1 = "no"; // si / no
    private int    juego2; // 31 a 40
    // Puntucacion "pares"
    private String pares1 = "no"; // si / no
    private String pares2; // par / medias / duples
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
            if(numsFicticios[j] == 2)
            {
                cuentaParejas ++;
                if(cuentaParejas == 2)
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
            else if((numsFicticios[j] == 3)||(numsFicticios[j] == 4))
            {
                pares2 = "medias";
                pares1 = "si";
            }
        }
    }// calularPares
    
    public void calularJuego()
    {
        for(int i = 0; i < mano.length; i++)
        {
            juego2 += mano[i].getValor();
            System.out.println(">Cuenta Puntos ("+nombre+"): "+juego2);
        }
        if(juego2 >= 31)
            juego1 = "si";

    }// calularJuego
    
    public void espiarJugador()
    {
        System.out.println("");
        System.out.println("Jugador --> "+nombre+" <--");
        for(int i = 0; i < mano.length; i++)
            System.out.println("+ "+mano[i].getNombre());
        
        if(juego2 >= 31)
            System.out.println("Juego: "+juego1+" "+juego2);
        else
            System.out.println("Juego: "+juego1);
        
        if(pares2 == null)
            System.out.println("Pares: "+pares1);  
        else
            System.out.println("Pares: "+pares1+" "+pares2);
    }// espiarJugador

}// class
