# Práctica: Ordenamiento de Stack

## 📌 Información General
- **Asignatura:** Estructura de Datos y Algoritmos  
- **Carrera:** Ingeniería en Computación  
- **Estudiantes:** Daniel Antonio Duran Ochoa
- **Fecha:** 08 / 06 / 2025  
- **Profesor:** Ing. Pablo Torres  

---

## 🧠 Descripción del Problema
Implementar un algoritmo que ordene un Stack de forma que los elementos más pequeños queden en el tope, utilizando únicamente:
- Operaciones básicas de Stack (`push`, `pop`, `peek`, `isEmpty`)
- Máximo 1 Stack adicional como estructura auxiliar
- Sin usar otras estructuras de datos (arrays, listas, etc.)

**Ejemplo:**  
Input: `[5, 1, 4, 2]` (tope → 5)  
Output: `[1, 2, 4, 5]` (tope → 1)

---

## 🛠️ Implementación

### Clase Principal
```java
public class App {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        
        System.out.println("Stack original:");
        StackUtils.printStack(stack);
        
        StackSorter sorter = new StackSorter();
        sorter.sortStack(stack);
        
        System.out.println("\nStack ordenado:");
        StackUtils.printStack(stack);
    }
}


  ```

## 📌 Resultados Esperados

 ```bash
'()' es válido: true
'()[]{}' es válido: true
'(]' es válido: false
'([)]' es válido: false
'{[]}' es válido: true

 ```

```bash
Stack original:
(tope) 5->1->4->2

Stack ordenado:
(tope) 1->2->4->5
 ```


## 📈 Conclusiones
En esta practica se reutilizo codigo previamente visto en clase, para solusionar problemas comunes como lo serian la validacion de signos, que estos podrian servir parra loguear en alguna pagina etc. Reforzando la compresion del uso de estructuras lineales