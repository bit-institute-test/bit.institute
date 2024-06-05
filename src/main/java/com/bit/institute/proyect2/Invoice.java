package com.bit.institute.proyect2;

/**
 * Clase que implementa una fatura.
 *
 * @author EAFB
 * @date 05 Junio 2024
 */

public class Invoice {
    // Instance variables
    private String number;
    private String description;
    private int quantity;
    private double price;

    // Constructor
    public Invoice(String number, String description, int quantity, double price) {
        this.number = number;
        this.description = description;
        this.quantity = (quantity > 0) ? quantity : 0;
        this.price = (price > 0) ? price : 0.0;
    }

    // Getters and setters
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = (quantity > 0) ? quantity : 0;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = (price > 0) ? price : 0.0;
    }

    /*Método para calcular el importe total de la factura*/
    public double getTotalInvoice() {
        double totalAmount = quantity * price;
        return (totalAmount > 0) ? totalAmount : 0.0;
    }
}
