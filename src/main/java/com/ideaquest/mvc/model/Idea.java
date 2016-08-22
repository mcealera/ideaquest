package com.ideaquest.mvc.model;

public class Idea {
	
	private Long ideaID;
	private String ideaName;
	private String ideaDesc;
	private String genDate;
	private String ideaStatus;
	private String notes;
	
	@Override
	public String toString() {
		return "Idea [ideaID=" + ideaID + ", ideaName=" + ideaName + ", ideaDesc=" + ideaDesc + ", genDate=" + genDate
				+ ", ideaStatus=" + ideaStatus + ", notes=" + notes + "]";
	}
	
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public Long getIdeaID() {
		return ideaID;
	}
	public void setIdeaID(Long ideaID) {
		this.ideaID = ideaID;
	}
	public String getIdeaName() {
		return ideaName;
	}
	public void setIdeaName(String ideaName) {
		this.ideaName = ideaName;
	}
	public String getIdeaDesc() {
		return ideaDesc;
	}
	public void setIdeaDesc(String ideaDesc) {
		this.ideaDesc = ideaDesc;
	}
	public String getGenDate() {
		return genDate;
	}
	public void setGenDate(String genDate) {
		this.genDate = genDate;
	}
	public String getIdeaStatus() {
		return ideaStatus;
	}
	public void setIdeaStatus(String ideaStatus) {
		this.ideaStatus = ideaStatus;
	}
	
	

}
