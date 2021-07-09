import java.util.Scanner;

public class UserScreen {
	public void InitMethod() {
	try {
	System.out.println("\nMain Menu:\n\nSelect the required option\n\n1. View the file list\n2. Search a file\n3. Create a file\n4. Delete a file\n5. Exit");
	String input;
	Scanner obj = new Scanner(System.in);
	input = obj.nextLine();
	//System.out.println(input);
	
	if (input.equals("1")) {
		PrintFileList p = new PrintFileList();
		p.printFileList();
		}
	if (input.equals("2")) {
		SearchFile s = new SearchFile();
		s.searchFile();
	}
	if (input.equals("3")) {
		CreateFile c = new CreateFile();
		c.createFile();
	}
	if (input.equals("4")) {
		DeleteFile d = new DeleteFile();
		d.deleteFile();
	}
	if (input.equals("5")) {
		System.exit(0);
	}
	obj.close();
		} catch (Exception e) {
			System.out.println("An error occurred");
		}
	}
}