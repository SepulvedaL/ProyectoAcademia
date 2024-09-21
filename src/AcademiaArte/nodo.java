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
/*
----------------
      Nodo 
----------------
-Dato: objeto
- sig: Nodo
- ant: Nodo
----------------
Nodo()
Nodo(d)
Nodo(li,d,ld)
----------------

*/

import java.util.logging.Level;
import java.util.logging.Logger;

 
public class nodo  
{
   
    //atributos propios de la clase
    private Object dato;
    private nodo sig;
    private nodo ant;
    
//constructor vacio
    public nodo()
    {} 
    //fin m�todo Nodo

    /*constructor que recibe el dato 
    y crea el nodo con su informaci�n
     y coloca las ligas en null*/
    public nodo(Object d)
    {
        dato=d;
        sig=null;
        
    }//fin m�todo Nodo

    /*este constructor lo vamos a usar para el nodo doble de la lista
    o el arbol, recibe tres parametros*/
    public nodo(nodo li,Object d,nodo ld)
    {
        ant=li;
        dato=d;
        sig=ld;
        
    }//fin m�todo Nodo

    
    
    public Object getDato() {
        return dato;
    }

    public void setDato(Object dato) {
        this.dato = dato;
    }

    //destructor ojo, este metodo finalize se  genera, es el inicio de un constructor
    public void finalize()
    {   try {
        super.finalize();
        } catch (Throwable ex) {
            Logger.getLogger(nodo.class.getName()).log(Level.SEVERE, null, ex);
        }
}
   
     
    @Override
    public String toString() {
        return dato.toString();
    }

    public nodo getAnt() {
        return ant;
    }

    public void setAnt(nodo ant) {
        this.ant = ant;
    }

    public nodo getSig() {
        return sig;
    }

    public void setSig(nodo sig) {
        this.sig = sig;
    }
    
    
   
}//fin clase nodo


    


