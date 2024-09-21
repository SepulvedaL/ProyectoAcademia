package AcademiaArte;
/**
  * Ejercico hecho por Luis
 * @author Luis Sepulveda and Oscar Lopez
 */
import javax.swing.JOptionPane;
import javax.swing.JComboBox;

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

    // Ingresar datos de la obra

    /**
     *
     * @return
     */
    public static Obras crearObrasDesdeConsola() {
        
        // Crear lista desplegable con opciones Tipo de Obra
        String[] opciones = { "Escultura", "Pintura", "Canción", "Cerámica"};
        JComboBox<String> listaTipoObra = new JComboBox<>(opciones);
        int selecTpObra;
        String tipoObra;
        
        String idObra = JOptionPane.showInputDialog(null, "Ingrese código de Obra:", "Registro de Obras", JOptionPane.INFORMATION_MESSAGE);
        String titulo = JOptionPane.showInputDialog(null, "Ingrese el título de la obra:", "Registro de Obras", JOptionPane.INFORMATION_MESSAGE);
        
        selecTpObra = JOptionPane.showConfirmDialog(null, listaTipoObra, "Selecciones el tipo de Obra", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                            
                        // Capturar la opci?n seleccionada cuando el usuario hace clic en "OK"
                            if (selecTpObra == JOptionPane.OK_OPTION) {
                                // Obtener la opción seleccionada de la lista
                                tipoObra = (String) listaTipoObra.getSelectedItem();
                            } 
                            else {
                                JOptionPane.showMessageDialog(null, "No seleccion? ninguna especialidad");
                                tipoObra = "No Aplica";
                            }
                            
        double valorObra = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el valor de la Obra:", "Registro de Obras", JOptionPane.INFORMATION_MESSAGE));

        return new Obras(idObra, titulo, tipoObra, valorObra);
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
