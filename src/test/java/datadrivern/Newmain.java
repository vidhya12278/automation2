package datadrivern;

import java.io.IOException;

import org.apache.commons.compress.archivers.dump.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Newmain extends Newbase{
	public static void main(String[] args) throws InterruptedException, InvalidFormatException, IOException, org.apache.poi.openxml4j.exceptions.InvalidFormatException {
		
		//open();
		WebDriver driver=open();
		driver.get("http://adactinhotelapp.com/");
		Thread.sleep(2000);
		WebElement user = driver.findElement(By.xpath("//input[@name='username']"));
		send(user,read(1,1));
		System.out.println(user.getAttribute("value"));
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		send(pass,read(1,1));
		System.out.println(pass.getAttribute("value"));
		WebElement login = driver.findElement(By.xpath("//input[@name='login']"));
		click(login);
		WebElement location = driver.findElement(By.id("location"));
		send(location,read(1,3));
		System.out.println(location.getAttribute("value"));
		WebElement hotel = driver.findElement(By.id("hotels"));
		send(hotel,read(1,4));
		System.out.println(hotel.getAttribute("value"));
		WebElement type = driver.findElement(By.id("room_type"));
		send(type,read(1,5));
		System.out.println(type.getAttribute("value"));
		WebElement room = driver.findElement(By.id("room_nos"));
		send(room,read(1,6));
		System.out.println(room.getAttribute("value"));
		

	}
}
