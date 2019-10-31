package monopoly;
import java.util.Scanner;


public class Monopoly {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);  

      Pemain p1 = new Pemain();
      p1.setwarna("hijau");
      p1.setnilai_uang(150000);
      
      Pemain p2 = new Pemain();
      p2.setwarna("biru");
      p2.setnilai_uang(150000);
      
      Pemain p3 = new Pemain();
      p3.setwarna("merah");
      p3.setnilai_uang(150000);
      
      Pemain p4 = new Pemain();
      p4.setwarna("kuning");
      p4.setnilai_uang(150000);
      
      
      petak petak = new petak();
      
      String perintah = "y";
      do{
      p1.lempardadu();
      System.out.println("Berada di " + petak.papan.daftar_petak.get(p1.getposisi()).getNama_petak());
      System.out.println("=========================");
      System.out.println("Lanjut ?");
      perintah = input.nextLine();
      System.out.println("");
      
      p2.lempardadu();
      System.out.println("Berada di " + petak.papan.daftar_petak.get(p2.getposisi()).getNama_petak());
      System.out.println("=========================");
      System.out.println("Lanjut ?");
      perintah = input.nextLine();
      System.out.println("");
      
      p3.lempardadu();
      System.out.println("Berada di " + petak.papan.daftar_petak.get(p3.getposisi()).getNama_petak());
      System.out.println("=========================");
      System.out.println("Lanjut ?");
      perintah = input.nextLine();
      System.out.println("");
      }
      while( perintah.equals("y"));
          
    }
    
}
