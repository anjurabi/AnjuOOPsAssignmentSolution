package com.anju.model;

class SuperDepartment								//super class
{
	public String departmentName()
	{
		return "Super Department";					//returns the super department
	}
	public String getTodaysWork()
	{
		return "No Work as of now";					//returns no work
	}
	public String getWorkDeadline()
	{
		return "Nil";								//returns Nil
	}
	public String isTodayAHoliday()
	{
		return "Today is not a Holiday";			//returns not a holiday
	}
}