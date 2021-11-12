package com.GOFiT.controller;
import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



import com.GOFiT.entity;



@Controller
public class GOFiTController extends HttpServlet{
	
	@GetMapping("/index")
	public String welcome(Model model) {
		System.out.println("Loading Homepage");
		return "index";
	}
	@GetMapping("/AdvancedFA")
	public String welcome(Model model) {
		System.out.println("Loading Advanced Fitness Assessment");
		return "AdvancedFA";
	}
	@GetMapping("/Demographics")
	public String welcome(Model model) {
		System.out.println("Loading Demographicse");
		return "Demographics";
	}
	@GetMapping("/Downloads")
	public String welcome(Model model) {
		System.out.println("Loading Downloads");
		return "Downloads";
	}
	@GetMapping("/Endurance")
	public String welcome(Model model) {
		System.out.println("Loading Endurance");
		return "Endurance";
	}
	@GetMapping("/Exemptions")
	public String welcome(Model model) {
		System.out.println("Loading Exemptions");
		return "Exemptions";
	}
	@GetMapping("/FitnessCharts")
	public String welcome(Model model) {
		System.out.println("Loading Fitness Charts");
		return "FitnessCharts";
	}
	@GetMapping("/login")
	public String welcome(Model model) {
		System.out.println("Loading Login Page");
		return "login";
	}
	@GetMapping("/OTS")
	public String welcome(Model model) {
		System.out.println("Loading OTS Entry Assessment");
		return "OTS";
	}
	@GetMapping("/regs")
	public String welcome(Model model) {
		System.out.println("Loading REgulations");
		return "regs";
	}
	@GetMapping("/SOCOM")
	public String welcome(Model model) {
		System.out.println("Loading SOCOM Fitness Assessment");
		return "SOCOM";
	}
	@GetMapping("/StandardFA")
	public String welcome(Model model) {
		System.out.println("Loading Standard Fitness Assessment");
		return "StandardFA";
	}
	@GetMapping("/UserProfile")
	public String welcome(Model model) {
		System.out.println("Loading User Profile");
		return "UserProfile";
	}
	
	/*
	 * private static final long serialVersionUID = 1L;
	 * 
	 * protected void doGet(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException { RequestDispatcher dispatcher
	 * = request.getRequestDispatcher("index.jsp"); dispatcher.forward(request,
	 * response); }
	 * 
	 * @GetMapping("/AdvancedFA") protected void doGet(HttpServletRequest request,
	 * HttpServletResponse response) throws ServletException, IOException {
	 * RequestDispatcher dispatcher =
	 * request.getRequestDispatcher("AdvancedFA.jsp"); dispatcher.forward(request,
	 * response); }
	 */
	

}
