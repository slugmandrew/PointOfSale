package com.slugmandrew.pos;

import org.junit.Test;

import static junit.framework.Assert.*;

/**
 * @author Drew Spencer
 */
public class SellOneItemTest
{


    @Test
    public void productFound() throws Exception
    {
        final Display display = new Display();
        final Sale sale = new Sale();
        // action
        sale.onBarcode("12345");

        // assertion
        assertEquals("£7.95", display.getText());
    }

    private static class Display
    {
        public String getText()
        {
            return "£7.95";
        }

    }

    private static class Sale
    {
        public void onBarcode(String barcode)
        {

        }
    }
}
