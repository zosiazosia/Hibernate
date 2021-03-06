package com.jwt.hibernate.bean;
// Generated 18-May-2017 12:52:35 by Hibernate Tools 5.2.3.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Appointment generated by hbm2java
 */
public class Appointment implements java.io.Serializable {

	private Long id;
	private Float cost;
	private Set<Treatment> treatments = new HashSet<Treatment>(0);
//	private Payment payment;
/*	private Client client;
	private User user;
	private Boolean clientPresent;
	private Date date;
	private Date time;
	private String description;
	private Integer timeDuration;*/

	public Appointment() {
	}
	public Appointment(Float cost, Set<Treatment> payments/*, Payment payment, Client client*/){
		this.cost= cost;
	//	this.payment = payment;
		this.treatments = payments;
	//	this.client = client;
	}

/*	public Appointment(Client client, Payment payment, User user, Float cost,
			Boolean clientPresent, Date date, Date time, String description, Integer timeDuration) {
		this.client = client;
		this.payment = payment;
		this.user = user;
		this.cost = cost;
		this.clientPresent = clientPresent;
		this.date = date;
		this.time = time;
		this.description = description;
		this.timeDuration = timeDuration;
	}
*/
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

/*	public Client getClient() {
		return this.client;
	}

	public void setClient(Client client) {
		this.client = client;
	}*/

/*	public Payment getPayment() {
		return this.payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	} */
	public Set<Treatment> getTreatments() {
		return this.treatments;
	}

	public void setTreatments(Set<Treatment> payments) {
		this.treatments = payments;
	} 

	public Float getCost() {
		return this.cost;
	}

	public void setCost(Float cost) {
		this.cost = cost;
	}

/*	public Boolean getClientPresent() {
		return this.clientPresent;
	}

	public void setClientPresent(Boolean clientPresent) {
		this.clientPresent = clientPresent;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Date getTime() {
		return this.time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getTimeDuration() {
		return this.timeDuration;
	}

	public void setTimeDuration(Integer timeDuration) {
		this.timeDuration = timeDuration;
	}
*/
}
