package springuru.springguru.repository;

import org.springframework.data.repository.CrudRepository;

import springuru.springguru.model.Pet;

public interface PetRepository extends CrudRepository<Pet, Long> {

}
