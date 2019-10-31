package monopoly;
import java.util.Random;

public class dadu {
    private int dadu1;
    private int dadu2;
    private int jmlnilai;
    int jmllempar;
    boolean dadusama =  false;
    
    Random acak = new Random();
    
    public void setDadu(int dadu1, int dadu2){
        this.dadu1 = dadu1;
        this.dadu2 = dadu2;
        
        jmlnilai = dadu1 + dadu2;
    }
    public int getDadu(){
        return jmlnilai;
    }
    
    public void kocokdadu(){
        int dadu1 = 1+acak.nextInt(6);
        int dadu2 = 1+acak.nextInt(6);
        setDadu(dadu1, dadu2);
    }
    
    public int getDadu1(){
        return dadu1;
    }
    public int getDadu2(){
        return dadu2;
    }
}
