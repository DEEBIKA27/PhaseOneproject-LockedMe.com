import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
	public void createFile() {
		System.out.println("Please enter file name to create with extension, ex- filename.txt");	
		Scanner obj = new Scanner(System.in);
	    String input;
	    
	    input = obj.nextLine();
	    ConsoleTestApplication f = new ConsoleTestApplication();
		File fileName = new File(f.filePath + "\\" + input);
		try {
			if(fileName.createNewFile()) {
				System.out.println("File created: " + fileName.getName());
			} else {
				System.out.println("File already exixts!");
			}
		} catch (IOException e) {
			System.out.println("An error occurred");
		}
		UserScreen userScreen = new UserScreen();
		userScreen.InitMethod();
		obj.close();
	}

}
