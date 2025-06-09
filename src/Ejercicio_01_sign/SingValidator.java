package Ejercicio_01_sign;

import java.util.HashMap;
import Materia.Stack;

/** Ejercicio 1: SingValidator;
 * Clase encargada de validar cadenas de signos usando una pila.
 * Valida si una cadena con los caracteres (), [], {} es escrita correcta.
 */
public class SingValidator {

    // Imprime en consola si la cadena es válida o no.
    public void isValidAndPrint(String s) {
        boolean isValid = checkValidity(s);
        System.out.println("'" + s + "' es válido: " + isValid);
    }

    /**
     * Verifica si una cadena de signos está balanceada.
     * Respuesta: true si está balanceada, false en caso contrario.
     */
    private boolean checkValidity(String s) {
        // Si el tamaño es impar, no puede estar balanceado
        if (s.length() % 2 != 0) {
            return false;
        }

        // Base de signos de apertura a cierre
        HashMap<Character, Character> dict = new HashMap<>();
        dict.put('(', ')');
        dict.put('[', ']');
        dict.put('{', '}');

        // Usamos la pila
        Stack<Character> stack = new Stack<>();

        // Recorremos cada carácter de la cadena
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (dict.containsKey(c)) {
                // Si es un signo de apertura, lo metemos a la pila
                stack.push(c);
            } else {
                // Si es signo de cierre, la pila no debe estar vacía
                if (stack.isEmpty()) {
                    return false;
                }
                // Verificamos si el último abierto coincide con el actual
                char lastOpened = stack.pop();
                if (c != dict.get(lastOpened)) {
                    return false;
                }
            }
        }

        // Al final, la pila debe estar vacía si está correctamente balanceada
        return stack.isEmpty();
    }
}
