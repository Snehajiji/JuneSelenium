package test;

import org.testng.annotations.Test;
import basepkg.Fb_baseclass;
import page.Fb_loginpage;
import utilities.Excelutilities;

public class Fb_logintest extends Fb_baseclass
{
	//WebDriver driver;
	
	@Test
	public void test()throws Exception
	{
		Fb_loginpage p1=new Fb_loginpage(driver);
		
		//Reading the data from excel file by the specified path
		
		String xl="D:\\A Software Testing\\Apache_Excel\\Demoexcel.xlsx";
		String Sheet="Sheet1";
		int rowCount=Excelutilities.getRowCount(xl, Sheet);
		
		for (int i=1;i<=rowCount;i++)
		{
			String Username=Excelutilities.getCellValue(xl, Sheet, i, 0);
			System.out.println("Username----"+Username);
			
			String Pwd=Excelutilities.getCellValue(xl, Sheet, i, 1);
			System.out.println("Password----"+Pwd);
			
			p1.setValues(Username, Pwd);
			p1.loginClick();
		}
	}

}
