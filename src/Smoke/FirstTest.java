package Smoke;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstTest{
	
	static WebDriver driver = null;
	Date startDate;
    
	@Before
	public void launch() throws Throwable {
		
		System.out.println("Before");
		
		Calendar calendar = Calendar.getInstance();
		 startDate = calendar.getTime();
        
		System.setProperty("webdriver.chrome.driver", ".//driver//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://win16sql19-cce.centricsoftware.com/WebAccess/login.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
        driver.findElement(By.id("LoginID")).sendKeys("Administrator");
        driver.findElement(By.id("Password")).sendKeys("centric8");
        driver.findElement(By.id("loginButton_label")).click();

        Thread.sleep(5000);
		
	}
	
	@Test
	public void bomType() throws Throwable {
		
		clickjs(driver.findElement(By.xpath("//span[contains(text(),'Configuration')]/preceding-sibling::span")));
		eleToBeClickable();
		clickjs(driver.findElement(By.xpath("(//tr[contains(@data-csi-automation,'SystemConfig')]/td)[2]")));
		eleToBeClickable();
		clickjs(driver.findElement(By.xpath("//span[@data-csi-tab-name='Configuration' or text()='Configuration']")));
		eleToBeClickable();
		clickjs(driver.findElement(By.xpath("//span[@data-csi-tab-name='Type Configuration']")));
		
		
		//------------------------------------------styleType-----------------------------------------------\\
		eleToBeClickable();
		clickjs(driver.findElement(By.xpath("//span[@data-csi-tab-name='Style Types']")));
		eleToBeClickable();
		clickjs(driver.findElement(By.xpath("//table[@data-csi-result-action='true']//div[@role='button']//div[@class='dijitReset dijitInline dijitButtonText']")));
		eleToBeClickable();
		driver.findElement(By.xpath("(//div[contains(@data-csi-automation,'StyleType')]/div)/div/input")).sendKeys("Apparel - Color and Size");
		eleToBeClickable();
		clickjs(driver.findElement(By.xpath("(//span[@data-csi-context-parent='centric:'])[2]")));
        eleToBeClickable();
        Thread.sleep(5000);
		isElementPresent(driver.findElement(By.xpath("(//div[@data-csi-act='HasColor:Child:Config:0']/input[@tabindex='0'])[1]")));
		clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='HasColor:Child:Config:0']/input[@tabindex='0'])[1]")));
		//isElementPresent(cp.getStyle_Active());
		//click(cp.getStyle_Active());
		//eleToBeClickable();
		try{
		for(int i=0; i < 8; i++){
			clickjs(driver.findElement(By.xpath("(//span[text()='+']/parent::div)[2]")));
		}}catch (Exception e) {
			// TODO: handle exception
		}
		clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='AttributesMap:Child:Config:0']/input[@tabindex='0'])[1]")));
		isElementPresent(driver.findElement(By.xpath("(//div[@data-csi-act='AttributesMap:Child:Config:0']/input[@tabindex='0'])[2]")));
		clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='AttributesMap:Child:Config:0']/input[@tabindex='0'])[2]")));
		clickjs(driver.findElement(By.xpath("(//span[text()='+']/parent::div)[2]")));
		isElementPresent(driver.findElement(By.xpath("(//div[@data-csi-act='AttributesMap:Child:Config:0']/input[@tabindex='0'])[3]")));
		clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='AttributesMap:Child:Config:0']/input[@tabindex='0'])[3]")));
		isElementPresent(driver.findElement(By.xpath("(//div[@data-csi-act='InAssortment:Child:Config:0']/input[@tabindex='0'])[1]")));
		clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='InAssortment:Child:Config:0']/input[@tabindex='0'])[1]")));
		isElementPresent(driver.findElement(By.xpath("(//div[@data-csi-act='IsAssortment:Child:Config:0']/input[@tabindex='0'])[1]")));
		clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='IsAssortment:Child:Config:0']/input[@tabindex='0'])[1]")));
		isElementPresent(driver.findElement(By.xpath("(//div[@data-csi-act='EnableSKUSources:Child:Config:0']/input[@tabindex='0'])[1]")));
		clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='EnableSKUSources:Child:Config:0']/input[@tabindex='0'])[1]")));
		eleToBeClickable();
		try{
		for(int i=0; i < 7; i++){
			clickjs(driver.findElement(By.xpath("(//span[text()='-']/parent::div)[2]")));
		}}catch (Exception e) {
			// TODO: handle exception
		}
		isElementPresent(driver.findElement(By.xpath("(//div[@data-csi-act='EnableStyleSupplierAttributes:Child:Config:0']/input[@tabindex='0'])[1]")));
		clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='EnableStyleSupplierAttributes:Child:Config:0']/input[@tabindex='0'])[1]")));
		isElementPresent(driver.findElement(By.xpath("(//div[@data-csi-act='HasSize:Child:Config:0']/input[@tabindex='0'])[1]")));
		clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='HasSize:Child:Config:0']/input[@tabindex='0'])[1]")));
		isElementPresent(driver.findElement(By.xpath("(//div[@data-csi-act='ValidateMCMaterialColors:Child:Config:0']/input[@tabindex='0'])[1]")));
		clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='ValidateMCMaterialColors:Child:Config:0']/input[@tabindex='0'])[1]")));
		isElementPresent(driver.findElement(By.xpath("(//div[@data-csi-act='ReferenceDefaultImageOnColorwayCreate:Child:Config:0']/input[@tabindex='0'])[1]")));
		clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='ReferenceDefaultImageOnColorwayCreate:Child:Config:0']/input[@tabindex='0'])[1]")));
		isElementPresent(driver.findElement(By.xpath("(//div[@data-csi-act='AllowCreateColorSpecOnColorway:Child:Config:0']/input[@tabindex='0'])[1]")));
		clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='AllowCreateColorSpecOnColorway:Child:Config:0']/input[@tabindex='0'])[1]")));
		eleToBeClickable();
		
		try{

		clickjs(driver.findElement(By.xpath("(//span[text()='-']/parent::div)[2]")));
		}catch (Exception e) {
			// TODO: handle exception
		}
		
		
		driver.findElement(By.xpath("//table[@data-csi-result-action='true']//div[@role='button']//div[@class='dijitReset dijitInline dijitButtonText']")).click();
        driver.findElement(By.xpath("(//div[contains(@data-csi-automation,'StyleType')]/div)/div/input")).sendKeys("Accessories - Only Color");
		driver.findElement(By.xpath("(//span[@data-csi-context-parent='centric:'])[2]")).click();
        eleToBeClickable();
        isElementPresent(driver.findElement(By.xpath("(//div[@data-csi-act='HasColor:Child:Config:0']/input[@tabindex='0'])[1]")));
		clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='HasColor:Child:Config:0']/input[@tabindex='0'])[1]")));
		//isElementPresent(cp.getStyle_Active());
		//click(cp.getStyle_Active());
		//eleToBeClickable();
		try{
		for(int i=0; i < 8; i++){
			clickjs(driver.findElement(By.xpath("(//span[text()='+']/parent::div)[2]")));
		}}catch (Exception e) {
			// TODO: handle exception
		}
		clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='AttributesMap:Child:Config:0']/input[@tabindex='0'])[1]")));
		isElementPresent(driver.findElement(By.xpath("(//div[@data-csi-act='AttributesMap:Child:Config:0']/input[@tabindex='0'])[2]")));
		clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='AttributesMap:Child:Config:0']/input[@tabindex='0'])[2]")));
		clickjs(driver.findElement(By.xpath("(//span[text()='+']/parent::div)[2]")));
		isElementPresent(driver.findElement(By.xpath("(//div[@data-csi-act='AttributesMap:Child:Config:0']/input[@tabindex='0'])[3]")));
		clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='AttributesMap:Child:Config:0']/input[@tabindex='0'])[3]")));
		isElementPresent(driver.findElement(By.xpath("(//div[@data-csi-act='InAssortment:Child:Config:0']/input[@tabindex='0'])[1]")));
		clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='InAssortment:Child:Config:0']/input[@tabindex='0'])[1]")));
		isElementPresent(driver.findElement(By.xpath("(//div[@data-csi-act='IsAssortment:Child:Config:0']/input[@tabindex='0'])[1]")));
		clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='IsAssortment:Child:Config:0']/input[@tabindex='0'])[1]")));
		isElementPresent(driver.findElement(By.xpath("(//div[@data-csi-act='EnableSKUSources:Child:Config:0']/input[@tabindex='0'])[1]")));
		clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='EnableSKUSources:Child:Config:0']/input[@tabindex='0'])[1]")));
		eleToBeClickable();
		try{
		for(int i=0; i < 7; i++){
			clickjs(driver.findElement(By.xpath("(//span[text()='-']/parent::div)[2]")));
		}}catch (Exception e) {
			// TODO: handle exception
		}
		isElementPresent(driver.findElement(By.xpath("(//div[@data-csi-act='EnableStyleSupplierAttributes:Child:Config:0']/input[@tabindex='0'])[1]")));
		clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='EnableStyleSupplierAttributes:Child:Config:0']/input[@tabindex='0'])[1]")));
		isElementPresent(driver.findElement(By.xpath("(//div[@data-csi-act='ValidateMCMaterialColors:Child:Config:0']/input[@tabindex='0'])[1]")));
		clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='ValidateMCMaterialColors:Child:Config:0']/input[@tabindex='0'])[1]")));
		isElementPresent(driver.findElement(By.xpath("(//div[@data-csi-act='ReferenceDefaultImageOnColorwayCreate:Child:Config:0']/input[@tabindex='0'])[1]")));
		clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='ReferenceDefaultImageOnColorwayCreate:Child:Config:0']/input[@tabindex='0'])[1]")));
		isElementPresent(driver.findElement(By.xpath("(//div[@data-csi-act='AllowCreateColorSpecOnColorway:Child:Config:0']/input[@tabindex='0'])[1]")));
		clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='AllowCreateColorSpecOnColorway:Child:Config:0']/input[@tabindex='0'])[1]")));
		eleToBeClickable();
		
		try{

		clickjs(driver.findElement(By.xpath("(//span[text()='-']/parent::div)[2]")));
		}catch (Exception e) {
			// TODO: handle exception
		}
		eleToBeClickable();
		driver.findElement(By.xpath("//table[@data-csi-result-action='true']//div[@role='button']//div[@class='dijitReset dijitInline dijitButtonText']")).click();
		eleToBeClickable();
		driver.findElement(By.xpath("(//div[contains(@data-csi-automation,'StyleType')]/div)/div/input")).sendKeys("Apparel - Only Size");
		eleToBeClickable();
		driver.findElement(By.xpath("(//span[@data-csi-context-parent='centric:'])[2]")).click();
        eleToBeClickable();
        try{
    		for(int i=0; i < 8; i++){
    			clickjs(driver.findElement(By.xpath("(//span[text()='+']/parent::div)[2]")));
    		}}catch (Exception e) {
    			// TODO: handle exception
    		}
        isElementPresent(driver.findElement(By.xpath("(//div[@data-csi-act='HasSize:Child:Config:0']/input[@tabindex='0'])[1]")));
		clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='HasSize:Child:Config:0']/input[@tabindex='0'])[1]")));
		clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='AttributesMap:Child:Config:0']/input[@tabindex='0'])[1]")));
		isElementPresent(driver.findElement(By.xpath("(//div[@data-csi-act='AttributesMap:Child:Config:0']/input[@tabindex='0'])[2]")));
		clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='AttributesMap:Child:Config:0']/input[@tabindex='0'])[2]")));
		clickjs(driver.findElement(By.xpath("(//span[text()='+']/parent::div)[2]")));
		isElementPresent(driver.findElement(By.xpath("(//div[@data-csi-act='AttributesMap:Child:Config:0']/input[@tabindex='0'])[3]")));
		clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='AttributesMap:Child:Config:0']/input[@tabindex='0'])[3]")));
		isElementPresent(driver.findElement(By.xpath("(//div[@data-csi-act='InAssortment:Child:Config:0']/input[@tabindex='0'])[1]")));
		clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='InAssortment:Child:Config:0']/input[@tabindex='0'])[1]")));
		isElementPresent(driver.findElement(By.xpath("(//div[@data-csi-act='IsAssortment:Child:Config:0']/input[@tabindex='0'])[1]")));
		clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='IsAssortment:Child:Config:0']/input[@tabindex='0'])[1]")));
		isElementPresent(driver.findElement(By.xpath("(//div[@data-csi-act='EnableSKUSources:Child:Config:0']/input[@tabindex='0'])[1]")));
		clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='EnableSKUSources:Child:Config:0']/input[@tabindex='0'])[1]")));
		eleToBeClickable();
		try{
		for(int i=0; i < 7; i++){
			clickjs(driver.findElement(By.xpath("(//span[text()='-']/parent::div)[2]")));
		}}catch (Exception e) {
			// TODO: handle exception
		}
		
		isElementPresent(driver.findElement(By.xpath("(//div[@data-csi-act='EnableStyleSupplierAttributes:Child:Config:0']/input[@tabindex='0'])[1]")));
		clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='EnableStyleSupplierAttributes:Child:Config:0']/input[@tabindex='0'])[1]")));
		try{

			clickjs(driver.findElement(By.xpath("(//span[text()='-']/parent::div)[2]")));
			}catch (Exception e) {
				// TODO: handle exception
			}
		eleToBeClickable();
		driver.findElement(By.xpath("//table[@data-csi-result-action='true']//div[@role='button']//div[@class='dijitReset dijitInline dijitButtonText']")).click();
		eleToBeClickable();
		driver.findElement(By.xpath("(//div[contains(@data-csi-automation,'StyleType')]/div)/div/input")).sendKeys("Accessories - No color and Size");
		eleToBeClickable();
		driver.findElement(By.xpath("(//span[@data-csi-context-parent='centric:'])[2]")).click();
        eleToBeClickable();
        
        getStyleActive();
        
  		System.out.println("style type created successfully");
  		System.out.println("checkbox clicked successfully");
  		
  		//------------------------------------------Attributes----------------------------------------------\\
  		
  		isElementPresent(driver.findElement(By.xpath("//span[@data-csi-tab-name='Style Type Data Sheets']")));
		clickjs(driver.findElement(By.xpath("//span[@data-csi-tab-name='Style Type Data Sheets']")));
		//eleToBeClickable();
		isElementPresent(driver.findElement(By.xpath("//span[@data-csi-automation='plugin-Site-StyleTDS-charts']//following-sibling::span[@data-csi-act='ViewRefresh']")));
		try{
			clickjs(driver.findElement(By.xpath("//span[@data-csi-automation='plugin-Site-StyleTDS-charts']//following-sibling::span[@data-csi-act='ViewRefresh']")));
		}catch(Exception e){
			
		}
		eleToBeClickable();
		//clickjs(driver.findElement(By.xpath("(//span[contains(@class,'fullScreen')])[3]")));
		List<WebElement> nRows = driver.findElements(By.xpath("((//div[contains(@class,'TDS')])/div[@class='csiDialogScroll']//table)//tr[@data-csi-act='ViewSelect']"));
		int i = nRows.size();
		for (int j = 1; j <=i; j++) {
			eleToBeClickable();
			WebElement text = driver.findElement(By.xpath("((((//div[contains(@class,'TDS')])/div[@class='csiDialogScroll']//table)//tr[@data-csi-act='ViewSelect'])["+j+"]/td)[1]"));
			//String s = String.valueOf(j);
			//style=null;
			String text2 = text.getText();
			System.out.println("text is :"+text2);
			
			if(text2.equals("Apparel - Color and Size")){
			for (int j2 = 1; j2 <= 12; j2++) {
				if(j2<=5){
			    eleToBeClickable();
				clickjs(driver.findElement(By.xpath("(//tr["+j+"]//div[@data-csi-act='TDSMap:Child:Config:0']/input[@tabindex='0'])["+j2+"]")));
				//ca.eleToBeClickable(cp.getStyle_Colour());
				}else{
					eleToBeClickable();
					clickjs(driver.findElement(By.xpath("(//span[text()='+']/parent::div)[3]")));
					eleToBeClickable();
					clickjs(driver.findElement(By.xpath("(//tr["+j+"]//div[@data-csi-act='TDSMap:Child:Config:0']/input[@tabindex='0'])["+j2+"]")));
				
				}
			}
			for(int k=0; k < 8; k++){
				clickjs(driver.findElement(By.xpath("(//span[text()='-']/parent::div)[3]")));
			}
			}else if(text2.equals("Accessories - Only Color")){
				for (int j2 = 1; j2 <= 12; j2++) {

					if(j2<=5){
						eleToBeClickable();
					clickjs(driver.findElement(By.xpath("(//tr["+j+"]//div[@data-csi-act='TDSMap:Child:Config:0']/input[@tabindex='0'])["+j2+"]")));
					//ca.eleToBeclickjsable(cp.getStyle_Colour());
					}else{
						eleToBeClickable();
						clickjs(driver.findElement(By.xpath("(//span[text()='+']/parent::div)[3]")));
						eleToBeClickable();
						clickjs(driver.findElement(By.xpath("(//tr["+j+"]//div[@data-csi-act='TDSMap:Child:Config:0']/input[@tabindex='0'])["+j2+"]")));
						
					}
				
				}for(int k=0; k < 8; k++){
					clickjs(driver.findElement(By.xpath("(//span[text()='-']/parent::div)[3]")));
				}
				}else if(text2.equals("Apparel - Only Size")){
					for (int j2 = 1; j2 <= 12; j2++) {

						if(j2<=5){
						eleToBeClickable();
						clickjs(driver.findElement(By.xpath("(//tr["+j+"]//div[@data-csi-act='TDSMap:Child:Config:0']/input[@tabindex='0'])["+j2+"]")));
						//ca.eleToBeclickjsable(cp.getStyle_Colour());
						}else{
							eleToBeClickable();
							clickjs(driver.findElement(By.xpath("(//span[text()='+']/parent::div)[3]")));
							eleToBeClickable();
							clickjs(driver.findElement(By.xpath("(//tr["+j+"]//div[@data-csi-act='TDSMap:Child:Config:0']/input[@tabindex='0'])["+j2+"]")));
						}
					
					}
					for(int k=0; k < 8; k++){
						clickjs(driver.findElement(By.xpath("(//span[text()='-']/parent::div)[3]")));
					}
					}else if(text2.equals("Accessories - No color and Size")){
						for (int j2 = 1; j2 <= 12; j2++) {

							if(j2<=5){
								eleToBeClickable();
							clickjs(driver.findElement(By.xpath("(//tr["+j+"]//div[@data-csi-act='TDSMap:Child:Config:0']/input[@tabindex='0'])["+j2+"]")));
							//ca.eleToBeclickjsable(cp.getStyle_Colour());
							}else{
								eleToBeClickable();
								clickjs(driver.findElement(By.xpath("(//span[text()='+']/parent::div)[3]")));
								eleToBeClickable();
								clickjs(driver.findElement(By.xpath("(//tr["+j+"]//div[@data-csi-act='TDSMap:Child:Config:0']/input[@tabindex='0'])["+j2+"]")));
							}
						
						}
						for(int k=0; k < 8; k++){
							clickjs(driver.findElement(By.xpath("(//span[text()='-']/parent::div)[3]")));
						}
						}else{
			}
				System.out.println("name doesn't matched");
			}
			
		
		System.out.println("style type attributes created successfully");
		System.out.println("checkbox clicked successfully");
		
		//------------------------------------------materialType---------------------------------------------\\
		
		eleToBeClickable();
		clickjs(driver.findElement(By.xpath("//span[@data-csi-tab-name='Material Types']")));
		//clickjs(driver.findElement(By.xpath("(//span[contains(@class,'fullScreen')])[3]")));
		standaloneMaterial("Fabric - Stanadlone");
		structureMaterial("Fabric - Structure Component");
		toolMaterial("Fabric - Tool");
		
		System.out.println("material type created successfully");
		System.out.println("checkbox clicked successfully");
		
		//-------------------------------------------sizeChartType--------------------------------------------\\
		
		
		eleToBeClickable();
		driver.findElement(By.xpath("//span[@data-csi-tab-name='Spec Types']")).click();
		eleToBeClickable();
		driver.findElement(By.xpath("(//table[contains(@data-csi-context-parent,'SpecificationDataSheetConfig')]//div[@role='button']//div[@class='dijitReset dijitInline dijitButtonText'])")).click();
		eleToBeClickable();
		driver.findElement(By.xpath("(//div[contains(@data-csi-automation,'SpecificationDataSheetSubtype')]/div)/div/input")).sendKeys("Spec Type-01");
		eleToBeClickable();
		driver.findElement(By.xpath("(//span[@data-csi-context-parent='centric:'])[3]")).click();
        
		//driver.findElement(By.xpath("//span[@data-csi-tab-name='Spec Types']")).click();
        Thread.sleep(1000);
		driver.findElement(By.xpath("(//table[contains(@data-csi-context-parent,'SpecificationDataSheetConfig')]//div[@role='button']//div[@class='dijitReset dijitInline dijitButtonText'])")).click();
		eleToBeClickable();
		driver.findElement(By.xpath("(//div[contains(@data-csi-automation,'SpecificationDataSheetSubtype')]/div)/div/input")).sendKeys("Spec Type-02");
		eleToBeClickable();
		driver.findElement(By.xpath("(//span[@data-csi-context-parent='centric:'])[3]")).click();
        
        Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@data-csi-act='EnableValueAttributes:Child:SetupSettings:0']/input[@tabindex='0'])[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@data-csi-act='EnableValueAttributes:Child:SetupSettings:0']/input[@tabindex='0'])[2]")).click();

		 List<WebElement> actives = driver.findElements(By.xpath("(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])"));
		  int s=actives.size();
		  System.out.println("size :"+s);
	    int  j=s-1;
	    int  k=s-2;
	    int  l=s-3;
	    int  m=s-4;
			  driver.findElement(By.xpath("(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])["+s+"]")).click();
			  
			  driver.findElement(By.xpath("(//div[@data-csi-act='Active:Child:SetupSettings:0']/input[@tabindex='0'])["+j+"]")).click();

			  System.out.println("size chart created successfully");
		  		System.out.println("checkbox clicked successfully");
			  
		//-----------------------------------------------------------------------------------------------------------\\	  

	}
	
	@After
	public void close() {
		Calendar calendar = Calendar.getInstance();
		Date endDate = calendar.getTime();
		long sumDate = endDate.getTime() - startDate.getTime();
		 long minutes = TimeUnit.MILLISECONDS.toMinutes(sumDate);
		 System.out.format("%d Milliseconds = %d minutes\n", sumDate, minutes );
		System.out.println("Total time taken is :"+ minutes+" minutes");
		driver.close();
	}
	
	public static void jsMouseOver() {
		try {
			Actions a = new Actions(driver);
			Thread.sleep(100);
			a.sendKeys(Keys.DOWN).build().perform();
			a.sendKeys(Keys.TAB).build().perform();
		} catch (Exception e) {
			//Reporter.addStepLogPass("Mouseover to the element" + element.toString() + "is failed");
		}
	}
	
	public static void waitForElementVisibility(WebElement element) throws Throwable {
		//WebDriverWait wait = new WebDriverWait(driver, 100);
		//wait.until(ExpectedConditions.visibilityOf(element));
		//Thread.sleep(1000);
	}
	
	public static boolean isElementPresent(WebElement element) throws Throwable {
		boolean elementPresent = false;
		try {
			Thread.sleep(1000);
			waitForElementVisibility(element);
			if (element.isDisplayed()) {
				elementPresent = true;
			}
			//Reporter.addStepLogPass(element.toString() + "is Displayed successfully");
		} catch (Exception e) {
			//Reporter.addStepLogInfo("Verify Element Present failed" + e.toString());
		}
		return elementPresent;
	}
	
	public static void accept_Alert() {
		try {
			Alert alert = driver.switchTo().alert();
			try{
				String text = alert.getText();
				System.out.println("alert text :"+text);
			}catch(Exception e){

			}
			alert.accept();
			//Reporter.addStepLogPass("alert accepted successfully");
		} catch (Exception e) {
			//Reporter.addStepLogInfo("Alert is not accepted" + e.toString());
		}
	}
	
	public static void insertText(WebElement element, String value) {
		try{
			try{
				element.clear();
			}catch(Exception e1){
				element.sendKeys(Keys.DELETE);
			}
		}catch (Exception e) {

		}
		element.sendKeys(value);

	}

	public void delete() {

		Actions a= new Actions(driver);
		a.sendKeys(Keys.DELETE);

	}

	public void insertTextjs(WebElement element, String value) {
		try{
			element.clear();
		}catch (Exception e) {

		}
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value', '" + value +"')", element);

	}

	public static void click(WebElement element) {

		element.click();

	}

	public void doubleclick(WebElement element) {

		Actions a = new Actions(driver);
		a.doubleClick(element);

	}

	public void eleToBeClickable() throws Throwable {

		Thread.sleep(1000);
		

	}
	
	public void jsScrollPageDown(WebElement element) throws Throwable {

		//int yScrollPosition = element.getLocation().getY();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("arguments[0].scrollIntoView(true);",element);
		Thread.sleep(2000);
		////Reporter.addStepLogPass("scroll page down" + "page is scrolled down successfully");

	}
	
	public void getStyleActive() throws Throwable{
		 
		eleToBeClickable();
		for(int i=0; i < 8; i++){
			clickjs(driver.findElement(By.xpath("(//span[text()='-']/parent::div)[2]")));
		}
		
		List<WebElement> actives = driver.findElements(By.xpath("(//div[@data-csi-act='Available:Child:Config:0']/input[@tabindex='0'])"));
		  int i=actives.size();
		  System.out.println("size :"+i);
	    int  j=i-1;
	    int  k=i-2;
	    int  l=i-3;
	    int  m=i-4;
		try{
			eleToBeClickable();
			jsScrollPageDown(driver.findElement(By.xpath("(//div[@data-csi-act='Available:Child:Config:0']/input[@tabindex='0'])["+i+"]")));
			
		}catch (Exception e) {
			// TODO: handle exception
			
		}
	    
			  clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='Available:Child:Config:0']/input[@tabindex='0'])["+i+"]")));
			  eleToBeClickable();//eleToBeClickable();ca.isElementPresent(element);
			  clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='Available:Child:Config:0']/input[@tabindex='0'])["+j+"]")));
			  eleToBeClickable();
			  clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='Available:Child:Config:0']/input[@tabindex='0'])["+k+"]")));
			  eleToBeClickable();
			  clickjs(driver.findElement(By.xpath("(//div[@data-csi-act='Available:Child:Config:0']/input[@tabindex='0'])["+l+"]")));
			  eleToBeClickable();
					  
		  
		  
	  }
	
	public void standaloneMaterial(String value) throws Throwable {
		
		eleToBeClickable();
		isElementPresent(driver.findElement(By.xpath("(//table[@data-csi-automation='plugin-Site-MaterialTypes-ToolbarNewActions']//div/div)[2]")));
		clickjs(driver.findElement(By.xpath("(//table[@data-csi-automation='plugin-Site-MaterialTypes-ToolbarNewActions']//div/div)[2]")));
		isElementPresent(driver.findElement(By.xpath("(//div[contains(@data-csi-automation,'MaterialType')]/div)/div/input")));
		insertText(driver.findElement(By.xpath("(//div[contains(@data-csi-automation,'MaterialType')]/div)/div/input")), value);
		//isElementPresent(driver.findElement(By.xpath("(//tr[@data-csi-form-field='MaterialUsage']/td[2]/div/div/div/input)[1]")));
		eleToBeClickable();
		click(driver.findElement(By.xpath("(//tr[@data-csi-form-field='MaterialUsage']/td[2]/div/div/div/input)[1]")));
		eleToBeClickable();
		clickjs(driver.findElement(By.xpath("((//div[@data-csi-automation='field-MaterialType-Form-MaterialUsage'])[2]/div)[3]")));
		isElementPresent(driver.findElement(By.xpath("(//span[@data-csi-context-parent='centric:'])[2]")));
		clickjs(driver.findElement(By.xpath("(//span[@data-csi-context-parent='centric:'])[2]")));
        materialCheckBoxes();
		
	}
	
	public void structureMaterial(String value) throws Throwable {
		
		eleToBeClickable();
		isElementPresent(driver.findElement(By.xpath("(//table[@data-csi-automation='plugin-Site-MaterialTypes-ToolbarNewActions']//div/div)[2]")));
		clickjs(driver.findElement(By.xpath("(//table[@data-csi-automation='plugin-Site-MaterialTypes-ToolbarNewActions']//div/div)[2]")));
		isElementPresent(driver.findElement(By.xpath("(//div[contains(@data-csi-automation,'MaterialType')]/div)/div/input")));
		insertText(driver.findElement(By.xpath("(//div[contains(@data-csi-automation,'MaterialType')]/div)/div/input")), value);
		//isElementPresent(driver.findElement(By.xpath("(//tr[@data-csi-form-field='MaterialUsage']/td[2]/div/div/div/input)[1]")));
		eleToBeClickable();
		click(driver.findElement(By.xpath("(//tr[@data-csi-form-field='MaterialUsage']/td[2]/div/div/div/input)[1]")));
		eleToBeClickable();
		clickjs(driver.findElement(By.xpath("((//div[@data-csi-automation='field-MaterialType-Form-MaterialUsage'])[2]/div)[4]")));
		isElementPresent(driver.findElement(By.xpath("(//span[@data-csi-context-parent='centric:'])[2]")));
		clickjs(driver.findElement(By.xpath("(//span[@data-csi-context-parent='centric:'])[2]")));
       
eleToBeClickable();
		
		for(int i=0; i < 10; i++){
			//eleToBeClickable();
			clickjs(driver.findElement(By.xpath("//div[contains(@class,'Material')]//span[text()='-']/parent::div")));
			
		}
		materialCheckBoxes();
		
		
	}
	
	public void toolMaterial(String value) throws Throwable {
		
		eleToBeClickable();
		isElementPresent(driver.findElement(By.xpath("(//table[@data-csi-automation='plugin-Site-MaterialTypes-ToolbarNewActions']//div/div)[2]")));
		clickjs(driver.findElement(By.xpath("(//table[@data-csi-automation='plugin-Site-MaterialTypes-ToolbarNewActions']//div/div)[2]")));
		isElementPresent(driver.findElement(By.xpath("(//div[contains(@data-csi-automation,'MaterialType')]/div)/div/input")));
		insertText(driver.findElement(By.xpath("(//div[contains(@data-csi-automation,'MaterialType')]/div)/div/input")), value);
		//isElementPresent(driver.findElement(By.xpath("(//tr[@data-csi-form-field='MaterialUsage']/td[2]/div/div/div/input)[1]")));
		eleToBeClickable();
		click(driver.findElement(By.xpath("(//tr[@data-csi-form-field='MaterialUsage']/td[2]/div/div/div/input)[1]")));
		eleToBeClickable();
		clickjs(driver.findElement(By.xpath("((//div[@data-csi-automation='field-MaterialType-Form-MaterialUsage'])[2]/div)[5]")));
		isElementPresent(driver.findElement(By.xpath("(//span[@data-csi-context-parent='centric:'])[2]")));
		clickjs(driver.findElement(By.xpath("(//span[@data-csi-context-parent='centric:'])[2]")));
         eleToBeClickable();
		
		for(int i=0; i < 15; i++){
			//eleToBeClickable();
			clickjs(driver.findElement(By.xpath("//div[contains(@class,'Material')]//span[text()='-']/parent::div")));
			
		}
		
		materialCheckBoxes();
		
		
	}
	
	public void materialCheckBoxes() throws Throwable {

		
		
		isElementPresent(driver.findElement(By.xpath("((//div[contains(@class,'Material')])/div[@class='csiDialogScroll']//table)//div[@data-csi-act='HasColor:Child:Config:0']/input[@tabindex='0']")));
		Thread.sleep(1000);
		clickjs(driver.findElement(By.xpath("((//div[contains(@class,'Material')])/div[@class='csiDialogScroll']//table)//div[@data-csi-act='HasColor:Child:Config:0']/input[@tabindex='0']")));
		isElementPresent(driver.findElement(By.xpath("((//div[contains(@class,'Material')])/div[@class='csiDialogScroll']//table)//div[@data-csi-act='Available:Child:Config:0']/input[@tabindex='0']")));
		clickjs(driver.findElement(By.xpath("((//div[contains(@class,'Material')])/div[@class='csiDialogScroll']//table)//div[@data-csi-act='Available:Child:Config:0']/input[@tabindex='0']")));
		eleToBeClickable();
		
		for(int i=0; i < 10; i++){
			eleToBeClickable();
			clickjs(driver.findElement(By.xpath("//div[contains(@class,'Material')]//span[text()='+']/parent::div")));
			if(driver.findElement(By.xpath("(((//div[contains(@class,'Material')])/div[@class='csiDialogScroll']//table)//div[@data-csi-act='TDSMap:Child:Config:0']/input[@tabindex='0'])[1]")).isDisplayed()){
				
		//	clickjs(driver.findElement(By.xpath("//div[contains(@class,'Material')]//span[text()='+']/parent::div")));
			break;
			}}
		clickjs(driver.findElement(By.xpath("(((//div[contains(@class,'Material')])/div[@class='csiDialogScroll']//table)//div[@data-csi-act='TDSMap:Child:Config:0']/input[@tabindex='0'])[1]")));
		
		for(int i=0; i < 5; i++){
			eleToBeClickable();
			clickjs(driver.findElement(By.xpath("//div[contains(@class,'Material')]//span[text()='+']/parent::div")));
			if(driver.findElement(By.xpath("(((//div[contains(@class,'Material')])/div[@class='csiDialogScroll']//table)//div[@data-csi-act='TDSMap:Child:Config:0']/input[@tabindex='0'])[2]")).isDisplayed()){
		//	clickjs(driver.findElement(By.xpath("//div[contains(@class,'Material')]//span[text()='+']/parent::div")));
			break;
		}}
		isElementPresent(driver.findElement(By.xpath("(((//div[contains(@class,'Material')])/div[@class='csiDialogScroll']//table)//div[@data-csi-act='TDSMap:Child:Config:0']/input[@tabindex='0'])[2]")));
		clickjs(driver.findElement(By.xpath("(((//div[contains(@class,'Material')])/div[@class='csiDialogScroll']//table)//div[@data-csi-act='TDSMap:Child:Config:0']/input[@tabindex='0'])[2]")));
		
		for(int i=0; i < 5; i++){
			eleToBeClickable();
			clickjs(driver.findElement(By.xpath("//div[contains(@class,'Material')]//span[text()='+']/parent::div")));
			if(driver.findElement(By.xpath("(((//div[contains(@class,'Material')])/div[@class='csiDialogScroll']//table)//div[@data-csi-act='TDSMap:Child:Config:0']/input[@tabindex='0'])[3]")).isDisplayed()){
		//	clickjs(driver.findElement(By.xpath("//div[contains(@class,'Material')]//span[text()='+']/parent::div")));
			break;
		}}
		isElementPresent(driver.findElement(By.xpath("(((//div[contains(@class,'Material')])/div[@class='csiDialogScroll']//table)//div[@data-csi-act='TDSMap:Child:Config:0']/input[@tabindex='0'])[3]")));
		clickjs(driver.findElement(By.xpath("(((//div[contains(@class,'Material')])/div[@class='csiDialogScroll']//table)//div[@data-csi-act='TDSMap:Child:Config:0']/input[@tabindex='0'])[3]")));
		
		for(int i=0; i < 5; i++){
			eleToBeClickable();
			clickjs(driver.findElement(By.xpath("//div[contains(@class,'Material')]//span[text()='+']/parent::div")));
			if(driver.findElement(By.xpath("(((//div[contains(@class,'Material')])/div[@class='csiDialogScroll']//table)//div[@data-csi-act='TDSMap:Child:Config:0']/input[@tabindex='0'])[4]")).isDisplayed()){
			//clickjs(driver.findElement(By.xpath("//div[contains(@class,'Material')]//span[text()='+']/parent::div")));
			break;
		}}
		isElementPresent(driver.findElement(By.xpath("(((//div[contains(@class,'Material')])/div[@class='csiDialogScroll']//table)//div[@data-csi-act='TDSMap:Child:Config:0']/input[@tabindex='0'])[4]")));
		clickjs(driver.findElement(By.xpath("(((//div[contains(@class,'Material')])/div[@class='csiDialogScroll']//table)//div[@data-csi-act='TDSMap:Child:Config:0']/input[@tabindex='0'])[4]")));
		eleToBeClickable();
		
		for(int i=0; i < 10; i++){
			eleToBeClickable();
			clickjs(driver.findElement(By.xpath("//div[contains(@class,'Material')]//span[text()='-']/parent::div")));
			if(driver.findElement(By.xpath("((//div[contains(@class,'Material')])/div[@class='csiDialogScroll']//table)//div[@data-csi-act='DefaultPlacementQuoteToHighestCost:Child:Config:0']/input[@tabindex='0']")).isDisplayed()){
		//	clickjs(driver.findElement(By.xpath("//div[contains(@class,'Material')]//span[text()='-']/parent::div")));
			break;
		}}
		clickjs(driver.findElement(By.xpath("((//div[contains(@class,'Material')])/div[@class='csiDialogScroll']//table)//div[@data-csi-act='DefaultPlacementQuoteToHighestCost:Child:Config:0']/input[@tabindex='0']")));
		
		for(int i=0; i < 4; i++){
			eleToBeClickable();
			clickjs(driver.findElement(By.xpath("//div[contains(@class,'Material')]//span[text()='-']/parent::div")));
			if(driver.findElement(By.xpath("((//div[contains(@class,'Material')])/div[@class='csiDialogScroll']//table)//div[@data-csi-act='DefaultHasSeasonAvailability:Child:Config:0']/input[@tabindex='0']")).isDisplayed()){
			//clickjs(driver.findElement(By.xpath("//div[contains(@class,'Material')]//span[text()='-']/parent::div")));
			break;
		}}
		isElementPresent(driver.findElement(By.xpath("((//div[contains(@class,'Material')])/div[@class='csiDialogScroll']//table)//div[@data-csi-act='DefaultHasSeasonAvailability:Child:Config:0']/input[@tabindex='0']")));
		clickjs(driver.findElement(By.xpath("((//div[contains(@class,'Material')])/div[@class='csiDialogScroll']//table)//div[@data-csi-act='DefaultHasSeasonAvailability:Child:Config:0']/input[@tabindex='0']")));
		
		for(int i=0; i < 4; i++){
			eleToBeClickable();
			clickjs(driver.findElement(By.xpath("//div[contains(@class,'Material')]//span[text()='-']/parent::div")));
			if(driver.findElement(By.xpath("((//div[contains(@class,'Material')])/div[@class='csiDialogScroll']//table)//div[@data-csi-act='EnableSKUSources:Child:Config:0']/input[@tabindex='0']")).isDisplayed()){
		//	clickjs(driver.findElement(By.xpath("//div[contains(@class,'Material')]//span[text()='-']/parent::div")));
			break;
		}}
		isElementPresent(driver.findElement(By.xpath("((//div[contains(@class,'Material')])/div[@class='csiDialogScroll']//table)//div[@data-csi-act='EnableSKUSources:Child:Config:0']/input[@tabindex='0']")));
		clickjs(driver.findElement(By.xpath("((//div[contains(@class,'Material')])/div[@class='csiDialogScroll']//table)//div[@data-csi-act='EnableSKUSources:Child:Config:0']/input[@tabindex='0']")));
		
		for(int i=0; i < 8; i++){
			eleToBeClickable();
			clickjs(driver.findElement(By.xpath("//div[contains(@class,'Material')]//span[text()='-']/parent::div")));
			if(driver.findElement(By.xpath("((//div[contains(@class,'Material')])/div[@class='csiDialogScroll']//table)//div[@data-csi-act='HasSize:Child:Config:0']/input[@tabindex='0']")).isDisplayed()){
			//clickjs(driver.findElement(By.xpath("//div[contains(@class,'Material')]//span[text()='-']/parent::div")));
			//break;
		}}
		isElementPresent(driver.findElement(By.xpath("((//div[contains(@class,'Material')])/div[@class='csiDialogScroll']//table)//div[@data-csi-act='HasSize:Child:Config:0']/input[@tabindex='0']")));
		clickjs(driver.findElement(By.xpath("((//div[contains(@class,'Material')])/div[@class='csiDialogScroll']//table)//div[@data-csi-act='HasSize:Child:Config:0']/input[@tabindex='0']")));
		
		for(int i=0; i < 4; i++){
			eleToBeClickable();
			clickjs(driver.findElement(By.xpath("//div[contains(@class,'Material')]//span[text()='-']/parent::div")));
			if(driver.findElement(By.xpath("((//div[contains(@class,'Material')])/div[@class='csiDialogScroll']//table)//div[@data-csi-act='AllowCreateColoredMaterialOnPlacement:Child:Config:0']/input[@tabindex='0']")).isDisplayed()){
			//clickjs(driver.findElement(By.xpath("//div[contains(@class,'Material')]//span[text()='-']/parent::div")));
			break;
		}}
		isElementPresent(driver.findElement(By.xpath("((//div[contains(@class,'Material')])/div[@class='csiDialogScroll']//table)//div[@data-csi-act='AllowCreateColoredMaterialOnPlacement:Child:Config:0']/input[@tabindex='0']")));
		clickjs(driver.findElement(By.xpath("((//div[contains(@class,'Material')])/div[@class='csiDialogScroll']//table)//div[@data-csi-act='AllowCreateColoredMaterialOnPlacement:Child:Config:0']/input[@tabindex='0']")));
		eleToBeClickable();
		clickjs(driver.findElement(By.xpath("//div[contains(@class,'Material')]//span[text()='-']/parent::div")));
		clickjs(driver.findElement(By.xpath("//div[contains(@class,'Material')]//span[text()='-']/parent::div")));

	}
	
	public static void clickjs(WebElement element) {
		try {
			JavascriptExecutor executor = (JavascriptExecutor) driver;
			executor.executeScript("arguments[0].click();", element);
			//Reporter.addStepLogPass(element.toString() + "element is clicked successfully");
		} catch (Exception e) {
			//Reporter.addStepLogInfo(element.toString() + "element is not clicked" + e.getMessage());
		}
	}
	

}
