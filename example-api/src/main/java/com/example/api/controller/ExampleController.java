package com.example.api.controller;

import com.example.core.service.EchoService;

/**
 * 
 * @author h.imai
 *
 */
public class ExampleController {
	
	private EchoService service;
	
	public void doSomething() {
		service.echo();
	}
}
