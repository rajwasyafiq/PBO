    package id.ac.upj.tif.uaspbo;

public class ModelTable {

    String id;
    String jenis, nama;

    public ModelTable(String jenis, String nama, String id){
        this.id = id;
        this.jenis = jenis;
        this.nama = nama;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
