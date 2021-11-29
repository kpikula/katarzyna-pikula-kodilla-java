package com.kodilla.stream.invoice.simple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleInvoiceTestSuite {

    @Test
    void testGetValueToPay() {
        //Given
        SimpleInvoice invoice = new SimpleInvoice();

        //When
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 1", 17.28), 2.0));
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 2", 11.99), 3.5));
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 3", 6.49), 5.0));


        //Then
        assertEquals(108.975, invoice.getValueToPay(), 0.001);
    }

    @Test
    void getValueTest() {
        //Given
        SimpleItem item1 = new SimpleItem(new SimpleProduct("Product 1", 17.28), 2.0);
        SimpleItem item2 = new SimpleItem(new SimpleProduct("Product 2", 11.99), 3.5);
        SimpleItem item3 = new SimpleItem(new SimpleProduct("Product 3", 6.49), 5.0);

        //When
        double value1 = item1.getValue();
        double value2 = item2.getValue();
        double value3 = item3.getValue();

        //Then
        assertEquals(41.965, value2);
        System.out.println(value2);
    }
}
