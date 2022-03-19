package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.hibernate.mapping.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;

    @Test
    void testInvoiceDaoSave() {

        //Given
        Product product1 = new Product("Hand cream");
        Product product2 = new Product("Face cream");
        Item item1 = new Item(product1, new BigDecimal("10"), 1, new BigDecimal(10));
        Item item2 = new Item(product2, new BigDecimal("25"), 2, new BigDecimal(50));
        List<Item> items = new ArrayList<>();
        items.add(item1);
        items.add(item2);
        Invoice invoice1 = new Invoice("10_2021", items);

        //When
        invoiceDao.save(invoice1);
        int invoice1Id = invoice1.getInvoiceId();
        invoice1.setInvoiceId(invoice1Id);
        item1.setInvoice(invoice1);
        item2.setInvoice(invoice1);
        productDao.save(product1);
        productDao.save(product2);
        int product1Id = product1.getId();
        int product2Id = product2.getId();
        itemDao.save(item1);
        itemDao.save(item2);
        int item1Id = item1.getId();
        int item2Id = item2.getId();

        //Then
        Assertions.assertEquals("Hand cream", product1.getName());
        Assertions.assertEquals("10_2021", invoice1.getNumber());
        Assertions.assertEquals(new BigDecimal("25"), item2.getPrice());

        //Clean
        try {
            itemDao.deleteAll();
            productDao.deleteAll();
            invoiceDao.deleteAll();
            itemDao.deleteById(item1Id);
            itemDao.deleteById(item2Id);
            productDao.deleteById(product1Id);
            productDao.deleteById(product2Id);
            invoiceDao.deleteById(invoice1Id);
        } catch (Exception e) {
        }

    }
}
