package com.GOFiT.entity;

import java.sql.Date;
import java.util.function.Function;
import java.sql.*;
import java.sql.DriverManager;
import javax.servlet.annotation.WebServlet;

@WebServlet("/StandardFA")
public StandardFACalc(){}

public class StandardFACalc {

Function<?, ?> calculateStandardFA(){	
		String testAdmin = (String) StandardFA.getElementById("testA");
		String testLocation = (String) StandardFA.getElementById("testL");
		Date testDate = (Date) StandardFA.getElementById("testD");
		String unit = (String) StandardFA.getElementById("logins");
		int age = (int) StandardFA.getElementById("Age");
		int DODID = (int) StandardFA.getElementById("TestDODID");
		boolean isMale = (boolean) StandardFA.getElementById("isMale");
		double height = (double) StandardFA.getElementById("height");
		int weight = (int) StandardFA.getElementById("weight");
		
		int AC1 = (int) StandardFA.getElementById("AC1");
		int AC2 = (int) StandardFA.getElementById("AC2");
		int AC3 = (int) StandardFA.getElementById("AC3");
		int txtAltBC1 = (int) StandardFA.getElementById("txtAltBC1");
		int txtAltBC2 = (int) StandardFA.getElementById("txtAltBC2");
		int txtAltBC3 = (int) StandardFA.getElementById("txtAltBC3");
		int txtAltBC4 = (int) StandardFA.getElementById("txtAltBC4");
		int pushUps = (int) StandardFA.getElementById("pushUps");
		int sitUps = (int) StandardFA.getElementById("sitUps");
		int runMinutes = (int) StandardFA.getElementById("runMinutes");
		int runSeconds = (int) StandardFA.getElementById("runSeconds");
		int walkMinutes = (int) StandardFA.getElementById("walkMinutes");
		int walkSeconds = (int) StandardFA.getElementById("walkSeconds");
		
		boolean isElevation6600 = (boolean) StandardFA.getElementById("isElevation6600");
		boolean isElevation6000 = (boolean) StandardFA.getElementById("isElevation6000");
		boolean isElevation5500 = (boolean) StandardFA.getElementById("isElevation5500");
		boolean isElevation5250 = (boolean) StandardFA.getElementById("isElevation5250");
		
		boolean Void = (boolean) StandardFA.getElementById("Void");
		boolean DNF = (boolean) StandardFA.getElementById("DNF");	
		boolean mock = (boolean) StandardFA.getElementById("mock");
		
		

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
AC = (AC1 + AC2 + AC3)/3;
if (AC <= 31.5) {
	ACScore = 20;
}
else if (AC = 32.0) {
	ACScore = 17.6;
}
else if (AC = 32.5) {
	ACScore = 17.1;
}
else if (AC = 33.0) {
	ACScore = 16.5;
}
else if (AC = 33.5) {
	ACScore = 15.9;
}
else if (AC = 34.0) {
	ACScore = 15.2;
}
else if (AC = 34.5) {
	ACScore = 14.5;
}
else if (AC = 35.0) {
	ACScore = 13.7;
}
else if (AC = 35.5) {
	ACScore = 12.8;
}
else if (AC > 35.5) {
	ACScore = 0;
}
//push ups	
if (pushUps >= 47) {
	pushUpScore = 10;
}
else if (pushUps > 42) {
	pushUpScore = 9.5;
}
else if (pushUps = 41) {
	pushUpScore = 9.4;
}
else if (pushUps = 40) {
	pushUpScore = 9.3;
}
else if (pushUps = 39) {
	pushUpScore = 9.2;
}
else if (pushUps = 38) {
	pushUpScore = 9.1;
}
else if (pushUps = 37) {
	pushUpScore = 9.0;
}
else if (pushUps = 36) {
	pushUpScore = 8.9;
}
else if (pushUps = 35) {
	pushUpScore = 8.8;
}
else if (pushUps = 34) {
	pushUpScore = 8.6;
}
else if (pushUps = 33) {
	pushUpScore = 8.5;
}
else if (pushUps = 32) {
	pushUpScore = 8.4;
}
else if (pushUps = 31) {
	pushUpScore = 8.3;
}
else if (pushUps = 30) {
	pushUpScore = 8.2;
}
else if (pushUps = 29) {
	pushUpScore = 8.1;
}
else if (pushUps = 28) {
	pushUpScore = 8.0;
}
else if (pushUps = 27) {
	pushUpScore = 7.5;
}
else if (pushUps = 26) {
	pushUpScore = 7.3;
}
else if (pushUps = 25) {
	pushUpScore = 7.2;
}
else if (pushUps = 24) {
	pushUpScore = 7.0;
}
else if (pushUps = 23) {
	pushUpScore = 6.5;
}
else if (pushUps = 22) {
	pushUpScore = 6.3;
}
else if (pushUps = 21) {
	pushUpScore = 6.0;
}
else if (pushUps = 20) {
	pushUpScore = 5.8;
}
else if (pushUps <= 19) {
	pushUpScore = 5.5;
}
else if (pushUps <= 18) {
	pushUpScore = 5.0;
}
else if (pushUps <= 17) {
	pushUpScore = 0;
}
//sitUps
if (sitUps >= 54) {
	sitUpScore = 10;
}
else if (sitUps > 51) {
	sitUpScore = 9.5;
}
else if (sitUps = 50) {
	sitUpScore = 9.4;
}
else if (sitUps = 49) {
	sitUpScore = 9.0;
}
else if (sitUps = 48) {
	sitUpScore = 8.9;
}
else if (sitUps = 47) {
	sitUpScore = 8.8;
}
else if (sitUps = 46) {
	sitUpScore = 8.6;
}
else if (sitUps = 45) {
	sitUpScore = 8.5;
}
else if (sitUps = 44) {
	sitUpScore = 8.0;
}
else if (sitUps = 43) {
	sitUpScore = 7.8;
}
else if (sitUps = 42) {
	sitUpScore = 7.5;
}
else if (sitUps = 41) {
	sitUpScore = 7.0;
}
else if (sitUps = 40) {
	sitUpScore = 6.8;
}
else if (sitUps = 39) {
	sitUpScore = 6.5;
}
else if (sitUps = 38) {
	sitUpScore = 6.0;
}
else if (sitUps <= 37) {
	sitUpScore = 0;
}


//run
runTime = (runMinutes * 60)+runSeconds;
if (runTime <= 623 {
	runScore=60;
}
else if (runTime <= 651 {
	runScore=59.9;
}
else if (runTime <= 666 {
	runScore=59.5;
}
else if (runTime <= 682 {
	runScore=59.2;
}
else if (runTime <= 698 {
	runScore=58.9;
}
else if (runTime <= 716 {
	runScore=58.6;
}
else if (runTime <= 734 {
	runScore=58.1;
}
else if (runTime <= 753 {
	runScore=57.6;
}
else if (runTime <= 773 {
	runScore=57.0;
}
else if (runTime <= 794 {
	runScore=56.2;
}
else if (runTime <= 816 {
	runScore=55.3;
}
else if (runTime <= 840 {
	runScore=54.2;
}
else if (runTime <= 865 {
	runScore=52.8;
}
else if (runTime <= 892) {
	runScore=51.2;
}
else if (runTime <= 920) {
	runScore=49.3;
}
else if (runTime <= 950) {
	runScore=46.9;
}
else if (runTime <= 982) {
	runScore=44.1;
}
else if (runTime > 982) {
	runScore=0;
}
score = ACScore + pushUpScore + sitUpScore + runScore;
return score;
}

private female30s{
AC = (AC1 + AC2 + AC3)/3;
if (AC <= 31.5) {
	ACScore = 20;
}
else if (AC = 32.0) {
	ACScore = 17.6;
}
else if (AC = 32.5) {
	ACScore = 17.1;
}
else if (AC = 33.0) {
	ACScore = 16.5;
}
else if (AC = 33.5) {
	ACScore = 15.9;
}
else if (AC = 34.0) {
	ACScore = 15.2;
}
else if (AC = 34.5) {
	ACScore = 14.5;
}
else if (AC = 35.0) {
	ACScore = 13.7;
}
else if (AC = 35.5) {
	ACScore = 12.8;
}
else if (AC > 35.5) {
	ACScore = 0;
}
		//push ups	
if (pushUps >= 46) {
	pushUpScore = 10;
}
else if (pushUps > 40) {
	pushUpScore = 9.5;
}
else if (pushUps = 39) {
	pushUpScore = 9.4;
}
else if (pushUps = 38) {
	pushUpScore = 9.3;
}
else if (pushUps = 37) {
	pushUpScore = 9.3;
}
else if (pushUps = 36) {
	pushUpScore = 9.2;
}
else if (pushUps = 35) {
	pushUpScore = 9.1;
}
else if (pushUps = 34) {
	pushUpScore = 9.1;
}
else if (pushUps = 33) {
	pushUpScore = 9.0;
}
else if (pushUps = 32) {
	pushUpScore = 8.9;
}
else if (pushUps = 31) {
	pushUpScore = 8.9;
}
else if (pushUps = 30) {
	pushUpScore = 8.8;
}
else if (pushUps = 29) {
	pushUpScore = 8.7;
}
else if (pushUps = 28) {
	pushUpScore = 8.6;
}
else if (pushUps = 27) {
	pushUpScore = 8.6;
}
else if (pushUps = 26) {
	pushUpScore = 8.5;
}
else if (pushUps = 25) {
	pushUpScore = 8.3;
}
else if (pushUps = 24) {
	pushUpScore = 8.2;
}
else if (pushUps = 23) {
	pushUpScore = 8.0;
}
else if (pushUps = 22) {
	pushUpScore = 7.9;
}
else if (pushUps = 21) {
	pushUpScore = 7.8;
}
else if (pushUps = 20) {
	pushUpScore = 7.6;
}
else if (pushUps = 19) {
	pushUpScore = 7.5;
}
else if (pushUps = 18) {
	pushUpScore = 7.0;
}
else if (pushUps <= 17) {
	pushUpScore = 6.8;
}
else if (pushUps <= 16) {
	pushUpScore = 6.5;
}
else if (pushUps <= 15) {
	pushUpScore = 6.0;
}
else if (pushUps <= 14) {
	pushUpScore = 5.0;
}
else if (pushUps <= 13) {
	pushUpScore = 0;
}
//sitUps
if (sitUps >= 45) {
	sitUpScore = 10;
}
else if (sitUps > 42) {
	sitUpScore = 9.5;
}
else if (sitUps = 41) {
	sitUpScore = 9.4;
}
else if (sitUps = 40) {
	sitUpScore = 9.0;
}
else if (sitUps = 39) {
	sitUpScore = 8.8;
}
else if (sitUps = 38) {
	sitUpScore = 8.5;
}
else if (sitUps = 37) {
	sitUpScore = 8.3;
}
else if (sitUps = 36) {
	sitUpScore = 8.2;
}
else if (sitUps = 35) {
	sitUpScore = 8.0;
}
else if (sitUps = 34) {
	sitUpScore = 7.8;
}
else if (sitUps = 33) {
	sitUpScore = 7.5;
}
else if (sitUps = 32) {
	sitUpScore = 7.0;
}
else if (sitUps = 31) {
	sitUpScore = 6.8;
}
else if (sitUps = 30) {
	sitUpScore = 6.5;
}
else if (sitUps = 29) {
	sitUpScore = 6.0;
}
else if (sitUps <= 28) {
	sitUpScore = 0;
}


//run
runTime=(runMinutes * 60)+runSeconds;
if (runTime <= 651 {
	runScore=60;
}
else if (runTime <= 682 {
	runScore=59.5;
}
else if (runTime <= 698 {
	runScore=59.0;
}
else if (runTime <= 716 {
	runScore=58.6;
}
else if (runTime <= 734 {
	runScore=58.1;
}
else if (runTime <= 753 {
	runScore=57.6;
}
else if (runTime <= 773 {
	runScore=57.0;
}
else if (runTime <= 794 {
	runScore=56.2;
}
else if (runTime <= 816 {
	runScore=55.3;
}
else if (runTime <= 840 {
	runScore=54.2;
}
else if (runTime <= 865 {
	runScore=52.8;
}
else if (runTime <= 892 {
	runScore=51.2;
}
else if (runTime <= 920 {
	runScore=49.3;
}
else if (runTime <= 950) {
	runScore=46.9;
}
else if (runTime <= 982) {
	runScore=44.1;
}
else if (runTime <= 1017) {
	runScore=40.8;
}
else if (runTime > 1017) {
	runScore=0;
}
score = ACScore + pushUpScore + sitUpScore + runScore;
return score;
}
private female40s{
AC = (AC1 + AC2 + AC3)/3;
if (AC <= 31.5) {
	ACScore = 20;
}
else if (AC = 32.0) {
	ACScore = 17.6;
}
else if (AC = 32.5) {
	ACScore = 17.1;
}
else if (AC = 33.0) {
	ACScore = 16.5;
}
else if (AC = 33.5) {
	ACScore = 15.9;
}
else if (AC = 34.0) {
	ACScore = 15.2;
}
else if (AC = 34.5) {
	ACScore = 14.5;
}
else if (AC = 35.0) {
	ACScore = 13.7;
}
else if (AC = 35.5) {
	ACScore = 12.8;
}
else if (AC > 35.5) {
	ACScore = 0;
}
//push ups	
if (pushUps >= 38) {
	pushUpScore = 10;
}
else if (pushUps > 33) {
	pushUpScore = 9.5;
}
else if (pushUps = 32) {
	pushUpScore = 9.4;
}
else if (pushUps = 31) {
	pushUpScore = 9.2;
}
else if (pushUps = 30) {
	pushUpScore = 9.1;
}
else if (pushUps = 29) {
	pushUpScore = 9.0;
}
else if (pushUps = 28) {
	pushUpScore = 8.9;
}
else if (pushUps = 27) {
	pushUpScore = 8.8;
}
else if (pushUps = 26) {
	pushUpScore = 8.7;
}
else if (pushUps = 25) {
	pushUpScore = 8.6;
}
else if (pushUps = 24) {
	pushUpScore = 8.6;
}
else if (pushUps = 23) {
	pushUpScore = 8.5;
}
else if (pushUps = 22) {
	pushUpScore = 8.4;
}
else if (pushUps = 21) {
	pushUpScore = 8.3;
}
else if (pushUps = 20) {
	pushUpScore = 8.2;
}
else if (pushUps = 19) {
	pushUpScore = 8.1;
}
else if (pushUps = 18) {
	pushUpScore = 8.0;
}
else if (pushUps = 17) {
	pushUpScore = 7.8;
}
else if (pushUps = 16) {
	pushUpScore = 7.5;
}
else if (pushUps = 15) {
	pushUpScore = 7.0;
}
else if (pushUps = 14) {
	pushUpScore = 6.5;
}
else if (pushUps = 13) {
	pushUpScore = 6.0;
}
else if (pushUps = 12) {
	pushUpScore = 5.5;
}
else if (pushUps = 11) {
	pushUpScore = 5.0;
}
else if (pushUps <= 10) {
	pushUpScore = 0;
}
//sitUps
if (sitUps >= 41) {
	sitUpScore = 10;
}
else if (sitUps > 38) {
	sitUpScore = 9.5;
}
else if (sitUps = 37) {
	sitUpScore = 9.4;
}
else if (sitUps = 36) {
	sitUpScore = 9.2;
}
else if (sitUps = 35) {
	sitUpScore = 9.1;
}
else if (sitUps = 34) {
	sitUpScore = 9.0;
}
else if (sitUps = 33) {
	sitUpScore = 8.8;
}
else if (sitUps = 32) {
	sitUpScore = 8.5;
}
else if (sitUps = 31) {
	sitUpScore = 8.3;
}
else if (sitUps = 30) {
	sitUpScore = 8.2;
}
else if (sitUps = 29) {
	sitUpScore = 8.0;
}
else if (sitUps = 28) {
	sitUpScore = 7.5;
}
else if (sitUps <= 27) {
	sitUpScore = 7.0;
}
else if (sitUps <= 26) {
	sitUpScore = 6.8;
}
else if (sitUps <= 25) {
	sitUpScore = 6.4;
}
else if (sitUps <= 24) {
	sitUpScore = 6.0;
}
else if (sitUps <= 23) {
	sitUpScore = 0;
}

//run
runTime=(runMinutes * 60)+runSeconds;
if (runTime <= 682 {
	runScore=60;
}
else if (runTime <= 716 {
	runScore=59.9;
}
else if (runTime <= 734 {
	runScore=59.8;
}
else if (runTime <= 753 {
	runScore=59.6;
}
else if (runTime <= 773 {
	runScore=59.4;
}
else if (runTime <= 794 {
	runScore=59.1;
}
else if (runTime <= 816 {
	runScore=58.7;
}
else if (runTime <= 840 {
	runScore=58.2;
}
else if (runTime <= 865 {
	runScore=57.7;
}
else if (runTime <= 892 {
	runScore=56.9;
}
else if (runTime <= 920 {
	runScore=56.0;
}
else if (runTime <= 950 {
	runScore=54.8;
}
else if (runTime <= 982 {
	runScore=53.3;
}
else if (runTime <= 1017) {
	runScore=51.4;
}
else if (runTime <= 1017) {
	runScore=49.0;
}
else if (runTime <= 1094) {
	runScore=45.9;
}
else if (runTime > 1094) {
	runScore=0;
}
score = ACScore + pushUpScore + sitUpScore + runScore;
return score;
}
private female50s{
	
AC = (AC1 + AC2 + AC3)/3;
if (AC < 32.0) {
	ACScore = 20;
}
else if (AC = 32.0) {
	ACScore = 17.6;
}
else if (AC = 32.5) {
	ACScore = 17.1;
}
else if (AC = 33.0) {
	ACScore = 16.5;
}
else if (AC = 33.5) {
	ACScore = 15.9;
}
else if (AC = 34.0) {
	ACScore = 15.2;
}
else if (AC = 34.5) {
	ACScore = 14.5;
}
else if (AC = 35.0) {
	ACScore = 13.7;
}
else if (AC = 35.5) {
	ACScore = 12.8;
}
else if (AC > 35.5) {
	ACScore = 0;
}
//push ups	
if (pushUps >= 35) {
	pushUpScore = 10;
}
else if (pushUps > 30) {
	pushUpScore = 9.5;
}
else if (pushUps = 29) {
	pushUpScore = 9.4;
}
else if (pushUps = 28) {
	pushUpScore = 9.3;
}
else if (pushUps = 27) {
	pushUpScore = 9.2;
}
else if (pushUps = 26) {
	pushUpScore = 9.1;
}
else if (pushUps = 25) {
	pushUpScore = 9.0;
}
else if (pushUps = 24) {
	pushUpScore = 8.8;
}
else if (pushUps = 23) {
	pushUpScore = 8.7;
}
else if (pushUps = 22) {
	pushUpScore = 8.6;
}
else if (pushUps = 21) {
	pushUpScore = 8.6;
}
else if (pushUps = 20) {
	pushUpScore = 8.5;
}
else if (pushUps = 19) {
	pushUpScore = 8.4;
}
else if (pushUps = 18) {
	pushUpScore = 8.3;
}
else if (pushUps = 17) {
	pushUpScore = 8.2;
}
else if (pushUps = 16) {
	pushUpScore = 8.1;
}
else if (pushUps = 15) {
	pushUpScore = 8.0;
}
else if (pushUps = 14) {
	pushUpScore = 7.5;
}
else if (pushUps = 13) {
	pushUpScore = 7.0;
}
else if (pushUps = 12) {
	pushUpScore = 6.5;
}
else if (pushUps = 11) {
	pushUpScore = 6.0;
}
else if (pushUps = 10) {
	pushUpScore = 5.5;
}
else if (pushUps = 9) {
	pushUpScore = 5.0;
}
else if (pushUps <= 8) {
	pushUpScore = 0;
}
//sitUps
if (sitUps >= 32) {
	sitUpScore = 10;
}
else if (sitUps > 30) {
	sitUpScore = 9.5;
}
else if (sitUps = 29) {
	sitUpScore = 9.0;
}
else if (sitUps = 28) {
	sitUpScore = 8.9;
}
else if (sitUps = 27) {
	sitUpScore = 8.8;
}
else if (sitUps = 26) {
	sitUpScore = 8.6;
}
else if (sitUps = 25) {
	sitUpScore = 8.5;
}
else if (sitUps = 24) {
	sitUpScore = 8.0;
}
else if (sitUps = 23) {
	sitUpScore = 7.5;
}
else if (sitUps = 22) {
	sitUpScore = 7.0;
}
else if (sitUps = 21) {
	sitUpScore = 6.5;
}
else if (sitUps = 20) {
	sitUpScore = 6.0;
}
else if (sitUps <= 19) {
	sitUpScore = 0;
}

//run
runTime=(runMinutes * 60)+runSeconds;
if (runTime <= 773 {
	runScore=60;
}
else if (runTime <= 816 {
	runScore=59.8;
}
else if (runTime <= 840 {
	runScore=59.6;
}
else if (runTime <= 865 {
	runScore=59.3;
}
else if (runTime <= 892 {
	runScore=58.9;
}
else if (runTime <= 920 {
	runScore=58.4;
}
else if (runTime <= 950 {
	runScore=57.7;
}
else if (runTime <= 982 {
	runScore=56.8;
}
else if (runTime <= 1017 {
	runScore=55.6;
}
else if (runTime <= 1054 {
	runScore=54.0;
}
else if (runTime <= 1094 {
	runScore=51.9;
}
else if (runTime <= 1136 {
	runScore=49.2;
}
else if (runTime <= 1183 {
	runScore=45.5;
}
else if (runTime > 1183) {
	runScore=0;
}
score = ACScore + pushUpScore + sitUpScore + runScore;
return score;
}
private female60s{
	//abdominal circumfrence
AC = (AC1 + AC2 + AC3)/3;
if (AC < 32.0) {
	ACScore = 20;
}
else if (AC = 32.0) {
	ACScore = 17.6;
}
else if (AC = 32.5) {
	ACScore = 17.1;
}
else if (AC = 33.0) {
	ACScore = 16.5;
}
else if (AC = 33.5) {
	ACScore = 15.9;
}
else if (AC = 34.0) {
	ACScore = 15.2;
}
else if (AC = 34.5) {
	ACScore = 14.5;
}
else if (AC = 35.0) {
	ACScore = 13.7;
}
else if (AC = 35.5) {
	ACScore = 12.8;
}
else if (AC > 35.5) {
	ACScore = 0;
}
//push ups	
if (pushUps >= 21) {
	pushUpScore = 10;
}
else if (pushUps > 19) {
	pushUpScore = 9.5;
}
else if (pushUps = 18) {
	pushUpScore = 9.4;
}
else if (pushUps = 17) {
	pushUpScore = 9.0;
}
else if (pushUps = 16) {
	pushUpScore = 8.8;
}
else if (pushUps = 15) {
	pushUpScore = 8.5;
}
else if (pushUps = 14) {
	pushUpScore = 8.0;
}
else if (pushUps = 13) {
	pushUpScore = 7.5;
}
else if (pushUps = 12) {
	pushUpScore = 7.0;
}
else if (pushUps = 11) {
	pushUpScore = 6.5;
}
else if (pushUps = 10) {
	pushUpScore = 6.0;
}
else if (pushUps = 9) {
	pushUpScore = 5.7;
}
else if (pushUps = 8) {
	pushUpScore = 5.3;
}
else if (pushUps = 7) {
	pushUpScore = 5.0;
}
else if (pushUps <= 6) {
	pushUpScore = 0;
}
//sitUps
if (sitUps >= 31) {
	sitUpScore = 10;
}
else if (sitUps > 28) {
	sitUpScore = 9.5;
}
else if (sitUps = 27) {
	sitUpScore = 9.4;
}
else if (sitUps = 26) {
	sitUpScore = 9.0;
}
else if (sitUps = 25) {
	sitUpScore = 8.9;
}
else if (sitUps = 24) {
	sitUpScore = 8.8;
}
else if (sitUps = 23) {
	sitUpScore = 8.7;
}
else if (sitUps = 22) {
	sitUpScore = 8.6;
}
else if (sitUps = 21) {
	sitUpScore = 8.5;
}
else if (sitUps = 20) {
	sitUpScore = 8.4;
}
else if (sitUps = 19) {
	sitUpScore = 8.3;
}
else if (sitUps = 18) {
	sitUpScore = 8.2;
}
else if (sitUps = 17) {
	sitUpScore = 8.0;
}
else if (sitUps = 16) {
	sitUpScore = 7.8;
}
else if (sitUps = 15) {
	sitUpScore = 7.5;
}
else if (sitUps = 14) {
	sitUpScore = 7.3;
}
else if (sitUps = 13) {
	sitUpScore = 7.0;
}
else if (sitUps = 12) {
	sitUpScore = 6.5;
}
else if (sitUps = 11) {
	sitUpScore = 6.0;
}
else if (sitUps < 11) {
	sitUpScore = 0;
}
//run
runTime=(runMinutes * 60)+runSeconds;
if (runTime <= 840 {
	runScore=60;
}
else if (runTime <= 892 {
	runScore=59.8;
}
else if (runTime <= 920 {
	runScore=59.5;
}
else if (runTime <= 950 {
	runScore=59.1;
}
else if (runTime <= 982 {
	runScore=58.6;
}
else if (runTime <= 1017 {
	runScore=57.9;
}
else if (runTime <= 1054 {
	runScore=57.0;
}
else if (runTime <= 1094 {
	runScore=55.8;
}
else if (runTime <= 1136 {
	runScore=54.2;
}
else if (runTime <= 1183 {
	runScore=52.1;
}
else if (runTime <= 1233 {
	runScore=49.3;
}
else if (runTime <= 1288 {
	runScore=45.6;
}
else if (runTime <= 1348 {
	runScore=40.8;
}
else if (runTime > 1348) {
	runScore=0;
}
score = ACScore + pushUpScore + sitUpScore + runScore;
return score;
}
private male20s{
	
AC = (AC1 + AC2 + AC3)/3;
if (AC <= 35.0) {
	ACScore = 20;
}
else if (AC <= 35.5) {
	ACScore = 17.6;
}
else if (AC <= 36.0) {
	ACScore = 17.0;
}
else if (AC <= 36.5) {
	ACScore = 16.4;
}
else if (AC <= 37.0) {
	ACScore = 15.8;
}
else if (AC <= 37.5) {
	ACScore = 15.1;
}
else if (AC <= 38.0) {
	ACScore = 14.4;
}
else if (AC <= 38.5) {
	ACScore = 13.5;
}
else if (AC <= 39.0) {
	ACScore = 12.6;
}
else if (AC > 39) {
	ACScore = 0;
}
//push ups	
if (pushUps >= 67) {
	pushUpScore = 10;
}
else if (pushUps > 62) {
	pushUpScore = 9.5;
}
else if (pushUps = 61) {
	pushUpScore = 9.4;
}
else if (pushUps = 60) {
	pushUpScore = 9.3;
}
else if (pushUps = 59) {
	pushUpScore = 9.2;
}
else if (pushUps = 58) {
	pushUpScore = 9.1;
}
else if (pushUps = 57) {
	pushUpScore = 9.0;
}
else if (pushUps = 56) {
	pushUpScore = 8.9;
}
else if (pushUps = 55) {
	pushUpScore = 8.8;
}
else if (pushUps = 54) {
	pushUpScore = 8.8;
}
else if (pushUps = 53) {
	pushUpScore = 8.7;
}
else if (pushUps = 52) {
	pushUpScore = 8.6;
}
else if (pushUps = 51) {
	pushUpScore = 8.5;
}
else if (pushUps = 50) {
	pushUpScore = 8.4;
}
else if (pushUps = 49) {
	pushUpScore = 8.3;
}
else if (pushUps = 48) {
	pushUpScore = 8.1;
}
else if (pushUps = 47) {
	pushUpScore = 8.0;
}
else if (pushUps = 46) {
	pushUpScore = 7.8;
}
else if (pushUps = 45) {
	pushUpScore = 7.7;
}
else if (pushUps = 44) {
	pushUpScore = 7.5;
}
else if (pushUps = 43) {
	pushUpScore = 7.3;
}
else if (pushUps = 42) {
	pushUpScore = 7.2;
}
else if (pushUps = 41) {
	pushUpScore = 7.0;
}
else if (pushUps = 40) {
	pushUpScore = 6.8;
}
else if (pushUps = 39) {
	pushUpScore = 6.5;
}
else if (pushUps = 38) {
	pushUpScore = 6.3;
}
else if (pushUps = 37) {
	pushUpScore = 6.0;
}
else if (pushUps = 36) {
	pushUpScore = 5.8;
}
else if (pushUps = 35) {
	pushUpScore = 5.5;
}
else if (pushUps = 34) {
	pushUpScore = 5.3;
}
else if (pushUps = 33) {
	pushUpScore = 5.0;
}
else if (pushUps <= 32) {
	pushUpScore = 0;
}
//sitUps
if (sitUps >= 58) {
	sitUpScore = 10;
}
else if (sitUps > 55) {
	sitUpScore = 9.5;
}
else if (sitUps = 54) {
	sitUpScore = 9.4;
}
else if (sitUps = 53) {
	sitUpScore = 9.2;
}
else if (sitUps = 52) {
	sitUpScore = 9.0;
}
else if (sitUps = 51) {
	sitUpScore = 8.8;
}
else if (sitUps = 50) {
	sitUpScore = 8.7;
}
else if (sitUps = 49) {
	sitUpScore = 8.5;
}
else if (sitUps = 48) {
	sitUpScore = 8.3;
}
else if (sitUps = 47) {
	sitUpScore = 8.0;
}
else if (sitUps = 46) {
	sitUpScore = 7.5;
}
else if (sitUps = 45) {
	sitUpScore = 7.0;
}
else if (sitUps = 44) {
	sitUpScore = 6.5;
}
else if (sitUps = 43) {
	sitUpScore = 6.3;
}
else if (sitUps = 42) {
	sitUpScore = 6.0;
}
else if (sitUps <= 41) {
	sitUpScore = 0;
}


//run
	runTime = (runMinutes * 60)+runSeconds;
	if (runTime <= 552 {
		runScore=60;
	}
	else if (runTime <= 574 {
		runScore=59.7;
	}
	else if (runTime <= 585 {
		runScore=59.3;
	}
	else if (runTime <= 598 {
		runScore=58.9;
	}
	else if (runTime <= 610 {
		runScore=58.5;
	}
	else if (runTime <= 623 {
		runScore=57.9;
	}
	else if (runTime <= 637 {
		runScore=57.3;
	}
	else if (runTime <= 651 {
		runScore=56.6;
	}
	else if (runTime <= 666 {
		runScore=55.7;
	}
	else if (runTime <= 682 {
		runScore=54.8;
	}
	else if (runTime <= 698 {
		runScore=53.7;
	}
	else if (runTime <= 716 {
		runScore=52.4;
	}
	else if (runTime <= 734 {
		runScore=50.9;
	}
	else if (runTime <= 753) {
		runScore=49.2;
	}
	else if (runTime <= 773) {
		runScore=47.2;
	}
	else if (runTime <= 794) {
		runScore=44.9;
	}
	else if (runTime <= 816) {
		runScore=42.3;
	}
	else if (runTime > 816) {
		runScore=0;
	}
	score = ACScore + pushUpScore + sitUpScore + runScore;
	return score;
}
private male30s{
	AC = (AC1 + AC2 + AC3)/3;
	if (AC <= 35.0) {
		ACScore = 20;
	}
	else if (AC <= 35.5) {
		ACScore = 17.6;
	}
	else if (AC <= 36.0) {
		ACScore = 17.0;
	}
	else if (AC <= 36.5) {
		ACScore = 16.4;
	}
	else if (AC <= 37.0) {
		ACScore = 15.8;
	}
	else if (AC <= 37.5) {
		ACScore = 15.1;
	}
	else if (AC <= 38.0) {
		ACScore = 14.4;
	}
	else if (AC <= 38.5) {
		ACScore = 13.5;
	}
	else if (AC <= 39.0) {
		ACScore = 12.6;
	}
	else if (AC > 39) {
		ACScore = 0;
	}
//push ups	
if (pushUps >= 57) {
	pushUpScore = 10;
}
else if (pushUps > 52) {
	pushUpScore = 9.5;
}
else if (pushUps = 51) {
	pushUpScore = 9.4;
}
else if (pushUps = 50) {
	pushUpScore = 9.3;
}
else if (pushUps = 49) {
	pushUpScore = 9.2;
}
else if (pushUps = 48) {
	pushUpScore = 9.2;
}
else if (pushUps = 47) {
	pushUpScore = 9.1;
}
else if (pushUps = 46) {
	pushUpScore = 9.0;
}
else if (pushUps = 45) {
	pushUpScore = 8.9;
}
else if (pushUps = 44) {
	pushUpScore = 8.8;
}
else if (pushUps = 43) {
	pushUpScore = 8.7;
}
else if (pushUps = 42) {
	pushUpScore = 8.6;
}
else if (pushUps = 41) {
	pushUpScore = 8.5;
}
else if (pushUps = 40) {
	pushUpScore = 8.3;
}
else if (pushUps = 39) {
	pushUpScore = 8.0;
}
else if (pushUps = 38) {
	pushUpScore = 7.8;
}
else if (pushUps = 37) {
	pushUpScore = 7.7;
}
else if (pushUps = 36) {
	pushUpScore = 7.5;
}
else if (pushUps = 35) {
	pushUpScore = 7.3;
}
else if (pushUps = 34) {
	pushUpScore = 7.0;
}
else if (pushUps = 33) {
	pushUpScore = 6.8;
}
else if (pushUps = 32) {
	pushUpScore = 6.7;
}
else if (pushUps = 31) {
	pushUpScore = 6.5;
}
else if (pushUps = 30) {
	pushUpScore = 6.0;
}
else if (pushUps = 29) {
	pushUpScore = 5.5;
}
else if (pushUps = 28) {
	pushUpScore = 5.3;
}
else if (pushUps = 27) {
	pushUpScore = 5.0;
}
else if (pushUps <= 26) {
	pushUpScore = 0;
}
//sitUps
if (sitUps >= 54) {
	sitUpScore = 10;
}
else if (sitUps > 51) {
	sitUpScore = 9.5;
}
else if (sitUps = 50) {
	sitUpScore = 9.4;
}
else if (sitUps = 49) {
	sitUpScore = 9.2;
}
else if (sitUps = 48) {
	sitUpScore = 9.0;
}
else if (sitUps = 47) {
	sitUpScore = 8.8;
}
else if (sitUps = 46) {
	sitUpScore = 8.7;
}
else if (sitUps = 45) {
	sitUpScore = 8.5;
}
else if (sitUps = 44) {
	sitUpScore = 8.3;
}
else if (sitUps = 43) {
	sitUpScore = 8.0;
}
else if (sitUps = 42) {
	sitUpScore = 7.5;
}
else if (sitUps = 41) {
	sitUpScore = 7.0;
}
else if (sitUps = 40) {
	sitUpScore = 6.5;
}
else if (sitUps = 39) {
	sitUpScore = 6.0;
}
else if (sitUps <= 38) {
	sitUpScore = 0;
}



//run
	runTime = (runMinutes * 60)+runSeconds;
	if (runTime <= 574 {
		runScore=60;
	}
	else if (runTime <= 598 {
		runScore=59.3;
	}
	else if (runTime <= 610 {
		runScore=58.6;
	}
	else if (runTime <= 623 {
		runScore=57.9;
	}
	else if (runTime <= 637 {
		runScore=57.3;
	}
	else if (runTime <= 651 {
		runScore=56.6;
	}
	else if (runTime <= 666 {
		runScore=55.7;
	}
	else if (runTime <= 682 {
		runScore=54.8;
	}
	else if (runTime <= 698 {
		runScore=53.7;
	}
	else if (runTime <= 716 {
		runScore=52.4;
	}
	else if (runTime <= 734 {
		runScore=50.9;
	}
	else if (runTime <= 753 {
		runScore=49.2;
	}
	else if (runTime <= 773 {
		runScore=47.2;
	}
	else if (runTime <= 794) {
		runScore=44.9;
	}
	else if (runTime <= 816) {
		runScore=42.3;
	}
	else if (runTime <= 840) {
		runScore=39.3;
	}
	else if (runTime <= 840) {
		runScore=0;
	}
	score = ACScore + pushUpScore + sitUpScore + runScore;
	return score;
}
private male40s{
	AC = (AC1 + AC2 + AC3)/3;
	if (AC <= 35.0) {
		ACScore = 20;
	}
	else if (AC <= 35.5) {
		ACScore = 17.6;
	}
	else if (AC <= 36.0) {
		ACScore = 17.0;
	}
	else if (AC <= 36.5) {
		ACScore = 16.4;
	}
	else if (AC <= 37.0) {
		ACScore = 15.8;
	}
	else if (AC <= 37.5) {
		ACScore = 15.1;
	}
	else if (AC <= 38.0) {
		ACScore = 14.4;
	}
	else if (AC <= 38.5) {
		ACScore = 13.5;
	}
	else if (AC <= 39.0) {
		ACScore = 12.6;
	}
	else if (AC > 39) {
		ACScore = 0;
	}
//push ups	
if (pushUps >= 44) {
	pushUpScore = 10;
}
else if (pushUps > 40) {
	pushUpScore = 9.5;
}
else if (pushUps = 39) {
	pushUpScore = 9.4;
}
else if (pushUps = 38) {
	pushUpScore = 9.2;
}
else if (pushUps = 37) {
	pushUpScore = 9.1;
}
else if (pushUps = 36) {
	pushUpScore = 9.0;
}
else if (pushUps = 35) {
	pushUpScore = 8.8;
}
else if (pushUps = 34) {
	pushUpScore = 8.5;
}
else if (pushUps = 33) {
	pushUpScore = 8.4;
}
else if (pushUps = 32) {
	pushUpScore = 8.3;
}
else if (pushUps = 31) {
	pushUpScore = 8.1;
}
else if (pushUps = 30) {
	pushUpScore = 8.0;
}
else if (pushUps = 29) {
	pushUpScore = 7.5;
}
else if (pushUps = 28) {
	pushUpScore = 7.3;
}
else if (pushUps = 27) {
	pushUpScore = 7.2;
}
else if (pushUps = 26) {
	pushUpScore = 7.0;
}
else if (pushUps = 25) {
	pushUpScore = 6.5;
}
else if (pushUps = 24) {
	pushUpScore = 6.0;
}
else if (pushUps = 23) {
	pushUpScore = 5.8;
}
else if (pushUps = 22) {
	pushUpScore = 5.5;
}
else if (pushUps = 21) {
	pushUpScore = 5.0;
}
else if (pushUps <= 20) {
	pushUpScore = 0;
}
//sitUps
if (sitUps >= 50) {
	sitUpScore = 10;
}
else if (sitUps > 47) {
	sitUpScore = 9.5;
}
else if (sitUps = 46) {
	sitUpScore = 9.4;
}
else if (sitUps = 45) {
	sitUpScore = 9.2;
}
else if (sitUps = 44) {
	sitUpScore = 9.1;
}
else if (sitUps = 43) {
	sitUpScore = 9.0;
}
else if (sitUps = 42) {
	sitUpScore = 8.8;
}
else if (sitUps = 41) {
	sitUpScore = 8.7;
}
else if (sitUps = 40) {
	sitUpScore = 8.5;
}
else if (sitUps = 39) {
	sitUpScore = 8.0;
}
else if (sitUps = 38) {
	sitUpScore = 7.8;
}
else if (sitUps = 37) {
	sitUpScore = 7.5;
}
else if (sitUps = 36) {
	sitUpScore = 7.0;
}
else if (sitUps = 35) {
	sitUpScore = 6.5;
}
else if (sitUps = 34) {
	sitUpScore = 6.0;
}
else if (sitUps <= 33) {
	sitUpScore = 0;
}
//run
	runTime = (runMinutes * 60)+runSeconds;
	if (runTime <= 585 {
		runScore=60;
	}
	else if (runTime <= 610 {
		runScore=59.8;
	}
	else if (runTime <= 623 {
		runScore=59.5;
	}
	else if (runTime <= 637 {
		runScore=59.1;
	}
	else if (runTime <= 651 {
		runScore=58.7;
	}
	else if (runTime <= 666 {
		runScore=58.3;
	}
	else if (runTime <= 682 {
		runScore=57.7;
	}
	else if (runTime <= 698 {
		runScore=57.1;
	}
	else if (runTime <= 716 {
		runScore=56.3;
	}
	else if (runTime <= 734 {
		runScore=55.4;
	}
	else if (runTime <= 753 {
		runScore=54.3;
	}
	else if (runTime <= 773 {
		runScore=53.1;
	}
	else if (runTime <= 794 {
		runScore=51.5;
	}
	else if (runTime <= 816) {
		runScore=49.8;
	}
	else if (runTime <= 840) {
		runScore=47.7;
	}
	else if (runTime <= 865) {
		runScore=45.2;
	}
	else if (runTime <= 892) {
		runScore=42.3;
	}
	else if (runTime > 892) {
		runScore=0;
	}
	score = ACScore + pushUpScore + sitUpScore + runScore;
	return score;
}
private male50s{
	AC = (AC1 + AC2 + AC3)/3;
	if (AC <= 35.0) {
		ACScore = 20;
	}
	else if (AC <= 35.5) {
		ACScore = 17.6;
	}
	else if (AC <= 36.0) {
		ACScore = 17.0;
	}
	else if (AC <= 36.5) {
		ACScore = 16.4;
	}
	else if (AC <= 37.0) {
		ACScore = 15.8;
	}
	else if (AC <= 37.5) {
		ACScore = 15.1;
	}
	else if (AC <= 38.0) {
		ACScore = 14.4;
	}
	else if (AC <= 38.5) {
		ACScore = 13.5;
	}
	else if (AC <= 39.0) {
		ACScore = 12.6;
	}
	else if (AC > 39) {
		ACScore = 0;
	}
//push ups	
if (pushUps >= 44) {
	pushUpScore = 10;
}
else if (pushUps >= 39) {
	pushUpScore = 9.5;
}
else if (pushUps = 38) {
	pushUpScore = 9.4;
}
else if (pushUps = 37) {
	pushUpScore = 9.4;
}
else if (pushUps = 36) {
	pushUpScore = 9.3;
}
else if (pushUps = 35) {
	pushUpScore = 9.3;
}
else if (pushUps = 34) {
	pushUpScore = 9.2;
}
else if (pushUps = 33) {
	pushUpScore = 9.2;
}
else if (pushUps = 32) {
	pushUpScore = 9.1;
}
else if (pushUps = 31) {
	pushUpScore = 9.1;
}
else if (pushUps = 30) {
	pushUpScore = 9.0;
}
else if (pushUps = 29) {
	pushUpScore = 8.8;
}
else if (pushUps = 28) {
	pushUpScore = 8.5;
}
else if (pushUps = 27) {
	pushUpScore = 8.3;
}
else if (pushUps = 26) {
	pushUpScore = 8.2;
}
else if (pushUps = 25) {
	pushUpScore = 8.0;
}
else if (pushUps = 24) {
	pushUpScore = 7.5;
}
else if (pushUps = 23) {
	pushUpScore = 7.3;
}
else if (pushUps = 22) {
	pushUpScore = 7.2;
}
else if (pushUps = 21) {
	pushUpScore = 7.0;
}
else if (pushUps = 20) {
	pushUpScore = 6.5;
}
else if (pushUps = 19) {
	pushUpScore = 6.0;
}
else if (pushUps = 18) {
	pushUpScore = 5.8;
}
else if (pushUps = 17) {
	pushUpScore = 5.5;
}
else if (pushUps = 16) {
	pushUpScore = 5.3;
}
else if (pushUps = 15) {
	pushUpScore = 5.0;
}
else if (pushUps <= 14) {
	pushUpScore = 0;
}
//sitUps
if (sitUps >= 46) {
	sitUpScore = 10;
}
else if (sitUps > 43) {
	sitUpScore = 9.5;
}
else if (sitUps = 42) {
	sitUpScore = 9.4;
}
else if (sitUps = 41) {
	sitUpScore = 9.2;
}
else if (sitUps = 40) {
	sitUpScore = 9.1;
}
else if (sitUps = 39) {
	sitUpScore = 9.0;
}
else if (sitUps = 38) {
	sitUpScore = 8.8;
}
else if (sitUps = 37) {
	sitUpScore = 8.7;
}
else if (sitUps = 36) {
	sitUpScore = 8.5;
}
else if (sitUps = 35) {
	sitUpScore = 8.0;
}
else if (sitUps = 34) {
	sitUpScore = 7.8;
}
else if (sitUps = 33) {
	sitUpScore = 7.5;
}
else if (sitUps = 32) {
	sitUpScore = 7.3;
}
else if (sitUps = 31) {
	sitUpScore = 7.0;
}
else if (sitUps = 30) {
	sitUpScore = 6.5;
}
else if (sitUps = 29) {
	sitUpScore = 6.3;
}
else if (sitUps = 28) {
	sitUpScore = 6.0;
}
else if (sitUps <= 27) {
	sitUpScore = 0;
}
//run
	runTime = (runMinutes * 60)+runSeconds;
	if (runTime <= 637 {
		runScore=60;
	}
	else if (runTime <= 666 {
		runScore=59.7;
	}
	else if (runTime <= 682 {
		runScore=59.4;
	}
	else if (runTime <= 698 {
		runScore=59.0;
	}
	else if (runTime <= 716 {
		runScore=58.5;
	}
	else if (runTime <= 734 {
		runScore=58.0;
	}
	else if (runTime <= 753 {
		runScore=57.3;
	}
	else if (runTime <= 773 {
		runScore=56.5;
	}
	else if (runTime <= 794 {
		runScore=55.6;
	}
	else if (runTime <= 816 {
		runScore=54.5;
	}
	else if (runTime <= 840 {
		runScore=53.3;
	}
	else if (runTime <= 865 {
		runScore=51.8;
	}
	else if (runTime <= 892 {
		runScore=50.0;
	}
	else if (runTime <= 920) {
		runScore=47.9;
	}
	else if (runTime <= 950) {
		runScore=45.4;
	}
	else if (runTime <= 982) {
		runScore=42.4;
	}
	else if (runTime > 982) {
		runScore=0;
	}
	score = ACScore + pushUpScore + sitUpScore + runScore;
	return score;
	}
private male60s{
	AC = (AC1 + AC2 + AC3)/3;
	if (AC <= 35.0) {
		ACScore = 20;
	}
	else if (AC <= 35.5) {
		ACScore = 17.6;
	}
	else if (AC <= 36.0) {
		ACScore = 17.0;
	}
	else if (AC <= 36.5) {
		ACScore = 16.4;
	}
	else if (AC <= 37.0) {
		ACScore = 15.8;
	}
	else if (AC <= 37.5) {
		ACScore = 15.1;
	}
	else if (AC <= 38.0) {
		ACScore = 14.4;
	}
	else if (AC <= 38.5) {
		ACScore = 13.5;
	}
	else if (AC <= 39.0) {
		ACScore = 12.6;
	}
	else if (AC > 39) {
		ACScore = 0;
	}
//push ups	
if (pushUps >= 30) {
	pushUpScore = 10;
}
else if (pushUps > 28) {
	pushUpScore = 9.5;
}
else if (pushUps = 27) {
	pushUpScore = 9.3;
}
else if (pushUps = 26) {
	pushUpScore = 9.0;
}
else if (pushUps = 25) {
	pushUpScore = 8.8;
}
else if (pushUps = 24) {
	pushUpScore = 8.5;
}
else if (pushUps = 23) {
	pushUpScore = 8.0;
}
else if (pushUps = 22) {
	pushUpScore = 7.5;
}
else if (pushUps = 21) {
	pushUpScore = 7.0;
}
else if (pushUps = 20) {
	pushUpScore = 6.5;
}
else if (pushUps = 19) {
	pushUpScore = 6.3;
}
else if (pushUps = 18) {
	pushUpScore = 6.0;
}
else if (pushUps = 17) {
	pushUpScore = 5.8;
}
else if (pushUps = 16) {
	pushUpScore = 5.5;
}
else if (pushUps = 15) {
	pushUpScore = 5.3;
}
else if (pushUps = 14) {
	pushUpScore = 5.0;
}
else if (pushUps <= 13) {
	pushUpScore = 0;
}

//sitUps
if (sitUps >= 42) {
	sitUpScore = 10;
}
else if (sitUps > 39) {
	sitUpScore = 9.5;
}
else if (sitUps = 38) {
	sitUpScore = 9.4;
}
else if (sitUps = 37) {
	sitUpScore = 9.2;
}
else if (sitUps = 36) {
	sitUpScore = 9.1;
}
else if (sitUps = 35) {
	sitUpScore = 9.0;
}
else if (sitUps = 34) {
	sitUpScore = 8.9;
}
else if (sitUps = 33) {
	sitUpScore = 8.8;
}
else if (sitUps = 32) {
	sitUpScore = 8.6;
}
else if (sitUps = 31) {
	sitUpScore = 8.5;
}
else if (sitUps = 30) {
	sitUpScore = 8.0;
}
else if (sitUps = 29) {
	sitUpScore = 7.8;
}
else if (sitUps = 28) {
	sitUpScore = 7.5;
}
else if (sitUps = 27) {
	sitUpScore = 7.3;
}
else if (sitUps = 26) {
	sitUpScore = 7.0;
}
else if (sitUps = 25) {
	sitUpScore = 6.8;
}
else if (sitUps = 24) {
	sitUpScore = 6.5;
}
else if (sitUps = 23) {
	sitUpScore = 6.3;
}
else if (sitUps = 22) {
	sitUpScore = 6.0;
}
else if (sitUps <= 21) {
	sitUpScore = 0;
}
//run
	runTime = (runMinutes * 60)+runSeconds;
	if (runTime <= 682 {
		runScore=60;
	}
	else if (runTime <= 716 {
		runScore=59.7;
	}
	else if (runTime <= 734 {
		runScore=59.4;
	}
	else if (runTime <= 773 {
		runScore=58.5;
	}
	else if (runTime <= 794 {
		runScore=58.0;
	}
	else if (runTime <= 816 {
		runScore=57.3;
	}
	else if (runTime <= 840 {
		runScore=56.5;
	}
	else if (runTime <= 865 {
		runScore=55.6;
	}
	else if (runTime <= 892 {
		runScore=54.5;
	}
	else if (runTime <= 920 {
		runScore=53.3;
	}
	else if (runTime <= 950 {
		runScore=51.8;
	}
	else if (runTime <= 982 {
		runScore=50.0;
	}
	else if (runTime <= 1017 {
		runScore=47.9;
	}
	else if (runTime <= 1054) {
		runScore=45.4;
	}
	else if (runTime <= 1094) {
		runScore=42.4;
	}
	else if (runTime > 1094) {
		runScore=0;
	}
	score = ACScore + pushUpScore + sitUpScore + runScore;
	return score;
}





		
		
		
		
		
		
		
	}

	private String testA;
	private String testL;
	private Date testD;
	private String logins;
	private int Age;
	private int TestDODID;
	private boolean isMale;
	private double height;
	private int weight;

	private double AC1;
	private double AC2;
	private double AC3;
	private double txtAltBC1;
	private double txtAltBC2;
	private double txtAltBC3;
	private double txtAltBC4;
	private int pushUps;
	private int sitUps;
	private int runMinutes;
	private int runSeconds;
	private boolean isElevation6600;
	private boolean isElevation6000;
	private boolean isElevation5500;
	private boolean isElevation5250;
	private boolean isVoid;
	private boolean isMock;
	private boolean isDNF;


	
	@Override
	public String toString() {
		return "StandardFA [testA=" + testA + ", testL=" + testL + ", testD=" + testD + ", logins=" + logins + ", Age="
				+ Age + ", TestDODID=" + TestDODID + ", isMale=" + isMale + ", height=" + height + ", weight=" + weight
				+ ", AC1=" + AC1 + ", AC2=" + AC2 + ", AC3=" + AC3 + ", txtAltBC1=" + txtAltBC1 + ", txtAltBC2="
				+ txtAltBC2 + ", txtAltBC3=" + txtAltBC3 + ", txtAltBC4=" + txtAltBC4 + ", pushUps=" + pushUps
				+ ", sitUps=" + sitUps + ", runMinutes=" + runMinutes + ", runSeconds=" + runSeconds
				+ ", isElevation6600=" + isElevation6600 + ", isElevation6000=" + isElevation6000 + ", isElevation5500="
				+ isElevation5500 + ", isElevation5250=" + isElevation5250 + ", isVoid=" + isVoid + ", isMock=" + isMock
				+ ", isDNF=" + isDNF + ", calculateStandardFA()=" + calculateStandardFA() + ", getClass()=" + getClass()
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

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
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

	public double getAC1() {
		return AC1;
	}

	public void setAC1(double aC1) {
		AC1 = aC1;
	}

	public double getAC2() {
		return AC2;
	}

	public void setAC2(double aC2) {
		AC2 = aC2;
	}

	public double getAC3() {
		return AC3;
	}

	public void setAC3(double aC3) {
		AC3 = aC3;
	}

	public double getTxtAltBC1() {
		return txtAltBC1;
	}

	public void setTxtAltBC1(double txtAltBC1) {
		this.txtAltBC1 = txtAltBC1;
	}

	public double getTxtAltBC2() {
		return txtAltBC2;
	}

	public void setTxtAltBC2(double txtAltBC2) {
		this.txtAltBC2 = txtAltBC2;
	}

	public double getTxtAltBC3() {
		return txtAltBC3;
	}

	public void setTxtAltBC3(double txtAltBC3) {
		this.txtAltBC3 = txtAltBC3;
	}

	public double getTxtAltBC4() {
		return txtAltBC4;
	}

	public void setTxtAltBC4(double txtAltBC4) {
		this.txtAltBC4 = txtAltBC4;
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

	public boolean isVoid() {
		return isVoid;
	}

	public void setVoid(boolean isVoid) {
		this.isVoid = isVoid;
	}

	public boolean isMock() {
		return isMock;
	}

	public void setMock(boolean isMock) {
		this.isMock = isMock;
	}

	public boolean isDNF() {
		return isDNF;
	}

	public void setDNF(boolean isDNF) {
		this.isDNF = isDNF;
	}
	
//save to database
	public static saveStandardFA(){  
		Connection conn = null;
		Statement stmt = null;
		
		try{  
		Class.forName("com.mysql:jdbc.Driver");  
		Connection conn=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/gofit","root","Blindsay@555");  
		Statement stmt=conn.createStatement();
		String sql = "INSERT INTO af_fitness_assessment " +
		"VALUES (testAdmin, testLocation, testDate, unit, age, DODID, isMale, height, weight, AC1, AC2, AC3, txtxAltBC1, txtAltBC2, txtAltBC3, txtAltBC4, pushUps, sitUps, runMinutes, runSeconds, walkMinutes, walkSeconds, isElevation6600, isElevation6000, isElevation5500, isElevation5250, Void, DNF, mock);"
		stmt.execute.Update(sql);
		}catch(SQLException se) {
			se.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(stmt != null)
					conn.close();
		}catch(SQLException se) {
			
		}
			try(conn != null)
					conn.close();
		}catch(SQLException se) {
			se.printStackTrace();
		}	
		}
}

