public class Pelanggan {
    private String id, nama, jenis;
    private int tahunLahir;

    public Pelanggan(String id, String nama, String jenis,
            int tahunLahir) {
        this.id = id;
        this.nama = nama;
        this.jenis = jenis;
        this.tahunLahir = tahunLahir;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getJenis() {
        return jenis;
    }

    public int getTahunLahir() {
        return tahunLahir;
    }
}