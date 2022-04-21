package april22;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class countrow {

	public static void main(String[] args)throws Throwable {
		FileInputStream fi = new FileInputStream("D://");
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("");

	}

}
