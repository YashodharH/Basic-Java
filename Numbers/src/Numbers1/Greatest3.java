package Numbers1;

public class Greatest3 {

	public static void main(String[] args) {
		int a = 90;
		int b = 10;
		int c = 180;
		if(a>b) {
			if(a>c) {
				System.out.println("a is largest");
			}else {
				System.out.println("c is largest");
			}
		}else if(b<c) {
			System.out.println("b is largest");
		}else {
			System.out.println("c is largest");
		}
		
	}

}
