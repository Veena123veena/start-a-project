package Genaric;

import org.openqa.selenium.WebElement;

public class Webelement_generic 
{
       public void get_the_text(WebElement ele)
       {
    	   String text = ele.getText();
    	   System.out.println(text);
       }
       
       public void get_the_att(WebElement ele,String an)
       {
    	   String att = ele.getAttribute(an);
    	   System.out.println(att);
       }
	
}
