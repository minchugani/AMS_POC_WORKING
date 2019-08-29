package com.walmart.rebates.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class AccrualItmKeys implements Serializable {
		
     @Column(name = "\"BucketId\"")
     private int BucketId;
  
	  @Column(name = "\"TansacationId\"")
	     private int transactionid;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + BucketId;
		result = prime * result + transactionid;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccrualItmKeys other = (AccrualItmKeys) obj;
		if (BucketId != other.BucketId)
			return false;
		if (transactionid != other.transactionid)
			return false;
		return true;
	}
	
	  
	
	
	
	
}
