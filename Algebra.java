// Implements algebraic operations and the square root function without using 
// the Java operations a + b, a - b, a * b, a / b, a % b, and without calling 
// Math.sqrt. All the functions in this class operate on int values and
// return int values.

public class Algebra {
	public static void main(String args[]) {
	    // Tests some of the operations
	    System.out.println(plus(2,3));   // 2 + 3
	    System.out.println(minus(7,2));  // 7 - 2
   		System.out.println(minus(2,7));  // 2 - 7
 		System.out.println(times(3,4));  // 3 * 4
   		System.out.println(plus(2,times(4,2)));  // 2 + 4 * 2
   		System.out.println(pow(5,3));      // 5^3
   		System.out.println(pow(3,5));      // 3^5
   		System.out.println(div(12,3));   // 12 / 3    
   		System.out.println(div(5,5));    // 5 / 5  
   		System.out.println(div(25,7));   // 25 / 7
   		System.out.println(mod(25,7));   // 25 % 7
   		System.out.println(mod(120,6));  // 120 % 6    
   		System.out.println(sqrt(36));
		System.out.println(sqrt(263169));
   		System.out.println(sqrt(76123));
	}  

	// Returns x1 + x2
	public static int plus(int x1, int x2) {
		if (x2 < 0) {
			while (x2 < 0) {
				x1--;
				x2++;
			}
		} else {
			while (x2 > 0) {
				x1++;
				x2--;
			}
		}
		return x1;
	}

	// Returns x1 - x2
	public static int minus(int x1, int x2) {
		if (x2 < 0) {
			while (x2 < 0) {
				x1++;
				x2++;
			}
		} 
		else {
			while (x2 > 0) {
				x1--;
				x2--;
			}
		}
		return x1;
	}

	public static int abs(int x) {
		if (x >= 0){
			return x;
		} else {
			int newx = 0;
			while (x < 0) {
				x++;
				newx++;
			}
			return newx;
		}
	}

	// Returns x1 * x2
	public static int times(int x1, int x2) {
		if (x1 == 0 || x2 == 0) {
			return 0;
		}
		int x3 = abs(x1);
		int x4 = abs(x2);
		int result = 0;
		while (x4 > 0) {
			result = plus(result, x3);
			x4--;
		}
		if (x1 < 0 && x2 > 0) {
			return minus(0, result); 
		} if (x1 > 0 && x2 < 0) {
			return minus(0, result);
		}
		return result;
	}

	// Returns x^n (for n >= 0)
	public static int pow(int x, int n) {
		int result = x;
		if (n == 0){
			return 1;
		} while (n > 1) {
			result = times(result, x);
			n--;
		}
		return result;
	}

	// Returns the integer part of x1 / x2 
	public static int div(int x1, int x2) {
		if (x2 == 1) {
			return x1;
		}
		int result = 0;
		int x3 = abs(x1);
		int x4 = abs(x2);
		while (x3 >= x4) {
			x3 = minus(x3, x4);
			result++;
		}
		if ((x1 < 0 && x2 > 0) || (x2 < 0 && x1 > 0)) {
			result = minus(0, result);
		}
		return result;
	}

	// Returns x1 % x2
	public static int mod(int x1, int x2) {
		if (x1 < x2) {
			return x1;
		} while (x1 >= x2) {
			x1 = minus(x1, x2);
		}
		return x1;
	}	

	// Returns the integer part of sqrt(x) 
	public static int sqrt(int x) {
		int option = 0;
		while (pow(option, 2) <= x) {
			option++;
		}
		option--;
		System.out.println(option);
		return option;
	}	  	  
}