package hello;

import java.io.Serializable;

public class Hello implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -91747190990848787L;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
