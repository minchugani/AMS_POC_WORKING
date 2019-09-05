package com.walmart.rebates.utils;

import javax.persistence.EntityManagerFactory;

import org.apache.olingo.odata2.jpa.processor.api.ODataJPAContext;
import org.apache.olingo.odata2.jpa.processor.api.ODataJPAServiceFactory;
import org.apache.olingo.odata2.jpa.processor.api.exception.ODataJPARuntimeException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;	

import org.springframework.context.annotation.Scope;

@Component
@Scope(WebApplicationContext.SCOPE_REQUEST)
public class RebatesOdataServiceFactory extends ODataJPAServiceFactory{
	public static final String PUNIT_NAME = "rebates";
	private final EntityManagerFactory entityManagerFactory;
	
	@Autowired
	public RebatesOdataServiceFactory(EntityManagerFactory entityManagerFactory) {
		super();
		this.entityManagerFactory = entityManagerFactory;
	}


	@Override
	public ODataJPAContext initializeODataJPAContext() throws ODataJPARuntimeException {
		ODataJPAContext oDataJPAContext = getODataJPAContext();
		oDataJPAContext.setEntityManagerFactory(entityManagerFactory);
		oDataJPAContext.setJPAEdmExtension(new RegisterFnImp());
		oDataJPAContext.setPersistenceUnitName(PUNIT_NAME);
		return oDataJPAContext;
	}
	
}
