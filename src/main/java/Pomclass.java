import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Pomclass {
	
	public static WebDriver driver;
	
	
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement email;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement login;
	
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	
	
	
	


}
