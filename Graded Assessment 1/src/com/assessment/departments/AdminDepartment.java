package com.assessment.departments;

public class AdminDepartment extends SuperDepartment{
	
	String departmentName()
	{
		return "Welcome to Admin Department ";
	}
	
	String getTodaysWork()
	{
		return "Complete your documents submission";
	}
	
	String getWorkDeadline()
	{
		return "Complete by EOD  ";
		//super.isTodayAHoliday();
	}
	
	public String isTodayAHoliday()
	{
		 return super.isTodayAHoliday();
	}
}
