package com.nit.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRun implements CommandLineRunner
{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Iam from Command Line Runners...");
	}

}
