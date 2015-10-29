package com.example.fw;







public class ApplicationManager {
	
	private WebDriverHelper webDriverHelper;
	private GroupHelper groupHelper;
	
	private NavigationHelper navigationHelper;
  
	
	public void stop() {
		if (webDriverHelper !=null) {
			webDriverHelper.stop();
		}
					
	}
	

	//public WebDriverHelper getWebDriverHelper() {
		//if (webDriverHelper ==null) {
			//webDriverHelper= new WebDriverHelper(this);
			
	//	}
		// TODO Auto-generated method stub
		//return webDriverHelper;
	//}

	
   
	
	WebDriverHelper getWebDriverHelper() {
		if (webDriverHelper == null) {
			webDriverHelper= new WebDriverHelper(this);
			
		}
		// TODO Auto-generated method stub
		return webDriverHelper;
	}

	public GroupHelper getGroupHelper() {
		if (groupHelper ==null) {
			groupHelper= new GroupHelper(this);
			
		}
		// TODO Auto-generated method stub
		return groupHelper;
	}
	
	public NavigationHelper getNavigationHelper() {
		if (navigationHelper==null) {
			navigationHelper= new NavigationHelper(this);
			
		}
		// TODO Auto-generated method stub
		return navigationHelper;
	}

	
}