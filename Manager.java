package Pertemuan_6.Latihan;

public class Manager extends Pegawai {
    double Tunjangan;

    //Subclass Construktor
    public Manager(String Nama,double GajiPokok) {
        super(Nama, GajiPokok);
    }
    public void setTunjangan(double Tunjangan) {
        this.Tunjangan = Tunjangan;
    }
    public double getTunjangan() {
        return this.Tunjangan;
    }

    @Override
    public void cetakinfo() {
        super.cetakinfo();
    }

    public void cetakTunjangan() {
        Tunjangan = 4000000;
        System.out.println("Tunjangan : Rp." + this.Tunjangan);
    }

}
