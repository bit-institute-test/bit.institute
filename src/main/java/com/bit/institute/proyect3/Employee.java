package com.bit.institute.proyect3;

/**
 * Clase que implementa un empelado.
 *
 * @author EAFB
 * @date 05 Junio 2024
 */

public class Employee {
    // Instance variables
    private String firstName;
    private String lastName;
    private double monthlySalary;

    private static int totalEmployees = 0;

    // Constructor
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
        totalEmployees++;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    // Método estático para obtener el número total de empleados.
    public static int getTotalEmployees() {
        return totalEmployees;
    }

    // Método para dar un aumento al salario mensual
    public void raiseSalary(double percentage) {
        double raiseAmount = monthlySalary * percentage / 100;
        monthlySalary += raiseAmount;
    }
}
