package Numbers1;

public class LargestCond4 {

	public static void main(String[] args) {
		int a = 10;
		int b = 40;
		int c = 110;
		int d = 200;
		if(a>b && a>c && a>d) {
			System.out.println("a is largest");
		}else if(b>a && b>c && b>d) {
			System.out.println("b is largest");
		}else if(c>a && c>b && c>d) {
			System.out.println("c is largest");
		}else {
			System.out.println("d is largest");
		}
	}

}
