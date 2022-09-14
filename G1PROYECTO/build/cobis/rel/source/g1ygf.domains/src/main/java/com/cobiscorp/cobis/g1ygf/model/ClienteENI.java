package com.cobiscorp.cobis.g1ygf.model;

import java.util.ArrayList;
import java.util.List;
import com.cobiscorp.designer.api.Property;

public class ClienteENI {

	public static final String EN_CLIENTEII_137 = "EN_CLIENTEII_137";
	
	public static final String VERSION = "1.0.0";
	
	public static final String ENTITY_NAME = "ClienteENI";
	
	
	public static final Property<String> EDAD = new Property<String>("edad", String.class, false);
	
	public static final Property<String> NOMBRE = new Property<String>("nombre", String.class, false);
	
	public static final Property<String> APELLIDO = new Property<String>("apellido", String.class, false);
	
	public static final List<Property<?>> getPks() {
		List<Property<?>> pks = new ArrayList<Property<?>>();
		return pks;
	}

}
