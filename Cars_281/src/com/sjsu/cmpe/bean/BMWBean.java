package com.sjsu.cmpe.bean;

import java.util.List;

public class BMWBean {
	
	private String model;
	private String colour;
	private List<String> feature;
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getColour() {
		return colour;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public List<String> getFeature() {
		return feature;
	}
	
	public void setFeature(List<String> feature) {
		this.feature = feature;
	}
}
