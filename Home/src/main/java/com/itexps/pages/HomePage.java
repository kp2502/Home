/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itexps.pages;

import com.itexps.util.BaseClass;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author Krimali
 */
public class HomePage extends BaseClass {
    //initializing web element
    //@FindBy(css = "[title=\"Home\"]")
   //private WebElement title;
       
      @FindBy(id="newsletter")
    private WebElement newsletter;
      
        @FindBy(id="Location")
    private WebElement location;
                
//                @FindBy(id="Location")
    //private WebElement location;
        @FindBy(xpath = ".//*[@title='Order Online']")
    private WebElement order;
    
                 
         @FindBy(id="Username")
    private WebElement username;
              
          @FindBy(id="Password")
    private WebElement password;
          
         @FindBy(xpath="//button[@type='submit']")
    private WebElement submit;
          
 //initializing page object
   public HomePage(){PageFactory.initElements(driver,this);
   }
// action or the process
  // public void home(){
     // title.click();
  // }
   public void info(){
     newsletter.sendKeys(prop.getProperty("username"));
     newsletter.sendKeys(Keys.TAB);
     location.sendKeys("c");
     location.sendKeys("c");
     password.sendKeys(prop.getProperty("itexperts"));
       submit.click();
      driver.close();
      driver.quit();
   }
}