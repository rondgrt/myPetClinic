package nl.rondgrt.myperclinic.repositories;

import nl.rondgrt.myperclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
