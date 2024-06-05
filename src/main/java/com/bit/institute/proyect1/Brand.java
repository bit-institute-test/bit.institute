package com.bit.institute.proyect1;

/**
 * Clase que implementa la Marca de un carro.
 *
 * @author EAFB
 * @date 05 Junio 2024
 */

public class Brand {
    private String name;
    private int numberOfModels;
    private int launchYear;
    private String identifierCode;

    // Constructor
    public Brand(String name, int numberOfModels, int launchYear, String identifierCode) {
        this.name = name;
        this.numberOfModels = numberOfModels;
        this.launchYear = launchYear;
        this.identifierCode = identifierCode;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfModels() {
        return numberOfModels;
    }

    public void setNumberOfModels(int numberOfModels) {
        this.numberOfModels = numberOfModels;
    }

    public int getLaunchYear() {
        return launchYear;
    }

    public void setLaunchYear(int launchYear) {
        this.launchYear = launchYear;
    }

    public String getIdentifierCode() {
        return identifierCode;
    }

    public void setIdentifierCode(String identifierCode) {
        this.identifierCode = identifierCode;
    }
}
