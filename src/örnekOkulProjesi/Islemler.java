package örnekOkulProjesi;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Islemler {

	static Scanner scan = new Scanner(System.in);

	private static Ogretmen ogretmen;
	private static Ogrenci ogrenci;
	static List<Ogretmen> ogretmenListesi = new ArrayList<>();
	static List<Ogrenci> ogrenciListesi = new ArrayList<>();
	static ListIterator<?> iteratorList;
	static Iterator<?> iterator;
	static String kisiTuru;

	public static void anaMenu() {
		System.out.println("====================================" + "\nÖÐRENCÝ VE ÖÐRETMEN YÖNETÝM PANELÝ"
				+ "\n====================================" + "\nLÜTFEN YAPMAK ÝSTEDÝÐÝNÝZ ÝÞLEMÝ SEÇÝNÝZ : "
				+ "\n1- ÖÐRENCÝ ÝÞLEMLERÝ\r\n" + "2- ÖÐRETMEN ÝÞLEMLERÝ\r\n" + "Q- ÇIKIÞ");
		String sonuc = scan.nextLine();

		if (sonuc.equalsIgnoreCase("q")) {
			cikis();
		} else if (sonuc.equalsIgnoreCase("1")) {
			kisiTuru = "OGRENCI";
			islemMenusu();
		} else if (sonuc.equalsIgnoreCase("2")) {
			kisiTuru = "OGRETMEN";
			islemMenusu();
		} else {
			System.out.println("Yanlýþ giriþ yaptýnýz..");
		}

	}

	private static void islemMenusu() {
		System.out.println("=====ÝÞLEMLER=====");
		System.out.println("1- EKLEME\n2- ARAMA\n3- LÝSTELEME\n4- SÝLME\n5- ANA MENÜ\nQ- ÇIKIÞ");
		System.out.println("lütfen yapmak istediðiniz iþlemi seçiniz");
		String tercih = scan.next().toLowerCase();
		scan.nextLine();

		switch (tercih) {
		case "1":
			ekleme();
			break;
		case "2":
			arama();
			break;
		case "3":
			listeleme();
			break;
		case "4":
			silme();
			break;
		case "5":
			anaMenu();
			break;
		case "6":
			cikis();
			break;
		default:
			break;
		}

	}

	private static void silme() {

		if (kisiTuru.equals("OGRENCI")) {
			if (ogrenciListesi.size() == 0) {
				System.out.println("Öðrenci listesi boþtur.");
			} else {
				System.out.println("Silmek istediðiniz öðrencinin kimlik numarasýný giriniz.");
				int kimlikNo = scan.nextInt();
				for (int i = 0; i < ogrenciListesi.size(); i++) {

					if (kimlikNo == ogrenciListesi.get(i).getKimlikNo()) {
						System.out.println("Kimlik numarasý" + ogrenciListesi.get(i).getKimlikNo()
								+ " olan öðrenci kaydý silindi.");
						ogrenciListesi.remove(i);

						System.out.println("Öðrencilerin Listesi : \n");
						iteratorList = ogrenciListesi.listIterator();
						while (iteratorList.hasNext()) {

							System.out.println(iteratorList.next());
						}
					}
				}
			}
		}
		if (kisiTuru.equals("OGRETMEN")) {
			if (ogretmenListesi.size() == 0) {
				System.out.println("Öðretmen listesi boþtur.");
			} else {
				System.out.println("Silmek istediðiniz öðretmenin kimlik numarasýný giriniz.");
				int kimlikNo1 = scan.nextInt();
				for (int i = 0; i < ogretmenListesi.size(); i++) {

					if (kimlikNo1 == ogretmenListesi.get(i).getKimlikNo()) {
						System.out.println("Kimlik numarasý " + ogrenciListesi.get(i).getKimlikNo()
								+ " olan öðretmen kaydý silindi.");
						ogretmenListesi.remove(i);
						System.out.println("Öðretmenlerin Listesi : \n");
						iteratorList = ogretmenListesi.listIterator();
						while (iteratorList.hasNext()) {

							System.out.println(iteratorList.next());
						}

					}
				}
			}
		}
		islemMenusu();

	}

	private static void listeleme() {

		if (kisiTuru.equals("OGRETMEN")) {
			iteratorList = ogretmenListesi.listIterator();
			if (iteratorList.hasNext()) {
				while (iteratorList.hasNext()) {

					System.out.println(iteratorList.next());
				}
			} else {
				System.out.println("Öðretmen listesi boþtur.");
			}

		} else {
			iterator = ogrenciListesi.iterator();
			if (iterator.hasNext()) {
				while (iterator.hasNext()) {

					System.out.println(iterator.next());
				}
			} else {
				System.out.println("Öðrenci listesi boþtur.");
			}
		}
		System.out.println("");
		islemMenusu();
	}

	private static void arama() {
		System.out.println("Aramak istediðiniz yöntemi belirtiniz\n1- Ýsim\n2- Kimlik Numarasý");
		int tercihArama = scan.nextInt();
		if (tercihArama == 1) {
			if (kisiTuru.equals("OGRENCI")) {
				if (ogrenciListesi.size() == 0) {
					System.out.println("Öðrenci listesi boþtur.");
				} else {
					System.out.println("Aramak istediðiniz öðrencinin ismini giriniz.");
					scan.nextLine();
					String isim = scan.nextLine();
					for (int i = 0; i < ogrenciListesi.size(); i++) {

						if (isim.equalsIgnoreCase(ogrenciListesi.get(i).getAdi())) {
							System.out.println(ogrenciListesi.get(i));
						}
					}
				}
			}
			if (kisiTuru.equals("OGRETMEN")) {

				if (ogretmenListesi.size() == 0) {
					System.out.println("Öðretmen listesi boþtur.");
				} else {
					System.out.println("Aramak istediðiniz öðretmenin ismini giriniz.");
					scan.nextLine();
					String isim = scan.nextLine();
					for (int i = 0; i < ogretmenListesi.size(); i++) {

						if (isim.equalsIgnoreCase(ogretmenListesi.get(i).getAdi())) {
							System.out.println(ogretmenListesi.get(i));
						}
					}
				}
			}
		} else if (tercihArama == 2) {
			if (kisiTuru.equals("OGRENCI")) {
				if (ogrenciListesi.size() == 0) {
					System.out.println("Öðrenci listesi boþtur.");
				} else {
					System.out.println("Aramak istediðiniz öðrencinin kimlik numarasýný giriniz.");
					int kimlikNo = scan.nextInt();
					for (int i = 0; i < ogrenciListesi.size(); i++) {

						if (kimlikNo == ogrenciListesi.get(i).getKimlikNo()) {
							System.out.println(ogrenciListesi.get(i));
						}
					}
				}
			}
			if (kisiTuru.equals("OGRETMEN")) {
				if (ogretmenListesi.size() == 0) {
					System.out.println("Öðretmen listesi boþtur.");
				} else {
					System.out.println("Aramak istediðiniz öðretmenin kimlik numarasýný giriniz.");
					int kimlikNo1 = scan.nextInt();
					for (int i = 0; i < ogretmenListesi.size(); i++) {

						if (kimlikNo1 == ogretmenListesi.get(i).getKimlikNo()) {
							System.out.println(ogretmenListesi.get(i));
						}
					}
				}
			}

		} else {
			System.out.println("Hatalý giriþ yaptýnýz.");
		}
		System.out.println("");
		islemMenusu();

	}

	private static boolean cikis() {
		System.out.println("Sistemden Çýkýlýyor");
		return false;
	}

	public static void ekleme() {

		System.out.println("------------- " + kisiTuru + " EKLEME SAYFASI ----------------");
		System.out.println("Adýnýzý giriniz.");
		String adi = scan.nextLine();
		System.out.println("Soyadýný giriniz.");
		String soyadi = scan.nextLine();
		System.out.println("Kimlik numaranýzý giriniz.");
		int kimlikNo = scan.nextInt();
		System.out.println("Yaþýnýzý giriniz.");
		int yas = scan.nextInt();
		scan.nextLine();
		if (kisiTuru.equals("OGRETMEN")) {
			System.out.println("Bölümünüzü giriniz.");
			String sicili = scan.nextLine();
			System.out.println("Sicilinizi giriniz.");
			String bolumu = scan.nextLine();

			ogretmen = new Ogretmen(adi, soyadi, kimlikNo, yas, bolumu, sicili);
			ogretmenListesi.add(ogretmen);

		} else if (kisiTuru.equals("OGRENCI")) {
			System.out.println("Numaranýzý giriniz.");
			int numara = scan.nextInt();
			scan.nextLine();
			System.out.println("Sýnýfýnýzý giriniz.");
			String sinif = scan.nextLine();

			ogrenci = new Ogrenci(adi, soyadi, kimlikNo, yas, numara, sinif);
			ogrenciListesi.add(ogrenci);

		} else {
			System.out.println("Hatalý tercih yaptýnýz. Lütfen tekrar deneyiniz.");
		}

		islemMenusu();

	}

}
