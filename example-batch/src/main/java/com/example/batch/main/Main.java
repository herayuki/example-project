package com.example.batch.main;

import com.example.core.service.EchoService;

public class Main {
	
	private static EchoService service;
	
	public static void main(String[] args) {
		service.echo();
	}
}
