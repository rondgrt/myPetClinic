package nl.rondgrt.myperclinic.repositories;

import nl.rondgrt.myperclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
