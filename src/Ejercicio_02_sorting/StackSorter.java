package Ejercicio_02_sorting;

import Materia.Stack;

public class StackSorter {

    /** Ejercicio 2: StackSorter;
     * Ordena un stack de forma que los elementos más pequeños queden en el tope
     */
    public void sortStack(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();
        
        while (!stack.isEmpty()) {
            int current = stack.pop();
            
            // Mover elementos mayores de tempStack de vuelta al stack original
            while (!tempStack.isEmpty() && tempStack.peek() > current) {
                stack.push(tempStack.pop());
            }
            
            tempStack.push(current);
        }
        
        // Transferir elementos ordenados de vuelta al stack original
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
    }

    /**
     * Imprime un stack sin modificarlo
     */
    public static void printStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            System.out.println("(tope) Stack vacío");
            return;
        }
        
        // Usar un array para almacenar temporalmente los elementos
        int[] elements = new int[stack.size()];
        int index = 0;
        
        // Extraer elementos para imprimir
        while (!stack.isEmpty()) {
            elements[index++] = stack.pop();
        }
        
        System.out.print("(tope) ");
        // Imprimir en orden inverso (tope primero)
        for (int i = elements.length - 1; i >= 0; i--) {
            System.out.print(elements[i]);
            if (i > 0) {
                System.out.print("->");
            }
            // Restaurar el stack
            stack.push(elements[i]);
        }
        System.out.println();
    }
}