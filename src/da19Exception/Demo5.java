package da19Exception;

public class Demo5 {

	public static void main(String[] args) {
		try {
		int aa[] = new int[3];
		aa[0] = 23;
		aa[1] = 23;
		aa[2] = 23;
		aa[3] = 23;
		System.out.println(aa[3]);

	}catch(ArrayIndexOutOfBoundsException ee) {
		ee.printStackTrace();
		
	}
		System.out.println("out of loop");
		
	

}
}