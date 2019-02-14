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
public class soalan2 {
  public static void main(String[] args){
      int jumlahBesar=jumlahSenarai();
      System.out.println("Jumlah nombor dalam senarai adalah " + jumlahBesar);
  }
  
  public static int jumlahSenarai(){
      int[] jawapan = senaraiNombor();
      int jum = 0;
   for( int j : jawapan){
      jum += j;
  }
          return jum;
    }
  
  public static int[] senaraiNombor(){
  Scanner scan = new Scanner(System.in);
     int nombor[] = new int[7];
     System.out.println("Taipkan 3 nombor : ");
     for(int i=0; i<7; i++){
     }
     
     return nombor;
  }
}
