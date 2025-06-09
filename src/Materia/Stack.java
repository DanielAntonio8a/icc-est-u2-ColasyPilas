package Materia;

import java.util.EmptyStackException;

//import Models.Node;

public class Stack<T> {
    private NodeGeneric<T> top;
    private int size;

    public Stack() {
        this.top = null;
        this.size = 0;
    }

    public void push (T value){
        //crear el nodo
        NodeGeneric<T> newNode = new NodeGeneric<>(value);
        //indicar que el nodo ingreso a la pila y con referencia al siguiente nodo
        newNode.setNext(top); //top apunta al que ingresa, al que esta en la cima 
        top = newNode;
        size++;
    }

    public T pop(){
        if(top==null){
            throw new EmptyStackException();
        }
        T value= top.getValue();
        top = top.getNext();// con esto se elimina el anterior top, y se referencia al nuevo 
        size--;
        return value;
    }

    public T peek(){
        if(top==null){
            throw new EmptyStackException();
        }
        T value= top.getValue();
        return value;
        
    }

    public boolean isEmpty(){
        return top==null;
    }

    public void printStack(){
        NodeGeneric<T> aux= top;
        System.out.println();
        while (aux!=null) {
            System.out.print(aux.getValue()+" | ");
            aux=aux.getNext();   
        } 
    }

    public int size(){
        return size;
    }
    
}
