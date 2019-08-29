package com.walmart.rebates.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import java.util.List;
@Entity
@Table(name = "\"AgreementBucket\"")
public class AgrBuckets {

   @Id
	@Column(name = "\"BucketId\"")
	private int bucketid;

	@Column(name = "\"BucketAmount\"")
	private String bucketamt;

	

	public int getBucketid() {
		return bucketid;
	}

	public void setBucketid(int bucketid) {
		this.bucketid = bucketid;
	}

	public String getBucketamt() {
		return bucketamt;
	}

	public void setBucketamt(String bucketamt) {
		this.bucketamt = bucketamt;
	}

	
@PrePersist
public void calculate() {
	calculation obj = new calculation() ;
	Object val = obj.buckcal();
//	String agrunm = obj.buckcal();
	int val1 = (int) val ;
	//this.bucketid = agrunm ;
	this.bucketid = val1 ;
	
}
}
