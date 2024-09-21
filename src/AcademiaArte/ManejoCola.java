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

//OJO MUY SIMILAR A PILA PERO SE DEBE ENTENDER QUE LOS DATOS ESTAN QUEDANDO UBICADOS MUY MUY DIFERENTE A PILA
public class ManejoCola 
{
     /*crear la cola con los datos de los ponentes
    se crea mientras que el usuario quiera ingresar datos
    porque no se debe llenar con un ciclo para*/
    public Cola IngresarDatos(Cola objC)
    {
        int resp;//respuesta del usuario
        Estudiantes objPon;
        //esta es una forma de leer una respuesta del usuario SIN NECESIDAD DE VALIDARLA, la misma ventana valida
        resp=JOptionPane.showConfirmDialog(null,"Ingresar ponente en cola?","",JOptionPane.YES_NO_OPTION);
        while (resp==JOptionPane.YES_OPTION)
        {
            objPon=new Estudiantes();//para asegurar que sobreescriba
            objPon=objPon.crearEstudianteDesdeConsola();//se recibe el objeto para encolar
            do{
               resp=JOptionPane.showConfirmDialog(null,"Desea ingresar Obras?","",JOptionPane.YES_NO_OPTION);
               if(resp==JOptionPane.YES_OPTION){
                   objPon.setObrasEstudiante(Obras.crearObrasDesdeConsola());
               }
            }while(resp==JOptionPane.YES_OPTION);

            objC.Push(objPon);//encolar el ponente
            resp=JOptionPane.showConfirmDialog(null,"Ingresar mas ponentes en cola?","",JOptionPane.YES_NO_OPTION);
        }//Fin mientras
        return objC;//se cambia el contenido de cola entonces se retorna
}//Fin ingresardatos


/*este metodo junta y retorna en una cadena todo el contenido de la cola */    
    public String ConcatenarCola(Cola c1, Cola c2)
    {
        String texto="";//texto del retorno
        Object Dato;//dato para desencolar
        while(c1.IsEmpty()==false)//mientras hayan datos en la cola
        {
            Dato=c1.Pop();//se desencola el dato
            texto=texto+Dato+"\n";//se concatena el dato desencolado
            c2.Push(Dato);//se encola el dato desencolado en la cola auxiliar
        }//fin mientras
                /*aca se hace lo mismo pero usando el peek
                while(c1.IsEmpty()==false)
                {
                    texto=texto+c1.Peek();//se concatena el dato proximo a desencolar pero el peek NO desencola
                    c2.Push(c1.Pop());//se encola en c2 lo que se desencola en c1 de inmediato
                }//fin mientras */
        //cuando termina el ciclo la cola original queda vacia hay que devolverle los datos      
        DevolverCola(c2,c1); //deja todo como estaba  
        return texto;//texto con la info o con ""        
    }//fin de concatenar

    /*este metodo recibe dos colas y desencola los datos de la primera cola que llega y
    los encola en la segunda que le llega*/
    public void DevolverCola(Cola objca, Cola objc)
    {
        while(objca.IsEmpty()==false)
        {
           objc.Push(objca.Pop());
        }//fin mientras
    }//fin devolver cola
    
}//fin clase manejo de cola

