package dukkanlar;

public class Dukkanlar extends Program {
	String urunAd;
	double fiyat;
	
	int adet;
	double toplamTutar;
	
	void satınal() {
		toplamTutar=adet*fiyat;
		System.out.println(getdukkanAd());
		System.out.println(urunAd + toplamTutar+ "toplamtutar." );
		
	}

	private String getdukkanAd() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setdukkanAd(String string) {
		// TODO Auto-generated method stub
		
	}

	
}
