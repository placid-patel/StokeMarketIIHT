package com.example.patel.company.models;

import lombok.Data;


import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

import java.io.Serializable;
import java.util.List;

@Data
@DynamicUpdate
@Entity
public class Company {
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(name = "company_id")
    private String id;
    private String companyName;
    private Long turnover;
    private String ceo;
    private String boardOfDirs;
    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)

    @JoinTable(
            name = "company_stockexchange",
            joinColumns = @JoinColumn(name = "company_id"),
            inverseJoinColumns = @JoinColumn(name = "stockexchange_id")
    )
    private List<StockExchange> stockExchangeList;
    private String sector;
    private String briefWriteup;
    private String ticker;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return companyName;
	}
	public void setName(String name) {
		this.companyName = name;
	}
	public Long getTurnover() {
		return turnover;
	}
	public void setTurnover(Long turnover) {
		this.turnover = turnover;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public String getBoardOfDirs() {
		return boardOfDirs;
	}
	public void setBoardOfDirs(String boardOfDirs) {
		this.boardOfDirs = boardOfDirs;
	}
	public String getSector() {
		return sector;
	}
	public void setSector(String sector) {
		this.sector = sector;
	}
	public String getBriefWriteup() {
		return briefWriteup;
	}
	public void setBriefWriteup(String briefWriteup) {
		this.briefWriteup = briefWriteup;
	}
	public String getTicker() {
		return ticker;
	}
	public void setTicker(String ticker) {
		this.ticker = ticker;
	}
	public Company(String id, String name, Long turnover, String ceo, String boardOfDirs, String sector,
			String briefWriteup, String ticker) {
		super();
		this.id = id;
		this.companyName = name;
		this.turnover = turnover;
		this.ceo = ceo;
		this.boardOfDirs = boardOfDirs;
		this.sector = sector;
		this.briefWriteup = briefWriteup;
		this.ticker = ticker;
	}
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}
