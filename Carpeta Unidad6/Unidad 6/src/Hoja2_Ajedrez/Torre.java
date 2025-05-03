package Hoja2_Ajedrez;


public class Torre extends Figura{
  /* atributos para no comer a otras figuras */
    private boolean up = true;    // arriba 
    private boolean down = true;  // abajo
    private boolean left = true;  // izquierda
    private boolean right = true; // derecha
    
    /* atributos para no ser comido por alfiles */
    private boolean upL = true;    // arriba izquierda
    private boolean upR = true;    // arriba derecha
    private boolean downL = true;  // abajo izquierda
    private boolean downR = true;  // abajo derecha
/* ---------------------------- Constructores --------------------------------*/    
    public Torre(int xCord, int yCord) {
        super(xCord, yCord);
    }
/* ------------------------------- Metodos ---------------------------------- */
    public void up_Check(String tablero[][])// si Funciona
    {
        // (a1,a2)>(y,x)
        int a1 = getyCord() - 1;    int a2 = getxCord();  
        
        while(a1 >= 0)
        {
            if(!(tablero[a1][a2].equals("·")))
                setUp(false);
            
            a1 --;
        }
        
    }// up_Check
    
    /* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
    public void down_Check(String tablero[][])// si Funciona
    {
        // (a1,a2)>(y,x)
        int a1 = getyCord() + 1;    int a2 = getxCord();  
        
        while(a1 <= 7)
        {
            if(!(tablero[a1][a2].equals("·")))
                setDown(false);
            
            a1 ++;
        }
        
    }// down_Check
    
    /* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
    public void left_Check(String tablero[][])// si Funciona
    {
       // (a1,a2)>(y,x)
        int a1 = getyCord();    int a2 = getxCord() - 1;  
        
        while(a2 >= 0)
        {
            if(!(tablero[a1][a2].equals("·")))
                setLeft(false);
            
            a2 --;
        }
        
    }// left_Check
    
    /* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * */
    public void right_Check(String tablero[][])// si Funciona
    {
        // (a1,a2)>(y,x)
        int a1 = getyCord();    int a2 = getxCord() + 1;  
        
        while(a2 <= 7)
        {
            if(!(tablero[a1][a2].equals("·")))
                setRight(false);
            
            a2 ++;
        }
        
    }// right_Check
    
    public boolean detectorTorre(String tablero[][])
    {
        up_Check(tablero);
        right_Check(tablero);
        down_Check(tablero);
        left_Check(tablero);
        
        boolean ok = false;
        
        if(up&&down&&left&&right&&detectorAlfil(tablero))
            ok = true;
        
        return ok;
    }// detectorTorre
    
/* ********************** Metodos para Detectar Alfiles ********************* */
    
    public void upL_Check(String tablero[][])// si Funciona
    {
        // (a1,a2)>(y,x)
        int a1 = getyCord() - 1;    int a2 = getxCord() - 1;  
        
        while((a1 >= 0)&&(a2 >= 0))
        {
            if((tablero[a1][a2].equals("A")))
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
            if((tablero[a1][a2].equals("A")))
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
            if((tablero[a1][a2].equals("A")))
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
            if((tablero[a1][a2].equals("A")))
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
    
/* ********************** Metodos para Detectar Alfiles ********************* */
    
    public void setUp(boolean up) {
        this.up = up;
    }

    public void setDown(boolean down) {
        this.down = down;
    }

    public void setLeft(boolean left) {
        this.left = left;
    }

    public void setRight(boolean right) {
        this.right = right;
    }

    public boolean isUp() {
        return up;
    }

    public boolean isDown() {
        return down;
    }

    public boolean isLeft() {
        return left;
    }

    public boolean isRight() {
        return right;
    }

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
    
    
}// class
