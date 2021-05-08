package datadrivern;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Baseclass 
{
	static WebDriver driver;
	static JavascriptExecutor js;
   public static  void send(WebElement t,String text) {
	t.sendKeys(text);
}
   public  static void click(WebElement t) {
	
     t.click();
}
   public static  void scriptjava(WebElement r) 
   {
	 js=(JavascriptExecutor)driver;
	 js.executeScript("arguments[0].setAttribute('style','background:pink');",r);

}
   public static  void down(String text,WebElement r) {

		 js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].setAttribute('value','"+text+"')",r);
} 
   public static  void clicks(WebElement r) {

	 js=(JavascriptExecutor)driver;
	 js.executeScript("arguments[0].click()",r);
}
   public static void downs(WebElement p) {
	   js=(JavascriptExecutor)driver;
	   js.executeScript("arguments[0].scrollIntoView(true)", p);

}
   public static void  ups(WebElement p) {
	   js=(JavascriptExecutor)driver;
	   js.executeScript("arguments[0].scrollIntoView(false)", p);

}
   public static  String read(int rowno,int colno) throws InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException {
	   File f = new File("C:\\Datadriven\\excel\\snapdealexcel.xlsx");
		Workbook n=new XSSFWorkbook(f);
	org.apache.poi.ss.usermodel.Sheet s = n.getSheet("Sheet1");
	Row r = s.getRow(rowno);
	Cell c = r.getCell(colno);
	CellType cellType = c.getCellType();
	
	String value="";
		if(cellType==cellType.STRING)
	{
	value=c.getStringCellValue();	
	}
	else 
		if(DateUtil.isCellDateFormatted(c))
		{
			    Date e=c.getDateCellValue();
			    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
			    value=sdf.format(e);
		}
		else
		{
			double d = c.getNumericCellValue();
			long l=(long)d;
			value=String.valueOf(l);
				}
	return value;
	}









}
