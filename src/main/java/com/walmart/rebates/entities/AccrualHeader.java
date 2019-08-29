package com.walmart.rebates.entities;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Persistence;
import javax.persistence.PostLoad;
import javax.persistence.PrePersist;
import javax.persistence.Query;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.apache.olingo.odata2.api.processor.ODataContext;
//import org.springframework.data.jpa.repository.Query;

import com.walmart.rebates.utils.EntityManagerUtility;
//import com.walmart.rebates.utils.getagrs;
//import com.walmart.rebates.utils.GetAgreements;



@Entity
@Table(name = "\"AccrualHeader\"")
//@SequenceGenerator(name="seq", initialValue=1, allocationSize=100)
public class AccrualHeader implements Serializable {
       @Id
       @Column(name = "\"BucketId\"")
       private int BucketId;

       @Column(name = "\"AgreementNum\"")
       private int AgreementNumber;
       
  //     @Column(name = "\"Vendor\"")
 //      private String Vendor;
       @Column(name = "\"SalesQuantity\"")
	     private float salesquantity;
	     
	   @Column(name = "\"SalesAmount\"")
	   private float salesamount;
       @Column(name = "\"Rebate\"")
       private float Rebate;
       
    @OneToMany(cascade = CascadeType.ALL , orphanRemoval = true)
   	@JoinColumn(name = "\"BucketId\"", referencedColumnName = "\"BucketId\"" , insertable = false , updatable = false)
   	private List<AccrualItems> accr_itm ;

    
	public int getBucketId() {
		return BucketId;
	}

	public void setBucketId(int bucketId) {
		BucketId = bucketId;
	}
	
	public int getAgreementNumber() {
		return AgreementNumber;
	}
	
	public void setAgreementNumber(int agreementNumber) {
		AgreementNumber = agreementNumber;
	}

	public float getRebate() {
		return Rebate;
	}

	public void setRebate(float rebate) {
		Rebate = rebate;
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

	public List<AccrualItems> getAccr_itm() {
		return accr_itm;
	}

	public void setAccr_itm(List<AccrualItems> accr_itm) {
		this.accr_itm = accr_itm;
	}

       
      
       
     
}