package nl.rondgrt.myperclinic.services;

import nl.rondgrt.myperclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
