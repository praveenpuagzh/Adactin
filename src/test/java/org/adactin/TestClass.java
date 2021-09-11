package org.adactin;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.DateUtil;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass extends BaseClass {
	public static WebDriver driver;

	@BeforeClass
	public static void beforeclass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
}

	@Before
	public void start() {

		Date d = new Date();
		System.out.println("Starttime:"+d);
		
	}

	@Test
	public void Test1() {
		loginpage l = new loginpage();
		System.out.println("Test1 Started");
		driver.get("https://adactinhotelapp.com/HotelAppBuild2/");
		fillthetext(l.uname, "Hulkpraveen");
		fillthetext(l.pass, "Hulk@123");
		click(l.login);
		
	}
	
	@Test
	public void Test2() {
		Searchpage sp = new Searchpage();
		System.out.println("Test2 Started");
		selectbyvalue(sp.location, "Melbourne");
		selectbyvalue(sp.hotels, "Hotel Hervey");
		selectbyvalue(sp.roomtype, "Standard");
		selectbyvalue(sp.roomnos,"1");
		fillthetext(sp.datepick_in, "11/09/2021");
		fillthetext(sp.datepick_out, "12/09/2021");
		selectbyvalue(sp.adult_room, "2");
		selectbyvalue(sp.child_room, "1");
		click(sp.submit);
		

	}
	@Test
	public void Test3() throws Throwable {
		SelectHotel sh = new SelectHotel();
		System.out.println("Test3 Started");
		click(sh.checkbutton);
		click(sh.press);
		
	}
	
	@Test
	public void Test4() {
		BookHotel bk = new BookHotel();
		System.out.println("Test4 Started");
		fillthetext(bk.fname, "Praveen");
		fillthetext(bk.lname, "Kumar");
		fillthetext(bk.address, "10,Anna Salai,Puducherry");
		fillthetext(bk.ccnum, "2135 5465 8798 8457");
		selectbyvalue(bk.cctype, "MAST");
		selectbyvalue(bk.expmonth, "3");
		selectbyvalue(bk.expyear, "2022");
		fillthetext(bk.cvvnum, "1278");
		click(bk.booknow);
		

	}
	@Test
	public void Test5() {
		Prebook pb =new Prebook();
		System.out.println("Test5 Started");
		click(pb.confrim);
		
	}
	@Test
	public void Test6() {
		BookConfrim bc = new BookConfrim();
		String fname = bc.fname.getAttribute("value");
		String lname = bc.lname.getAttribute("value");
		System.out.println("Name:"+fname+lname);
		String bookingID = bc.bookingid.getAttribute("value");
		System.out.println("booking ID is:"+bookingID);
		String Hotelname = bc.HotelName.getAttribute("value");
		System.out.println("Hotel name:"+Hotelname);
		String location = bc.Location.getAttribute("value");
		System.out.println("Hotel Location:"+location);
		String Roomnos = bc.roomcount.getAttribute("value");
		System.out.println("TotalRooms:"+Roomnos);
		
	}
	
	@After
	public void End() {

		Date d = new Date();
		System.out.println("Endtime:"+d);
	}

	@AfterClass
	public static void quit() {
		// driver.quit();
	}

}
