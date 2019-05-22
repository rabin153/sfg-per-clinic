package springuru.springguru.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "pets")
public class Pet extends BaseEntity {
	private static final long serialVersionUID = 1L;

	@Column(name = "name")
	private String name;
	// Pet Type

	@ManyToOne
	@JoinColumn(name = "type+id")
	private PetType petType;

	@ManyToOne
	@JoinColumn(name = "owner_id") // how this is related with owner in db
	private Owner owner;

	@Column(name = "birth_date")
	private LocalDate birthDate;

	public PetType getPetType() {
		return petType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPetType(PetType petType) {
		this.petType = petType;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

}
