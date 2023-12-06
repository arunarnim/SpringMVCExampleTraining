package com.org.mvc;

import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMvcExampleApplication implements ApplicationRunner {
	
	private static Logger LOG = LoggerFactory.getLogger("Test");

	public static void main(String[] args) {
		LOG.info("--- START -- main called");
		SpringApplication.run(SpringMvcExampleApplication.class, args);
		LOG.info("--- STOP -- main called");
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		LOG.info("--- Application Runner");
		List nonOptionalArgs = args.getNonOptionArgs();
		String[] sarg = args.getSourceArgs();
		Set optName = args.getOptionNames();
		
		nonOptionalArgs.forEach(x -> LOG.info("--non opt " + x ));
	}

	/*
	 * @Override public void run(String... args) throws Exception { // TODO
	 * Auto-generated method stub LOG.info("--- run -- main called"); for (int
	 * i=0;i<10;i++) { LOG.info("--- i -- " + i);
	 * 
	 * } }
	 */
	
	

}
