package com.walmart.rebates.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name = "\"TRHeader\"")
public class TR_Header {

	@Id
	@Column(name = "\"TranactionID\"")
	private int trid;

	@Column(name = "\"TransactionType\"")
	private String trtype;

	@Column(name = "\"Transactiondate\"")
	@Temporal(TemporalType.DATE)
	private Date trdate;

	@Column(name = "\"TransactionParty\"")
	private int  trparty;

	@Column(name = "\"SalesAmount\"")
	private float salesamt;

	@Column(name = "\"TransactionCurr\"")
	private String trcurr;

	@Column(name = "\"SettlPartner\"")
	private String settlPartner;

	@Column(name = "\"CalcBasis\"")
	private String calcBasis;

	

	public int getTrid() {
		return trid;
	}

	public void setTrid(int trid) {
		this.trid = trid;
	}

	public String getTrtype() {
		return trtype;
	}

	public void setTrtype(String trtype) {
		this.trtype = trtype;
	}

	public Date getTrdate() {
		return trdate;
	}

	public void setTrdate(Date trdate) {
		this.trdate = trdate;
	}

	public int getTrparty() {
		return trparty;
	}

	public void setTrparty(int trparty) {
		this.trparty = trparty;
	}

	public float getSalesamt() {
		return salesamt;
	}

	public void setSalesamt(float salesamt) {
		this.salesamt = salesamt;
	}

	public String getTrcurr() {
		return trcurr;
	}

	public void setTrcurr(String trcurr) {
		this.trcurr = trcurr;
	}

	public String getSettlPartner() {
		return settlPartner;
	}

	public void setSettlPartner(String settlPartner) {
		this.settlPartner = settlPartner;
	}

	public String getCalcBasis() {
		return calcBasis;
	}

	public void setCalcBasis(String calcBasis) {
		this.calcBasis = calcBasis;
	}

	


}
