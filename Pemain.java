package monopoly;

public class Pemain{
    private String warna;
    private int nilai_uang;
    private int posisi;
    private int posisiAwal;
    private int posisiAkhir;
    private int lempardadu;
    int ganda = 0;
    dadu dadu = new dadu();
    //method untuk menyimpan
    public void setwarna(String warna){
        this.warna = warna;
    }
    
    //method untuk memanggil
    public String getwarna(){
        return warna;
    }
    
    public void setposisi(int posisi){
        this.posisi = posisi;
    }
    
    public int getposisi(){
        return posisi;
    }
    
    public void setnilai_uang(int nilai_uang){
        this.nilai_uang = nilai_uang;
    }
    public int getnilai_uang(){
        return nilai_uang;
    }
    
    public void lempardadu(){
        dadu.kocokdadu();
        posisiAwal = posisiAkhir;
        posisiAkhir = dadu.getDadu() + posisiAwal;
        if (posisiAkhir > 40) {
            posisiAkhir -= 40;
            if(getposisi() != 1){
                setnilai_uang(20000);
            }
        }
        setposisi(posisiAkhir);
        bergerak();
    }
    
    public void bergerak(){
        System.out.println("==============================");
        System.out.println("^^^ warna "+ getwarna()+" ^^^");
        System.out.println("maju "+ dadu.getDadu() + " langkah");
        System.out.println("dadu 1 : "+ dadu.getDadu1());
        System.out.println("dadu 2 : "+ dadu.getDadu2());
        System.out.println("posisi awal : " + posisiAwal);
        System.out.println("posisi anda sekarang "+ getposisi());
    }
    
    public void dadu_ganda(){
        if (dadu.getDadu1() == dadu.getDadu2()) {
            System.out.println("dadu ganda");
            lempardadu();
            ganda = ganda + 1;
            if (ganda == 3) {
                System.out.println("anda Masuk penjara!!!");
                ganda = 0;
            }
        }
    }
}