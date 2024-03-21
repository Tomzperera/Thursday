package junitpkg;

public class Stringcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Hello, have a good day";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                count++;
            }
        }
        System.out.println(count);

	}

}
