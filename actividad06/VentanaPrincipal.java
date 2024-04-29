import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Iterator;

public class VentanaPrincipal {

    public static void main(String[] args) throws IOException {

        String rutaProyecto = System.getProperty("user.dir"); //ruta hasta el proyecto donde se ejecuta nuestro programa
        String separador = File.separator; //String que utiliza el Sistema Operativo para separar carpetas al generar su ruta    
        
        //segundo creamos la ruta de la carpeta que contiene la del proyecto:
        String rutaCarpeta = rutaProyecto + separador + "archivosHashMap";
        System.out.println(" La ruta de la carpeta es: " + rutaCarpeta);

        File carpeta = new File(rutaCarpeta); //el objeto File nos permite también tener información sobre la carpeta
            // Creando la carpeta nuevaCarpeta si no existe.
            if (!carpeta.exists()) { // if(carpeta.exists()==false)
                    carpeta.mkdir(); // make directory
            }
               

        HashMap<String, Empleado> listaEmpleados = new HashMap<String, Empleado>();
            listaEmpleados.put("Gara", new Empleado("Gara","González",1500)); 
            listaEmpleados.put("Dennis", new Empleado("Dennis","Nedry",1700));
            listaEmpleados.put("Cameron", new Empleado("Cameron","Tucker",1800));

            File archivo = new File("listado trabajadores");

            //ESCRIBIR EL ARCHIVO
		    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo)); // creamos el outputStream y asociamos a nuestro archivo. Se abre para guardar

            Iterator it = listaEmpleados.keySet().iterator();
                while(it.hasNext()){
                String key = (String) it.next();
                listaEmpleados.get(key);
                oos.writeObject(listaEmpleados);
                System.out.println("Clave: " + key + " -> Valor: " + listaEmpleados.get(key));
                }
                oos.close();
                



    }
}