package exam;

import java.util.Scanner;

public class MenuRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ans = 0;
		int[] menu = {};
		
		System.out.print("원아 번호를 입력하세요: ");
		ans = sc.nextInt();
		
		sc.close();
	}
}
