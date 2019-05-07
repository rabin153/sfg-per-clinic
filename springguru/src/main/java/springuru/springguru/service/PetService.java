package springuru.springguru.service;

import java.util.Set;

import springuru.springguru.model.Pet;

public interface PetService {

	Pet findById(Long id);

	Pet save(Pet Pet);

	Set<Pet> findAll();
}
