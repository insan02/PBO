public class Simulator {
    public static void main(String[] args){
    
        int totalJamSibuk;
        Asdos a = new Asdos(" Fairuzikun ", 21, 10 ); //Upcasting
        Elemen b = new Asdos(" Angel-chan ", 20, 4); 
        Dosen c = new Dosen(" Raja OP Damanik ", 5); //Upcasting
        Elemen d = new Dosen(" Nivotko ", 3);
        Mahasiswa e = new Mahasiswa(" Firman ", 20); //Upcasting
        Elemen f = new Mahasiswa(" Nid to pass this sem ", 23); 
        
        a.display();
        c.display();
        b.display();
        e.display();
        f.display();
        d.display();

        totalJamSibuk = a.getJamSibuk() + b.getJamSibuk() + c.getJamSibuk() + d.getJamSibuk() + 
                        e.getJamSibuk() + f.getJamSibuk();
        System.out.println(" Total jam sibuk elemen Fasilkom adalah " + totalJamSibuk);

    } 
        
}
