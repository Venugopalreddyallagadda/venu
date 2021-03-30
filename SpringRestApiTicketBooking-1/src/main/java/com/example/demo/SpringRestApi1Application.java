package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.Ticket;
import com.example.demo.service.TicketService;

@SpringBootApplication
public class SpringRestApi1Application implements CommandLineRunner{
	@Autowired
	private TicketService service;

	public static void main(String[] args) {
		SpringApplication.run(SpringRestApi1Application.class, args);
		
	}
//
	@Override
	public void run(String... args) throws Exception {
		Ticket t = new Ticket();
		//t.setBookingDate();
		t.setDestinationStation("knl");
		t.setEmail("venu.gopalljs");
		t.setPassengerName("venu");
		t.setPhoneNumeber("8989");
		t.setSourceStation("hyd");
		service.createTicket(t);
		
		
	}

}
