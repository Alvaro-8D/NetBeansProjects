package Hoja1Ej3;


public class Plano 
{
    public static void main(String[] args) 
    {
        Rectangulo rectangulo = new Rectangulo();
        Triangulo triangulo = new Triangulo();
        Cuadrado cuadrado = new Cuadrado();

        System.out.println("");
        dibujarTrianguloHueco(triangulo.getAltura());
        System.out.println(triangulo.toString());
        
        
        System.out.println("");
        dibujarCuadradoHueco(cuadrado.getAltura());
        System.out.println(cuadrado.toString());

        System.out.println("");
        dibujarRectanguloHueco(rectangulo.getAltura(), rectangulo.getBase());
        System.out.println(rectangulo.toString());
    }// main
/* ------------------------------- Metodos ---------------------------------- */
    static void dibujarTrianguloHueco(int altura) {
        for (int i = 1; i <= altura; i++) {
            // Espacios al inicio
            for (int j = 1; j <= altura - i; j++) {
                System.out.print(" ");
            }
            // Lógica para bordes
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == 2 * i - 1 || i == altura) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    static void dibujarCuadradoHueco(int lado) {
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                if (i == 0 || i == lado - 1 || j == 0 || j == lado - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void dibujarRectanguloHueco(int alto, int ancho) {
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                if (i == 0 || i == alto - 1 || j == 0 || j == ancho - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}//class
