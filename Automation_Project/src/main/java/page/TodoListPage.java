package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TodoListPage {

	
    WebDriver driver;
	
	public TodoListPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//body/div[3]/input[3]") WebElement ToggleAllButton;
	@FindBy(how = How.XPATH, using = "//span[contains(text(),'Water')]") WebElement WaterButton;
	@FindBy(how = How.XPATH, using = "//a[3]/span") WebElement Important165Button;
	 
 	@FindBy(how = How.XPATH, using = "/html/body/a[2]") WebElement NevermindWaterButton;
	@FindBy(how = How.XPATH, using = "//input[@value='Remove']") WebElement RemoveButton;
	
	public void ClickToggleAllButton() {
		
		ToggleAllButton.click();
	}
	
	public void ClickImportant165Button() {
		
		Important165Button.click();
		}
	
	public void ClickWaterButton() {
		
		WaterButton.click();
	}
	
	public void NevermindWaterButton() {
		
		NevermindWaterButton.click();
	}
	
	public void ClickRemoveButton() {
		
		RemoveButton.click();
	}
	
}

