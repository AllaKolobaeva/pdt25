package com.example.tests;

import static org.testng.Assert.assertEquals;

import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.testng.annotations.Test;

public class GroupRemovalTests extends TestBase{
	
 @Test
public void deleteSomeGroup() {
	app.getNavigationHelper().openMaimPage();
	app.getNavigationHelper().gotoGroupsPage();
	
	List<GroupData> oldList = app.getGroupHelper().getGroups();
	Random rnd = new Random();
	int index= rnd.nextInt(oldList.size()-1);
	
	
	app.getGroupHelper().deleteGroup(index);
	app.getGroupHelper().returnToGroupsPage();

	 List<GroupData> newList = app.getGroupHelper().getGroups();
	
	 oldList.remove(index);
     Collections.sort(oldList);
     assertEquals(newList, oldList);
 
 }
 
}
