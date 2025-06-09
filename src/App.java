import Ejercicio_01_sign.SingValidator;
import Ejercicio_02_sorting.StackSorter;
import Materia.Stack;  

public class App {
    public static void main(String[] args) {        
        // Validación de paréntesis
        SingValidator validator = new SingValidator();
        validator.isValidAndPrint("()");
        validator.isValidAndPrint("()[]{}");
        validator.isValidAndPrint("(]");
        validator.isValidAndPrint("([)]");
        validator.isValidAndPrint("{[]}");

        // Ordenación de Stack
        Stack<Integer> stack = new Stack<>();  // Usa tu Stack personalizado
        stack.push(2);
        stack.push(4);
        stack.push(1);
        stack.push(5);

        StackSorter sorter = new StackSorter();

        System.out.println("\nStack original:");
        StackSorter.printStack(stack);

        sorter.sortStack(stack);

        System.out.println("\nStack ordenado:");
        StackSorter.printStack(stack);
    }
}