package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


//This is used for Home page
public class HomePage {
	@FindBy(linkText = "Log out")
	private WebElement logoutLink;
	
	@FindBy(partialLinkText = "Books")
	private WebElement booksLink;
	
	@FindBy(partialLinkText = "Computers")
	private WebElement computersLink;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public WebElement getBooksLink() {
		return booksLink;
	}

	public WebElement getComputersLink() {
		return computersLink;
	}
	
	public void setComputersLink(WebElement computerLink) {
		this.computersLink = computersLink;
	}
	
	

}
