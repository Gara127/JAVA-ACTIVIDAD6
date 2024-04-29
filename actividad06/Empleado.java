import java.io.Serializable;

public class  Empleado implements Serializable {
  private String nombre; 
  private String apellido;
  private double sueldo;
  private transient String clave; // con el modificador transient no se guardará este atributo en el archivo
  
  public Empleado  (String nombre, String apellido, double sueldo) { // Constructor por defecto, inicializa los atributos y para el "clave" pone un valor por defecto "patata"
        this.clave = "patata";         
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo = sueldo;
    }  

    public Empleado(String nombre, String apellido, double sueldo, String clave) { // Constructor por defecto, inicializa los atributos y para el "clave" pone un valor por defecto "patata"
    this.clave = clave;         
    this.nombre = nombre;
    this.apellido = apellido;
    this.sueldo = sueldo;
}  


  public String getNombre() {
      return this.nombre;
  }

  public void setNombre(String nombre) {
      this.nombre = nombre;
  }

  public String getApellido() {
      return this.apellido;
  }

  public void setApellido(String apellido) {
      this.apellido = apellido;
  }

  public double getSueldo() {
    return this.sueldo;
}

public void setSueldo(double sueldo) {
    this.sueldo = sueldo;
}

public String getClave() {
    return this.clave;
}

public void setClave(String clave) {
    this.clave = clave;
}

@Override
    public String toString() {  // sobreescribimos elmétodo toString para poder mostrar facilmente los atributos de la clase Empleado.
        return "Nombre: " + this.nombre + " | Apellido: " + this.apellido +  " | Sueldo: " + this.sueldo + " | Clave: " + this.clave;
    }




}
// segundo constructor, quitar apellido del string, getters and setters clave
// crear archivo en el main