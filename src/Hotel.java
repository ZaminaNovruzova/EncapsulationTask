public class Hotel {
        private String ad;
    private String seher;
    private String olke;
    private int otaqSayi;
    private String ulduz;
    private Boolean uzguculukHovuzu;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSeher() {
        return seher;
    }

    public void setSeher(String seher) {
        this.seher = seher;
    }

    public String getOlke() {
        return olke;
    }

    public void setOlke(String olke) {
        this.olke = olke;
    }

    public int getOtaqSayi() {
        return otaqSayi;
    }

    public void setOtaqSayi(int otaqSayi) {
        this.otaqSayi = otaqSayi;
    }

    public String getUlduz() {
        return ulduz;
    }

    public void setUlduz(String ulduz) {
        this.ulduz = ulduz;
    }

    public Boolean getUzguculukHovuzu() {
        return uzguculukHovuzu;
    }

    public void setUzguculukHovuzu(Boolean uzguculukHovuzu) {
        this.uzguculukHovuzu = uzguculukHovuzu;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "ad='" + ad + '\'' +
                ", seher='" + seher + '\'' +
                ", olke='" + olke + '\'' +
                ", otaqSayi=" + otaqSayi +
                ", ulduz='" + ulduz + '\'' +
                ", uzguculukHovuzu=" + uzguculukHovuzu +
                '}';
    }

    public Hotel(String ad, String seher, String olke, int otaqSayi, String ulduz, Boolean uzguculukHovuzu) {
        this.ad = ad;
        this.seher = seher;
        this.olke = olke;
        this.otaqSayi = otaqSayi;
        this.ulduz = ulduz;
        this.uzguculukHovuzu = uzguculukHovuzu;


    }
}
