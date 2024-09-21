package AcademiaArte;

import java.util.Scanner;

/**
  * Ejercico hecho por Luis
 * @author Luis Sepulveda and Oscar Lopez
 */
public class Obras {
    private String idObra;
    private String titulo;
    private String tipoObra;
    private double valorObra;

    // Constructor vacío
    public Obras() {}

    // Constructor con parámetros
    public Obras(String idObra, String titulo, String tipoObra, double valorObra) {
        this.idObra = idObra;
        this.titulo = titulo;
        this.tipoObra = tipoObra;
        this.valorObra = valorObra;
    }
    
    public static Obras crearObrasDesdeConsola() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el ID de la obra: ");
        String idObra = scanner.nextLine();

        System.out.print("Ingrese el titulo de la oba: ");
        String titulo = scanner.nextLine();
        
        System.out.print("Ingrese el tipo de obra: ");
        String tipoObra = scanner.nextLine();
        
        System.out.print("Ingrese el valor de la obra: ");
        double valorObra = scanner.nextDouble();
       
        // Crear el objeto Estudiante
        Obras obra = new Obras(idObra, titulo, tipoObra, valorObra);
        return obra;
    }

    // Métodos Getters y Setters
    public String getIdObra() {
        return this.idObra;
    }

    public void setIdObra(String idObra) {
        this.idObra = idObra;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipoObra() {
        return this.tipoObra;
    }

    public void setTipoObra(String tipoObra) {
        this.tipoObra = tipoObra;
    }

    public double getValorObra() {
        return this.valorObra;
    }

    public void setValorObra(double valorObra) {
        this.valorObra = valorObra;
    }

    // Método ToString para imprimir los datos de la obra
    @Override
    public String toString() {
        return titulo + " (" + tipoObra + "), Valor: " + valorObra;
    }
}
