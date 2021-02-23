package Test_scripts;

import org.testng.annotations.Test;

import Genaric.Base_test;
import Genaric.Generic_readExcel;
import Pom_classes.Facebook_login;

public class Valid_login extends Base_test
{
	@Test
	public void Login()
	{
		String username=Generic_readExcel .getdata("sheet1", 0, 0);
		String password=Generic_readExcel.getdata("sheet1", 0, 1);
		Facebook_login fb= new Facebook_login(driver);
		
		fb.setemail(username);
		fb.setpass(password);
		fb.pressbtn();
	}
	


}
