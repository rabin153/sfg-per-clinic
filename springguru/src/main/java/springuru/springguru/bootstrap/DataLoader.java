package springuru.springguru.bootstrap;

import java.time.LocalDate;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import springuru.springguru.model.Owner;
import springuru.springguru.model.Pet;
import springuru.springguru.model.PetType;
import springuru.springguru.model.Vet;
import springuru.springguru.service.OwnerService;
import springuru.springguru.service.PetTypeService;
import springuru.springguru.service.VetService;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petPetTypeService;

	public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petPetTypeService = petTypeService;
	}

	@Override
	public void run(String... args) throws Exception {

		PetType dog = new PetType();
		dog.setName("Dog");
		PetType savedDogType = petPetTypeService.save(dog);

		PetType cat = new PetType();
		cat.setName("Cat");
		PetType savedCatType = petPetTypeService.save(cat);
		System.out.println(savedDogType);
		System.out.println(savedCatType);

		Owner owner1 = new Owner();
		owner1.setFirstName("Michaeal");
		owner1.setLastName("Westeon");
		owner1.setAddress("123 Brickerel");
		owner1.setCity("Miami");
		owner1.setTelephone("12345677");

		Pet mikesPet = new Pet();
		mikesPet.setPetType(dog);
		mikesPet.setOwner(owner1);
		mikesPet.setBirthDate(LocalDate.now());
		mikesPet.setName("Rosco");
		owner1.getPets().add(mikesPet);

		ownerService.save(owner1);

		Owner owner2 = new Owner();
		owner2.setFirstName("Fiona");
		owner2.setLastName("Glenanne");
		owner2.setAddress("123 Brickerel");
		owner2.setCity("Miami");
		owner2.setTelephone("12345677");

		Pet fianoasCat = new Pet();
		fianoasCat.setName("Just Cat");
		fianoasCat.setBirthDate(LocalDate.now());
		fianoasCat.setPetType(savedCatType);
		fianoasCat.setOwner(owner2);
		owner2.getPets().add(fianoasCat);

		ownerService.save(owner2);

		System.out.println("Loaded owners...........");

		Vet vet1 = new Vet();
		vet1.setFirstName("Sam");
		vet1.setLastName("Axe");

		vetService.save(vet1);

		System.out.println("Loaded vets..............");

	}

}
