package com.jsp.dto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bike {
	@Autowired
	Engine engine;
	public void testRide() {
		engine.ignition();
	}
}
