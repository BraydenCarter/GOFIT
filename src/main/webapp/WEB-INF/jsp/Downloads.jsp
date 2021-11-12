<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>GOFit | Donloads</title>
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
    <h3>Downloads</h3>
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

<h3>Scorecards</h3>

    <input type="button" value="Download Standard USAF Fitness Scorecard"  /><br>
    <input type="button" value="Download Advanced Fitness Scorecard"  /><br>
    <input type="button" value="Download Firefighter Endurance Fitness Scorecard"  /><br>
    <input type="button" value="Download OTS Entry Fitness Scorecard"  /><br>
    <input type="button" value="Download SOCOM Fitness Scorecard"  />


<h3>Fitness Charts</h3>
    <input type="button" value="Download Standard USAF Fitness Assessment"  /><br>
    <input type="button" value="Download Advanced Fitness Assessment"  /><br>
    <input type="button" value="Download Firefighter Endurance Fitness Assessment"  /><br>
    <input type="button" value="Download OTS Entry Fitness Assessment"  /><br>
    <input type="button" value="Download SOCOM Fitness Assessment"  />  
</main>
