package springuru.springguru.repository;

import org.springframework.data.repository.CrudRepository;

import springuru.springguru.model.Owner;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

	Owner findByLastName(String lastName);
}
