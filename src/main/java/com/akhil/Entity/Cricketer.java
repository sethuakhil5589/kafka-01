package com.akhil.Entity;

public class Cricketer {

	private Integer cId;
	private String cName;
	private Integer noOfMatches;
	private Integer noOfCenturies;
	public Cricketer() {
		super();
	}
	public Cricketer(Integer cId, String cName, Integer noOfMatches, Integer noOfCenturies) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.noOfMatches = noOfMatches;
		this.noOfCenturies = noOfCenturies;
	}
	public Integer getcId() {
		return cId;
	}
	public void setcId(Integer cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public Integer getNoOfMatches() {
		return noOfMatches;
	}
	public void setNoOfMatches(Integer noOfMatches) {
		this.noOfMatches = noOfMatches;
	}
	public Integer getNoOfCenturies() {
		return noOfCenturies;
	}
	public void setNoOfCenturies(Integer noOfCenturies) {
		this.noOfCenturies = noOfCenturies;
	}
	@Override
	public String toString() {
		return "Cricketer [cId=" + cId + ", cName=" + cName + ", noOfMatches=" + noOfMatches + ", noOfCenturies="
				+ noOfCenturies + "]";
	}
}
