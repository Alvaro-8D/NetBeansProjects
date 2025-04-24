package personas;


public class Persona 
{
    private String nombre;
    private String apellidos;
/* ---------------------------- Constructores --------------------------------*/    
    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

/* ------------------------------- Metodos ---------------------------------- */

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
    
    public void caminar()
    {
        System.out.println("CAMINANDO......");
    }
    
    public void dormir()
    {
        System.out.println("DURMIENDO......");
    }
    
    public void visualizarInfo()
    {
        System.out.println("-> NOMBRE: "+nombre+"\n > APELIIDOS: "+apellidos);
    }
    
    
}//class
