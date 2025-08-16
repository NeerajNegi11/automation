package example1;

public class FindMaxInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int [] marks = {45, 32, 102, 54, 89};
    /*int max1 = max_number(marks);
    System.out.println(max1);
    
	}
	*/
	int max = marks [0];
	//public static int max_number(int n[]) {
		
		
		for (int i=1; i<marks.length; i++) {
			if (marks[i] > max)
			{
				max = marks[i];
			}
		}
		
		// return max;
		System.out.println(max);
		
	}

}
