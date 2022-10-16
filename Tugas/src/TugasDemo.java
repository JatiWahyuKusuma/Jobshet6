public class TugasDemo {
    public static void main(String[] args) {
        Dosen d1 = new Dosen(50000, "002145", "Rivan Alamsyah", "Surabaya");
        d1.setSKS();
        Pegawai peg1 = new Pegawai("004563", "Rendy Suyono ", "Malang");
        DaftarGaji dGaji = new DaftarGaji(10);

        System.out.println("=======================");
        System.out.println("|      DATA GAJI      |");
        System.out.println("=======================");
        dGaji.addPegawai(peg1);
        dGaji.addPegawai(d1);
        dGaji.printSemuaGaji();
        System.out.println("=======================");
    
    }       
}


