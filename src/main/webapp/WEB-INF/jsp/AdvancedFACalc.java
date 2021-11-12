package com.GOFiT.entity;

import java.sql.Date;
import java.util.function.Function;

import javax.servlet.annotation.WebServlet;

@WebServlet("/AdvancedFA")
public AdvancedFACalc() {}

public class AdvancedFACalc{
	
Function<?, ?> calculateAdvancedFA(){	
	String testAdmin = (String) AdvancedFA.getElementById("testA");
	String testLocation = (String) AdvancedFA.getElementById("testL");
	Date testDate = (Date) AdvancedFA.getElementById("testD");
	String unit = (String) AdvancedFA.getElementById("logins");
	int age = (int) AdvancedFA.getElementById("Age");
	int DODID = (int) AdvancedFA.getElementById("testDODID");
	boolean isMale = (boolean) AdvancedFA.getElementById("isMale");
	
	double height = (double) AdvancedFA.getElementById("height");
	int weight = (int) AdvancedFA.getElementById("weight");
	
	double benchPress = (double) AdvancedFA.getElementById("benchPress");
	double legPress = (double) AdvancedFA.getElementById("legPress");
	int pushUps = (int) AdvancedFA.getElementById("pushUps");
	int sitUps = (int) AdvancedFA.getElementById("sitUps");
	int step = (int) AdvancedFA.getElementById("step");
	double skinFold = (double) AdvancedFA.getElementById("skinFold");
	int sitReachInch = (int) AdvancedFA.getElementById("sitReachInch");
	int sitReachCentimeter = (int) AdvancedFA.getElementById("sitReachCentimeter");
	int runMinutes = (int) AdvancedFA.getElementById("runMinutes");
	int runSeconds = (int) AdvancedFA.getElementById("runSeconds");
	boolean isElevation6600 = (boolean) AdvancedFA.getElementById("isElevation6600");
	boolean isElevation6000 = (boolean) AdvancedFA.getElementById("isElevation6000");
	boolean isElevation5500 = (boolean) AdvancedFA.getElementById("isElevation5500");
	boolean isElevation5250 = (boolean) AdvancedFA.getElementById("isElevation5250");
	
	

	if (isMale == false && age < 30) {
		female20s();
	}
	else if (isMale == false && age > 29 && age < 40) {
		female30s();
	}
	else if (isMale == false && age > 39 && age < 50) {
		female40s();
	}
	else if (isMale == false && age > 59 && age < 60) {
		female50s();
	}
	else if (isMale == false && age > 60) {
		female60s();
	}
	if (isMale == true && age < 30) {
		male20s();
	}
	else if (isMale == true && age > 29 && age < 40) {
		male30s();
	}
	else if (isMale == true && age > 39 && age < 50) {
		male40s();
	}
	else if (isMale == true && age > 59 && age < 60) {
		male50s();
	}
	else if (isMale == true && age > 60) {
		male60s();
	}
	
	private female20s{
		return score;
	}
	private female30s{
		return score;
	}
	private female40s{
		return score;
	}
	private female50s{
		return score;
	}
	private female60s{
		return score;
	}
	private male20s{
		return score;
	}
	private male30s{
		return score;
	}
	private male40s{
		return score;
	}
	private male50s{
		return score;
	}
	private male60s{
		return score;
	}
}
	
	
	
	
	
	private String testA;
	private String testL;
	private Date testD;
	private String logins;
	private int Age;
	private int testDODID;
	private boolean isMale;
	private double height;
	private int weight;
	
	private double benchPress;
	private double legPress;
	private int pushUps;
	private int sitUps;
	private int step;
	private double skinFold;
	private int sitReachInch;
	private int sitReachCentimeter;
	private int runMinutes;
	private int runSeconds;
	private boolean isElevation6600;
	private boolean isElevation6000;
	private boolean isElevation5500;
	private boolean isElevation5250;
	@Override
	public String toString() {
		return "AdvancedFA [testA=" + testA + ", testL=" + testL + ", testD=" + testD + ", logins=" + logins + ", Age="
				+ Age + ", testDODID=" + testDODID + ", isMale=" + isMale + ", height=" + height + ", weight=" + weight
				+ ", benchPress=" + benchPress + ", legPress=" + legPress + ", pushUps=" + pushUps + ", sitUps="
				+ sitUps + ", step=" + step + ", skinFold=" + skinFold + ", sitReachInch=" + sitReachInch
				+ ", sitReachCentimeter=" + sitReachCentimeter + ", runMinutes=" + runMinutes + ", runSeconds="
				+ runSeconds + ", isElevation6600=" + isElevation6600 + ", isElevation6000=" + isElevation6000
				+ ", isElevation5500=" + isElevation5500 + ", isElevation5250=" + isElevation5250
				+ ", calculateAdvancedFA()=" + calculateAdvancedFA() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	public String getTestA() {
		return testA;
	}
	public void setTestA(String testA) {
		this.testA = testA;
	}
	public String getTestL() {
		return testL;
	}
	public void setTestL(String testL) {
		this.testL = testL;
	}
	public Date getTestD() {
		return testD;
	}
	public void setTestD(Date testD) {
		this.testD = testD;
	}
	public String getLogins() {
		return logins;
	}
	public void setLogins(String logins) {
		this.logins = logins;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public int getTestDODID() {
		return testDODID;
	}
	public void setTestDODID(int testDODID) {
		this.testDODID = testDODID;
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
	public double getBenchPress() {
		return benchPress;
	}
	public void setBenchPress(double benchPress) {
		this.benchPress = benchPress;
	}
	public double getLegPress() {
		return legPress;
	}
	public void setLegPress(double legPress) {
		this.legPress = legPress;
	}
	public int getPushUps() {
		return pushUps;
	}
	public void setPushUps(int pushUps) {
		this.pushUps = pushUps;
	}
	public int getSitUps() {
		return sitUps;
	}
	public void setSitUps(int sitUps) {
		this.sitUps = sitUps;
	}
	public int getStep() {
		return step;
	}
	public void setStep(int step) {
		this.step = step;
	}
	public double getSkinFold() {
		return skinFold;
	}
	public void setSkinFold(double skinFold) {
		this.skinFold = skinFold;
	}
	public int getSitReachInch() {
		return sitReachInch;
	}
	public void setSitReachInch(int sitReachInch) {
		this.sitReachInch = sitReachInch;
	}
	public int getSitReachCentimeter() {
		return sitReachCentimeter;
	}
	public void setSitReachCentimeter(int sitReachCentimeter) {
		this.sitReachCentimeter = sitReachCentimeter;
	}
	public int getRunMinutes() {
		return runMinutes;
	}
	public void setRunMinutes(int runMinutes) {
		this.runMinutes = runMinutes;
	}
	public int getRunSeconds() {
		return runSeconds;
	}
	public void setRunSeconds(int runSeconds) {
		this.runSeconds = runSeconds;
	}
	public boolean isElevation6600() {
		return isElevation6600;
	}
	public void setElevation6600(boolean isElevation6600) {
		this.isElevation6600 = isElevation6600;
	}
	public boolean isElevation6000() {
		return isElevation6000;
	}
	public void setElevation6000(boolean isElevation6000) {
		this.isElevation6000 = isElevation6000;
	}
	public boolean isElevation5500() {
		return isElevation5500;
	}
	public void setElevation5500(boolean isElevation5500) {
		this.isElevation5500 = isElevation5500;
	}
	public boolean isElevation5250() {
		return isElevation5250;
	}
	public void setElevation5250(boolean isElevation5250) {
		this.isElevation5250 = isElevation5250;
	}
	
	
}
