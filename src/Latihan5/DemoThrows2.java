/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan5;

/**
 *
 * @author Naufal K D
 */
public class DemoThrows2 {
    public static void uji(int angka)throws NullPointerException,ArithmeticException{
        if(angka < 0){
            throw new NullPointerException("KESALAHAN: null poimter exception");
        }else {
            throw new ArithmeticException("KESALAHAN: arithmetic exception");
        }
    }
    public static void main(String[] args){
        try {
            //uji(-12);// menimbulkan ekspesi NullPointerException
            uji(0);//menimbulkan ekspesi ArithmeticException
        }catch(Exception e){
            System.out.println("Exception ditangkap di sini...");
            System.out.println(e.getMessage());
        }
        System.out.println("Statemen setelah blok try-catch");
    }
}
