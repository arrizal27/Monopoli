package monopoly;

public class petak {
    private String Nama_petak;
    public int posisi;
    
    //objek
    public papan papan = new papan();
    
    public void setNama_petak(String n){
        Nama_petak = n;
    }
    public String getNama_petak(){
        return Nama_petak;
    }
    public void setposisi(int posisi){
        this.posisi = posisi;
    }
    public int getposisi()
    {
        return posisi;
    }
    
    public void setpetak(){
      start mulai = new start();
      mulai.setNama_petak("start");
      mulai.setposisi(1);
      
      negara indo = new negara();
      indo.setposisi(2);
      indo.setNama_petak("Indonesia");
      indo.setkomplek("A");
      indo.setharga(6000);
      
      kartu_danaumum du1 = new kartu_danaumum();
      du1.setposisi(3);
      du1.setNama_petak("dana umum");
      
      negara malay = new negara();
      malay.setposisi(4);
      malay.setNama_petak("Malaysia");
      malay.setkomplek("A");
      malay.setharga(600);
      
      petak pajak_jalan = new petak();
      pajak_jalan.setposisi(5);
      pajak_jalan.setNama_petak("Pajak Jalan");
      
      petak airport = new petak();
      airport.setposisi(6);
      airport.setNama_petak("Changi Airport");
      
      negara singa = new negara();
      singa.setposisi(7);
      singa.setNama_petak("Singapura");
      singa.setkomplek("B");
      singa.setharga(10000);
      
      kartu_kesempatan kk1 = new kartu_kesempatan();
      kk1.setNama_petak("Kesempatan");
      kk1.setposisi(8);
      
      negara hoko = new negara();
      hoko.setposisi(9);
      hoko.setNama_petak("Hongkong");
      hoko.setkomplek("B");
      hoko.setharga(10000);
      
      negara taiwan = new negara();
      taiwan.setposisi(10);
      taiwan.setNama_petak("Taiwan");
      taiwan.setkomplek("B");
      taiwan.setharga(12000);
      
      petak penjara = new petak();
      penjara.setposisi(11);
      penjara.setNama_petak("Penjara");
      
      negara pilip = new negara();
      pilip.setposisi(12);
      pilip.setNama_petak("Philipina");
      pilip.setkomplek("C");
      pilip.setharga(14000);
      
      petak listrik = new petak();
      listrik.setposisi(13);
      listrik.setNama_petak("Perusahaan Listrik");
      
      negara thai = new negara();
      thai.setposisi(14);
      thai.setNama_petak("Thailand");
      thai.setkomplek("C");
      thai.setharga(14000);
      
      negara viet = new negara();
      viet.setposisi(15);
      viet.setNama_petak("Vietnam");
      viet.setkomplek("C");
      viet.setharga(16000);
      
      Transport tokyo = new Transport();
      tokyo.setposisi(16);
      tokyo.setNama_petak("Terminal Bus Tokyo");
      tokyo.setHarga(20000);
      
      negara jepang = new negara();
      jepang.setposisi(17);
      jepang.setNama_petak("Jepang");
      jepang.setkomplek("D");
      jepang.setharga(16000);
      
      kartu_danaumum du2 = new kartu_danaumum();
      du2.setposisi(18);
      du2.setNama_petak("Dana Umum");
    
      
      negara korea = new negara();
      korea.setposisi(19);
      korea.setNama_petak("Korea");
      korea.setkomplek("D");
      korea.setharga(18000);
      
      negara india = new negara();
      india.setposisi(20);
      india.setNama_petak("India");
      india.setkomplek("D");
      india.setharga(20000);
      
      Bebas_Parkir bp = new Bebas_Parkir();
      bp.setposisi(21);
      bp.setNama_petak("Bebas Parkir");
      
      negara china = new negara();
      china.setposisi(22);
      china.setNama_petak("China");
      china.setkomplek("E");
      china.setharga(22000);
      
      kartu_kesempatan kk2 = new kartu_kesempatan();
      kk2.setNama_petak("Kesempatan");
      kk2.setposisi(23);
      
      negara uni_soviet = new negara();
      uni_soviet.setposisi(24);
      uni_soviet.setNama_petak("Uni Soviet");
      uni_soviet.setkomplek("E");
      uni_soviet.setharga(22000);
      
      negara italia = new negara();
      italia.setposisi(25);
      italia.setNama_petak("Italia");
      italia.setkomplek("E");
      italia.setharga(24000);
      
      Transport london = new Transport();
      london.setNama_petak("Stasiun London");
      london.setposisi(26);
      
      negara inggris = new negara();
      inggris.setposisi(27);
      inggris.setNama_petak("Inggris");
      inggris.setkomplek("F");
      inggris.setharga(26000);
      
      negara perancis = new negara();
      perancis.setposisi(28);
      perancis.setNama_petak("Perancis");
      perancis.setkomplek("F");
      perancis.setharga(26000);
      
      Perusahaan air = new Perusahaan();
      air.setNama_petak("Air");
      air.setposisi(29);
      air.setHarga(15000);
      
      negara belanda = new negara();
      belanda.setposisi(30);
      belanda.setNama_petak("Belanda");
      belanda.setkomplek("F");
      belanda.setharga(28000);
      
      Penjara bui = new Penjara();
      bui.setNama_petak("Masuk Penjara");
      bui.setposisi(31);
      
      negara kanada = new negara();
      kanada.setposisi(32);
      kanada.setNama_petak("Kanada");
      kanada.setkomplek("G");
      kanada.setharga(30000);
      
      negara amerika = new negara();
      amerika.setposisi(33);
      amerika.setNama_petak("Amerika");
      amerika.setkomplek("G");
      amerika.setharga(30000);
      
      kartu_danaumum du3 = new kartu_danaumum();
      du3.setposisi(34);
      du3.setNama_petak("Dana Umum");
      
      negara brazil = new negara();
      brazil.setposisi(34);
      brazil.setNama_petak("Brazil");
      brazil.setkomplek("G");
      brazil.setharga(32000);
      
      Transport sydney = new Transport();
      sydney.setNama_petak("Pelabuhan Sydney");
      sydney.setposisi(35);
      
      kartu_kesempatan kk3 = new kartu_kesempatan();
      kk3.setNama_petak("Kesempatan");
      kk3.setposisi(36);
      
      negara australia = new negara();
      australia.setposisi(37);
      australia.setNama_petak("Australia");
      australia.setkomplek("H");
      australia.setharga(35000);
      
      Pajak isti = new Pajak();
      isti.setNama_petak("Istimewa");
      isti.setposisi(38);
      
      negara afrika = new negara();
      afrika.setposisi(39);
      afrika.setNama_petak("Afrika");
      afrika.setkomplek("H");
      afrika.setharga(40000);
      
      papan.tambah_petak(mulai);
      papan.tambah_petak(indo);
      papan.tambah_petak(du1);
      papan.tambah_petak(malay);
      papan.tambah_petak(pajak_jalan);
      papan.tambah_petak(airport);
      papan.tambah_petak(singa);
      papan.tambah_petak(hoko);
      papan.tambah_petak(taiwan);
      papan.tambah_petak(penjara);
      papan.tambah_petak(pilip);
      papan.tambah_petak(listrik);
      papan.tambah_petak(thai);
      papan.tambah_petak(viet);
      papan.tambah_petak(tokyo);
      papan.tambah_petak(jepang);
      papan.tambah_petak(du2);
      papan.tambah_petak(korea);
      papan.tambah_petak(india);
      papan.tambah_petak(bp);
      papan.tambah_petak(china);
      papan.tambah_petak(kk2);
      papan.tambah_petak(uni_soviet);
      papan.tambah_petak(italia);
      papan.tambah_petak(london);
      papan.tambah_petak(inggris);
      papan.tambah_petak(perancis);
      papan.tambah_petak(air);
      papan.tambah_petak(belanda);
      papan.tambah_petak(bui);
      papan.tambah_petak(kanada);
      papan.tambah_petak(amerika);
      papan.tambah_petak(du3);
      papan.tambah_petak(brazil);
      papan.tambah_petak(sydney);
      papan.tambah_petak(kk3);
      papan.tambah_petak(australia);
      papan.tambah_petak(isti);
      papan.tambah_petak(afrika);
    }
}
