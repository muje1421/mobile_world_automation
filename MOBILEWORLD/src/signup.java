import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class signup { 
@Test(dataProvider = "datas")

	 public void signup1(String firstname,String lastname,String email,String passwords,String DOB,String phonenumber,String bio) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mujif.rahuman\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mobileworld.banyanpro.com//");
		Landingpage landing = new Landingpage(driver);
        landing.register(firstname, lastname, email, passwords, DOB, phonenumber, bio);

	}
@DataProvider

public Object[][] datas() {

	Object[][] data = new Object[3][7];
	
	data[0][0] = "muje";
	data[0][1] = "rahuman";
	data[0][2] = "muje1@gmail.com";
	data[0][3] = "muje1421";
	data[0][4] = "21/06/2000";
	data[0][5] = "6383696035";
	data[0][6] = "hii i am mujif";
	
	data[1][0] = "mu";
	data[1][1] = "ra";
	data[1][2] = "muje1@gmail.com";
	data[1][3] = "muje1421";
	data[1][4] = "21/06/2000";
	data[1][5] = "6383696035";
	data[1][6] = "hii i am mujif";
	
	data[2][0] = "muje";
	data[2][1] = "rahuman";
	data[2][2] = "muje1@gmail.com";
	data[2][3] = "muje1421";
	data[2][4] = "";
	data[2][5] = "6383696035";
	data[2][6] = "hii i am mujif";
	
	return data;

}
}
