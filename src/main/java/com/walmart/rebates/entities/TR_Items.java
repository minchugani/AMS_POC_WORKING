package com.walmart.rebates.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
@Entity
@Table(name = "\"TRItems\"")
@IdClass(TRItemKeys.class)
public class TR_Items implements Serializable{
	@Id
	@Column(name = "\"TranactionId\"")
	private int trid;
	
	@Id
	@Column(name = "\"TranactionSeq\"")
	private int trseq;
	
	@Column(name = "\"ItemNumber\"")
	private int itemnum;
	
	@Column(name = "\"Store\"")
	private int storeid;
	
	@Column(name = "\"SalesAmount\"")
	private float salesamt;
	
	@Column(name = "\"SalesQuantity\"")
	private int salesquan;
	
	@Column(name = "\"SalesUoM\"")
	private String salesuom;

	public int getTrid() {
		return trid;
	}

	public void setTrid(int trid) {
		this.trid = trid;
	}

	public int getTrseq() {
		return trseq;
	}

	public void setTrseq(int trseq) {
		this.trseq = trseq;
	}

	public int getItemnum() {
		return itemnum;
	}

	public void setItemnum(int itemnum) {
		this.itemnum = itemnum;
	}

	public int getStoreid() {
		return storeid;
	}

	public void setStoreid(int storeid) {
		this.storeid = storeid;
	}

	public float getSalesamt() {
		return salesamt;
	}

	public void setSalesamt(float salesamt) {
		this.salesamt = salesamt;
	}

	public int getSalesquan() {
		return salesquan;
	}

	public void setSalesquan(int salesquan) {
		this.salesquan = salesquan;
	}

	public String getSalesuom() {
		return salesuom;
	}

	public void setSalesuom(String salesuom) {
		this.salesuom = salesuom;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
