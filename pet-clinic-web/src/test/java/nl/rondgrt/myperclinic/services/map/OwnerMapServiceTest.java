package nl.rondgrt.myperclinic.services.map;

import nl.rondgrt.myperclinic.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class OwnerMapServiceTest {

    private static final long OWNER_ID = 1L;
    private static final String OWNER_LAST_NAME = "Smith";

    private OwnerMapService ownerMapService;

    @BeforeEach
    void setUp() {
        ownerMapService = new OwnerMapService(new PetTypeMapService(), new PetMapService());

        ownerMapService.save(Owner.builder().id(OWNER_ID).lastName(OWNER_LAST_NAME).build());
    }

    @Test
    void findAll() {
        Set<Owner> ownerSet = ownerMapService.findAll();

        assertEquals(1, ownerSet.size());
    }

    @Test
    void deleteById() {
        ownerMapService.deleteById(OWNER_ID);

        assertEquals(0, ownerMapService.findAll().size());
    }

    @Test
    void delete() {
        ownerMapService.delete(ownerMapService.findById(OWNER_ID));

        assertEquals(0, ownerMapService.findAll().size());
    }

    @Test
    void saveExistingId() {
        Long id = 2L;

        Owner savedOwner = ownerMapService.save(Owner.builder().id(id).build());

        assertEquals(id, savedOwner.getId());
    }

    @Test
    void saveNoId() {
        Owner savedOwner = ownerMapService.save(Owner.builder().build());

        assertNotNull(savedOwner.getId());
    }

    @Test
    void findById() {
        Owner owner = ownerMapService.findById(OWNER_ID);

        assertEquals(OWNER_ID, owner.getId());
    }

    @Test
    void findByLastName() {
        Owner owner = ownerMapService.findByLastName(OWNER_LAST_NAME);

        assertEquals(OWNER_LAST_NAME, owner.getLastName());
    }

    @Test
    void findByNonExistingLastName() {
        Owner owner = ownerMapService.findByLastName("ikbestaniet");

        assertNull(owner);
    }
}