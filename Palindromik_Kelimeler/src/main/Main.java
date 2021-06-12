package main;

public class Main {
	public static void main(String[] args) {
		System.out.println(isPalindrome("mazlum"));
		System.out.println(isPalindrome2("ada"));

	}

	public static boolean isPalindrome(String str) {
		int firstIndex = 0;
		int lastIndex = str.length() - 1;
		while (firstIndex < lastIndex) {
			if (str.charAt(firstIndex) != str.charAt(lastIndex)) {
				return false;
			}
			firstIndex++;
			lastIndex--;
		}
		return true;
	}

	public static boolean isPalindrome2(String str) {
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		} 
		/*
		 * if(str.equals(reverse)) { return true; } return false;
		 */
		return str.equals(reverse);
	}

}
