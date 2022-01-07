import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class UselessWebsiteDetector{
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a website has to start with https");
		String website = scanner.nextLine();
		if(website.startsWith("https")){
			System.out.println("this is a useless website");
		}else{
			System.out.println("failed to find website");
		}
		TimeUnit.SECONDS.sleep(20);
	}
}