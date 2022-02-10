package test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.TodoListPage;
import util.BrowserFactory;

public class TodoListTest {
WebDriver driver;
	
	@Before
	public void initBrowser() {		
		driver = BrowserFactory.init();	
	}	
	
	@Test
	public void testTODOLIST() throws InterruptedException {	
		
		TodoListPage todolistpage = PageFactory.initElements(driver, TodoListPage.class);
		todolistpage.ClickToggleAllButton();
		Thread.sleep(2000);
		todolistpage.ClickToggleAllButton();
		Thread.sleep(2000);
		todolistpage.ClickWaterButton();
		Thread.sleep(2000);
		todolistpage.NevermindWaterButton();
		Thread.sleep(2000);
		todolistpage.ClickRemoveButton();
		Thread.sleep(2000);
		todolistpage.ClickToggleAllButton();
		Thread.sleep(2000);
		todolistpage.ClickRemoveButton();
		Thread.sleep(2000);
	}
	
	@After
	public void tearDown() {
		BrowserFactory.tearDown();
	}
}
