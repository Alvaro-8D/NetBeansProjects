package Hoja1Ej3;

import java.util.Scanner;

public class Figura 
{
    private double area;
    private double perimetro;
    private int base;
    private int altura;
    private String clase = (""+getClass()).substring(15);
/* ---------------------------- Constructores --------------------------------*/    

    public Figura() {
        System.out.print("Dime la base del "+clase+": ");
        this.base = pedirDatos();
        
        if(clase.equals("Cuadrado"))
            this.altura = base;
        else
        {
            System.out.print("Dime la altura del "+clase+": ");
            this.altura = pedirDatos();
        }
        
        this.area = calcularArea();
        this.perimetro = calcularPerimetro();
    }

/* ------------------------------- Metodos ---------------------------------- */
    public int pedirDatos()
    {
       Scanner entrada = new Scanner(System.in);
       return entrada.nextInt();
    }
    
    public double calcularArea()
    {
        double resultado = 0;
                
        if((clase.equals("Rectangulo"))||(clase.equals("Cuadrado")))
        {
            resultado = base * altura;
        }
        else if(clase.equals("Triangulo"))
        {
            resultado = (base * altura)/2;
        }
        else 
            System.out.println(" Error, no se que tipo de figura es");
        
        return resultado;
    }
    
    public double calcularPerimetro()
    {
       double resultado = 0;
                
        if((clase.equals("Rectangulo"))||(clase.equals("Cuadrado")))
        {
            resultado = (base*2) + (altura*2);
        }
        else if(clase.equals("Triangulo"))
        {
            resultado = base 
                +(Math.sqrt((Math.pow(base, 2))+(Math.pow(altura, 2))));
        }
        else 
            System.out.println(" Error, no se que tipo de figura es");
        
        return resultado;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

@Override
    public String toString() {
        return clase+":\n - Area: "+area+"\n - perimetro: "+perimetro
                +"\n - base:"+base+"\n - altura: "+altura;
    }
}//class
