package nl.rondgrt.myperclinic.services;

import nl.rondgrt.myperclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
