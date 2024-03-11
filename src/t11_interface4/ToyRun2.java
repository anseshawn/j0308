package t11_interface4;

import java.util.Scanner;

/*
	기능			곰돌이	 	로보트		비행기		 탱크
	움직임			O				O				X				O
	레이저			X				X				O				O
	미사일			X				O				O				O
	연령			전연령		4세 이상		8세 이상		13세 이상
	
	장난감 목록을 표시해주고, 해당 장난감의 기능을 보여주세요.
	
	(예) 어떤 장난감 구매를 희망하십니까?
	1.곰돌이 2.로보트 3.비행기 4.탱크 0.종료 ==> 1
	곰돌이는 팔다리를 움직일 수 있습니다.
	모든 연령대가 사용하실 수 있습니다.
	
	구매를 희망하십니까?(Y/N) ==> Y
	곰돌이 구매가 확정되었습니다.
	감사합니다.
	
	구매를 희망하십니까?(Y/N) ==> N
	감사합니다. 다음에 또 이용해 주세요.
*/
public class ToyRun2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		String con = "";
		
		Toy[] toys = {new Bear(), new Robot(), new Airplane(), new Tank()};
		String[] titles = {"곰돌이","로보트","비행기","탱크"};
		
		while(true) {
			System.out.println("어떤 장난감 구매를 희망하십니까?");
			System.out.print("1.곰돌이	2.로보트	3.비행기	4.탱크	0.종료 ==> ");
			ans = sc.nextInt();
			
			if (ans == 0) break;
			
			System.out.println("장난감 이름 : "+titles[ans-1]);
			toys[ans-1].age();
			toys[ans-1].moving();
			toys[ans-1].fire();
			toys[ans-1].misaile();
			
			System.out.println();
			System.out.print("구매를 희망하십니까?(Y/N) ==> ");
			con = sc.next();
			if(con.toUpperCase().equals("Y")) {
				System.out.println("구매가 확정되었습니다.");
				System.out.println("감사합니다.");
				System.out.println();
			}
			else {
				System.out.println("감사합니다. 다음에 또 이용해주세요.");
				System.out.println();
			}
	}
		
		System.out.println("\n프로그램을 종료합니다.");
		
		sc.close();
	}
}
