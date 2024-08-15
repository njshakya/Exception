package da19Exception;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		scan.close();
		
		try {
			System.out.println(scan.next());
			
			
		}catch(Exception e) {
			
			
		}finally {
			
			
		}
		
	}

}
