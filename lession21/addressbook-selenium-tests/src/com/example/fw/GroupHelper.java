package com.example.fw;



import org.openqa.selenium.By;


import com.example.tests.GroupObject;


public class GroupHelper extends HelperBase  {
	
	
	public GroupHelper(ApplicationManager manager){
		super(manager);
	}
	
	public void createGroup(GroupObject groupObject) {
		
		manager.getNavigationHelper().goToGroupListPage();
		initGroupCreation();
		fillGroupForm(groupObject);
		submitGroupCreation();
		returnToGroupListPage();
	}

	private void returnToGroupListPage() {
		click(By.linkText("group page"));
	   
	  
	}

	private void submitGroupCreation() {
		click(By.name("submit"));
	   
	}

	private void fillGroupForm(GroupObject groupObject) {
		type("group_name", groupObject.name);
	    type("group_header", groupObject.header);
	    type("group_footer", groupObject.footer);
	}
	private void initGroupCreation() {
		click(By.name("new"));
	  
	}

	
}
