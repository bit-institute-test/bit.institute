package com.bit.institute.proyect1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Crear una dirección
        Address address = new Address("Calle Principal", "Barrio Centro", "Bogotá");

        // Crear un propietario (persona) con la dirección
        Owner owner = new Owner("Pepito Perez", LocalDate.of(1980, 5, 15), address);

        // Crear una marca
        Brand brand = new Brand("Toyota", 10, 1990, "Prado");

        // Crear un coche con la marca, el propietario y otros detalles
        Car car = new Car("Corolla", "Rojo", 2020, brand, "123456789", owner,
                200, 4, true, 6, true, 50.0);

        // Relacionar el propietario con el coche
        car.setOwner(owner);

        // Relacionar la marca con el coche
        car.setBrand(brand);

        // Imprimir detalles del coche
        System.out.println("Detalles del coche:");
        System.out.println("Marca: " + car.getBrand().getName());
        System.out.println("Modelo: " + car.getModel());
        System.out.println("Color: " + car.getColor());
        System.out.println("Año: " + car.getYear());
        System.out.println("Marca: " + car.getBrand().getName());
        System.out.println("Propietario: " + car.getOwner().getName());

        // Acelerar el coche en 5 km/h
        car.accelerate();
        car.accelerate();
        car.accelerate();
        car.accelerate();
        car.accelerate();
        System.out.println("Velocidad actual después de acelerar: " + car.getCurrentSpeed() + " km/h");

        System.out.println("Marchas actual: " + car.getCurrentGear());

        // subir la marcha a la siguiente
        car.shiftUp();
        System.out.println("Número de marchas después de cambiar: " + car.getCurrentGear());

        // bajar la marcha a la siguiente
        car.shiftDown();
        System.out.println("Número de marchas después de cambiar: " + car.getCurrentGear());

        // Frenar el coche
        car.brake();
        System.out.println("Velocidad actual después de frenar: " + car.getCurrentSpeed() + " km/h");

        // mostrar el volumen de combustible
        System.out.println("El volumen del combustible es: " + car.showFuelVolume());

        //calcular la autonomía de viaje
        double autonomy = car.calculateRange(7);
        System.out.println("Autonomía de viaje con consumo medio de 7 galones por 100 km: " + autonomy + " km");
    }
}
