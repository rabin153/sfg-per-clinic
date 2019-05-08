package springuru.springguru.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import springuru.springguru.model.Owner;
import springuru.springguru.model.Vet;
import springuru.springguru.service.OwnerService;
import springuru.springguru.service.VetService;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;

	public DataLoader(OwnerService ownerService, VetService vetService) {
		this.ownerService = ownerService;
		this.vetService = vetService;
	}

	@Override
	public void run(String... args) throws Exception {

		Owner owner1 = new Owner();
		owner1.setId(1L);
		owner1.setFirstName("Michaeal");
		owner1.setLastName("Westeon");

		ownerService.save(owner1);

		System.out.println("Loaded owners...........");

		Vet vet1 = new Vet();
		vet1.setId(1L);
		vet1.setFirstName("Sam");
		vet1.setLastName("Axe");

		vetService.save(vet1);

		System.out.println("Loaded vets..............");

	}

}
