public class Mahasiswa extends Elemen {
    public int jamSibuk;
    public int SKS;
    

    public Mahasiswa (String nama, int SKS){
       super(nama); 
       jamSibuk = SKS * 3;
    } 

    public void display(){
        System.out.println(getNama() + " adalah seorang mahasiswa dengan jam sibuk " + getJamSibuk());
    }

    public int getJamSibuk(){ //Polymorphism
        return jamSibuk;
    }
}
