package com.diam.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.diam.app.model.TXNAuditLogs;

@SpringBootApplication
public class SampleWarApplication{

	public static void main(String[] args) {
		
		SpringApplication.run(SampleWarApplication.class, args);
		String trustStorePathNew = System.getProperty("javax.net.ssl.trustStore");
        String trustStorePasswordNew = System.getProperty("javax.net.ssl.trustStorePassword");
        System.out.println("---------- Trust Store Path ---- : " + trustStorePathNew);
        System.out.println("---------- Trust Store Password ----: " + trustStorePasswordNew);
		
	}


}
