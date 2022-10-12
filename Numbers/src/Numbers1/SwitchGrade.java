package Numbers1;

public class SwitchGrade {

	public static void main(String[] args) {
		char Grade = 'L';
		switch(Grade)
		{
		case 'A':System.out.println("First class with distinction");
		break;
		case 'B':System.out.println("First Class");
		break;
		case 'C':System.out.println("Second Class");
		break;
		case 'D':System.out.println("Just Pass");
		break;
		case 'E':System.out.println("Fail");
		break;
		
		default:System.err.println("Invalid Grade");
				
		}
	}

}
