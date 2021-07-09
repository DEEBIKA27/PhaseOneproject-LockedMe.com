import java.io.File;

public class PrintFileList {
	public void printFileList() {
		try {
		ConsoleTestApplication f = new ConsoleTestApplication();
		File folder = new File(f.filePath);
		File[] listOfFiles = folder.listFiles();
		if(listOfFiles.length == 0) {
			System.out.println("This folder is empty");
		} else {
			for (int i = 0; i < listOfFiles.length; i++) {
				if(listOfFiles[i].isFile()) {
					System.out.println(listOfFiles[i].getName() + "\n");
				} else if (listOfFiles[i].isDirectory()) {
	                System.out.println("Directory " + listOfFiles[i].getName());
	            }
			} 
		}
	UserScreen userScreen = new UserScreen();
	userScreen.InitMethod();
		}catch (Exception e) {
			System.out.println("An error occurred");
		}
	}
}
