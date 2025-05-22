package ex3evAlvaro;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Principal 
{
    public static void main(String[] args) 
    {
        ArrayList<Hecho> listaHechos = new ArrayList<>();
        ArrayList<Hecho> listaInformatica = new ArrayList<>();
        ArrayList<Hecho> listaMedicina = new ArrayList<>();
        
        
       extraerHecho("C:/examen/hechos.xml", listaHechos);
       
       for(Hecho e:listaHechos)
       {
           if(e instanceof Informatica) 
               listaInformatica.add(e);
           if(e instanceof Medicina) 
               listaMedicina.add(e);
       }
       
       
       System.out.println("********** Todos los Hechos *********");
       for(Hecho e:listaHechos)
       {
           System.out.println(e.toString());
       }
       System.out.println("********** Informatica *********");
       for(Hecho e:listaInformatica)
       {
           System.out.println(e.toString());
       }
       System.out.println("********** Medicina *********");
       for(Hecho e:listaMedicina)
       {
           System.out.println(e.toString());
       }
        System.out.println("----------------------------------------");
       for(Hecho e:listaInformatica)
       {
           System.out.println(e.getDescripcion()+" el dia "+e.getDia()+" de "+e.getMes()+" del anno "+e.getAnno());
       }
    }// main
/* ------------------------------- Metodos ---------------------------------- */
    private static int detectaHecho(String linea)
    {
        int ok = 3;
        
        if((linea.trim()).equals("<hecho>"))
           ok = 1; //1 empieza objeto
        else if((linea.trim()).equals("</hecho>"))
           ok = 2; // 2 acaba objeto
        else
           ok = 3;
        
        return ok;
        
    }// detectaHecho
    
    private static void extraerHecho(String directArchivo,ArrayList<Hecho> listaHechos)
    {
        String  tipo = "nada";
        String  descripcion = "nada";
        int     dia = 0;
        int     mes = 0;
        int     anno = 0;
        int contadorLinea = 1;
        
        FileReader fr = null;
        try {
            fr = new FileReader(directArchivo);
            BufferedReader entrada = new BufferedReader(fr);
            String cadena = entrada.readLine(); 
            contadorLinea ++;                   
            while (cadena != null) 
            {                                                         
            if((cadena.trim()).length() >= 6)
            {    
                if(((cadena.trim()).substring(0,6)).equals("<tipo>"))
                {
                    int j = 0;
                    do{
                        j ++;
                    }while(!((((cadena.trim()).charAt(j))+"").equals("/")));

                    tipo = (cadena.trim()).substring(6,(j-1));
                }
            }
            if((cadena.trim()).length() >= 13)
            {
                if(((cadena.trim()).substring(0,13)).equals("<descripcion>"))
                {
                    int j = 0;
                    do{
                        j ++;
                    }while(!((((cadena.trim()).charAt(j))+"").equals("/")));

                    descripcion = (cadena.trim()).substring(13,(j-1));
                }
            }
            if((cadena.trim()).length() >= 5)
            {
                if(((cadena.trim()).substring(0,5)).equals("<dia>"))
                {
                    int j = 0;
                    do{
                        j ++;
                    }while(!((((cadena.trim()).charAt(j))+"").equals("/")));

                    dia = Integer.parseInt((cadena.trim()).substring(5,(j-1)));
                }
            }
            if((cadena.trim()).length() >= 5)
            {
                if(((cadena.trim()).substring(0,5)).equals("<mes>"))
                {
                    int j = 0;
                    do{
                        j ++;
                    }while(!((((cadena.trim()).charAt(j))+"").equals("/")));

                    mes = Integer.parseInt((cadena.trim()).substring(5,(j-1)));
                }
            }
            if((cadena.trim()).length() >= 6)
            {
                if(((cadena.trim()).substring(0,6)).equals("<anno>"))
                {
                    int j = 0;
                    do{
                        j ++;
                    }while(!((((cadena.trim()).charAt(j))+"").equals("/")));

                    anno = Integer.parseInt((cadena.trim()).substring(6,(j-1)));
                }
            }
                if(detectaHecho(cadena) == 2) 
                {  //una vez tiene lso datos, crea el Hecho 
                    if(tipo.equals("informatica"))
                        listaHechos.add(new Informatica(tipo, descripcion, dia, mes, anno));
                    else if(tipo.equals("medicina"))
                        listaHechos.add(new Medicina(tipo, descripcion, dia, mes, anno));
                }   
                if(!(tipo.equals("informatica")||tipo.equals("medicina")))
                    System.out.println("LINEA("+contadorLinea+")Se ha detectado un Hecho Historico que no pertenece ni a ifromatica ni a medicina");
                cadena = entrada.readLine();
                contadorLinea ++;
            }
        } 
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
            try {
                    fr.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());                                                               
            }
            
        }
    }// extraerHecho
    
    private static void leerArchivo(String directArchivo)
    {
        FileReader fr = null;
        try {
            fr = new FileReader(directArchivo);
            BufferedReader entrada = new BufferedReader(fr);
            String cadena = entrada.readLine();    //se lee la primera línea del fichero
            while (cadena != null) 
            {                                      //mientras no se llegue al final del fichero                   
                System.out.println(cadena);        //se nuestra por pantalla
                cadena = entrada.readLine();       //se lee la siguiente línea del fichero                        
            }
        } 
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
            try {
                if (fr != null) 
                    fr.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());                                                               
            }
        }
    }// leerArchivo

}//class
