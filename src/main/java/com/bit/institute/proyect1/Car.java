package com.bit.institute.proyect1;

/**
 * Clase que implementa un carro.
 *
 * @author EAFB
 * @date 05 Junio 2024
 */

public class Car {
    private String model;
    private String color;
    private int year;
    private Brand brand;
    private String chassis;
    private Owner owner;
    private int maxSpeed;
    private int currentSpeed;
    private int numberOfPorts;
    private boolean hasSunroof;
    private int numberOfGears;
    private int currentGear;
    private boolean automaticTransmission;
    private double fuelVolume;

    // Constructor
    public Car(String model, String color, int year, Brand brand, String chassis, Owner owner,
               int maxSpeed, int numberOfPorts, boolean hasSunroof, int numberOfGears,
               boolean automaticTransmission, double fuelVolume) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.brand = brand;
        this.chassis = chassis;
        this.owner = owner;
        this.maxSpeed = maxSpeed;
        this.numberOfPorts = numberOfPorts;
        this.hasSunroof = hasSunroof;
        this.numberOfGears = numberOfGears;
        this.currentGear = 1;
        this.automaticTransmission = automaticTransmission;
        this.fuelVolume = fuelVolume;
        this.currentSpeed = 0;
    }

    // Getters and setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getChassis() {
        return chassis;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getNumberOfPorts() {
        return numberOfPorts;
    }

    public void setNumberOfPorts(int numberOfPorts) {
        this.numberOfPorts = numberOfPorts;
    }

    public boolean isHasSunroof() {
        return hasSunroof;
    }

    public void setHasSunroof(boolean hasSunroof) {
        this.hasSunroof = hasSunroof;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public boolean isAutomaticTransmission() {
        return automaticTransmission;
    }

    public void setAutomaticTransmission(boolean automaticTransmission) {
        this.automaticTransmission = automaticTransmission;
    }

    public double getFuelVolume() {
        return fuelVolume;
    }

    public void setFuelVolume(double fuelVolume) {
        this.fuelVolume = fuelVolume;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    /* método de aceleración que aumenta la velocidad de 1 en 1 km/h */
    public void accelerate() {
        // Verifica si la velocidad actual no excede la velocidad máxima
        if (currentSpeed < maxSpeed) {
            // Incrementa la velocidad en 1 km/h
            currentSpeed++;
            System.out.println("El auto ha acelerado. Velocidad actual: " + currentSpeed + " km/h");
        } else {
            System.out.println("El auto ha alcanzado su velocidad máxima.");
        }
    }

    /*método de frenado que detiene el automóvil – Velocidad = 0 km/h*/
    public void brake() {
        // Establece la velocidad actual en 0 km/h
        currentSpeed = 0;
        System.out.println("El auto ha frenado. Velocidad actual: " + currentSpeed + " km/h");
    }

    /*método de cambio de marcha*/
    public void shiftUp() {
        if (currentGear < numberOfGears) {
            currentGear++;
        }
    }

    /*método reduce la marcha*/
    public void shiftDown() {
        if (currentGear > 1) {
            currentGear--;
        }
    }

    /*Método para cambiar a marcha atrás*/
    public void shiftToReverse() {
        if (currentSpeed > 0) {
            System.out.println("No se puede cambiar a reversa mientras se avanza");
        } else {
            currentGear = -1; // Marcha atrás
        }
    }

    /*Método para calcular la autonomía de viaje*/
    public double calculateRange(double averageConsumption) {
        if (averageConsumption <= 0) {
            throw new IllegalArgumentException("El consumo medio debe ser positivo.");
        }
        return fuelVolume / averageConsumption;
    }


    /*Método para mostrar el volumen de combustible*/
    public double  showFuelVolume() {
        //System.out.println("Volumen de combustible en el tanque: " + fuelVolume + " litros");
        return fuelVolume;

    }

}
