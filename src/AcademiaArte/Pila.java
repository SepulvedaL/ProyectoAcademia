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

public class Pila 
{
    //atributos propios y privados
    private int Maxsize;//tamaño maximo del almacenamiento
    private int Size;//contador de nodos para que no se pase de maximo tamaño
    private nodo Top,q;//apuntador al tope y auxiliar q
    
    //constructores
    public Pila()
    {}
    public Pila(int n)//condiciones iniciales del constructor
    {
        Maxsize=n;
        Top=null;
        Size=0;
    }
         
    
    public boolean IsEmpty() 
    {//si esta vacia
        if(Size <= 0)
            return true;
        else
            return false;
    }

    
    public boolean IsFull() 
    {//si esta llena o sea ya se llego al maximo
        if(Size >= Maxsize)
            return true;
        else 
            return false;
    }
    
   //  JOptionPane.showMessageDialog(null,"*****Pila LLena DESBORDAMIENTO DE PILA*****");//OPCIONAL
          
    
   
    public void Push(Object d)//apilar
    {
        if(IsFull()==false)//se van a colocar datos...problema?si esta llena
        {
            Size=Size + 1;
            q=new nodo(d);
            q.setSig(Top);
            Top=q;
        }
        else
        {
            JOptionPane.showMessageDialog(null,"*****Pila Llena DESBORDAMIENTO DE PILA*****");
              //(OPCIONAL);opcional avisarle al usuario pila LLENA
        }
        //opcional avisarle al usuario "pila LLENA..Desbordamiento de pila"
    }//fin de push - apilar
    
    public Object Pop()
    {
        Object d=null;
        if(IsEmpty()==false)//se van a quitar  datos...problema?si esta vacia
        {
            if (Top.getSig() == null) 
            {
                d = Top.getDato();
                Top=null;
            } else {
                d =Top.getDato();
                q=Top;
                Top=Top.getSig();
                q=(null);
            }
            Size=Size- 1;
        }    
        else
        {
            JOptionPane.showMessageDialog(null,"*****Pila Vacia SUBDESBORDAMIENTO DE PILA*****");
              //OPCIONAL);opcional avisarle al usuario pila VACIA
        }
        return d;
        
    }//fin  de pop - desapilar

    public Object  Peek()
    {
       Object dato=null; 
       if(IsEmpty()==false)
       {
           dato=Top.getDato();
       }
      return dato;	
    }//Fin método pop


}//fin clase pila

