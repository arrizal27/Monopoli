package monopoly;
import java.util.ArrayList;

public class papan {
  String kartu;
  ArrayList<petak> daftar_petak;
  
    /**
     *
     */
    public papan(){
      daftar_petak = new ArrayList<petak>();
  }
  public void tambah_petak(petak ptk){
      daftar_petak.add(ptk);
  }
  
  String penjara;
  String negara;
  String rumah;
  
  public static void beli_tanah(){}
  public static void dapat_uang(){}
  public static void jual_tanah(){}
  public static void bayar_pajak(){}
  public static void masuk_penjara(){}
  public static void keluar_penjara(){}
  
}
