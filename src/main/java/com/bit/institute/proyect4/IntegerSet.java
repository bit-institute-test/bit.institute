package com.bit.institute.proyect4;

/**
 * Clase que implementa un conjunto de numeros enteros.
 *
 * @author EAFB
 * @date 05 Junio 2024
 */

public class IntegerSet {
    // Instance variable
    boolean[] set;

    // Constructor
    public IntegerSet() {
        set = new boolean[101]; // Inicializar la matriz con tamaño para almacenar números de 0 a 100
    }

    /*Método para realizar la unión de dos conjuntos*/
    public IntegerSet union(IntegerSet otherSet) {
        IntegerSet unionSet = new IntegerSet();
        for (int i = 0; i < set.length; i++) {
            unionSet.set[i] = this.set[i] || otherSet.set[i];
        }
        return unionSet;
    }

    /*Método para realizar la intersección de dos conjuntos*/
    public IntegerSet intersection(IntegerSet otherSet) {
        IntegerSet intersectionSet = new IntegerSet();
        for (int i = 0; i < set.length; i++) {
            intersectionSet.set[i] = this.set[i] && otherSet.set[i];
        }
        return intersectionSet;
    }

    /*Método para insertar un nuevo elemento en el conjunto*/
    public void insertElement(int k) {
        if (k >= 0 && k <= 100) {
            set[k] = true;
        } else {
            System.out.println("Error: el número entero debe estar entre 0 y 100.");
        }
    }

    /*Método para eliminar un elemento del conjunto*/
    public void deleteElement(int m) {
        if (m >= 0 && m <= 100) {
            set[m] = false;
        } else {
            System.out.println("Error: el número entero debe estar entre 0 y 100.");
        }
    }

    /*Método para devolver una cadena que representa el conjunto*/
    public String toSetString() {
        StringBuilder sb = new StringBuilder();
        boolean isEmpty = true;
        for (int i = 0; i < set.length; i++) {
            if (set[i]) {
                sb.append(i).append(" ");
                isEmpty = false;
            }
        }
        if (isEmpty) {
            return "-";
        } else {
            return sb.toString().trim();
        }
    }

    /*Método para determinar si dos conjuntos son iguales*/
    public boolean equalTo(IntegerSet otherSet) {
        for (int i = 0; i < set.length; i++) {
            if (this.set[i] != otherSet.set[i]) {
                return false;
            }
        }
        return true;
    }
}
