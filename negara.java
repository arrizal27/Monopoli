package monopoly;
    
public class negara extends petak {
    private String Nama_negara;
    private int harga;
    private int posisi;
    private String komplek;
        


    @Override
    public void setNama_petak(String n) {
        super.setNama_petak("Negara " + n); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setharga(int harga){
        harga = harga;
    }
    public int getharga(){
        return harga;
    }
    
    public void setkomplek(String komplek){
        komplek = komplek;
    }
    public String getkomplek(){
        return komplek;
    }
    
}
