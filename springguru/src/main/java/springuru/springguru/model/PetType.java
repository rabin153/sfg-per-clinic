package springuru.springguru.model;

public class PetType extends BaseEntity {
	private static final long serialVersionUID = 1L;
	// Defines PeTttype
	private String name;

	//
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
