import java.io.File;
import java.util.Scanner;

public class SearchFile {
	public void searchFile() {
		try {
		System.out.println("Please enter the file name to search");
		Scanner obj = new Scanner(System.in);
		String input;
		
		input = obj.nextLine();
		ConsoleTestApplication f = new ConsoleTestApplication();
		File fileName = new File(f.filePath + "\\" + input);
		if(fileName.exists()) {
			System.out.println(fileName.getName() + " is found");
		}else {
		      System.out.println("The file does not exist");
		}
		UserScreen userScreen = new UserScreen();
		userScreen.InitMethod();
		obj.close();
		} catch (Exception e) {
			System.out.println("An error occurred");
		}
	}
		
}
