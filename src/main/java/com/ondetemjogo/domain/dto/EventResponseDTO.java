package com.ondetemjogo.domain.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class EventResponseDTO {

	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date date;
	private Long establishment;
	private Long houseTeam;
	private Long visitTeam;

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Long getEstablishment() {
		return establishment;
	}

	public void setEstablishment(Long establishment) {
		this.establishment = establishment;
	}

	public Long getHouseTeam() {
		return houseTeam;
	}

	public void setHouseTeam(Long houseTeam) {
		this.houseTeam = houseTeam;
	}

	public Long getVisitTeam() {
		return visitTeam;
	}

	public void setVisitTeam(Long visitTeam) {
		this.visitTeam = visitTeam;
	}

}
