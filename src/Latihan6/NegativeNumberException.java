/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan6;

/**
 *
 * @author Naufal K D
 */
public class NegativeNumberException extends Exception{
    private int bilangan;
    //default construktor
    NegativeNumberException(){
    }
    //construktor dengan parameter String
    NegativeNumberException(String pesan){
        super(pesan);
    }
    //construktor dengan parameter String dan int
    NegativeNumberException(String pesan, int nilai){
        super(pesan);
        bilangan = nilai;
    }
    public int getBilangan(){
        return bilangan;
    }
}
