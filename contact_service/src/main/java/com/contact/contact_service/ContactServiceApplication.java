package com.contact.contact_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableDiscoveryClient
@SpringBootApplication
public class ContactServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContactServiceApplication.class, args);
	}

}

