package nl.rondgrt.myperclinic.services;

import nl.rondgrt.myperclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
