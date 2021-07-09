import java.io.File;
import java.util.Scanner;

public class DeleteFile {
	public void deleteFile() {
		try {
		System.out.println("Please enter file name to delete with extension, ex- filename.txt");	
		Scanner obj = new Scanner(System.in);
	    String input;
	    
	    input = obj.nextLine();
	    ConsoleTestApplication f = new ConsoleTestApplication();
		File fileName = new File(f.filePath + "\\" + input);
		if (!fileName.exists()) {
			System.out.println(fileName.getName() + "does not exist");
		} else if (fileName.delete()) {
			System.out.println("The file is deleted!");
		} else {
			System.out.println("Failed to delete the file!");
		}
		UserScreen userScreen = new UserScreen();
		userScreen.InitMethod();
		obj.close();
		}catch (Exception e) {
			System.out.println("An error occurred");
		}
	}
}