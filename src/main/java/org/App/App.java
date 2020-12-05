package org.App;

import org.zxx.Utils.Barcode;

import java.io.File;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Barcode.BookBarcode("aaaaa");
        System.out.println( "Hello World!" );
        Barcode.readCode(new File("/Users/bytedance/Desktop/Barcode-test/abc.jpg"));
    }
}
