/*PROGRAM JAVA
PROGRAM UNTUK MENGETAHUI NILAI BERUPA GANJIL/GENAP
*/

import java.util.Scanner;


public class GanjilGenap{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Bilangan = ");

        int a;
        a = input.nextInt();
        int hasil;        
        hasil = a%2;
                

        if (hasil == 0) {
            System.out.print("Bilangan " + a + " merupakan bilangan genap \n"); //buat bilangan genap
        } else{
            System.out.print("Bilangan " + a +" merupakan bilangan ganjil \n"); //buat bilangan ganjil
        }



    }
}
