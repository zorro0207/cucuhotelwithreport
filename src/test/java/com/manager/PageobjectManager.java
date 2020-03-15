package com.manager;

import org.pages.BookHotelPage;
import org.pages.ConfirmationPage;
import org.pages.LoginPage;
import org.pages.SearchPage;
import org.pages.SelectPage;

public class PageobjectManager {
	
	private LoginPage loginPage;
	private BookHotelPage bookHotelPage;
	private SearchPage searchPage;
	private SelectPage selectPage;
	
	private ConfirmationPage confirmationPage;

	public LoginPage getLoginPage() {
		return (loginPage==null?loginPage=new LoginPage():loginPage);
	}

	public BookHotelPage getBookHotelPage() {
		return (bookHotelPage==null?bookHotelPage=new BookHotelPage():bookHotelPage);
	}

	public SearchPage getSearchPage() {
		return (searchPage==null?searchPage=new SearchPage():searchPage);
	}

	public SelectPage getSelectPage() {
		return (selectPage==null?selectPage=new SelectPage():selectPage);
	}

	public ConfirmationPage getConfirmationPage() {
		return (confirmationPage==null?confirmationPage=new ConfirmationPage():confirmationPage);
	}
	
	
	
	

}
