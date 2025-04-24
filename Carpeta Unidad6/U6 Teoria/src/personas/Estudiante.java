package personas;


public class Estudiante extends Persona
{
    private String numExpediente;
    private String titulacion;
/* ---------------------------- Constructores --------------------------------*/    
    public Estudiante(String numExpediente, String titulacion, 
            String nombre, String apellidos) 
    {
        super(nombre, apellidos);
        this.numExpediente = numExpediente;
        this.titulacion = titulacion;
    }
/* ------------------------------- Metodos ---------------------------------- */
    public String getNumExpediente() {
        return numExpediente;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void estudiar()
    {
        System.out.println("ESTOY ESTUDIANDO .....");
    }
    
    public void examinarse()
    {
        System.out.println("EXAMINÁNDOME .....");
    }
    
    @Override
    public void visualizarInfo()
    {
        System.out.println( "-> NOMBRE: "+getNombre()+
                            "\n > APELIIDOS: "+getApellidos()+
                            "\n > NUM EXPEDIENTE: "+numExpediente+
                            "\n > TITULACION: "+titulacion);
    }

}//class
