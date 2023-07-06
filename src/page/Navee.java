package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Navee {
	WebDriver driver;
	By navee1=By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a/span[1]");
	By navee2=By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a");
	By firstn=By.xpath("//*[@id=\"input-firstname\"]");
	By lastn=By.xpath("//*[@id=\"input-lastname\"]");
	By email=By.xpath("//*[@id=\"input-email\"]");
	By tele=By.xpath("//*[@id=\"input-telephone\"]");
	By pass=By.xpath("//*[@id=\"input-password\"]");
	By pass2=By.xpath("//*[@id=\"input-confirm\"]");
	By conf=By.xpath("/html/body/div[2]/div/div/form/fieldset[3]/div/div/label[2]");
	By check1=By.xpath("/html/body/div[2]/div/div/form/div/div/input[1]");
	By cont=By.xpath("/html/body/div[2]/div/div/form/div/div/input[2]");
	By cont1=By.xpath("/html/body/div[2]/div/div/div/div/a");
	By logout=By.xpath("/html/body/nav/div/div[2]/ul/li[2]/ul/li[5]/a");
public Navee(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
	}
public void test1()
{
	driver.findElement(navee1).click();
	driver.findElement(navee2).click();
}
public void name()
{
	driver.findElement(firstn).sendKeys("Amritha");
	driver.findElement(lastn).sendKeys("Udayakumar");
}
public void test2()
{
	driver.findElement(email).sendKeys("amrithauday@gmail.com");
	
	driver.findElement(tele).sendKeys("7736594870");
}
public void test3()
{
	driver.findElement(pass).sendKeys("ammu@123");
	driver.findElement(pass2).sendKeys("ammu@123");
}
public void radio() {
	WebElement radio=driver.findElement(conf);
	if(radio.isSelected())
	{
		System.out.println("checked");
	}
	else
	{
		System.out.println("not checked");
		radio.click();
	}}
public void test4()
{
	driver.findElement(check1).click();
	driver.findElement(cont).click();
	driver.findElement(cont1).click();
}
public void test5()
{
	
	driver.findElement(navee1).click();
	driver.findElement(logout).click();
	
	
}}


