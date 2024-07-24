package abhimanyu;

import java.util.Scanner;

public class Main {

  public static boolean canCrossChakravyuha(int p, int a, int b, int[] k) {
	        int skips = a;
	        int recharges = b;

	        for (int i = 0; i < k.length; i++) {
	            if (p < k[i]) {
	                if (skips > 0) {
	                    skips--;
	                } else if (recharges > 0) {
	                    p += k[i];
	                    recharges--;
	                } else {
	                    return false;
	                }
	            }
	p -= k[i];

	            if (i == 2 || i == 6) {
	                if (p < k[i] / 2) {
	                    if (skips > 0) {
	                        skips--;
	                    } else if (recharges > 0) {
	                        p += k[i] / 2;
	                        recharges--;
	                    } else {
	                        return false;
	                    }
	                }
	                p -= k[i] / 2;
	            }
	        }
	        return true;
	    }
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter Abhimanyu's initial power: ");
	        int p = scanner.nextInt();

	        System.out.print("Enter number of skips: ");
	        int a = scanner.nextInt();

	        System.out.print("Enter number of recharges: ");
	        int b = scanner.nextInt();

	        int[] k = new int[11];
	        System.out.println("Enter the power of enemies in each of the 11 circles:");
	        for (int i = 0; i < 11; i++) {
	            k[i] = scanner.nextInt();
	        }

	        boolean result = canCrossChakravyuha(p, a, b, k);
	        if (result) {
	            System.out.println("Abhimanyu can cross the Chakravyuha!");
	        } else {
	            System.out.println("Abhimanyu cannot cross the Chakravyuha.");
	        }

	        scanner.close();
	    }
	}
	

