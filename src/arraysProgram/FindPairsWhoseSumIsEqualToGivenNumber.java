package arraysProgram;

public class FindPairsWhoseSumIsEqualToGivenNumber {

	

	    public static void main(String[] args) {
	        int[] arr = {2, 2,2, 4,2,4 };
	        int targetSum = 6;

	        findPairs(arr, targetSum);
	    }

	    
	    public static void findPairs(int[] arr, int targetSum) {
	        System.out.println("Pairs with sum " + targetSum + " are:");

	        for (int i = 0; i < arr.length; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] + arr[j] == targetSum) {
	                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
	                }
	            }
	        }

	    }
	}

