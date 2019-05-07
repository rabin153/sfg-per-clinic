package springuru.springguru.service;

import java.util.Set;

import springuru.springguru.model.Vet;

public interface VetService {

	Vet findById(Long id);

	Vet save(Vet Vet);

	Set<Vet> findAll();
}
