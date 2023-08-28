public class Book {
    private int id;
    private String ad;
    private String muellif;
    private String janr;
    private int qiymet;

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

    public String getMuellif() {
        return muellif;
    }

    public void setMuellif(String muellif) {
        this.muellif = muellif;
    }

    public String getJanr() {
        return janr;
    }

    public void setJanr(String janr) {
        this.janr = janr;
    }

    public int getQiymet() {
        return qiymet;
    }

    public void setQiymet(int qiymet) {
        this.qiymet = qiymet;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", muellif='" + muellif + '\'' +
                ", janr='" + janr + '\'' +
                ", qiymet=" + qiymet +
                '}';
    }

    public Book(int id, String ad, String muellif, String janr, int qiymet) {
        this.id = id;
        this.ad = ad;
        this.muellif = muellif;
        this.janr = janr;
        this.qiymet = qiymet;


    }
}
