import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcı bilgilerini al
        System.out.print("Adınız: ");
        String ad = scanner.nextLine();

        System.out.print("Soyadınız: ");
        String soyad = scanner.nextLine();

        System.out.print("E-posta Adresiniz: ");
        String eposta = scanner.nextLine();

        System.out.print("Telefon Numaranız: ");
        String telefonNo = scanner.nextLine();

        // Filmleri oluştur
        Film film1 = new Film("Oppenheimer", 2.3, "Christopher Nolan");
        Film film2 = new Film("The Prestige", 2.1, "Christopher Nolan");

        // Filmleri göster
        System.out.println("\nFilmler:");
        System.out.println("1. " + film1.getAd());
        System.out.println("   Süre: " + film1.getSure() + " saat");
        System.out.println("   Yönetmen: " + film1.getDirector());
        System.out.println("2. " + film2.getAd());
        System.out.println("   Süre: " + film2.getSure() + " saat");
        System.out.println("   Yönetmen: " + film2.getDirector());

        // Kullanıcıdan film seçmesini iste
        int filmSecim = 0;
        while (filmSecim != 1 && filmSecim != 2) {
            try {
                System.out.print("Film seçiniz (1 veya 2): ");
                filmSecim = Integer.parseInt(scanner.nextLine());
                if (filmSecim != 1 && filmSecim != 2) {
                    throw new IllegalArgumentException();
                }
            } catch (NumberFormatException e) {
                System.out.println("Hatalı giriş! Lütfen geçerli bir sayı girin.");
            } catch (IllegalArgumentException e) {
                System.out.println("Hatalı giriş! Lütfen 1 veya 2 seçin.");
            }
        }

        // Kullanıcıdan seans seçmesini iste
        int seansSecim = 0;
        while (seansSecim != 1 && seansSecim != 2) {
            try {
                System.out.println("\nSeanslar:");
                System.out.println("1. 12.06.2023 14:00");
                System.out.println("2. 12.06.2023 22:00");
                System.out.print("Seans seçiniz (1 veya 2): ");
                seansSecim = Integer.parseInt(scanner.nextLine());
                if (seansSecim != 1 && seansSecim != 2) {
                    throw new IllegalArgumentException();
                }
            } catch (NumberFormatException e) {
                System.out.println("Hatalı giriş! Lütfen geçerli bir sayı girin.");
            } catch (IllegalArgumentException e) {
                System.out.println("Hatalı giriş! Lütfen 1 veya 2 seçin.");
            }
        }

        // Kullanıcıdan koltuk seçmesini iste
        String koltukSecim = "";
        while (!koltukSecim.equals("2A") && !koltukSecim.equals("3A") && !koltukSecim.equals("4A") && !koltukSecim.equals("5A")) {
            System.out.println("\nBoş Koltuklar: 2A 3A 4A 5A");
            System.out.print("Lütfen boş bir koltuk seçin: ");
            koltukSecim = scanner.nextLine().toUpperCase();
            if (!koltukSecim.equals("2A") && !koltukSecim.equals("3A") && !koltukSecim.equals("4A") && !koltukSecim.equals("5A")) {
                System.out.println("Hatalı giriş! Lütfen geçerli bir koltuk seçin.");
            }
        }

        // Kullanıcıdan ödeme seçmesini iste
        String odemeSecim = "";
        while (!odemeSecim.equals("nakit") && !odemeSecim.equals("kart")) {
            System.out.print("Ödeme şeklini seçin (nakit veya kart): ");
            odemeSecim = scanner.nextLine().toLowerCase();
            if (!odemeSecim.equals("nakit") && !odemeSecim.equals("kart")) {
                System.out.println("Hatalı giriş! Lütfen geçerli bir ödeme şekli seçin.");
            }
        }

        // Rezervasyon bilgilerini oluştur
        Film secilenFilm = (filmSecim == 1) ? film1 : film2;
        String secilenSeans = (seansSecim == 1) ? "12.06.2023 14:00" : "12.06.2023 22:00";
        Koltuk secilenKoltuk = new Koltuk(koltukSecim);
        double toplamTutar = 50.0;

        // Rezervasyon bilgilerini göster
        System.out.println("\nRezervasyon Bilgileri:");
        System.out.println("Ad: " + ad);
        System.out.println("Soyad: " + soyad);
        System.out.println("E-posta Adresi: " + eposta);
        System.out.println("Telefon No: " + telefonNo);
        System.out.println("Ödeme Şekli: " + odemeSecim);
        System.out.println("Toplam Tutar: " + toplamTutar + " TL");
        System.out.println("Film Adı: " + secilenFilm.getAd());
        System.out.println("Tarih: " + secilenSeans);
        System.out.println("Koltuk: " + secilenKoltuk.getAd());

        // Kullanıcıdan rezervasyonu onaylamasını iste
        String rezervasyonOnay = "";
        while (!rezervasyonOnay.equalsIgnoreCase("evet") && !rezervasyonOnay.equalsIgnoreCase("hayır")) {
            System.out.print("Rezervasyonu onaylıyor musunuz? (Evet/Hayir): ");
            rezervasyonOnay = scanner.nextLine();
            if (!rezervasyonOnay.equalsIgnoreCase("evet") && !rezervasyonOnay.equalsIgnoreCase("hayır")) {
                System.out.println("Hatalı giriş! Lütfen Evet veya Hayir yanıtı verin.");
            }
        }

        // Rezervasyonu işle
        if (rezervasyonOnay.equalsIgnoreCase("evet")) {
            System.out.println("Rezervasyon kaydedildi. İyi seyirler!");
        } else {
            System.out.println("Rezervasyon iptal edildi.");
        }

        scanner.close();
    }
}