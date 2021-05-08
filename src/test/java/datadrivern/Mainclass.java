package datadrivern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Mainclass extends Baseclass
{
public static void main(String[] args) throws InterruptedException, InvalidFormatException, IOException {
		
		WebDriver driver=browserlaunch();
		open();
		//-------------------------------using excel-----------------------
		//1st page
		//driver.navigate().refresh();
		//login
		WebElement g = driver.findElement(By.xpath("//span[text()='Sign In']"));
		click(g);
		WebElement login = driver.findElement(By.xpath("//a[text()='login']"));
		click(login);
		driver.switchTo().frame("loginIframe");
		Thread.sleep(2000);
		WebElement o1 = driver.findElement(By.xpath("//input[@id='userName']"));
		down(read(1,0),o1);
		WebElement u1 = driver.findElement(By.xpath("(//button[text()='continue'])[1]"));
		clicks(u1);
		Thread.sleep(2000);
		
		//2nd page
		driver.switchTo().defaultContent();
		driver.switchTo().frame("loginIframe");
		WebElement mobiles = driver.findElement(By.xpath("//input[@id='j_number']"));
		down(read(1,1),mobiles);
		
		WebElement name1 = driver.findElement(By.id("j_name"));
	down(read(1,2),name1);
		
		WebElement date1 = driver.findElement(By.id("j_dob"));
		date1.clear();
		down(read(1,3),date1);
		
		WebElement pass1 = driver.findElement(By.id("j_password"));
		down(read(1,4),pass1);
		
		WebElement show1 = driver.findElement(By.xpath("//i[@data-pass='j_password']"));
		click(show1);
		WebElement con1 = driver.findElement(By.xpath("//button[@id='userSignup']"));
		click(con1);
		
		//----------------------------javascript--------------------------
		driver.navigate().refresh();
		WebElement pro = driver.findElement(By.xpath("//h2[text()='TRENDING PRODUCTS']"));
		scriptjava(pro);
		
		WebElement search = driver.findElement(By.xpath("//input[@id='inputValEnter']"));	
		down("girls watch",search);
		//thread.sleep(2000);
		WebElement button = driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		clicks(button);
		
		//driver.navigate().back();
		//down
		/*Thread.sleep(2000);
	    WebElement snap = driver.findElement(By.xpath("//div[text()='Snapdeal Business']"));
	    downs(snap);
	    scriptjava(snap);
	    System.out.println("print line: " + snap.getText());
	
        //down
	    WebElement high = driver.findElement(By.xpath("//a[text()='Media Enquiries']"));
	    scriptjava(high);
	    System.out.println("line: " + high.getText());
	
	    //up
	    Thread.sleep(4000);
	    WebElement oops = driver.findElement(By.xpath("(//span[@class='catText'])[7]"));
	    ups(oops);
	    click(oops);
	   /* WebElement sun = driver.findElement(By.xpath("(//span[text()='Sunglasses'])[2]"));
	    click(sun);
	   
	    WebElement title = driver.findElement(By.xpath("//img[@title='Walrus - Black Wayfarer Sunglasses ( WS-DON-III-020302 )']"));
	    System.out.println("print product title:" + title.getAttribute("value") );
	
	    WebElement price = driver.findElement(By.xpath("//span[text()='Rs.  299']"));
	    System.out.println("print product price: " + price.getAttribute("value"));
	    scriptjava(price);
	    click(title);*/
	
	
	
	
	
	
	
	
		
	}
}
