public class Cashier {
    private int id;
    private String ad;
    private String soyad;
    private String ayliqTecrube;
    private int umumiSatisMeblegi;

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

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getAyliqTecrube() {
        return ayliqTecrube;
    }

    public void setAyliqTecrube(String ayliqTecrube) {
        this.ayliqTecrube = ayliqTecrube;
    }

    public int getUmumiSatisMeblegi() {
        return umumiSatisMeblegi;
    }

    public void setUmumiSatisMeblegi(int umumiSatisMeblegi) {
        this.umumiSatisMeblegi = umumiSatisMeblegi;
    }

    @Override
    public String toString() {
        return "Cashier{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", ayliqTecrube='" + ayliqTecrube + '\'' +
                ", umumiSatisMeblegi=" + umumiSatisMeblegi +
                '}';
    }

    public Cashier(int id, String ad, String soyad, String ayliqTecrube, int umumiSatisMeblegi) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.ayliqTecrube = ayliqTecrube;
        this.umumiSatisMeblegi = umumiSatisMeblegi;


    }
}
