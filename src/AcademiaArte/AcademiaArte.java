package AcademiaArte;

import javax.swing.JOptionPane;

/**
 * Ejercico hecho por Luis
 * @author Luis Sepulveda and Oscar Lopez
 */
public class AcademiaArte{
    private int contEsculturas;
    private int contPinturas;
    private int contCanciones;
    private int contOtrasObras;

    // Método Principal
     public static void main(String[] args){
        // Este método podría usarse para iniciar el flujo de la aplicación
        
        
        AcademiaArte academia = new AcademiaArte();
        ManejoPila objManPil=new ManejoPila();
        ManejoCola objManCol=new ManejoCola();
        
        //creamos las pilas y las colas
        //OJO no se crean llamando al constructor vacio!!!!
        Pila objP=new Pila(10);//se manda un valor de memoria inventado
        Pila objPo = new Pila(10);
        Pila objPa=new Pila(10);//se manda un valor de memoria inventado
        Cola objC=new Cola(10);//se manda un valor de memoria inventado
        Cola objCa=new Cola(10);//se manda un valor de memoria inventado
       
         //opciones para los menus
        int op, op1,op2;
        
        //ciclo para el menu principal manejado por op
        do{
            //se imprime el menu principal y se lee la op del menu principal 
            op=Integer.parseInt(JOptionPane.showInputDialog(academia.MenuPpal()));
            //se requiere un selector o case para las diferentes opciones del menu
            switch(op)//en caso de op
            {
                //1. Manejo Pilas
                case 1://ciclo para la opcion 1 del menu principal manejo de pilas manejado por op1
                        do{
                            //se imprime el menu de manejo de pilas 
                            op1=Integer.parseInt(JOptionPane.showInputDialog(academia.Opcion1()));
                            //se requiere un selector o case para las diferentes opciones del menu
                            switch(op1)//en caso de op1
                            {
                                case 1:
                                    objP=objManPil.IngresarDatos(objP);
                                    break;
                                case 2:
                                    if(objP.IsEmpty()==false)//si hay datos
                                    {
                                        JOptionPane.showMessageDialog(null,"La pila de conferencias es: \n"+objManPil.ConcatenarPila(objP, objPa));
                                    }else{
                                        JOptionPane.showMessageDialog(null,"La pila de conferencias esta vacia ");
                                    }
                                    break; 
                                case 3:
                                    JOptionPane.showMessageDialog(null,"Cuántas esculturas se donaron");
                                    break;
                                case 4:
                                    JOptionPane.showMessageDialog(null,"Cuántas Pinturas se donaron");
                                    break;
                                case 5:
                                    JOptionPane.showMessageDialog(null,"Porcentaje de Canciones donadas");
                                    break;
                            }//fin caso de op1
                        }while(op1<10);//fin del ciclo para el menu de manejo de pilas
                        break;//fin case 1 de manejo de pilas
                //2. Manejo colas
                case 2://ciclo para la opcion 2 del menu principal manejo de colas manejado por op2
                        do{
                            //se imprime el menu de manejo de colas 
                            op2=Integer.parseInt(JOptionPane.showInputDialog(academia.Opcion2()));
                            //se requiere un selector o case para las diferentes opciones del menu
                            switch(op2)//en caso de op2
                            {
                             case 1:objC=objManCol.IngresarDatos(objC);
                                    break;
                             case 2:if(objC.IsEmpty()==false)//si hay datos
                                    {
                                         JOptionPane.showMessageDialog(null,"La cola de ponentes es: \n"+objManCol.ConcatenarCola(objC, objCa));
                                    }
                                    else
                                    {
                                         JOptionPane.showMessageDialog(null,"La cola de ponentes esta vacia ");
                                    }
                                    break; 
                             case 3:
                                 JOptionPane.showMessageDialog(null,"Cuántas esculturas se donaron");
                                 break;
                             case 4:
                                 JOptionPane.showMessageDialog(null,"Cuántas Pinturas se donaron");
                                 break;
                             case 5:
                                 JOptionPane.showMessageDialog(null,"Porcentaje de Canciones donadas");
                                 break;
                            }//fin caso de op2
                        }while(op2<10);//fin del ciclo para el menu de manejo de colas
                        break;//fin case 2 de manejo de colas
            
            }//fin caso de op
        }while(op<3);//fin del ciclo para el menu principal
        
        
        //academia.ContarObras(estudiante1.getObjObra().getTipoObra());

        /*
        int i = 0,j = 0;
        
        do{
            Estudiantes estudiante1 = Estudiantes.crearEstudianteDesdeConsola();

            do{ 
                estudiante1.setObrasEstudiante(Obras.crearObrasDesdeConsola());
                academia.ContarObras(estudiante1.getObjObra().getTipoObra());
                j++;
            }while(j<2);
            i++;
            j=0;
        }while(i<2);*/
        


       /* Obras obra1 = new Obras("O01", "Mona Lisa", "Pintura", 85000000.0);
        Obras obra2 = new Obras("O02", "Lisa Mona", "Canción", 8000000.0);
        Obras obra3 = new Obras("O03", "hola", "Canción", 9000000.0);
        Obras obra4 = new Obras("004", "El canto", "Escultura", 1000000.0);
        Obras obra5 = new Obras("005", "Llanto", "Cerámica", 1000000.0);
        Obras obra6 = new Obras("006", "Susto", "Pintura", 2500000.0);
        Obras obra7 = new Obras("007", "Grito", "Pintura", 2500000.0);
        
        AcademiaArte academia = new AcademiaArte();
        //AcademiaArte academia = new AcademiaArte();
            
        estudiante1.setObrasEstudiante(obra1);
        academia.ContarObras(obra1.getTipoObra());
        estudiante1.setObrasEstudiante(obra2);
        academia.ContarObras(obra2.getTipoObra());
        estudiante1.setObrasEstudiante(obra3);
        academia.ContarObras(obra3.getTipoObra());
        estudiante2.setObrasEstudiante(obra4);
        academia.ContarObras(obra4.getTipoObra());
        estudiante2.setObrasEstudiante(obra5);
        academia.ContarObras(obra5.getTipoObra());
        estudiante3.setObrasEstudiante(obra6);
        academia.ContarObras(obra6.getTipoObra());
        estudiante3.setObrasEstudiante(obra7);
        academia.ContarObras(obra7.getTipoObra());*/
        
       /*
        int total = academia.getContCanciones() + academia.getContEsculturas() + academia.getContPinturas() + academia.getContOtrasObras();
        System.out.println(total + " ---- " + academia.getContCanciones());
        
        //Cuantas esculturas se donaron por parte de los estudiantes.
        System.out.println("Total de Esculturas donadas: " + academia.getContEsculturas());
        
        //Cuantas pinturas se donaron por parte de los estudiantes.
        System.out.println("Total de Pinturas donadas: " + academia.getContPinturas());
        
        //Qué porcentaje de canciones se tiene entre las donaciones.
        System.out.println("Porcentaje de canciones donadas: " + academia.CalcularPorcentaje(academia.getContCanciones(), total));
        */
        
        //System.out.println(estudiante1.toString());
        //System.out.println(estudiante2.toString());
    }

