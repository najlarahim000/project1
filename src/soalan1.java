/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pc 12
 */
public class soalan1 {
    static java.util.Scanner input = new java.util.Scanner(System.in);
public static void main(String[] args) {
    String s;
    System.out.println("KIRA ISIPADU SEBUAH PIRAMID");
    
  do{
      System.out.print("Panjang Tapak: ");
      double panjangTapak = input.nextDouble();
      
      System.out.print("Lebar Tapak: ");
      double lebarTapak = input.nextDouble();
      
      System.out.print("Tinggi: ");
      double tinggiPiramid = input.nextDouble();
      
      double jawapan = isipaduPiramid(panjangTapak, lebarTapak, tinggiPiramid);
      System.out.println("Isipadu bagi Piramid adalah: "+jawapan);
      
      System.out.println("Taipkan Y untuk teruskan..");
      System.out.println("Taipkan N untuk tamatkan..");
      s = input.next();
      
      }while (s.equals("y")||s.equals("Y"));
  
    }

public static double isipaduPiramid(double panjangTapak, double lebarTapak, double tinggiPiramid){
    
     double isipaduPiramid = ((panjangTapak * lebarTapak) * tinggiPiramid) / 3;
 return Math.round(isipaduPiramid);
}
}
