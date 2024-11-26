package java_programs;

public class Solution {

	public static void main(String[] args) {

		String a = "abcdef";
		String b = "xyz1234";
		String c = "abcxy";

		// 1. Verify length of the A variable should be greater than length of the C
		// variable and should be less than length of the B variable.

		if (a.length() > c.length() && a.length() < b.length()) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		// 2. A variable should not be same as b variable and c variable

		if (a.equals(b) == false && a.equals(c) == false) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		// 3. C variable should be same as A variable irrespective of the case.

		if (c.equalsIgnoreCase(a)) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

		// 4. A variable should contains cd and should not contains xy

		if (a.contains("cd") == true && a.contains("xy") != true) {
			System.out.println("Pass");
		}

		else {
			System.out.println("Fail");
		}

		// 5. Convert B variable into upper case and verify it should contains “Z” &
		// should not contains “z”

		if (b.toUpperCase().contains("Z") == true && b.toUpperCase().contains("z") == false) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

	}

}
