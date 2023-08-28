public class Subject {

        private int id;
    private String ad;
    private int muhazireSaati;
    private int EmekSaati;
    private String seminar;
    private boolean kursIsi;

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

    public int getMuhazireSaati() {
        return muhazireSaati;
    }

    public void setMuhazireSaati(int muhazireSaati) {
        this.muhazireSaati = muhazireSaati;
    }

    public int getEmekSaati() {
        return EmekSaati;
    }

    public void setEmekSaati(int emekSaati) {
        EmekSaati = emekSaati;
    }

    public String getSeminar() {
        return seminar;
    }

    public void setSeminar(String seminar) {
        this.seminar = seminar;
    }

    public boolean isKursIsi() {
        return kursIsi;
    }

    public void setKursIsi(boolean kursIsi) {
        this.kursIsi = kursIsi;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", muhazireSaati=" + muhazireSaati +
                ", EmekSaati=" + EmekSaati +
                ", seminar='" + seminar + '\'' +
                ", kursIsi=" + kursIsi +
                '}';
    }

    public Subject(int id, String ad, int muhazireSaati, int emekSaati, String seminar, boolean kursIsi) {
        this.id = id;
        this.ad = ad;
        this.muhazireSaati = muhazireSaati;
        EmekSaati = emekSaati;
        this.seminar = seminar;
        this.kursIsi = kursIsi;



    }
}
