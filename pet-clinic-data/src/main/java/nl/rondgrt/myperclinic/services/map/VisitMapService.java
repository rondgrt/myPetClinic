package nl.rondgrt.myperclinic.services.map;

import nl.rondgrt.myperclinic.model.Visit;
import nl.rondgrt.myperclinic.services.VisitService;

import java.util.Set;

public class VisitMapService extends AbstractMapService<Visit, Long> implements VisitService {

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Visit save(Visit visit) {
        if (visit.getPet() == null || visit.getPet().getOwner() == null || visit.getPet().getId() == null
            || visit.getPet().getOwner().getId() == null) {
            throw new RuntimeException(("Invalid visit"));
        }

        return super.save(visit);
    }

    @Override
    public void delete(Visit visit) {
        super.save(visit);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

}
