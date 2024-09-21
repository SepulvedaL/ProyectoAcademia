/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AcademiaArte;

/**
 *
 * @author Luis Sepulveda
 */
import javax.swing.JOptionPane;

public class ManejoPila 
{
    /*crear la pila con los datos de las conferencias
    se crea mientras que el usuario quiera ingresar datos
    porque no se debe llenar con un ciclo para*/
    public Pila IngresarDatos(Pila objP)
    {
        int resp;//respuesta del usuario
        Estudiantes objCon;
        
        //esta es una forma de leer una respuesta del usuario SIN NECESIDAD DE VALIDARLA, la misma ventana valida
        resp=JOptionPane.showConfirmDialog(null,"Ingresar Estudiante en la pila?","",JOptionPane.YES_NO_OPTION);
        while (resp==JOptionPane.YES_OPTION)
        {
            objCon=new Estudiantes();//para asegurar que sobreescriba
            objCon=Estudiantes.crearEstudianteDesdeConsola();//se recibe el objeto para apilar
            
            do{
               resp=JOptionPane.showConfirmDialog(null,"Desea ingresar Obras?","",JOptionPane.YES_NO_OPTION);
               if(resp==JOptionPane.YES_OPTION){
                   objCon.setObrasEstudiante(Obras.crearObrasDesdeConsola()); 
               }
            }while(resp==JOptionPane.YES_OPTION);
            
            
            objP.Push(objCon);//apilar la conferencia
            resp=JOptionPane.showConfirmDialog(null,"Ingresar mas Estudiantes en la pila?","",JOptionPane.YES_NO_OPTION);
        }//Fin mientras
        return objP;//se cambia el contenido de pila entonces se retorna
    }//Fin ingresardatos


/*este metodo junta y retorna en una cadena todo el contenido de la pila */    
    public String ConcatenarPila(Pila p1, Pila p2)
    {
        String texto="";//texto del retorno
        Object Dato;//dato para desapilar
        while(p1.IsEmpty()==false)//mientras hayan datos en la pila
        {
            Dato=p1.Pop();//se desapila el dato
            texto=texto+Dato+"\n";//se concatena el dato desapilado
            //texto=texto+((Estudiantes)Dato).getObjObra().getTipoObra()+"\n";
            p2.Push(Dato);//se apila el dato desapilado en la pila auxiliar
        }//fin mientras
                /*aca se hace lo mismo pero usando el peek
                while(p1.IsEmpty()==false)
                {
                    texto=texto+p1.Peek();//se concatena el dato proximo a desapilar pero el peek NO desapila
                    p2.Push(p1.Pop());//se apila en p2 lo que se desapila en p1 de inmediato
                }//fin mientras */
        //cuando termina el ciclo la pila original queda vacia hay que devolverle los datos      
        DevolverPila(p2,p1); //deja todo como estaba       
        return texto;//texto con la info o con ""        
    }//fin de concatenar

    
/*este metodo recibe dos pilas y desapila los datos de la primera pila que llega y
los apila en la segunda que le llega*/
    public void DevolverPila(Pila objpa, Pila objp)
    {
        while(objpa.IsEmpty()==false)//mientras hayan datos en la pila
        {
           objp.Push(objpa.Pop());//se apila en la segunda pila lo que se desapila en la primera pila de inmediato
        }//fin mientras
    }//fin devolver pila
    
    
}//fin clase de manejo de pila
