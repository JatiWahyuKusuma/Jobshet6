public class DaftarGaji {
    public Pegawai [] listPegawai;
    public int jmlPegawai;
    
    DaftarGaji(int jumlah){
        listPegawai = new Pegawai[jumlah];
    }

    public void addPegawai(Pegawai pegawai){
        listPegawai[jmlPegawai] = pegawai;
        jmlPegawai++;
    }

    public void printSemuaGaji(){
        for(int i = 0;i < jmlPegawai; i++){
            System.out.println("Nama        = "+listPegawai[i].getNama());
            System.out.println("Nip         = "+listPegawai[i].nip);
            System.out.println("Alamat      = "+listPegawai[i].alamat);
            System.out.println("Total Gaji  = "+listPegawai[i].getGaji());
        }
    }
}
