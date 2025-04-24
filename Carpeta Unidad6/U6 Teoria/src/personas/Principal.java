package personas;


public class Principal 
{
    public static void main(String[] args) 
    {
        // creamos dos objetos
        Persona persona = new Persona("pepe","castillo");
        Estudiante estudiante = new Estudiante("1234","daw1","rebeca","palacios");
        
        //metodos propios de Persona
        
        persona.caminar();
        persona.dormir();
        
        //metodos propios de Estudiante
        System.out.println("");
        estudiante.estudiar();
        estudiante.examinarse();
        
        //metodos por herencia
        System.out.println("");
        estudiante.caminar();
        estudiante.dormir();
        
        System.out.println("");
        System.out.println("**INFO**");
        persona.visualizarInfo();
        estudiante.visualizarInfo();
        
        // ------> errores <-------
        // persona.examinarse();
        // persona.getNumExpediente();
        
        /* * * * * * POLIMORFISMO * * * * * */
        
        Persona personas[] = new Persona[3];
        
        personas[0] = new Persona("carlos", "ramirez");
        personas[1] = new Persona("Ana", "Rios");
        personas[2] = new Estudiante("1234", "daw1", "tito", "puente");
        
        personas[0].dormir();
        personas[1].caminar();
        personas[2].caminar();
        
        System.out.println("");
        System.out.println("Por Samuel, va por ti");
        for(int i = 0; i < 3; i++)
        {
            System.out.println("* * * * * * * * * * * * ");
            personas[i].visualizarInfo();
        }
        
        // * * * * * * * REFUNDICION  * * * * * * *
        
        int numero = (int) Math.random(); // Ejemplo de Refundicion
        
        // Le recordamos al Array de tipo Persona
        // que se debe comportar como un Estudiante
        ((Estudiante)personas[2]).estudiar();
        
        // * * * * * * * REFUNDICION  * * * * * * *
       
        
        
        
    }// main
/* ------------------------------- Metodos ---------------------------------- */


}//class
