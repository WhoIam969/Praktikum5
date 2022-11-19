package Pertemuan_6.Latihan;

public class Programmer extends Pegawai {
    double Bonus;

    //Subclass Construktor
    public Programmer(String Name,double GajiPokok) {
        super(Name, GajiPokok);
    }
    public void setBonus(double Bonus) {
        this.Bonus = Bonus;
    }
    public double getBonus() {
        return this.Bonus;
    }
    
    @Override
    public void cetakinfo() {
        super.cetakinfo();
    }

    public void cetakBonus() {
        Bonus = 2000000.00;
        System.out.println("Bonus : Rp." + this.Bonus);
    }
}
