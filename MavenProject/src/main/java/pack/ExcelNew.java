package pack;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelNew {
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet sh;
	public static String getStringData(int a,int b) throws IOException {
	f=new FileInputStream("C:\\Users\\ACER\\Desktop\\Obsqura\\Book1.xlsx");//to obtain input bytes from a file
	w=new XSSFWorkbook(f);
	sh=w.getSheet("sheet1");
	Row r=sh.getRow(a);
	Cell c=r.getCell(b);
	return c.getStringCellValue();
	}
	public static String getIntegergData(int a,int b) throws IOException {
		f=new FileInputStream("C:\\Users\\ACER\\Desktop\\Obsqura\\Book1.xlsx");//to obtain input bytes from a file
		w=new XSSFWorkbook(f);
		sh=w.getSheet("sheet1");
		Row r=sh.getRow(a);
		Cell c=r.getCell(b);
		int x=(int)c.getNumericCellValue();//type casting
		return String.valueOf(x);
		}
	

}