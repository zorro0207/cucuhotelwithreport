package org.stepdef;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.base.LibGlobal;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.pages.BookHotelPage;
import org.pages.ConfirmationPage;
import org.pages.LoginPage;
import org.pages.SearchPage;
import org.pages.SelectPage;

import com.manager.PageobjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef extends LibGlobal {
	//WebDriver driver;
	PageobjectManager page =new PageobjectManager();

	@Given("user is on the adahotel page enters the user name ,password and clicks login")
	public void user_is_on_the_adahotel_page_enters_the_user_name_password_and_clicks_login(
			io.cucumber.datatable.DataTable data) throws IOException, InterruptedException {
		
		
		List<String> l = data.asList();
		String s1 = l.get(0);
		String s2 = l.get(1);
		System.out.println(s1);
		System.out.println(s2);
		// Thread.sleep(5000);
		fill(page.getLoginPage().getTxtUser(), s1);
		// Thread.sleep(2000);
		fill(page.getLoginPage().getTxtpass(), s2);

		click(page.getLoginPage().getBtnLogn());

	}

	@When("user enters the location ,hotel name, room type,  noORooms, NoOfAdults, NoOfChild and clicks search")
	public void user_enters_the_location_hotel_name_room_type_noORooms_NoOfAdults_NoOfChild_and_clicks_search(
			io.cucumber.datatable.DataTable data) throws InterruptedException, IOException {


		List<String> li = data.asList();
		String s1 = li.get(0);
		selectByVisibletext(page.getSearchPage().getLocation(), s1);
		Thread.sleep(1000);

		String s2 = li.get(1);
		selectByVisibletext(page.getSearchPage().getHotel(), s2);

		String s3 = li.get(2);
		selectByVisibletext(page.getSearchPage().getRoomType(), s3);

		String s4 = li.get(3);
		selectByVisibletext(page.getSearchPage().getRoomNo(), s4);

		String s5 = li.get(4);
		selectByVisibletext(page.getSearchPage().getNoOfAdult(), s5);

		String s6 = li.get(5);
		selectByVisibletext(page.getSearchPage().getNoOfChild(), s6);

		click(page.getSearchPage().getSearch());
		Thread.sleep(3000);

		click(page.getSelectPage().getHotelselect());
		click(page.getSelectPage().getHotelSelectOn());

	}

	@When("user enters the first name, last name, billing address, credit card no , credit card type an ccv")
	public void user_enters_the_first_name_last_name_billing_address_credit_card_no_credit_card_type_an_ccv(
			io.cucumber.datatable.DataTable data) throws InterruptedException, IOException {


		Thread.sleep(2000);

		List<String> li = data.asList();
		String s1 = li.get(0);
		fill(page.getBookHotelPage().getFirstName(), s1);

		String s2 = li.get(1);
		fill(page.getBookHotelPage().getLastName(), s2);

		String s3 = li.get(2);
		fill(page.getBookHotelPage().getBillingAddress(), s3);

		String s4 = li.get(3);
		fill(page.getBookHotelPage().getCreditCardNO(), s4);

		String s5 = li.get(4);
		selectByVisibletext(page.getBookHotelPage().getCreditType(), s5);
		Thread.sleep(1000);

		String s6 = li.get(5);
		selectByVisibletext(page.getBookHotelPage().getMonth(), s6);
		Thread.sleep(1000);
		String s7 = li.get(6);

		selectByVisibletext(page.getBookHotelPage().getYear(), s7);

		Thread.sleep(1000);

		String s8 = li.get(7);
		fill(page.getBookHotelPage().getCcv(), s8);
		Thread.sleep(2000);
		click(page.getBookHotelPage().getBook());
	}

	@Then("user should click the login button")
	public void user_should_click_the_login_button() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebElement book1 = page.getConfirmationPage().getBook();
		String order = book1.getAttribute("value");
		 System.out.println(order);
		click(page.getConfirmationPage().getBookeditinerary());
		
		String x="//input[@value='"+order+"']/parent::td/preceding-sibling::td";
	    WebElement c = driver.findElement(By.xpath(x));
	    click(c);
	    click(page.getConfirmationPage().getCancel());
	    
	    Alert a= driver.switchTo().alert();
	    a.accept();
	    
	}
	    
		
		

	}

