package com.example.demo.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ticket")
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ticket_id")
	private Integer TicketId;

	@Column(name = "passenger_name", nullable = false)
	private String PassengerName;

	@Column(name = "source_station")
	private String sourceStation;

	@Column(name = "destination_station")
	private String destinationStation;

	@Column(name = "booking_date")
	private Date bookingDate;

	@Column(name = "email")
	private String email;

	@Column(name = "phoneNumber")
	private String phoneNumeber;

	public Integer getTicketId() {
		return TicketId;
	}

	public void setTicketId(Integer ticketId) {
		TicketId = ticketId;
	}

	public String getPassengerName() {
		return PassengerName;
	}

	public void setPassengerName(String PassengerName) {
		this.PassengerName = PassengerName;
	}

	public String getSourceStation() {
		return sourceStation;
	}

	public void setSourceStation(String sourceStation) {
		this.sourceStation = sourceStation;
	}

	public String getDestinationStation() {
		return destinationStation;
	}

	public void setDestinationStation(String destinationStation) {
		this.destinationStation = destinationStation;
	}

	public Date getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumeber() {
		return phoneNumeber;
	}

	public void setPhoneNumeber(String phoneNumeber) {
		this.phoneNumeber = phoneNumeber;
	}

}
