package com.GOFiT.entity;

import java.sql.Date;
import java.util.function.Function;

import javax.servlet.annotation.WebServlet;

@WebServlet("/OTS")
public OTSCalc() {}

public class OTSCalc {
	
Function<?, ?> calculateOTS(){	
	String testAdmin = (String) OTS.getElementById("testA");
	String testLocation = (String) OTS.getElementById("testL");
	Date testDate = (Date) OTS.getElementById("testD");
	String unit = (String) OTS.getElementById("logins");
	int age = (int) OTS.getElementById("Age");
	int DODID = (int) OTS.getElementById("TestDODID");
	boolean isMale = (boolean) OTS.getElementById("isMale");
	int pushUps = (int) OTS.getElementById("pushUps");
	int sitUps = (int) OTS.getElementById("sitUps");
	int basketballThrowFt = (int) OTS.getElementById("basketballThrowFt");
	int basketballThrowIn = (int) OTS.getElementById("basketballThrowIn");
	int shuttleRunMinutes = (int) OTS.getElementById("shuttleRunMinutes");
	int shuttleRunSeconds = (int) OTS.getElementById("shuttleRunSeconds");
	int pullUps = (int) OTS.getElementById("pullUps");
	int hangMinutes = (int) OTS.getElementById("hangMinutes");
	int hangSeconds = (int) OTS.getElementById("hangSeconds");
	int runMinutes = (int) OTS.getElementById("runMinutes");
	int runSeconds = (int) OTS.getElementById("runSeconds");
	boolean isElevation6600 = (boolean) OTS.getElementById("isElevation6600");
	boolean isElevation6000 = (boolean) OTS.getElementById("isElevation6000");
	boolean isElevation5500 = (boolean) OTS.getElementById("isElevation5500");
	boolean isElevation5250 = (boolean) OTS.getElementById("isElevation5250");

		
		return null;
	}
	
	

	private String testA;
	private String testL;
	private Date testD;
	private String logins;
	private int TestDODID;
	private int Age;
	private boolean isMale;

	
	private int pushUps;
	private int sitUps;
	private int basketballThrowFt;
	private int basketballThrowIn;
	private int shuttleRunMinutes;
	private int shuttleRunSeconds;
	private int pullUps;
	private int hangMinutes;
	private int hangSeconds;
	private int runMinutes;
	private int runSeconds;
	private boolean isElevation6600;
	private boolean isElevation6000;
	private boolean isElevation5500;
	private boolean isElevation5250;
	@Override
	public String toString() {
		return "OTS [testA=" + testA + ", testL=" + testL + ", testD=" + testD + ", logins=" + logins + ", TestDODID="
				+ TestDODID + ", Age=" + Age + ", isMale=" + isMale + ", pushUps=" + pushUps + ", sitUps=" + sitUps
				+ ", basketballThrowFt=" + basketballThrowFt + ", basketballThrowIn=" + basketballThrowIn
				+ ", shuttleRunMinutes=" + shuttleRunMinutes + ", shuttleRunSeconds=" + shuttleRunSeconds + ", pullUps="
				+ pullUps + ", hangMinutes=" + hangMinutes + ", hangSeconds=" + hangSeconds + ", runMinutes="
				+ runMinutes + ", runSeconds=" + runSeconds + ", isElevation6600=" + isElevation6600
				+ ", isElevation6000=" + isElevation6000 + ", isElevation5500=" + isElevation5500 + ", isElevation5250="
				+ isElevation5250 + ", calculateOTS()=" + calculateOTS() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
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






	public int getTestDODID() {
		return TestDODID;
	}






	public void setTestDODID(int testDODID) {
		TestDODID = testDODID;
	}






	public int getAge() {
		return Age;
	}






	public void setAge(int age) {
		Age = age;
	}






	public boolean isMale() {
		return isMale;
	}






	public void setMale(boolean isMale) {
		this.isMale = isMale;
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






	public int getBasketballThrowFt() {
		return basketballThrowFt;
	}






	public void setBasketballThrowFt(int basketballThrowFt) {
		this.basketballThrowFt = basketballThrowFt;
	}






	public int getBasketballThrowIn() {
		return basketballThrowIn;
	}






	public void setBasketballThrowIn(int basketballThrowIn) {
		this.basketballThrowIn = basketballThrowIn;
	}






	public int getShuttleRunMinutes() {
		return shuttleRunMinutes;
	}






	public void setShuttleRunMinutes(int shuttleRunMinutes) {
		this.shuttleRunMinutes = shuttleRunMinutes;
	}






	public int getShuttleRunSeconds() {
		return shuttleRunSeconds;
	}






	public void setShuttleRunSeconds(int shuttleRunSeconds) {
		this.shuttleRunSeconds = shuttleRunSeconds;
	}






	public int getPullUps() {
		return pullUps;
	}






	public void setPullUps(int pullUps) {
		this.pullUps = pullUps;
	}






	public int getHangMinutes() {
		return hangMinutes;
	}






	public void setHangMinutes(int hangMinutes) {
		this.hangMinutes = hangMinutes;
	}






	public int getHangSeconds() {
		return hangSeconds;
	}






	public void setHangSeconds(int hangSeconds) {
		this.hangSeconds = hangSeconds;
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
