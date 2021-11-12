package com.GOFiT.entity;

import java.sql.Date;
import java.util.function.Function;

import javax.servlet.annotation.WebServlet;

@WebServlet("/Endurance")
public EnduranceCalc() {}

public class EnduranceCalc {
	
	
Function<?, ?> calculateEndurance(){	
		
		String testAdmin = (String) Endurance.getElementById("testAdmin");
		String testLocation = (String) Endurance.getElementById("testLocation");
		Date testDate = (Date) Endurance.getElementById("testDate");
		String unit = (String) Endurance.getElementById("unit");
		int age = (int) Endurance.getElementById("Age");
		int DODID = (int) Endurance.getElementById("DODID");
		boolean isMale = (boolean) Endurance.getElementById("isMale");
		double height = (double) Endurance.getElementById("height");
		int weight = (int) Endurance.getElementById("weight");
		
		

		
		return null;
	}
	



	private String testAdmin;
	private String testLocation;
	private Date testDate;
	private String unit;
	private int DODID;
	private boolean isMale;
	private double height;
	private int weight;
	
	
	@Override
	public String toString() {
		return "Endurance [testAdmin=" + testAdmin + ", testLocation=" + testLocation + ", testDate=" + testDate
				+ ", unit=" + unit + ", DODID=" + DODID + ", isMale=" + isMale + ", height=" + height + ", weight="
				+ weight + "]";
	}
	public String getTestAdmin() {
		return testAdmin;
	}
	public void setTestAdmin(String testAdmin) {
		this.testAdmin = testAdmin;
	}
	public String getTestLocation() {
		return testLocation;
	}
	public void setTestLocation(String testLocation) {
		this.testLocation = testLocation;
	}
	public Date getTestDate() {
		return testDate;
	}
	public void setTestDate(Date testDate) {
		this.testDate = testDate;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public int getDODID() {
		return DODID;
	}
	public void setDODID(int dODID) {
		DODID = dODID;
	}
	public boolean isMale() {
		return isMale;
	}
	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	

	
	
	
	

}
