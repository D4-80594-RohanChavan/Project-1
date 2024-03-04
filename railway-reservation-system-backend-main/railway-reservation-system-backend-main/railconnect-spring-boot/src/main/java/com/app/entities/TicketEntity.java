package com.app.entities;

import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tickets")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@AttributeOverride(name = "id", column = @Column(name = "ticket_id", length = 10))
public class TicketEntity extends BaseEntity {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pnr_number") // Assuming this is the foreign key column
	private BookingEntity booking;

	@Column(name = "seat_number", length = 5)
	private String seatNumber;

	@Enumerated(EnumType.STRING)
	@Column(name = "status", length = 10)
	private TicketStatus status;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "passenger_id_fk", referencedColumnName = "passenger_id")
	private PassengerEntity passengerEntity;

}
