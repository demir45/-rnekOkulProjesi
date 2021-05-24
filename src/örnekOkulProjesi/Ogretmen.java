package örnekOkulProjesi;

public class Ogretmen extends Kisi{
	
	private String bolum;
	private String sicilNo;
	
	
	
	public Ogretmen() {
		
	}


	public Ogretmen(String adi, String soyadi, int kimlikNo, int yas, String bolum, String sicilNo) {
		super(adi, soyadi, kimlikNo, yas);
		this.bolum = bolum;
		this.sicilNo = sicilNo;
	}

	
	public String getBolum() {
		return bolum;
	}

	public void setBolum(String bolum) {
		this.bolum = bolum;
	}

	public String getSicilNo() {
		return sicilNo;
	}

	public void setSicilNo(String sicilNo) {
		this.sicilNo = sicilNo;
	}


	@Override
	public String toString() {
		return "Öðretmenin : Adý = " + getAdi()+ ", Soyadý = " 
				+ getSoyadi() + ", KimlikNo = " + getKimlikNo() 
				+ ", Yaþ = " + getYas() + ", Bölüm = " + bolum + 
				", Sicil No = " + sicilNo;
	}


		

}
