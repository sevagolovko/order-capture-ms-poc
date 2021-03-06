package com.example.oc.mspoc.datatype;

import com.amdocs.cih.services.assignedproduct.lib.SearchAssignedProductOutput;

public class SearchAssignedProductOutputWrapper implements ServiceOutputWrapper {
	
	private SearchAssignedProductOutput searchAssignedProductOutput;
	
	public SearchAssignedProductOutputWrapper (SearchAssignedProductOutput obj) {
		this.searchAssignedProductOutput = obj;
	}

	public Object getOutput() {
		return searchAssignedProductOutput;
	}
}
