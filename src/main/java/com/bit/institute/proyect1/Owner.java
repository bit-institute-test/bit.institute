package com.bit.institute.proyect1;

/**
 * Clase que implementa un propietario.
 *
 * @author EAFB
 * @date 05 Junio 2024
 */

import java.time.LocalDate;

public class Owner {
    private String name;
    private LocalDate birthDate;
    private Address address;

    // Constructor
    public Owner(String name, LocalDate birthDate, Address address) {
        // Verifica si la dirección no es nula antes de asignarla
        if (address == null || address.getStreet().isEmpty() || address.getNeighborhood().isEmpty() || address.getCity().isEmpty()) {
            throw new IllegalArgumentException("La dirección del propietario no puede estar vacía.");
        }

        this.name = name;
        this.birthDate = birthDate;
        this.address = address;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
