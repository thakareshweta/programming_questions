import java.util.Scanner;

public class splitRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String inputString = scanner.nextLine();
		String[] stringArray = inputString.split("\\W");
		String stringWithoutSpecialChars = stringArray.toString();
		
		System.out.println(stringArray.length);
		for (int i=0;i<stringArray.length;i++) {
			System.out.println(stringArray[i]);
		}
		System.out.println(stringWithoutSpecialChars);
		String[] stringArrayWithoutSpaces = stringWithoutSpecialChars.split("\\s");
		//System.out.println(stringArray.length);
		for (int i=0;i<stringArrayWithoutSpaces.length;i++) {
			System.out.println(stringArrayWithoutSpaces[i]);
		}
	}

}
