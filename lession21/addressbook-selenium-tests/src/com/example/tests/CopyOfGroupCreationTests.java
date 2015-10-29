package com.example.tests;

import org.testng.annotations.Test;

//import org.testng.annotations.TestInstance;




public class CopyOfGroupCreationTests extends TestBase {
 
	@Test 
  public void testValidGr() throws Exception {
	  GroupObject emptyDataGroup = new GroupObject("gyfg", "gdbvg", "vvdv");
	 app.getGroupHelper().createGroup(emptyDataGroup);
    //validate
  }
  
  @Test
  public void testGroupWithEmptyDataCanBeCreated() throws Exception {
	  GroupObject validGroup = new GroupObject("", "", "");
	  app.getGroupHelper().createGroup(validGroup);
	  //validate
    
  }
}
