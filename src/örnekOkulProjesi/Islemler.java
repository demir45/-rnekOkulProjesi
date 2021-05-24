package �rnekOkulProjesi;

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
		System.out.println("====================================" + "\n��RENC� VE ��RETMEN Y�NET�M PANEL�"
				+ "\n====================================" + "\nL�TFEN YAPMAK �STED���N�Z ��LEM� SE��N�Z : "
				+ "\n1- ��RENC� ��LEMLER�\r\n" + "2- ��RETMEN ��LEMLER�\r\n" + "Q- �IKI�");
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
			System.out.println("Yanl�� giri� yapt�n�z..");
		}

	}

	private static void islemMenusu() {
		System.out.println("=====��LEMLER=====");
		System.out.println("1- EKLEME\n2- ARAMA\n3- L�STELEME\n4- S�LME\n5- ANA MEN�\nQ- �IKI�");
		System.out.println("l�tfen yapmak istedi�iniz i�lemi se�iniz");
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
				System.out.println("��renci listesi bo�tur.");
			} else {
				System.out.println("Silmek istedi�iniz ��rencinin kimlik numaras�n� giriniz.");
				int kimlikNo = scan.nextInt();
				for (int i = 0; i < ogrenciListesi.size(); i++) {

					if (kimlikNo == ogrenciListesi.get(i).getKimlikNo()) {
						System.out.println("Kimlik numaras�" + ogrenciListesi.get(i).getKimlikNo()
								+ " olan ��renci kayd� silindi.");
						ogrenciListesi.remove(i);

						System.out.println("��rencilerin Listesi : \n");
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
				System.out.println("��retmen listesi bo�tur.");
			} else {
				System.out.println("Silmek istedi�iniz ��retmenin kimlik numaras�n� giriniz.");
				int kimlikNo1 = scan.nextInt();
				for (int i = 0; i < ogretmenListesi.size(); i++) {

					if (kimlikNo1 == ogretmenListesi.get(i).getKimlikNo()) {
						System.out.println("Kimlik numaras� " + ogrenciListesi.get(i).getKimlikNo()
								+ " olan ��retmen kayd� silindi.");
						ogretmenListesi.remove(i);
						System.out.println("��retmenlerin Listesi : \n");
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
				System.out.println("��retmen listesi bo�tur.");
			}

		} else {
			iterator = ogrenciListesi.iterator();
			if (iterator.hasNext()) {
				while (iterator.hasNext()) {

					System.out.println(iterator.next());
				}
			} else {
				System.out.println("��renci listesi bo�tur.");
			}
		}
		System.out.println("");
		islemMenusu();
	}

	private static void arama() {
		System.out.println("Aramak istedi�iniz y�ntemi belirtiniz\n1- �sim\n2- Kimlik Numaras�");
		int tercihArama = scan.nextInt();
		if (tercihArama == 1) {
			if (kisiTuru.equals("OGRENCI")) {
				if (ogrenciListesi.size() == 0) {
					System.out.println("��renci listesi bo�tur.");
				} else {
					System.out.println("Aramak istedi�iniz ��rencinin ismini giriniz.");
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
					System.out.println("��retmen listesi bo�tur.");
				} else {
					System.out.println("Aramak istedi�iniz ��retmenin ismini giriniz.");
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
					System.out.println("��renci listesi bo�tur.");
				} else {
					System.out.println("Aramak istedi�iniz ��rencinin kimlik numaras�n� giriniz.");
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
					System.out.println("��retmen listesi bo�tur.");
				} else {
					System.out.println("Aramak istedi�iniz ��retmenin kimlik numaras�n� giriniz.");
					int kimlikNo1 = scan.nextInt();
					for (int i = 0; i < ogretmenListesi.size(); i++) {

						if (kimlikNo1 == ogretmenListesi.get(i).getKimlikNo()) {
							System.out.println(ogretmenListesi.get(i));
						}
					}
				}
			}

		} else {
			System.out.println("Hatal� giri� yapt�n�z.");
		}
		System.out.println("");
		islemMenusu();

	}

	private static boolean cikis() {
		System.out.println("Sistemden ��k�l�yor");
		return false;
	}

	public static void ekleme() {

		System.out.println("------------- " + kisiTuru + " EKLEME SAYFASI ----------------");
		System.out.println("Ad�n�z� giriniz.");
		String adi = scan.nextLine();
		System.out.println("Soyad�n� giriniz.");
		String soyadi = scan.nextLine();
		System.out.println("Kimlik numaran�z� giriniz.");
		int kimlikNo = scan.nextInt();
		System.out.println("Ya��n�z� giriniz.");
		int yas = scan.nextInt();
		scan.nextLine();
		if (kisiTuru.equals("OGRETMEN")) {
			System.out.println("B�l�m�n�z� giriniz.");
			String sicili = scan.nextLine();
			System.out.println("Sicilinizi giriniz.");
			String bolumu = scan.nextLine();

			ogretmen = new Ogretmen(adi, soyadi, kimlikNo, yas, bolumu, sicili);
			ogretmenListesi.add(ogretmen);

		} else if (kisiTuru.equals("OGRENCI")) {
			System.out.println("Numaran�z� giriniz.");
			int numara = scan.nextInt();
			scan.nextLine();
			System.out.println("S�n�f�n�z� giriniz.");
			String sinif = scan.nextLine();

			ogrenci = new Ogrenci(adi, soyadi, kimlikNo, yas, numara, sinif);
			ogrenciListesi.add(ogrenci);

		} else {
			System.out.println("Hatal� tercih yapt�n�z. L�tfen tekrar deneyiniz.");
		}

		islemMenusu();

	}

}
