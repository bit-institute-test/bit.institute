package com.bit.institute.proyect2;

public class InvoiceTest {
    public static void main(String[] args) {
        // Crear una factura
        Invoice invoice = new Invoice("INV123", "Laptop", 2, 800.0);

        // Mostrar los detalles de la factura
        System.out.println("Detalles de la factura:");
        System.out.println("Número de factura: " + invoice.getNumber());
        System.out.println("Descripción: " + invoice.getDescription());
        System.out.println("Cantidad: " + invoice.getQuantity());
        System.out.println("Precio por artículo: $" + invoice.getPrice());

        // Calcular y mostrar el monto total de la factura
        System.out.println("Monto total de la factura: $" + invoice.getTotalInvoice());
    }
}
