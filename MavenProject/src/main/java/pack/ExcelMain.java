package pack;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		String s=ExcelNew.getStringData(0, 1);
		System.out.println(s);
		String n=ExcelNew.getIntegergData(0, 0);
		System.out.println(n);//committing
			}

}
