package nl.rondgrt.myperclinic.repositories;

import nl.rondgrt.myperclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
