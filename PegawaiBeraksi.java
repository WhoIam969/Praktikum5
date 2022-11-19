package Pertemuan_6.Latihan;

public class PegawaiBeraksi {
    public static void main(String[] args) {
        //Membuat Objek
        Manager manager = new Manager("Rohmat",6000000.00);
        manager.cetakinfo();
        manager.cetakTunjangan();
        System.out.println("============================");
        Programmer programer = new Programmer("Udin",5000000.00);
        programer.cetakinfo();
        programer.cetakBonus();

    }
    
}
