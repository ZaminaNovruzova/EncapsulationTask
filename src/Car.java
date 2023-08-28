public class Car {
    private int id;
    private String ad;
    private String suret;
    private String sahibkar;
    private String qiymet;

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

    public String getSuret() {
        return suret;
    }

    public void setSuret(String suret) {
        this.suret = suret;
    }

    public String getSahibkar() {
        return sahibkar;
    }

    public void setSahibkar(String sahibkar) {
        this.sahibkar = sahibkar;
    }

    public String getQiymet() {
        return qiymet;
    }

    public void setQiymet(String qiymet) {
        this.qiymet = qiymet;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", suret='" + suret + '\'' +
                ", sahibkar='" + sahibkar + '\'' +
                ", qiymet='" + qiymet + '\'' +
                '}';
    }

    public Car(int id, String ad, String suret, String sahibkar, String qiymet) {
        this.id = id;
        this.ad = ad;
        this.suret = suret;
        this.sahibkar = sahibkar;
        this.qiymet = qiymet;


    }
}
