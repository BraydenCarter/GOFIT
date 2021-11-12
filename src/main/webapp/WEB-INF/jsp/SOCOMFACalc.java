package com.GOFiT.entity;

import java.sql.Date;
import java.util.function.Function;

import javax.servlet.annotation.WebServlet;

@WebServlet("/SOCOM")
public SOCOMFACalc() {}

public class SOCOMFACalc {
	
	Function<?, ?> calculateSOCOM(){	
	boolean isSWOE = (boolean) SOCOM.getElementById("isSWOE");
	boolean isPJCCTTACPSR = (boolean) SOCOM.getElementById("isPJCCTTACPSR");
	boolean isTACPO = (boolean) SOCOM.getElementById("isTACPO");
	boolean isEOD = (boolean) SOCOM.getElementById("isEOD");
	boolean isSERE = (boolean) SOCOM.getElementById("isSERE");
	String testAdmin = (String) SOCOM.getElementById("testA");
	String testLocation = (String) SOCOM.getElementById("testL");
	Date testDate = (Date) SOCOM.getElementById("testD");
	String unit = (String) SOCOM.getElementById("logins");
	int age = (int) SOCOM.getElementById("Age");
	int DODID = (int) SOCOM.getElementById("TestDODID");
	boolean isMale = (boolean) SOCOM.getElementById("isMale");
	int pullUps  = (int) SOCOM.getElementById("pullUps");
	int sitUps = (int) SOCOM.getElementById("sitUps");
	int pushUps  = (int) SOCOM.getElementById("pushUps");
	int oneAndHalfRunMinutes = (int) SOCOM.getElementById("runOneMinutes");
	int oneAndHalfRunSeconds = (int) SOCOM.getElementById("runOneSeconds");
	int underSwimOneMinutes = (int) SOCOM.getElementById("swimOneMinutes");
	int underSwimOneSeconds = (int) SOCOM.getElementById("swimOneSeconds");
	int underSwimTwoMinutes = (int) SOCOM.getElementById("swimTwoMinutes");
	int underSwimTwoSeconds = (int) SOCOM.getElementById("swimTwoSeconds");
	int surfaceSwimOneMinutes = (int) SOCOM.getElementById("surfaceSwimMinutes");
	int surfaceSwimOneSeconds = (int) SOCOM.getElementById("surfaceSwimSeconds");
	int surfaceSwimTwoMinutes = (int) SOCOM.getElementById("surfaceSwimTwoMinutes");
	int surfaceSwimTwoSeconds = (int) SOCOM.getElementById("surfaceSwimTwoSeconds");
	int threeMileRunMinutes = (int) SOCOM.getElementById("runTwoMinutes");
	int threeMileRunSeconds = (int) SOCOM.getElementById("runTwoSeconds");
	
	
	
	return null;
}
	
	
	
	
	private boolean isSWOE;
	private boolean isPJCCTTACPSR;
	private boolean isTACPO;
	private boolean isEOD;
	private boolean isSERE;
	
