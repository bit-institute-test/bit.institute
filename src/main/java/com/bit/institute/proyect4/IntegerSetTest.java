package com.bit.institute.proyect4;

public class IntegerSetTest {
    public static void main(String[] args) {
        // Crear dos conjuntos de números enteros
        IntegerSet set1 = new IntegerSet();
        IntegerSet set2 = new IntegerSet();

        // Insertar algunos elementos en los conjuntos
        set1.insertElement(10);
        set1.insertElement(20);
        set1.insertElement(30);
        set1.insertElement(40);
        set1.insertElement(50);

        set2.insertElement(30);
        set2.insertElement(40);
        set2.insertElement(50);
        set2.insertElement(60);
        set2.insertElement(70);

        // Mostrar los conjuntos originales
        System.out.println("Conjunto 1: " + set1.toSetString());
        System.out.println("Conjunto 2: " + set2.toSetString());

        // Realizar la unión de los conjuntos
        IntegerSet unionSet = set1.union(set2);
        System.out.println("\nUnión de los conjuntos: " + unionSet.toSetString());

        // Realizar la intersección de los conjuntos
        IntegerSet intersectionSet = set1.intersection(set2);
        System.out.println("Intersección de los conjuntos: " + intersectionSet.toSetString());

        // Eliminar un elemento del conjunto 1 y mostrar el conjunto resultante
        set1.deleteElement(30);
        System.out.println("\nConjunto 1 después de eliminar 30: " + set1.toSetString());

        // Comprobar si los conjuntos 1 y 2 son iguales
        System.out.println("\n¿El conjunto 1 es igual al conjunto 2? " + set1.equalTo(set2));
    }
}
