package com.prospecta.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class EntryDto {
    private String title;
    private String description;
	public EntryDto(String title, String description) {
		super();
		this.title = title;
		this.description = description;
	}
	public EntryDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
    
    
}


