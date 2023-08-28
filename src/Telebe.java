public class Telebe {
    private int id;
    private String ad;
    private String SOYAD;
    private int qrupNomresi;
    private int kurs;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSOYAD() {
        return SOYAD;
    }

    public void setSOYAD(String SOYAD) {
        this.SOYAD = SOYAD;
    }

    public int getQrup() {
        return qrupNomresi;
    }

    public void setQrup(int qrup) {
        this.qrupNomresi = qrup;
    }

    public int getKurs() {
        return kurs;
    }

    public void setKurs(int kurs) {
        this.kurs = kurs;
    }

    @Override
    public String toString() {
        return "Telebe{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", SOYAD='" + SOYAD + '\'' +
                ", qrup=" + qrupNomresi +
                ", kurs=" + kurs +
                '}';
    }

    public Telebe(int id, String ad, String SOYAD, int qrup, int kurs) {
        this.id = id;
        this.ad = ad;
        this.SOYAD = SOYAD;
        this.qrupNomresi = qrup;
        this.kurs = kurs;



    }
}
