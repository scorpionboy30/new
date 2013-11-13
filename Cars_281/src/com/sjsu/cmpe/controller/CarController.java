package com.sjsu.cmpe.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Response;

import org.json.JSONObject;

public class CarController extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2072259621860761453L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		Map map = new HashMap(request.getParameterMap());
		map.remove("submit");
		
		JSONObject json = new JSONObject(map);

		if ((request.getParameter("Company")).equalsIgnoreCase("BMW")) {
			try {
				response.sendRedirect("payment.html");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if ((request.getParameter("company")).equalsIgnoreCase("AUDI")) {
			System.out.println(json);
		}

	}
}
