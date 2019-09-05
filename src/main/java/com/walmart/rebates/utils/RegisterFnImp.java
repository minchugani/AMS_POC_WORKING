package com.walmart.rebates.utils;

import java.io.InputStream;

import org.apache.olingo.odata2.jpa.processor.api.model.JPAEdmExtension;
import org.apache.olingo.odata2.jpa.processor.api.model.JPAEdmSchemaView;

public class RegisterFnImp implements JPAEdmExtension{

@Override
public void extendWithOperation(JPAEdmSchemaView view) {
	view.registerOperations(AccrFnImp.class, null);
}

@Override
public void extendJPAEdmSchema(JPAEdmSchemaView view) {
	view.registerOperations(AccrFnImp.class, null);
	// TODO Auto-generated method stub
	
}

@Override
public InputStream getJPAEdmMappingModelStream() {
	// TODO Auto-generated method stub
	return null;
}
}
