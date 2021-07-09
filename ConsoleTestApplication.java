
public class ConsoleTestApplication {
		String filePath = "D:\\JAVA FOLDER";
		
		public String getFilePath() {
			return filePath;
		}

		public static void main(String[] args) {
			try {
			System.out.println("Welcome to Console test Application!\nDeveloper: Deebika");
			UserScreen userScreen = new UserScreen();
			userScreen.InitMethod();
		} catch (Exception e) {
			System.out.println("An error occurred");
		}
	}
}
