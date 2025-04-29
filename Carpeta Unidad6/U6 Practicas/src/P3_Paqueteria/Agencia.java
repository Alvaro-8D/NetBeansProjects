package P3_Paqueteria;

import java.util.Scanner;

public class Agencia {
    
    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        
        String encargadoSucursal;
        String direccionSucursal;
        
        System.out.println("Creando la agencia");
        System.out.print("Introduce el encargado(a) de la sucursalA: ");
        encargadoSucursal = entrada.nextLine();
        System.out.print("Introduce la direccion de la sucursalA: ");
        direccionSucursal = entrada.nextLine();

        Sucursal sucursalA= new Sucursal("sucursalA",direccionSucursal, encargadoSucursal);
        
        System.out.print("\nIntroduce el encargado(a) de la sucursalB: ");
        encargadoSucursal = entrada.nextLine();
        System.out.print("Introduce la direccion de la sucursalB: ");
        direccionSucursal = entrada.nextLine();

        
        Sucursal sucursalB = new Sucursal("sucursalB",direccionSucursal, encargadoSucursal);
        
        
        generarPaquetes(sucursalA,sucursalB);
        
        
        System.out.println("");
        System.out.println(sucursalA.toString());
        
        System.out.println("");
        System.out.println(sucursalB.toString());
        
    }// main
/* ------------------------------- Metodos ---------------------------------- */
    public static void asignarSucursal(Paquete paquete,Sucursal sucursalA,Sucursal sucursalB) 
    {
        Paquete paquetesA[] = new Paquete[10];
        Paquete paquetesB[] = new Paquete[10];
        
        if(paquete.getPrecio()== -1)
        {
            
            System.out.println("");System.out.println("! ! ! ! ! ! ! ! ! !");
            System.out.println("El paquete "+paquete.getId()+" pesa demasiado"
            + " para ser un sobre.\n********** NO SERA ENVIADO **********");
        }
        else if(sucursalA.getIndicePaquetes() < 4)
        {
            paquetesA = sucursalA.getPaquetes();
            
            paquetesA[sucursalA.getIndicePaquetes()] = paquete;
            sucursalA.sumaIndicePaquetes();
            
            sucursalA.setPaquetes(paquetesA);
        }
        else
        {
            paquetesB = sucursalB.getPaquetes();
            
            paquetesB[sucursalB.getIndicePaquetes()] = paquete;
            sucursalB.sumaIndicePaquetes();
            
            sucursalB.setPaquetes(paquetesB);
        }
        
        
    }
    
    private static void generarPaquetes(Sucursal sucursalA,Sucursal sucursalB) 
    { 
        // Se pasan peso y si va certificado 
        //(y color opcionalmente...) 
        
        Paquete paquete; 
        
        paquete = new Sobre(70,false); 
        asignarSucursal(paquete,sucursalA,sucursalB);                  //id = 1000
         
        paquete = new Caja(230,false); 
        asignarSucursal(paquete,sucursalA,sucursalB);                  //id = 1001 
       
        paquete = new Caja(2078,true); 
        asignarSucursal(paquete,sucursalA,sucursalB);                  //id = 1002 
        
        paquete = new Sobre (182, false, "gris"); 
        asignarSucursal (paquete,sucursalA,sucursalB);                  //id = 1003
         
        paquete = new Caja (210,false); 
        asignarSucursal (paquete,sucursalA,sucursalB);                  //id = 1004 
        
        paquete  = new Caja (1000,true);  
        asignarSucursal (paquete,sucursalA,sucursalB);                  //id = 1005
         
        paquete  = new Sobre (160,true); 
        asignarSucursal (paquete,sucursalA,sucursalB);                  //id = 1006 
        
        paquete  = null;                // borramos paquete
        
    }// generarPaquetes

}// class
