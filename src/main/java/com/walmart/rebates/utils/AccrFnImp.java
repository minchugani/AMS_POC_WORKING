package com.walmart.rebates.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.StoredProcedureQuery;

import org.apache.olingo.odata2.api.annotation.edm.EdmFunctionImport;
import org.apache.olingo.odata2.api.annotation.edm.EdmFunctionImport.ReturnType;
import org.apache.olingo.odata2.api.annotation.edm.EdmFunctionImport.ReturnType.Type;

public class AccrFnImp {

	@EdmFunctionImport(name = "Accrual", returnType = @ReturnType(type = Type.SIMPLE))
	
	public boolean demoaccr() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("rebates");
		EntityManager em = factory.createEntityManager();
		StoredProcedureQuery sp  = 	em.createStoredProcedureQuery("update_accruals") ;
		boolean success = sp.execute();
		  System.out.println("execute : " + success);
		return success;
		
	}
}
