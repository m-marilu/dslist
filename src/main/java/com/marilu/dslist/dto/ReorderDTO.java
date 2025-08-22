package com.marilu.dslist.dto;

public class ReorderDTO {

	private Integer sourceIndex;
	private Integer destinationIndex;
	
	public Integer getSourceIndex() {
		return sourceIndex;
	}
	
	public void setSourceIndex(Integer sourceIndex) {
		this.sourceIndex = sourceIndex;
	}
	
	public Integer getDestinationIndex() {
		return destinationIndex;
	}
	
	public void setDestinationIndex(Integer destinationIndex) {
		this.destinationIndex = destinationIndex;
	}
}
