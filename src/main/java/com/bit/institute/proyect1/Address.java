package com.bit.institute.proyect1;

/**
 * Clase que implementa la direccion de un propietario.
 *
 * @author EAFB
 * @date 05 Junio 2024
 */

public class Address {
    private String street;
    private String neighborhood;
    private String city;

    // Builder
    public Address(String street, String neighborhood, String city) {
        this.street = street;
        this.neighborhood = neighborhood;
        this.city = city;
    }

    // Getter for street
    public String getStreet() {
        return street;
    }

    // Setter for street
    public void setStreet(String street) {
        this.street = street;
    }

    // Getter for neighborhood
    public String getNeighborhood() {
        return neighborhood;
    }

    // Setter for neighborhood
    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    // Getter for city
    public String getCity() {
        return city;
    }

    // Setter for city
    public void setCity(String city) {
        this.city = city;
    }
}
