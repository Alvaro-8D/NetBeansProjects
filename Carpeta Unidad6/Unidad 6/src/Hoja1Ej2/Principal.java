package Hoja1Ej2;


public class Principal 
{
    public static void main(String[] args) 
    {
        Vehiculo vehiculos[] = new Vehiculo[6];
        
        vehiculos[0] = new Coche(1600, 1111, "gris");
        vehiculos[1] = new Coche(1800, 2222);
        vehiculos[2] = new Barco(3333, "blanco");
        vehiculos[3] = new Barco(4444);
        vehiculos[4] = new Coche(1700, 5555, "gris");
        
        vehiculos[5] = new Tractor("compacto", "nuevo", 1000, "verde");
        
        
        series(vehiculos);
        
        colores(vehiculos, "gris");
        
        vehiculos[3].setColor("gris");
        
        vehiculos[0].setNumSerie(1116);
        vehiculos[2].setNumSerie(3336);
        
        ((Tractor)(vehiculos[5])).cambiarEstado("usado");
        
        for(Vehiculo vi:vehiculos)
        {
            vi.arrancar();
        }
        
    }// main
/* ------------------------------- Metodos ---------------------------------- */
    private static void series(Vehiculo []v)
    {
        System.out.println("**** Numeros de Serie *");
        for(Vehiculo ve:v)
        {
            System.out.println(ve.getNumSerie());
        }
    }
    
    private static void colores(Vehiculo []v, String col)
    {
        System.out.println("**** Coche Gris*");
        for(Vehiculo ve:v)
        {
            if(((ve.getColor()).equals(col))&&(ve instanceof Coche))
                System.out.println(ve.getNumSerie());
        }
    }
    
    
}//class
