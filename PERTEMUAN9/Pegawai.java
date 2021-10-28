public class Pegawai extends Manusia {
    private String gelarBelakang;

    public String getGelarBelakang() {
        return gelarBelakang;
    }
    public void setGelarBelakang(String gelarBelakang) {
        this.gelarBelakang = gelarBelakang;
    }
    public void dataSingkat() {
        this.namaLengkap();
        System.out.println("Umur: " + this.getUmur() + " tahun");
    }
    public void namaLengkap() {
        System.out.println("Nama Pegawai: " + this.getNamaDepan)
    }

}