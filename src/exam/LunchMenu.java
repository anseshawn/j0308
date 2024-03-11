package exam;

public class LunchMenu implements Menu {

	@Override
	public int price() {
		int sum = 0;
		
		sum = RICE + BULGOGI + TOFU + SEAWEED;

		return sum;
	}

}
