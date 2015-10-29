package com.example.fw;



import org.openqa.selenium.By;


public class NavigationHelper extends HelperBase {
	
	public NavigationHelper(ApplicationManager manager){
		super(manager);
	}


	public void goToGroupListPage() {
		//if (getCurrentUrl() != "http://localhost/addressbookv4.1.4/group.php") {
			click(By.linkText("groups"));
		//}
		
	   
	}
    public  void openMainPage() {
		//if (we are not in the main page) {
			openUrl("http://localhost/addressbookv4.1.4/");
		//}
	    
	}

}
