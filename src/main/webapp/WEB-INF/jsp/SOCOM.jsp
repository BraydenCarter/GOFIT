<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>


<head>
    <meta charset="UTF-8">
    <title>GOFit | SOCOM</title>
        <style type="text/css">
    
    
    /*GlobalStyles*/
body {
    font-family: Arial, Helvetica, sans-serif;
    font-size: 16px;
    background-color: rgb(0, 43, 128);
}
a:visited, a:hover a:active{
    background-color: #ffffff;
    color: white;
    padding: 14px 25px;
    text-align: center;
    display: inline-block;
}
header {
    padding: 20px 20px 20px 20px;
    background-color: rgb(0, 43, 128);
    color: #ffffff;
    text-align: center;
    border-style: double;
    border-color: rgb(182, 134, 10);   
}
nav {
    padding: 20px 2px 20px 5px;
    background-color: rgb(0, 43, 128);
    color: #ffffff;
    text-transform: uppercase;
    border-style: ridge;
    text-align: left;
    float: left;
    width: 27%;
    border-color: rgb(182, 134, 10);
}
nav li {
    padding: 1px 1px 1px 0px;
    color: #ffffff;
    font-size: small;
    border-style: solid;
    border-color:rgb(7,7,7);
    background-color: rgb(7, 7, 7);
    text-decoration: none;   
}
ul.no-bullets {
    list-style-type: none;
}
main {
    border-style: ridge;
    border-color: rgb(182, 134, 10);
    color: white;
 }
.div1 {
  border-style: ridge;
  border-color: rgb(182, 134, 10);
  color: rgb(252, 252, 252);
  width: 33%;
  float: left;
}
.FAform {
  display: inline-block;
}
  /* Set a style for all buttons */
  button {
    background-color: #04AA6D;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    cursor: pointer;
    width: 100%;
  }  
  /* Add a hover effect for buttons */
  button:hover {
    opacity: 0.8;
  }
  /* Extra style for the cancel button (red) */
  .cancelbtn {
    width: auto;
    padding: 10px 18px;
    background-color: #f44336;
  } 
  /* Add padding to containers */
  .container {
    padding: 16px;
    float: left;
  }
    /* The "Forgot password" text */
    span.psw {
      float: right;
      padding-top: 16px;
      color: white;
    }
  /* Change styles for span and cancel button on extra small screens */
  @media screen and (max-width: 300px) {
    span.psw {
      display: block;
      float: none;
    }
    .cancelbtn {
      width: 100%;
    }
  }
  .container {
    color: white;
      }
  .remember {
    color: white;
}
    
    
    
    </style>
<!--     <link href="/GOFiT2/src/main/resources/static/Styles/Styles.css" rel="stylesheet" type="text/css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css"
          integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay" crossorigin="anonymous"> -->
</head>
<body>
<header>
    <img src="images/AFlogo.png" alt="Air Force Logo" name="AFlogo" id="AFlogo" style="float:left;width:128px;height:128px;">
    <img src="images/AFlogo.png" alt="Air Force Logo" name="AFlogo" id="AFlogo" style="float:right;width:128px;height:128px;">
    <h1>GO FiT</h1>
    <h2>Global Overall Fitness Tracker</h2>
    <h3>SOCOM Fitness Test</h3>
</header>
<nav>
    <display: block>
        <li><a href="index.jsp"style="color:#ffffff;">Home</a></li><br>
        <li><a href="UserProfile.jsp"style="color:#ffffff;">Lookup User Profile</a></li><br>
        <li><a href="StandardFA.jsp"style="color:#ffffff;">Input New USAF Standard Fitness Assessment</a></li><br>
        <li><a href="AdvancedFA.jsp"style="color:#ffffff;">Input Advanced Fitness Assessment</a></li><br>
        <li><a href="SOCOM.jsp"style="color:#ffffff;">Input SOCOM Fitness Assessment</a></li><br>
        <li><a href="Endurance.jsp"style="color:#ffffff;">Input Firefighter Endurance Test</a></li><br>
        <li><a href="OTS.jsp"style="color:#ffffff;">Input OTS Entry Fitness Assessment</a></li><br>
        <li><a href="Demographics.jsp"style="color:#ffffff;">Demographics</a></li><br>
        <li><a href="regs.jsp"style="color:#ffffff;">Regulations</a></li><br>
        <li><a href="login.jsp"style="color:#ffffff;">Change roll</a></li><br>
        <li><a href="Downloads.jsp"style="color:#ffffff;">Downloads</a></li><br>
        <li><a href="Exemptions.jsp"style="color:#ffffff;">Exemptions</a></li><br>
        <li><a href="FitnessCharts.jsp"style="color:#ffffff;">Fitness Charts</a></li>
	</display: block>
