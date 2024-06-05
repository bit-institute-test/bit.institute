package com.bit.institute.proyect3;

public class EmployeeTest {

    public static void main(String[] args) {
        // Crear dos objetos Empleado
        Employee employee1 = new Employee("John", "Doe", 5000);
        Employee employee2 = new Employee("Jane", "Smith", 6000);

        // Mostrar el salario de cada empleado
        System.out.println("Salario mensual de cada empleado antes del aumento:");
        System.out.println(employee1.getFirstName() + " " + employee1.getLastName() + ": $" + employee1.getMonthlySalary());
        System.out.println(employee2.getFirstName() + " " + employee2.getLastName() + ": $" + employee2.getMonthlySalary());

        // Dar a cada empleado un aumento del 10%
        employee1.raiseSalary(10);
        employee2.raiseSalary(10);

        // Mostrar el salario de cada empleado después del aumento
        System.out.println("\nSalario mensual de cada empleado después del aumento:");
        System.out.println(employee1.getFirstName() + " " + employee1.getLastName() + ": $" + employee1.getMonthlySalary());
        System.out.println(employee2.getFirstName() + " " + employee2.getLastName() + ": $" + employee2.getMonthlySalary());

        // Mostrar el número de empleados que han pasado por la empresa hasta la fecha
        System.out.println("\nNúmero total de empleados: " + Employee.getTotalEmployees());
    }
}
