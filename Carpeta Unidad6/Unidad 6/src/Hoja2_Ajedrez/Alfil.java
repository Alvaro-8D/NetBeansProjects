package Hoja2_Ajedrez;


public class Alfil extends Figura {
   /* atributos para no comer a otras figuras */
    private boolean upL = true;    // arriba izquierda
    private boolean upR = true;    // arriba derecha
    private boolean downL = true;  // abajo izquierda
    private boolean downR = true;  // abajo derecha

/* ---------------------------- Constructores --------------------------------*/    
    public Alfil(int xCord, int yCord) {
        super(xCord, yCord);
    }
/* ------------------------------- Metodos ---------------------------------- */
    public void upL_Check(String tablero[][])// si Funciona
    {
        // (a1,a2)>(y,x)
        int a1 = getyCord() - 1;    int a2 = getxCord() - 1;  
        
        while((a1 >= 0)&&(a2 >= 0))
        {
            if(!(tablero[a1][a2].equals("·")))
                setUpL(false);
            
            a1 --;  a2 --;
        }
        
    }// upL_Check
    
    /* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
    public void upR_Check(String tablero[][])// si Funciona
    {
        // (a1,a2)>(y,x)
        int a1 = getyCord() - 1;    int a2 = getxCord() + 1;  
        
        while((a1 >= 0)&&(a2 <= 7))
        {
            if(!(tablero[a1][a2].equals("·")))
                setUpR(false);
            
            a1 --;  a2 ++;
        }
        
    }// upR_Check
    
    /* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
    public void downL_Check(String tablero[][])// si Funciona
    {
       // (a1,a2)>(y,x)
        int a1 = getyCord() + 1;    int a2 = getxCord() - 1;  
        
        while((a2 >= 0)&&(a1 <= 7))
        {
            if(!(tablero[a1][a2].equals("·")))
                setDownL(false);
            
            a1 ++;  a2 --;
        }
        
    }// downL_Check
    
    /* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
    public void downR_Check(String tablero[][])// si Funciona
    {
        // (a1,a2)>(y,x)
        int a1 = getyCord() + 1;    int a2 = getxCord() + 1;  
        
        while((a1 <= 7)&&(a2 <= 7))
        {
            if(!(tablero[a1][a2].equals("·")))
                setDownR(false);
            
            a1 ++;  a2 ++;
        }
        
    }// downR_Check

    public boolean detectorAlfil(String tablero[][])
    {
        upR_Check(tablero);
        upL_Check(tablero);
        downR_Check(tablero);
        downL_Check(tablero);
        
        boolean ok = false;
        
        if(upR&&downR&&upL&&downL)
            ok = true;
        
        return ok;
    }// detectorAlfil
    
    public void setUpL(boolean upL) {
        this.upL = upL;
    }

    public void setUpR(boolean upR) {
        this.upR = upR;
    }

    public void setDownL(boolean downL) {
        this.downL = downL;
    }

    public void setDownR(boolean downR) {
        this.downR = downR;
    }

    public boolean isUpL() {
        return upL;
    }

    public boolean isUpR() {
        return upR;
    }

    public boolean isDownL() {
        return downL;
    }

    public boolean isDownR() {
        return downR;
    }
    
    
}// class
