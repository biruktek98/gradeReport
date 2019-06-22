/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autotest;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver; 

/**
 *
 * @author G
 */
public class Autotest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException, IOException {
        // TODO code application logic here
         System.setProperty("webdriver.gecko.driver", "C:\\Gecko\\geckodriver.exe");
         WebDriver driver;
         driver = new FirefoxDriver();
         
         driver.get("https://portal.aait.edu.et"); 
         
         driver.findElement(By.id("UserName")).sendKeys("ATR/9938/09");
        
         driver.findElement(By.id("Password")).sendKeys("password");
         driver.findElement(By.xpath("//*[@id=\"home\"]/div[2]/div[2]/form/div[4]/div/button")).click();
         
         driver.get("https://portal.aait.edu.et/Grade/GradeReport");
         
         
         WebElement report = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]"));
        
         File gr = new File("./Grades.txt");
         BufferedWriter writer = new BufferedWriter(new FileWriter(gr));
         writer.write(report.getText());

    }
    
}
























