/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc 12
 */
import java.util.Scanner;
public class soalan3 {
public static void main(String[] args){
    
    Scanner input = new Scanner(System.in);
    System.out.print("Taip satu perkataan yang panjang: ");
    String ayat = input.nextLine();
    
    System.out.println("Bilangan aksara dalam ayat adalah : " + bilangAksara(ayat));
    
    System.out.print("\n");
    
    semakVowel(ayat);
  }

public static int bilangAksara(String ayat){
    
    int jumlahAksara = 0;
    for (int i = 0; i < ayat.length (); i++){
        if (dapatAksara(ayat.charAt(i))) jumlahAksara++;
    
}
return jumlahAksara;
}

public static boolean dapatAksara(char huruf){
    huruf = Character.toUpperCase(huruf);
    return (huruf >= 'A' && huruf <= 'Z');
}

public static void semakVowel(String ayat){
  System.out.println("Bilangan Vokal: " +
                    (ayat.length() - ayat.toLowerCase().replaceAll
                    ("a|e|i|o|u","").length()));
   }
} 
