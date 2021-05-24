/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.list;

/**
 *
 * @author wandagranados
 */
public class SinglyLinkedList  {
    
    private Node first; //apunta al inicio de la lista dinamica

    //Constructor
    public SinglyLinkedList() {
        this.first = null; //la lista todavia no existe
    }
    
    public boolean contains(Object element) throws ListException {
        if (isEmpty()) {
            throw new ListException("SinglyLinkedList is empty");
        }
        Node aux = first;
         // el aux para moverme por la lista hasta el ultimo elemento
        while (aux != null) {
            if (util.Utility.equals(aux.data, element)) {
                return true;
            }
            aux = aux.next;
        }
        return false; //indica q el elemento no existe
    }
    
    public boolean isEmpty() {
        return first == null;
    }
    
     public void clear() {
        this.first = null;
    }
     public void add(Object element) {
        Node newNode = new Node(element);
        if (isEmpty()) {
            this.first = newNode;
        } else {
            Node aux = first;
            //el aux es para moverme por la lista hasta el ult elemento
            while (aux.next != null) {
                aux = aux.next;
            }
            //cuando se sale del while quiere decir q aux.next == null
            aux.next = newNode;
        }
    }
     
     public void remove(Object element) throws ListException {
        if (isEmpty()) {
            throw new ListException("SinglyLinkedList is empty");
        }
        //CASO 1. EL ELEMENTO A SUPRIMIR ES EL PRIMERO DE LA LISTA
        if (util.Utility.equals(first.data, element)) {
            first = first.next;
        } else {
            //CASO 2. EL ELEMENTO A SUPRIMIR ESTA EN CUALQUIER OTRO NODO
            Node prev = first; //para dejar rastro, apunta al anterior de aux
            Node aux = first.next;
            while (aux != null && !util.Utility.equals(aux.data, element)) {
                prev = aux; //un nodo atras de aux
                aux = aux.next;
            }
            //se sale del while cuando alcanza nulo
            //o cuando encuentra el elemento a suprimir
            if (aux != null && util.Utility.equals(aux.data, element)) {
                //desenlazo o desconecto el nodo
                prev.next = aux.next;
            }
        }
    }
    
}
