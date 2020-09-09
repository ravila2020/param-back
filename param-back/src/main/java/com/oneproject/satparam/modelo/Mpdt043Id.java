package com.oneproject.satparam.modelo;
// xy
import java.io.Serializable;

import javax.persistence.Id;


public class Mpdt043Id implements Serializable {
	
	private String codent;
	private String producto;
	private String subprodu;
	
	public Mpdt043Id() {
		this.codent = codent;
		this.producto = producto;		
		this.subprodu = subprodu;
	}

	public Mpdt043Id (String codent, String producto, String subprodu) {
		super();
		this.codent = codent;
		this.producto = producto;
		this.subprodu = subprodu;
	}

	public String getCodent() {
		return codent;
	}

	public void setCodent(String codent) {
		this.codent = codent;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public String getSubprodu() {
		return subprodu;
	}

	public void setSubprodu(String subprodu) {
		this.subprodu = subprodu;
	}	

}