</nav>
<main>
    
    <section>
        <form:form>
            <div class="FAform">
            <input type="radio" id="isSWOE" name="fav_language" value="SWOE">
            <label for="isSWOE">SWOE</label>
            <input type="radio" id="isPJCCTTACPSR" name="fav_language" value="PJ/CCT/TACP/SR">
            <label for="PJ/CCT/TACP/SR">PJ/CCT/TACP/SR</label>
            <input type="radio" id="isTACPO" name="fav_language" value="TACPO">
            <label for="isTACPO">TACPO</label>
            <input type="radio" id="isEOD" name="fav_language" value="EOD">
            <label for="isEOD">EOD</label>
            <input type="radio" id="isSERE" name="fav_language" value="SERE">
            <label for="isSERE">SERE</label><br>
            <label for="TestA">Test Administrator:</label><br>
            <input type="text" id="TestA" name="TestA" value="Test Administrator" onfocus="this.value=''"><br>
            <label for="TestL">Test Location:</label><br>
            <input type="text" id="TestL" name="TestL" value="Test Location" onfocus="this.value=''"><br>
            <label for="TestD">Test Date:</label><br>
            <input type="text" id="TestD" name="TestD" value="Test Date" onfocus="this.value=''"><br>
            <form:form action="action_page.php" method="post">     
                <label for="logins">Unit:</label><br>
                <input list="logins">
                <datalist id="logins" name="logins" >
                    <option value="92 FSS">
                    <option value="373 TRS">
                    <option value="92 ARW">
                    <option value="92 MSG">
                    <option value="92 CS">
                </datalist><br>
            </form:form>
            <label for="TestDODID">DOD ID Number:</label><br>
            <input type="text" id="TestDODID" name="TestDODID" value="DOD ID Number" onfocus="this.value=''"><br>
            <label for="Age">Age:</label><br>
            <input type="text" id="Age" name="Age" value="Age" onfocus="this.value=''"><br>

            <label for="pullUps">Pull Ups:</label><br>
            <input type="text" id="pullUps" name="pullUps" value="Pull Ups" onfocus="this.value=''"><br>

            <label for="sitUps">Sit Ups:</label><br>
            <input type="text" id="sitUps" name="sitUps" value="Sit Ups" onfocus="this.value=''"><br>

            <label for="pushUps">Push Ups:</label><br>
            <input type="text" id="pushUps" name="pushUps" value="Push Ups" onfocus="this.value=''"><br>

            <label for="runOneMinutes">1.5 mile run:</label><br>
            <input type="text" id="runOneMinutes" name="run1" value="1.5 mile run Minutes" onfocus="this.value=''">
            <input type="text" id="runOneSeconds" name="run1" value="1.5 mile run Seconds" onfocus="this.value=''"><br>

            <label for="swimOneMinutes">25m underwater swim 1:</label><br>
            <input type="text" id="swimOneMinutes" name="swim1" value="25m Underwater Swim1 Minutes" onfocus="this.value=''">
            <input type="text" id="swimOneSeconds" name="swim1" value="25m Underwater Swim1 Seconds" onfocus="this.value=''"><br>
            
            <label for="swimTwoSeconds">25m underwater swim 2:</label><br>
            <input type="text" id="swimTwoMinutes" name="swim2" value="25m Underwater Swim2 Minutes" onfocus="this.value=''">
            <input type="text" id="swimTwoSeconds" name="swim2" value="25m Underwater Swim2 Seconds" onfocus="this.value=''"><br>

            <label for="surfaceSwimMinutes">500m surface swim:</label><br>
            <input type="text" id="surfaceSwimMinutes" name="swim3" value="500m Surface Swim Minutes" onfocus="this.value=''">
            <input type="text" id="surfaceSwimSeconds" name="swim3" value="500m Surface Swim Seconds" onfocus="this.value=''"><br>

            <label for="runTwoMinutes">3 mile run:</label><br>
            <input type="text" id="runTwoMinutes" name="run2" value="3 mile run" onfocus="this.value=''">
            <input type="text" id="runTwoSeconds" name="run2" value="3 mile run" onfocus="this.value=''"><br>

            <label for="surfaceSwimTwoMinutes">1500m surface swim:</label><br>
            <input type="text" id="surfaceSwimTwoMinutes" name="swim4" value="1500m Surface Swim Minutes" onfocus="this.value=''">
            <input type="text" id="surfaceSwimTwoSeconds" name="swim4" value="1500m Surface Swim Seconds" onfocus="this.value=''"><br>


    

    
           <br> <input type="submit" value="Save Assessment" onclick="SOCOMFACalc()" />
        </div>
        </form:form>
    </section>

    
</main>
</body>

