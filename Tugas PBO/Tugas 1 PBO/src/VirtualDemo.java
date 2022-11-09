public class VirtualDemo {
    public static void main(String[] args) {
        Gaji s = new Gaji("Wahyu ", "KUBAR ", 3, 5000.00); //Polymorphism
        Pegawai e = new Gaji("Ini Nama ", "Samarinda ", 2, 2500.00); //Polymorphism, upcasting
        /*polymorphism karena keduanya merupakan objek baru di class Gaji, class Gaji merupakan turunan dari class Pegawai,
        maka kedua objek tersebut merupakan bagian dari class Gaji sekaligus Pegawai

        upcasting karena pegawai merupakan parent class, namun objek e di definisikan sebagai objek baru pada class gaji,
        sehingga subclass to superclass
        */
        System.out.println("Memanggil mailCheck Berdasarkan Referensi Gaji --");

        s.mailCheck();
        System.out.println("\nMemanggil mailCheck Berdasarkan Referensi Pegawai--");
        e.mailCheck();
    }
}
        /* menyusun pegawai tampil 2x karena karena penggunaan super() pada constructor di subclass yang mengakses 
        constructor superclass
        */