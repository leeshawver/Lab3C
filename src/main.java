
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] integers = {101, 65, 230, 45, 87};
//
//		double[] input = {23.4, 65.32, 44.4, 1001.1};
//		String[] newWords = {"leslie", "cherlito", "oliver", "benenenenenenenenenenenenenenenenenenenen", "luke"};
//		int[] nameLengths = elementMatchesLength(newWords);
//		for (int number : nameLengths) {
//			System.out.println(number);
//		}
//		System.out.println(smallestNumber(integers));
//		System.out.println(average(input));
//		System.out.println(evenOrOdd(newWords));
		System.out.println(palindrome("momo"));
	}
	
	public static int smallestNumber(int[] integers) {
		int min = integers[0];
		for (int integer : integers) {
			if (integer < min) {
				min = integer;
			}
		}
		return min;
	}
	
	public static double average(double[] input) {
		int length = input.length;
		double total = 0;
		for (double number : input) {
			total += number;
		}
		return total / length;
	}
	
	public static int[] elementMatchesLength(String[] newWords) {
		int[] wordLength = new int[newWords.length];
		for (int i = 0; i < newWords.length; i++) {
			wordLength[i] = newWords[i].length();
		}
		
		return wordLength;
	}
	
	public static boolean evenOrOdd (String[] newNewWords) {
		// returns true if the sum of letters for all strings with an even amount of letters
		// is greater than the sum of those with odd amount of letters
		int even = 0;
		int odd = 0;
		for (String word : newNewWords) {
			if (word.length() % 2 == 0) {
				even += word.length();
			} else odd += word.length();
		}
		return even > odd;
				
	}
	
	public static boolean palindrome (String testWord) {
		boolean test = true;
		int length = testWord.length();
		System.out.println(length);
		for (int i = 0; i < length; i++) {
			if (testWord.charAt(i) != testWord.charAt(length - i - 1)) {
				test = false;
				break;
			}
		}
		return test;	
	}
}
