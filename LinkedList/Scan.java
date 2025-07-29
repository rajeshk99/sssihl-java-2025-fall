import java.io.*;
import java.util.Scanner;

public class Scan {
	public static void main(String... args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Give me an input to print: ");
			Integer string = Integer.parseInt(br.readLine());
			System.out.println(string);
	
			Scanner s = new Scanner(System.in);
			System.out.print("Give me an input to print: ");
			String string1 = s.nextLine();
			System.out.println(string1);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
