/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nurakhiria;

/**
 *
 * @author Sony vaio
 */import java.util.Scanner;
public class NURAKHIRIA {

    public static void main(String[] args) {
double sisi,luaspermukaan,volume,luassisikubus;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Panjang Sisi: ");
        sisi=input.nextDouble();
        luassisikubus=sisi*sisi;
        luaspermukaan=6*luassisikubus;
        System.out.println("Mencari volume!!!");
        volume=sisi*sisi*sisi;
        System.out.println("luas permukaannya adalah: "+luaspermukaan);
        System.out.println("luas sisi kubusnya adalah "+luassisikubus);
        System.out.print("volumenyass adlah: "+ volume);
    }
    
}
