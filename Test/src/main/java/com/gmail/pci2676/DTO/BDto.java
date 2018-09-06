package com.gmail.pci2676.DTO;

import java.util.Date;

public class BDto {
	
	int bId;
	String bName;
	String bTitle;
	String bContent;
	Date bDate;

	
	public BDto() {
		// TODO Auto-generated constructor stub
	}
	
	public BDto(int bId, String bName, String bTitle,String bContent,Date bDate) {
		// TODO Auto-generated constructor stub
		this.bId=bId;
		this.bName=bName;
		this.bTitle=bTitle;
		this.bContent=bContent;
		this.bDate=bDate;
	}

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public String getbTitle() {
		return bTitle;
	}

	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}

	public String getbContent() {
		return bContent;
	}

	public void setbContent(String bContent) {
		this.bContent = bContent;
	}

	public Date getbDate() {
		return bDate;
	}

	public void setbDate(Date bDate) {
		this.bDate = bDate;
	}
	
	
}
