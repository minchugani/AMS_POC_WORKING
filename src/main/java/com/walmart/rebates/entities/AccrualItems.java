package com.walmart.rebates.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name = "\"AccrualItems\"")
@IdClass(AccrualItmKeys.class)
public class AccrualItems {

	 @Id
     @Column(name = "\"BucketId\"")
     private int BucketId;
     
	  @Id
	  @Column(name = "\"TansacationId\"")
	     private int transactionid;
//     @Column(name = "\"Vendor\"")
//      private String Vendor;
     
	  @Column(name = "\"SalesQuantity\"")
	     private float salesquantity;
	     
	   @Column(name = "\"SalesAmount\"")
	   private float salesamount;
	     
     @Column(name = "\"Rebate\"")
     private float Rebate;

	public int getBucketId() {
		return BucketId;
	}

	public void setBucketId(int bucketId) {
		BucketId = bucketId;
	}

	public int getTransactionid() {
		return transactionid;
	}

	public void setTransactionid(int transactionid) {
		this.transactionid = transactionid;
	}

	public float getSalesquantity() {
		return salesquantity;
	}

	public void setSalesquantity(float salesquantity) {
		this.salesquantity = salesquantity;
	}

	public float getSalesamount() {
		return salesamount;
	}

	public void setSalesamount(float salesamount) {
		this.salesamount = salesamount;
	}

	public float getRebate() {
		return Rebate;
	}

	public void setRebate(float rebate) {
		Rebate = rebate;
	}
     
     
     
   
     
     
}
