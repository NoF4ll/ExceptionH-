package hue21_11_2019;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class FileNotFound {

	public static void main(String[] args) {
		try {
			File f = new File("C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs\\Nicolaus.png");
			Scanner sc = new Scanner(f);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
