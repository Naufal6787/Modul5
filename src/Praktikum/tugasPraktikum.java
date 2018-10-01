/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Naufal K D
 */
public class tugasPraktikum {
     public static void main(String[] args) throws IOException {
        System.out.println("===================================");
        System.out.println("    !HARUS MENGINPUT ANGKA!     ");
        System.out.println("===================================");
        System.out.print("Masukkan bilangan : ");
        String temp;
        double num = 0;
        
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader baca = new BufferedReader(input);
        temp = baca.readLine();
        
        try{
            num = Double.parseDouble(temp);
        }
        catch(NumberFormatException nfe){
            System.out.println("Maaf data yang dimasukkan bukan angka");
        }
        finally{
            System.out.println("Inputan yang dimasukkan = " + num);
        }
                
    }
}
