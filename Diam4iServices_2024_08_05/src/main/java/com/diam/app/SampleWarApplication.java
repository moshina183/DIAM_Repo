package com.diam.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.diam.app.model.TXNAuditLogs;

@SpringBootApplication
public class SampleWarApplication implements CommandLineRunner{

	public static void main(String[] args) {
		//System.setProperty("javax.net.ssl.trustStore", "C:\\Program Files\\Java\\jre1.8.0_202\\lib\\security\\cacerts");
		//System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
		
		//System.setProperty("javax.net.ssl.trustStore", "D:\\diamwallet\\keystore.jks");
		//System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
		
		//System.setProperty("javax.net.ssl.trustStore", "/oradata/tomcat/tomcat10/wallet/keystore.jks");
		//System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
		
		SpringApplication.run(SampleWarApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.setProperty("javax.net.ssl.trustStore", "D:\\diamwallet\\keystore.jks");
		System.setProperty("javax.net.ssl.trustStorePassword", "changeit");
		String trustStorePath = System.getProperty("javax.net.ssl.trustStore");
        String trustStorePassword = System.getProperty("javax.net.ssl.trustStorePassword");

        // Print out the values to verify they are set correctly
        System.out.println("Trust Store Path: " + trustStorePath);
        System.out.println("Trust Store Password: " + trustStorePassword);
		
	}

}
