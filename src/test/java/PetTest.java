import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PetTest {

    private Pet garfield;
    private Pet pluto;

    private Person owner;
    private Person newOwner;

    @BeforeEach
    public void setup() {
        owner = new Person("Jaap", "van", "Doorn", Sex.MALE, 34);
        newOwner = new Person("Truus", "de", "Licht", Sex.FEMALE, 55);
        pluto = new Pet("Pluto", 5, "Dog");
        garfield = new Pet("Garfield", 4, "Cat");
        owner.addPet(pluto);
        owner.addPet(garfield);
    }

    @Test
    void getName() {
        assertEquals("Pluto", pluto.getName());
    }

    @Test
    void setName() {
        pluto.setName("Goofy");
        assertEquals("Goofy", pluto.getName());
    }

    @Test
    void getAge() {
        assertEquals(5, pluto.getAge());
    }

    @Test
    void setAge() {
        pluto.setAge(6);
        assertEquals(6, pluto.getAge());
    }

    @Test
    void getSpecies() {
        assertEquals("Cat", garfield.getSpecies());
        assertEquals("Dog", pluto.getSpecies());
    }

    @Test
    void setSpecies() {
        garfield.setSpecies("cartoon cat");
        pluto.setSpecies("cartoon dog");
        assertEquals("cartoon cat", garfield.getSpecies());
        assertEquals("cartoon dog", pluto.getSpecies());
    }

    @Test
    void getOwner() {
        assertEquals("Jaap", garfield.getOwner().getName());
        assertEquals("Jaap", pluto.getOwner().getName());
    }

    @Test
    void setOwner() {
        garfield.setOwner(newOwner);
        pluto.setOwner(newOwner);
        assertEquals("Truus", garfield.getOwner().getName());
        assertEquals("Truus", pluto.getOwner().getName());
    }
}