import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class signin {
	
@Test(dataProvider = "datas")
	public void signin(String username,String password) throws InterruptedException{
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\mujif.rahuman\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mobileworld.banyanpro.com//");
        Landingpage landing = new Landingpage(driver);
        landing.loginpage(username,password);
        }

@DataProvider

public Object[][] datas() {

	Object[][] data = new Object[5][2];
			
	data[0][0] = "muje";
	data[0][1] = "muje1421";

	data[1][0] = "sdfghjkasdfghjasdfghjasdfghjkasdfghjasdfghjkasdfghj";
	data[1][1] = "muje1421";
	
	data[2][0] = "mu";
	data[2][1] = "f1s234";
	
	data[3][0] = " ";
	data[3][1] = "muje1421";
	
	data[4][0] = "muje";
	data[4][1] = "";
	
	return data;
}
	
}
