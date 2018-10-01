/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasRumah;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 *
 * @author Naufal K D
 */
public class CobaCoba {
    public static void main (String[] args) {
        System.out.println("awal program");

        try {
            System.out.println("Baris ini tidak akan dieksekusi - 1.2");    

            File f = new File ("hello.txt");
            InputStream fis = new FileInputStream(f);

            System.out.println("Baris ini tidak akan dieksekusi - 1.3");    
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("Baris di dalam finally akan dieksekusi");
        }

        System.out.println("akhir program");
    }
}
