package t10_abstractEx;

public class BunsikRun2 {
	public static void main(String[] args) {
//		WangjaBunsik wangjaBunsik = new WangjaBunsik();
//		SeoulBunsik seoulBunsik = new SeoulBunsik();
//		WoojuBunsik woojuBunsik = new WoojuBunsik();
		
		
//		Bonsa wangjaBunsik = new WangjaBunsik();
//		Bonsa seoulBunsik = new SeoulBunsik();
//		Bonsa woojuBunsik = new WoojuBunsik();
//		
//		Bonsa[] bonsas = {wangjaBunsik, seoulBunsik, woojuBunsik};
		// => 타입 변환으로 타입이 전부 같아져서 배열로 묶을 수 있게 됨
		
		Bonsa[] bonsas = {new WangjaBunsik(), new SeoulBunsik(), new WoojuBunsik()};
		
		for(int i=0; i<bonsas.length; i++) {
			bonsas[i].getShopName();
			bonsas[i].kimchi();
			bonsas[i].budae();
			bonsas[i].bibim();
			bonsas[i].sundae();
			bonsas[i].konggi();
			System.out.println("=================================================");
		}
		
		
/*		
		wangjaBunsik.getShopName();
		wangjaBunsik.kimchi();
		wangjaBunsik.budae();
		wangjaBunsik.bibim();
		wangjaBunsik.sundae();
		wangjaBunsik.konggi();
		System.out.println("=================================================");
		
		seoulBunsik.getShopName();
		seoulBunsik.kimchi();
		seoulBunsik.budae();
		seoulBunsik.bibim();
		seoulBunsik.sundae();
		seoulBunsik.konggi();
		System.out.println("=================================================");
		
		woojuBunsik.getShopName();
		woojuBunsik.kimchi();
		woojuBunsik.budae();
		woojuBunsik.bibim();
		woojuBunsik.sundae();
		woojuBunsik.konggi();
		System.out.println("=================================================");
*/				
				
	}
}
