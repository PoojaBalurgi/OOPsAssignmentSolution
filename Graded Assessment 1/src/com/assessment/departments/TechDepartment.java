package com.assessment.departments;

public class TechDepartment extends SuperDepartment{
	
	String departmentName()
	{
		return "Welcome to Tech Department ";
	}
	
	String getTodaysWork()
	{
		return "Complete coding of Module 1";
	}
	
	String getWorkDeadline()
	{
		return "Complete by EOD  ";
	}
	
	String getTechStackInformation()
	{
		return "Core Java";
	}
	
	public String isTodayAHoliday()
	{
		 return super.isTodayAHoliday();
	}
}

