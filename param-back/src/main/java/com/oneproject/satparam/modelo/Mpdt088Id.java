package com.oneproject.satparam.modelo;

import java.io.Serializable;

public class Mpdt088Id implements Serializable{
	
	private String codent;
    private String producto;
    private String subprodu;
    
    public Mpdt088Id() {

        this.codent  = codent;
        this.producto = producto;                    
        this.subprodu = subprodu;

}
    
    public Mpdt088Id (String codent, String producto, String subprodu) {

   	    this.codent  = codent;
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
