package poja;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
public class Trello {
	

public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://trello.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
//===================================================================================================================================================================
		WebElement LogIn =  driver.findElement(By.xpath("//a[@data-uuid='MJFtCCgVhXrVl7v9HA7EH_login']"));
	    LogIn.click();
		
	    WebElement Email = driver.findElement(By.xpath("(//input[@name='user'])[1]"));
		Email.sendKeys("ghanwatpritam44@gmail.com");
		
		WebElement Continue = driver.findElement(By.xpath("//input[@type='submit']"));
		Continue.click();

//==========================================================================================================================================================		
		Thread.sleep(2000);
		String Handles = driver.getWindowHandle();

		driver.switchTo().window(Handles);
		WebElement Password = driver.findElement(By.xpath("	//input[@name='password']"));
		Password.sendKeys("Pritam1995@");
		
		WebElement Login = driver.findElement(By.xpath("//span[text()='Log in']"));
	    Login.click();
	    Thread.sleep(2000);
	    driver.navigate().refresh();  
//==========================================================================================================================================================	   
	    String Handles1 = driver.getWindowHandle();
		driver.switchTo().window(Handles1 );
	   
	    WebElement NewBoard = driver.findElement(By.xpath("//div[@class='board-tile mod-add']"));
	    NewBoard.click();
	    Thread.sleep(2000);

	    WebElement NameOfBoard = driver.findElement(By.xpath("//input[@type='text']"));
	    NameOfBoard.sendKeys("PRITAM");
	    
	    WebElement Create = driver.findElement(By.xpath("//button[text()='Create'] "));
	    Create.click();
	    
	    Thread.sleep(2000);
  
        String Handles2 = driver.getWindowHandle();
        driver.switchTo().window(Handles2 );
     
        WebElement List = driver.findElement(By.xpath("//span[@class='placeholder'] "));
           Actions act = new Actions (driver);
           act.moveToElement(List);
           act.click();
           act.build().perform();
//========================================================================================================================================================== 
       WebElement Title1 = driver.findElement(By.xpath("//input[@class='list-name-input']"));
        Title1.sendKeys("A");
	 
       WebElement AddCard1 = driver.findElement(By.xpath("//input[@value='Add card'] "));  
         act.moveToElement(AddCard1);
         act.sendKeys(Keys.ENTER);
         act.build().perform();
//==========================================================================================================================================================
         Thread.sleep(2000);
         WebElement Title2 = driver.findElement(By.xpath("//input[@class='list-name-input']"));
         Title2.sendKeys("B");
 	
         WebElement AddCard2 = driver.findElement(By.xpath("//input[@value='Add list'] "));  
          act.moveToElement(AddCard2);
          act.sendKeys(Keys.ENTER);
          act.build().perform();
//==========================================================================================================================================================         
         Thread.sleep(2000);  
         WebElement Cancel = driver.findElement(By.xpath("//a[@class='icon-lg icon-close dark-hover js-cancel-edit'] "));
         Actions act1 = new Actions (driver);
         act1.moveToElement(Cancel);
         act1.click();
         act1.build().perform();
         driver.navigate().refresh();
//==========================================================================================================================================================        
         Thread.sleep(2000);
         WebElement ListOfElement = driver.findElement(By.xpath("(//a[@class='open-card-composer js-open-card-composer'])[4]"));        
         Actions act2 = new Actions (driver);
         act2.moveToElement(ListOfElement);
         act2.doubleClick();
         Thread.sleep(2000);
         act2.sendKeys("Hello");
         act2.sendKeys(Keys.ENTER);
         act2.build().perform();
//==========================================================================================================================================================    
        WebElement  Cance2 = driver.findElement(By.xpath("//a[@class='icon-lg icon-close dark-hover js-cancel']"));  
        Cance2.click(); 
        Thread.sleep(2000);
       
        WebElement  Source = driver.findElement(By.xpath("//div[@class='list-card-details js-card-details']"));  
       
        Actions act3 = new Actions (driver);
        act3.contextClick().perform();

        WebElement  Move = driver.findElement(By.xpath("//span[text()='Move']"));  
        act3.moveToElement(Move);
        act3.click();
        act3.build().perform();
        
        WebElement MoveToOptions = driver.findElement(By.xpath("//select[@class='js-select-list']"));
        act3.moveToElement(MoveToOptions);
        act3.click();
        act3.build().perform();
        
       Select select = new Select (MoveToOptions);
        select.selectByVisibleText("B");
        
       WebElement ClickOnMove = driver.findElement(By.xpath("//input[@value='Move']"));
       ClickOnMove.click();

//==========================================================================================================================================================
       Thread.sleep(2000);
       WebElement  Hello = driver.findElement(By.xpath("//div[@class='list-cards u-fancy-scrollbar u-clearfix js-list-cards js-sortable ui-sortable'])[5]"));
       Point point = Hello.getLocation();
        int xcord = point.getX();
        int ycord = point.getY();
       System.out.println(xcord+ ", "+ycord);
       
       
       
	}

}
