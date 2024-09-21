package AcademiaArte;
/**
 *  Ejercico hecho por Luis
 * @author Luis Sepulveda and Oscar Lopez
 */
import java.util.Scanner;

public class Estudiantes {
    private String id;
    private String nombre;
    private String apellido;
    private String direccion;
    private String tel;
    private String fecIngreso;
    private Obras objObra;

    // Constructor vacío
    public Estudiantes() {}

    // Constructor con parámetros
    public Estudiantes(String id, String nombre, String apellido, String direccion, String tel, String fecIngreso) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.tel = tel;
        this.fecIngreso = fecIngreso;
    }
    
    public static Estudiantes crearEstudianteDesdeConsola() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el ID del estudiante: ");
        String id = scanner.nextLine();

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = scanner.nextLine();
        
        System.out.print("Ingrese el apellido del estudiante: ");
        String apellido = scanner.nextLine();
        
        System.out.print("Ingrese la direccion del estudiante: ");
        String direccion = scanner.nextLine();
        
        System.out.print("Ingrese el telefono del estudiante: ");
        String tel = scanner.nextLine();

        System.out.print("Ingrese la fecha de ingreso del estudiante: ");
        String fecIngreso = scanner.nextLine();
       
        // Crear el objeto Estudiante
        Estudiantes estudiante = new Estudiantes(id, nombre, apellido, direccion, tel, fecIngreso);
        return estudiante;
    }
    
    // Métodos Getters y Setters
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTel() {
        return this.tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getFecIngreso() {
        return this.fecIngreso;
    }

    public void setFechaIngreso(String fecIngreso) {
        this.fecIngreso = fecIngreso;
    }

    // Método para set una obra al estudiante
    public void setObrasEstudiante(Obras obra) {
        this.objObra = obra;
    }

    public Obras getObjObra() {
        return objObra;
    }
    

    // Método ToString para imprimir los datos del estudiante
    @Override
    public String toString() {
        return "Estudiante: " + nombre + " " + apellido + ", Dirección: " + direccion + ", Teléfono: " + tel +
                ", Fecha de Ingreso: " + fecIngreso + ", Obra: " + (objObra != null ? objObra.toString() : "Sin obra asignada");
    }

}

