package com.careerit.coursestat.dto;

public class StatusCountDTO {

	private int placedCount;
	private int notPlacedCount;

	public StatusCountDTO(int placedCount, int notPlacedCount) {
		super();
		this.placedCount = placedCount;
		this.notPlacedCount = notPlacedCount;
	}

	public StatusCountDTO() {
		super();

	}

	public int getPlacedCount() {
		return placedCount;
	}

	public void setPlacedCount(int placedCount) {
		this.placedCount = placedCount;
	}

	public int getNotPlacedCount() {
		return notPlacedCount;
	}

	public void setNotPlacedCount(int notPlacedCount) {
		this.notPlacedCount = notPlacedCount;
	}

}
