package com.walmart.rebates.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

public class TRItemKeys implements Serializable {

	@Id
	@Column(name = "\"TranactionID\"")
	private int trid;
	
	@Id
	@Column(name = "\"TranactionSeq\"")
	private int trseq;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + trid;
		result = prime * result + trseq;
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
		TRItemKeys other = (TRItemKeys) obj;
		if (trid != other.trid)
			return false;
		if (trseq != other.trseq)
			return false;
		return true;
	}
	
	

}
