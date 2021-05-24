package örnekOkulProjesi;

public class Kisi {
	
	private String adi;
	private String soyadi;
	private int kimlikNo;
	private int yas;
	
	
	
	public Kisi() {
		super();
	}

	public Kisi(String adi, String soyadi, int kimlikNo, int yas) {
		this.adi = adi;
		this.soyadi = soyadi;
		this.kimlikNo = kimlikNo;
		this.yas = yas;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	public int getKimlikNo() {
		return kimlikNo;
	}

	public void setKimlikNo(int kimlikNo) {
		this.kimlikNo = kimlikNo;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}

	@Override
	public String toString() {
		return "Kisi [adi=" + adi + ", soyadi=" + soyadi + ", kimlikNo=" + kimlikNo + ", yas=" + yas + "]";
	}
	

}
