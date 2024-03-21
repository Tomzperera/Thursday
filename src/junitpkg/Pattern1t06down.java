package junitpkg;

public class Pattern1t06down {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = 6;

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
            for (int k = rows - i + 1; k > 0; k--) {
                System.out.println();
            }
        }

	}

}
