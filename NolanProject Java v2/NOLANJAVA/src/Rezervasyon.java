public class Rezervasyon {
    private String ad;
    private String soyad;
    private String eposta;
    private String telefonNo;
    private Film film;
    private String seans;
    private Koltuk koltuk;
    private String odemeSekli;
    private double toplamTutar;

    public Rezervasyon(String ad, String soyad, String eposta, String telefonNo, Film film, String seans,
            Koltuk koltuk, String odemeSekli, double toplamTutar) {
        this.ad = ad;
        this.soyad = soyad;
        this.eposta = eposta;
        this.telefonNo = telefonNo;
        this.film = film;
        this.seans = seans;
        this.koltuk = koltuk;
        this.odemeSekli = odemeSekli;
        this.toplamTutar = toplamTutar;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public String getEposta() {
        return eposta;
    }

    public String getTelefonNo() {
        return telefonNo;
    }

    public Film getFilm() {
        return film;
    }

    public String getSeans() {
        return seans;
    }

    public Koltuk getKoltuk() {
        return koltuk;
    }

    public String getOdemeSekli() {
        return odemeSekli;
    }

    public double getToplamTutar() {
        return toplamTutar;
    }
}