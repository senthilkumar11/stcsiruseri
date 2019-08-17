  package com.premium.stc.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Company {
	@Id
	@Column(name="company_code")
	private int companyCode;
	@Size(min=1,message="Required")
	@Column(name="company_Name")
	private String companyName;
	@Column(name="turnover")
	private BigDecimal turnOver;
	private String ceo;
	@Column(name="boardofdirectors")
	private String boardOfDirectors;
	@Column(name="sector_id")
	private int sectorId;
	@Column(name="breifwriteup")
	private String briefWriteUp;
	@Column(name="stock_price_id")
	private int stockPriceId;
	
	
	public Company(int companyCode, String companyName, BigDecimal turnOver, String ceo, String boardOfDirectors,
			int sectorId, String briefWriteUp, int stockPriceId) {
		super();
		this.companyCode = companyCode;
		this.companyName = companyName;
		this.turnOver = turnOver;
		this.ceo = ceo;
		this.boardOfDirectors = boardOfDirectors;
		this.sectorId = sectorId;
		this.briefWriteUp = briefWriteUp;
		this.stockPriceId = stockPriceId;
	}
	
	public Company() {
		super();
	}

	public int getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(int companyCode) {
		this.companyCode = companyCode;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public BigDecimal getTurnOver() {
		return turnOver;
	}
	public void setTurnOver(BigDecimal turnOver) {
		this.turnOver = turnOver;
	}
	public String getCeo() {
		return ceo;
	}
	public void setCeo(String ceo) {
		this.ceo = ceo;
	}
	public String getBoardOfDirectors() {
		return boardOfDirectors;
	}
	public void setBoardOfDirectors(String boardOfDirectors) {
		this.boardOfDirectors = boardOfDirectors;
	}
	
	
	public int getSectorId() {
		return sectorId;
	}
	public void setSectorId(int sectorId) {
		this.sectorId = sectorId;
	}
	public String getBriefWriteUp() {
		return briefWriteUp;
	}
	public void setBriefWriteUp(String briefWriteUp) {
		this.briefWriteUp = briefWriteUp;
	}
	

	public int getStockPriceId() {
		return stockPriceId;
	}

	public void setStockPriceId(int stockPriceId) {
		this.stockPriceId = stockPriceId;
	}

	@Override
	public String toString() {
		return "Company [companyCode=" + companyCode + ", companyName=" + companyName + ", turnOver=" + turnOver
				+ ", ceo=" + ceo + ", boardOfDirectors=" + boardOfDirectors + ", sectorId=" + sectorId
				+ ", briefWriteUp=" + briefWriteUp + ", stockCode=" + stockPriceId + "]";
	}
	
	
	
}
