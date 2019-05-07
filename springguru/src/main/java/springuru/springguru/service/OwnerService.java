package springuru.springguru.service;

import springuru.springguru.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

	Owner findByLastName(String lastName);

	// already implemented by parent interface
//	Owner findById(Long id);
//
//	Owner save(Owner owner);
//
//	Set<Owner> findAll();
}