    // Contar Obras según el tipo
    public void ContarObras(String tipoObra) {
        switch (tipoObra) {
            case "Escultura":
                contEsculturas++;
                break;
            case "Pintura":
                contPinturas++;
                break;
            case "Cancion":
                contCanciones++;
                break;
            case "Ceramica":
                contOtrasObras++;
                break;
            default:
                System.out.println("Obra no valida" + tipoObra);
                break;
        }
    }
    
    // Calcular porcentaje
    public double CalcularPorcentaje(int cont, int total) {
        if (total == 0) return 0;
        return ((double) cont / total) * 100;
    }
    
    // Métodos Getters y Setters
    public int getContEsculturas() {
        return contEsculturas;
    }

    public void setContEsculturas(int contEsculturas) {
        this.contEsculturas = contEsculturas;
    }

    public int getContPinturas() {
        return contPinturas;
    }

    public void setContPinturas(int contPinturas) {
        this.contPinturas = contPinturas;
    }

    public int getContCanciones() {
        return contCanciones;
    }

    public void setContCanciones(int contCanciones) {
        this.contCanciones = contCanciones;
    }
    
    public int getContOtrasObras() {
        return contOtrasObras;
    }

    public void setContOtrasObras(int contCanciones) {
        this.contOtrasObras = contCanciones;
    }
 
    
    //vamos a hacer menu de opciones para mejor manejo de la información
    //menu principal
    public String MenuPpal()
    {
        return "Menu Principal\n"
                + "1. Manejo Pilas\n"
                + "2. Manejo Colas\n"
                + "3. Salir";
    }
    //menu opcion 1 del menu principal
    public String Opcion1()
    {
        return "Menu Pila de conferencias\n"
                + "1. Ingresar Estudiante en la pila\n"
                + "2. Mostrar pila de Estudiantes\n"
                + "3. Cuántas esculturas se donaron\n"
                + "4. Cuántas pinturas se donaron\n"
                + "5. Qué porcentaje de canciones se donaron\n"
                + "10. Volver al menú ppal";
    }
    //menu opcion 2 del menu principal
    public String Opcion2()
    {
        return "Menu Cola de ponentes\n"
                + "1. Ingresar Estudiante en la cola\n"
                + "2. Mostrar cola de Estudiante\n"
                + "3. Cuántas esculturas se donaron\n"
                + "4. Cuántas pinturas se donaron\n"
                + "5. Qué porcentaje de canciones se donaron\n"
                + "10. Volver al menú ppal";
    }
}

 