public class Asdos extends Mahasiswa {

    public int jamNgasdos;
    
    public Asdos(String nama, int SKS, int jamNgasdos){
        super(nama, SKS); 
        jamSibuk = jamSibuk + jamNgasdos ; 
    }

    public int getJamSibuk(){ //Polymorphism
        return jamSibuk;
    } 
}
