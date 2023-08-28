public class City {
    private String ad;
    private String ehali;
    private String olke;
    private int sahe;
    private boolean denizkenari;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getEhali() {
        return ehali;
    }

    public void setEhali(String ehali) {
        this.ehali = ehali;
    }

    public String getOlke() {
        return olke;
    }

    public void setOlke(String olke) {
        this.olke = olke;
    }

    public int getSahe() {
        return sahe;
    }

    public void setSahe(int sahe) {
        this.sahe = sahe;
    }

    public boolean isDenizkenari() {
        return denizkenari;
    }

    public void setDenizkenari(boolean denizkenari) {
        this.denizkenari = denizkenari;
    }

    @Override
    public String toString() {
        return "City{" +
                "ad='" + ad + '\'' +
                ", ehali='" + ehali + '\'' +
                ", olke='" + olke + '\'' +
                ", sahe=" + sahe +
                ", denizkenari=" + denizkenari +
                '}';
    }

    public City(String ad, String ehali, String olke, int sahe, boolean denizkenari) {
        this.ad = ad;
        this.ehali = ehali;
        this.olke = olke;
        this.sahe = sahe;
        this.denizkenari = denizkenari;

    }
}
