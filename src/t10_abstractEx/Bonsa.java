package t10_abstractEx;

//과제 풀이
//@SuppressWarnings("unused") //경고처리를 하지 말라는 명령
public abstract class Bonsa {
	public String shopName;
	public int kimchi;
	public int budae;
	public int bibim;
	public int sundae;
	public int konggi;
	
	//setter를 이용하지 않고 생성자를 통해서 값을 넣기
	public Bonsa(String shopName, int kimchi, int budae, int bibim, int sundae, int konggi) {
		this.shopName = shopName;
		this.kimchi = kimchi;
		this.budae = budae;
		this.bibim = bibim;
		this.sundae = sundae;
		this.konggi = konggi;
	}
	
	public abstract void kimchi();
	public abstract void budae();
	public abstract void bibim();
	public abstract void sundae();
	public abstract void konggi();
	
	public void getShopName() {
		System.out.println("점포명 : "+shopName);
	}
}
