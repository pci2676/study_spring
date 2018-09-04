package com.gmail.pci2676.dto;

import java.sql.Timestamp;

public class BDto {
	int bId;
	String bName;
	String bTitle;
	String bContent;
	Timestamp bDate;
	int bHit;
	int bGroup;
	int bIndent;
	
	public BDto() {
		// TODO Auto-generated constructor stub
	}
	
	public BDto(int bId, String bName, String bTitle,String bContent, Timestamp bDate, int bHit, int bGroup, int bIndent) {
		// TODO Auto-generated constructor stub
		this.bId=bId;
		this.bName=bName;
		this.bTitle=bTitle;
		this.bContent=bContent;
		this.bDate=bDate;
		this.bHit=bHit;
		this.bGroup=bGroup;
		this.bIndent=bIndent;
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

	public Timestamp getbDate() {
		return bDate;
	}

	public void setbDate(Timestamp bDate) {
		this.bDate = bDate;
	}

	public int getbHit() {
		return bHit;
	}

	public void setbHit(int bHit) {
		this.bHit = bHit;
	}

	public int getbGroup() {
		return bGroup;
	}

	public void setbGroup(int bGroup) {
		this.bGroup = bGroup;
	}

	public int getbIndent() {
		return bIndent;
	}

	public void setbIndent(int bIndent) {
		this.bIndent = bIndent;
	}

	public String getbContent() {
		return bContent;
	}

	public void setbContent(String bContent) {
		this.bContent = bContent;
	}
	
	
}
