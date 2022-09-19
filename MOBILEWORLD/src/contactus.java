import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class contactus {
@Test(dataProvider = "datas")	

	public void send(String Username,String Email,String phone,String message) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mujif.rahuman\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com//");
		Thread.sleep(1000);
		Landingpage landing = new Landingpage(driver);
        landing.send(Username, Email, phone, message);


	   }
@DataProvider

public Object[][] datas() {

	Object[][] data = new Object[3][4];
	
	   data[0][0] = "muje12";
	   data[0][1] = "muje12@gamil.com";
	   data[0][2] = "6383696035";
	   data[0][3] = "hii,bye";
	   
	   data[1][0] = "muje12";
	   data[1][1] = "muje12@gamil.com";
	   data[1][2] = "6383696035";
	   data[1][3] = "";
	   
	   data[2][0] = "muje12";
	   data[2][1] = "";
	   data[2][2] = "6383696035";
	   data[2][3] = "hii,bye";
	   return data;
	
	

}
}
