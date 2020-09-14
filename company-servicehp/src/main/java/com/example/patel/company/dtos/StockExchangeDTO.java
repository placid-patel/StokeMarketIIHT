package com.example.patel.company.dtos;

import lombok.Data;

@Data
public class StockExchangeDTO {

    private String id;
    private String stockExchangeName;
    private String brief;
    private String contactAddress;
    private String remarks;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return stockExchangeName;
	}
	public void setName(String name) {
		this.stockExchangeName = name;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public String getContactAddress() {
		return contactAddress;
	}
	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
    
    
}