public class Film {
    private String ad;
    private double sure;
    private String director;

    public Film(String ad, double sure, String director) {
        this.ad = ad;
        this.sure = sure;
        this.director = director;
    }

    public String getAd() {
        return ad;
    }

    public double getSure() {
        return sure;
    }

    public String getDirector() {
        return director;
    }
}