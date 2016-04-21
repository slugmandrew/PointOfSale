package com.slugmandrew.pos;

import org.junit.Ignore;
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
        final Sale sale = new Sale(display);
        // action
        sale.onBarcode("12345");

        // assertion
        assertEquals("£7.95", display.getText());
    }

    @Test
    public void anotherProductFound() throws Exception
    {
        final Display display = new Display();
        final Sale sale = new Sale(display);
        // action
        sale.onBarcode("23456");

        // assertion
        assertEquals("£12.50", display.getText());
    }

    public static class Display
    {
        private String text;

        public String getText()
        {
            return text;
        }

        public void setText(String text)
        {
            this.text = text;
        }
    }

    public static class Sale
    {
        private Display display;

        public Sale(Display display)
        {
            this.display = display;
        }

        public void onBarcode(String barcode)
        {
            if(barcode.equals("12345"))
            {
                display.setText("£7.95");
            }
            else
            {
                display.setText("£12.50");
            }
        }
    }
}
