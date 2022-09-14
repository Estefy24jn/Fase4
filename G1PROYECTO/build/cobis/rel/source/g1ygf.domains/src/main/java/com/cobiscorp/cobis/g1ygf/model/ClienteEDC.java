package com.cobiscorp.cobis.g1ygf.model;

import java.util.ArrayList;
import java.util.List;
import com.cobiscorp.designer.api.Property;

public class ClienteEDC {

	public static final String EN_CLIENTECE_848 = "EN_CLIENTECE_848";
	
	public static final String VERSION = "1.0.0";
	
	public static final String ENTITY_NAME = "ClienteEDC";
	
	
	public static final Property<String> NOMBRE = new Property<String>("nombre", String.class, false);
	
	public static final Property<String> APELLIDO = new Property<String>("apellido", String.class, false);
	
	public static final List<Property<?>> getPks() {
		List<Property<?>> pks = new ArrayList<Property<?>>();
		return pks;
	}

}
