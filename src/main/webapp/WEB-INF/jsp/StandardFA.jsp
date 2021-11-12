<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>


<head>
    <meta charset="UTF-8">
    <title>GOFit | Standard FA</title>
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
          <!--Javascript for alternative a/c assessment-->
          <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.3/jquery.min.js"></script>
          <script type="text/javascript">

            $(function () {
                  $("#AltBC").click(function () {
                      if ($(AltBC).is(":checked")) {
                          $("#txtAltBC1").removeAttr("disabled");
                          $("#txtAltBC1").focus();

                          $("#txtAltBC2").removeAttr("disabled");
                          $("#txtAltBC2").focus();

                          $("#txtAltBC3").removeAttr("disabled");
                          $("#txtAltBC3").focus();

                          $("#txtAltBC4").removeAttr("disabled");
                          $("#txtAltBC4").focus();

                          $("#txtAltBC5").removeAttr("disabled");
                          $("#txtAltBC5").focus();
                      } else {
                        $("#txtAltBC1").attr("disabled", "disabled");
                        $("#txtAltBC2").attr("disabled", "disabled");
                        $("#txtAltBC3").attr("disabled", "disabled");
                        $("#txtAltBC4").attr("disabled", "disabled");
                        $("#txtAltBC5").attr("disabled", "disabled");
                      }
                  });
              });
          
          </script>
 
</head>
<body>
<header>
    <img src="images/AFlogo.png" alt="Air Force Logo" name="AFlogo" id="AFlogo" style="float:left;width:128px;height:128px;">
    <img src="images/AFlogo.png" alt="Air Force Logo" name="AFlogo" id="AFlogo" style="float:right;width:128px;height:128px;">
    <h1>GO FiT</h1>
    <h2>Global Overall Fitness Tracker</h2>
    <h3>Air Force Fitness Assessment</h3>
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
        <div class=div1>
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
            <input type="radio" id="isMale" name="fav_language" value="Male">
            <label for="male">Male</label>
            <input type="radio" id="isMale" name="fav_language" value="Female">
            <label for="female">Female</label><br> 
            
            <label for="height">Height:</label><br>
            <input type="text" id="height" name="height" value="Height" onfocus="this.value=''"><br>
            <label for="weight">Weight:</label><br>
            <input type="text" id="weight" name="weight" value="Weight" onfocus="this.value=''"><br>

            <label for="AC">Abdominal Circumference:</label><br>
            <input type="text" id="AC1" name="Abdominal Circumference1" value="AC 1" onfocus="this.value=''"><br>
            <input type="text" id="AC2" name="Abdominal Circumference2" value="AC 2" onfocus="this.value=''"><br>
            <input type="text" id="AC3" name="Abdominal Circumference3" value="AC 3" onfocus="this.value=''"><br>
    
            <label for="AltBC">Alternative Body Composition:<input type="checkbox" id="AltBC" /></label><br>
            <input type="text" id="txtAltBC1" disabled="disabled" value="Neck" onclick="this.value=''"/>
            <input type="text" id="txtAltBC2" disabled="disabled" value="Abdominals" onclick="this.value=''"/>
            <input type="text" id="txtAltBC3" disabled="disabled" Value="Waist" onclick="this.value=''"/>
            <input type="text" id="txtAltBC4" disabled="disabled" value="Buttocks" onclick="this.value=''"/>
            <br>
       

            <label for="pushUps">Push Ups:</label><br>
            <input type="text" id="pushUps" name="pushUps" value="Push Ups" onfocus="this.value=''"><br>

            <label for="sitUps">Sit Ups:</label><br>
            <input type="text" id="sitUps" name="sitUps" value="Sit Ups" onfocus="this.value=''"><br>

            <label for="cardio">Choose a Cardio Assessment:</label>
            <select id="cars" name="cars">
              <option value="run">1.5 Mile Run</option>
              <option value="walk">2 KM Walk</option>
            </select><br>
            <label for="runMinutes">Run Time:</label><br>
            <input type="text" id="runMinutes" name="runMinutes" value="Run Minutes" onfocus="this.value=''">
            <input type="text" id="runSeconds" name="runSeconds" value="Run Time" onfocus="this.value=''"><br>
            <label for="walkMinutes">Walk Time:</label><br>
            <input type="text" id="walkMinutes" name="walkMinutes" value="Walk Minutes" onfocus="this.value=''">
            <input type="text" id="walkSeconds" name="walkSeconds" value="Walk Seconds" onfocus="this.value=''"><br>
            

            <label for="Altitude">Altitude Adjustment:</label><br>
            <input type="radio" id="Alt" name="fav_language" value="Alt" checked>
            <label for="alt">N/A</label>
            <input type="radio" id="isElevation5250" name="fav_language" value="Alt1">
            <label for="isElevation5250">5250-5499 ft</label>
            <input type="radio" id="isElevation5500" name="fav_language" value="Alt2">
            <label for="isElevation5500">5500-5999 ft</label><br>
            <input type="radio" id="isElevation6000" name="fav_language" value="Alt3">
            <label for="isElevation6000">6000-6599 ft</label>
            <input type="radio" id="isElevation6600" name="fav_language" value="Alt4">
            <label for="isElevation6600">6600+ ft</label><br>



            <input type="checkbox" id="Void" name="Void" value="Void">
            <label for="Void"> Fitness assessment has been voided by FIM</label><br>


            <input type="checkbox" id="DNF" name="DNF" value="DNF">
            <label for="DNF"> Member did not finish assessment</label><br>
            <input type="checkbox" id="mock" name="mock" value="mock">
            <label for="mock"> Mock Assessment</label><br>
    
            <input type="submit" value="Save Assessment" onclick="calculateStandardFA()" onclick="saveStandardFA()"/>
    </div>
        </form:form>
    </section>

    
</main>
</body>