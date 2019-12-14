package nl.rondgrt.myperclinic.repositories;

import nl.rondgrt.myperclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
