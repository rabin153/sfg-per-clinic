package springuru.springguru.model;

import java.io.Serializable;

// This is the BaseEntity class 
// i.e. all other classes will extends this class for id 

public class BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
