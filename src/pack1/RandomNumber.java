package pack1;

import java.util.Random;


public class RandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		
		int number = random.nextInt(1,90);
	    float number2 = random.nextFloat(1545,905454);
		System.out.println(number);
		System.out.println(number2);

	}

}
