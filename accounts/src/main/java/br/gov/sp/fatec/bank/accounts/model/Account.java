package br.gov.sp.fatec.bank.accounts.model;

import javax.persistence.*;

@Entity
@Table(name = "ACC_ACCOUNT")
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ACC_ID")
	private Long id;

	@Column(name = "ACC_NUMBER")
	private Long number;

	@Column(name = "ACC_BALANCE")
	private Double balance;

	@Column(name = "ACC_CLIENT_ID")
	private Long clientId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getNumber() {
		return number;
	}

	public Account() {
		this.balance = 0d;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public Double getBalance() {
		return balance;
	}

	public void deposit(Double value) {
		if (value != null && value > 0) {
			this.balance += value;
		}
	}

	public void withdraw(Double value) {
		if (value != null && value > 0 && value <= this.balance) {
			this.balance -= value;
		}
	}

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}
}
