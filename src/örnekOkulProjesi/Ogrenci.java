package örnekOkulProjesi;

public class Ogrenci extends Kisi {

	private int okulNo;
	private String sinifBilgileri;
	
	public Ogrenci(String adi, String soyadi, int kimlikNo, int yas, int okulNo, String sinifBilgileri) {
		super(adi, soyadi, kimlikNo, yas);
		this.okulNo = okulNo;
		this.sinifBilgileri = sinifBilgileri;
	}

	public int getOkulNo() {
		return okulNo;
	}

	public void setOkulNo(int okulNo) {
		this.okulNo = okulNo;
	}

	public String getSinifBilgileri() {
		return sinifBilgileri;
	}

	public void setSinifBilgileri(String sinifBilgileri) {
		this.sinifBilgileri = sinifBilgileri;
	}

	@Override
	public String toString() {
		return "Öðrencinin : Adý = " + getAdi()+ ", Soyadý = " 
				+ getSoyadi() + ", KimlikNo = " + getKimlikNo() 
				+ ", Yaþ = " + getYas() + ", OkulNo = " + okulNo 
				+ ", Sýnýf Bilgileri = " + sinifBilgileri;
	}


	
	
}
