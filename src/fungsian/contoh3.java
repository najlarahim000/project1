/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fungsian;

/**
 *
 * @author pc 12
 */
import java.util.Scanner;
public class contoh3 {
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
  System.out.println("Taipkan dua nombor : ");
  int i=scan.nextInt();
  int j=scan.nextInt();
  int nomborRendah = rendah(i, j) ;
  int nomborTinggi = tinggi(i, j) ;
  
  System.out.println("Nombor Rendah antara " + i + " dan " + j + " adalah " + nomborRendah);
  System.out.println("Nombor Tinggi antara " + i + " dan " + j + " adalah " + nomborTinggi);
}

public static int tinggi(int n1, int n2){
    int tinggi;
    tinggi=Math.max(n1, n2);
    return tinggi;
}

public static int rendah(int n1, int n2){
    int rendah;
   rendah=Math.min(n1, n2);
    return rendah;
}
  }
