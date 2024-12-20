package com.nit.runners;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Component
@Repository
@Controller

public class ExRun implements CommandLineRunner
{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Iam Ex runner...");
	}

}