	private String testA;
	private String testL;
	private Date testD;
	private String logins;
	private Int Age;
	private int TestDODID;
	private boolean isMale;
	private int pullUps;
	private int sitUps;
	private int pushUps;
	private int runOneMinutes;
	private int runOneSeconds;
	private int swimOneMinutes;
	private int swimOneSeconds;
	private int swimTwoMinutes;
	private int swimTwoSeconds;
	private int surfaceSwimMinutes;
	private int surfaceSwimSeconds;
	private int surfaceSwimTwoMinutes;
	private int surfaceSwimTwoSeconds;
	private int runTwoMinutes;
	private int runTwoSeconds;
	@Override
	public String toString() {
		return "SOCOMFA [isSWOE=" + isSWOE + ", isPJCCTTACPSR=" + isPJCCTTACPSR + ", isTACPO=" + isTACPO + ", isEOD="
				+ isEOD + ", isSERE=" + isSERE + ", testA=" + testA + ", testL=" + testL + ", testD=" + testD
				+ ", logins=" + logins + ", TestDODID=" + TestDODID + ", isMale=" + isMale + ", pullUps=" + pullUps
				+ ", sitUps=" + sitUps + ", pushUps=" + pushUps + ", runOneMinutes=" + runOneMinutes
				+ ", runOneSeconds=" + runOneSeconds + ", swimOneMinutes=" + swimOneMinutes + ", swimOneSeconds="
				+ swimOneSeconds + ", swimTwoMinutes=" + swimTwoMinutes + ", swimTwoSeconds=" + swimTwoSeconds
				+ ", surfaceSwimMinutes=" + surfaceSwimMinutes + ", surfaceSwimSeconds=" + surfaceSwimSeconds
				+ ", surfaceSwimTwoMinutes=" + surfaceSwimTwoMinutes + ", surfaceSwimTwoSeconds="
				+ surfaceSwimTwoSeconds + ", runTwoMinutes=" + runTwoMinutes + ", runTwoSeconds=" + runTwoSeconds
				+ ", calculateSOCOM()=" + calculateSOCOM() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public boolean isSWOE() {
		return isSWOE;
	}
	public void setSWOE(boolean isSWOE) {
		this.isSWOE = isSWOE;
	}
	public boolean isPJCCTTACPSR() {
		return isPJCCTTACPSR;
	}
	public void setPJCCTTACPSR(boolean isPJCCTTACPSR) {
		this.isPJCCTTACPSR = isPJCCTTACPSR;
	}
	public boolean isTACPO() {
		return isTACPO;
	}
	public void setTACPO(boolean isTACPO) {
		this.isTACPO = isTACPO;
	}
	public boolean isEOD() {
		return isEOD;
	}
	public void setEOD(boolean isEOD) {
		this.isEOD = isEOD;
	}
	public boolean isSERE() {
		return isSERE;
	}
	public void setSERE(boolean isSERE) {
		this.isSERE = isSERE;
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
	public Int getAge() {
		return Age;
	}
	public void setAge(Int age) {
		Age = age;
	}
	public int getTestDODID() {
		return TestDODID;
	}
	public void setTestDODID(int testDODID) {
		TestDODID = testDODID;
	}
	public boolean isMale() {
		return isMale;
	}
	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}
	public int getPullUps() {
		return pullUps;
	}
	public void setPullUps(int pullUps) {
		this.pullUps = pullUps;
	}
	public int getSitUps() {
		return sitUps;
	}
	public void setSitUps(int sitUps) {
		this.sitUps = sitUps;
	}
	public int getPushUps() {
		return pushUps;
	}
	public void setPushUps(int pushUps) {
		this.pushUps = pushUps;
	}
	public int getRunOneMinutes() {
		return runOneMinutes;
	}
	public void setRunOneMinutes(int runOneMinutes) {
		this.runOneMinutes = runOneMinutes;
	}
	public int getRunOneSeconds() {
		return runOneSeconds;
	}
	public void setRunOneSeconds(int runOneSeconds) {
		this.runOneSeconds = runOneSeconds;
	}
	public int getSwimOneMinutes() {
		return swimOneMinutes;
	}
	public void setSwimOneMinutes(int swimOneMinutes) {
		this.swimOneMinutes = swimOneMinutes;
	}
	public int getSwimOneSeconds() {
		return swimOneSeconds;
	}
	public void setSwimOneSeconds(int swimOneSeconds) {
		this.swimOneSeconds = swimOneSeconds;
	}
	public int getSwimTwoMinutes() {
		return swimTwoMinutes;
	}
	public void setSwimTwoMinutes(int swimTwoMinutes) {
		this.swimTwoMinutes = swimTwoMinutes;
	}
	public int getSwimTwoSeconds() {
		return swimTwoSeconds;
	}
	public void setSwimTwoSeconds(int swimTwoSeconds) {
		this.swimTwoSeconds = swimTwoSeconds;
	}
	public int getSurfaceSwimMinutes() {
		return surfaceSwimMinutes;
	}
	public void setSurfaceSwimMinutes(int surfaceSwimMinutes) {
		this.surfaceSwimMinutes = surfaceSwimMinutes;
	}
	public int getSurfaceSwimSeconds() {
		return surfaceSwimSeconds;
	}
	public void setSurfaceSwimSeconds(int surfaceSwimSeconds) {
		this.surfaceSwimSeconds = surfaceSwimSeconds;
	}
	public int getSurfaceSwimTwoMinutes() {
		return surfaceSwimTwoMinutes;
	}
	public void setSurfaceSwimTwoMinutes(int surfaceSwimTwoMinutes) {
		this.surfaceSwimTwoMinutes = surfaceSwimTwoMinutes;
	}
	public int getSurfaceSwimTwoSeconds() {
		return surfaceSwimTwoSeconds;
	}
	public void setSurfaceSwimTwoSeconds(int surfaceSwimTwoSeconds) {
		this.surfaceSwimTwoSeconds = surfaceSwimTwoSeconds;
	}
	public int getRunTwoMinutes() {
		return runTwoMinutes;
	}
	public void setRunTwoMinutes(int runTwoMinutes) {
		this.runTwoMinutes = runTwoMinutes;
	}
	public int getRunTwoSeconds() {
		return runTwoSeconds;
	}
	public void setRunTwoSeconds(int runTwoSeconds) {
		this.runTwoSeconds = runTwoSeconds;
	}
	
	
	
	

	

}
