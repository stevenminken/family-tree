import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    private Person person;
    Person father;
    Person mother;
    Person brother;
    Person sister;
    Person son;
    Person daughter;
    Person grandDaughter;

    Pet doggy;

    @BeforeEach
    public void setup() {
        person = new Person("Jaap", "van", "Doorn", Sex.MALE, 34);
        father = new Person("Boris", "Janssen", Sex.MALE, 53);
        mother = new Person("Dora", "the", "Explorer", Sex.FEMALE, 55);
        brother = new Person("Bro", "Brother", Sex.MALE, 22);
        sister = new Person("Sis", "Sister", Sex.FEMALE, 20);
        son = new Person("Sonny", "Sonshine", Sex.MALE, 12);
        daughter = new Person("Tara", "Sweety", Sex.FEMALE, 11);
        grandDaughter = new Person("Happy", "Sweety", Sex.FEMALE, 1);
        doggy = new Pet("Bone", 5, "Dog");
    }

    @org.junit.jupiter.api.Test
    void getName() {
        assertEquals("Jaap", person.getName());
    }

    @org.junit.jupiter.api.Test
    void setName() {
        person.setName("Petrus");
        assertEquals("Petrus", person.getName());
    }

    @org.junit.jupiter.api.Test
    void getMiddleName() {
        assertEquals("van", person.getMiddleName());
    }

    @org.junit.jupiter.api.Test
    void setMiddleName() {
        person.setMiddleName("de");
        assertEquals("de", person.getMiddleName());
    }

    @org.junit.jupiter.api.Test
    void getLastName() {
        assertEquals("Doorn", person.getLastName());
    }

    @org.junit.jupiter.api.Test
    void setLastName() {
        person.setLastName("Gelovige");
        assertEquals("Gelovige", person.getLastName());
    }

    @org.junit.jupiter.api.Test
    void getSex() {
        assertEquals(Sex.MALE, person.getSex());
    }

    @org.junit.jupiter.api.Test
    void setSex() {
        person.setSex(Sex.FEMALE);
        assertEquals(Sex.FEMALE, person.getSex());
    }

    @org.junit.jupiter.api.Test
    void getAge() {
        assertEquals(34, person.getAge());
    }

    @org.junit.jupiter.api.Test
    void setAge() {
        person.setAge(74);
        assertEquals(74, person.getAge());
    }

    @org.junit.jupiter.api.Test
    void getMother() {
        person.setMother(mother);
        assertEquals("Dora", person.getMother().getName());
    }

    @org.junit.jupiter.api.Test
    void setMother() {
        person.setMother(mother);
        assertEquals("Dora", person.getMother().getName());
    }

    @org.junit.jupiter.api.Test
    void getFather() {
        person.setFather(father);
        assertEquals("Boris", person.getFather().getName());
    }

    @org.junit.jupiter.api.Test
    void setFather() {
        person.setFather(father);
        assertEquals("Boris", person.getFather().getName());
    }

    @org.junit.jupiter.api.Test
    void getSiblings() {
        ArrayList<Person> siblings = new ArrayList<>();
        siblings.add(brother);
        siblings.add(sister);
        person.setSiblings(siblings);
        assertEquals("Bro", person.getSiblings().get(0).getName());
        assertEquals("Sis", person.getSiblings().get(1).getName());
    }

    @org.junit.jupiter.api.Test
    void setSiblings() {
        ArrayList<Person> siblings = new ArrayList<>();
        siblings.add(brother);
        siblings.add(sister);
        person.setSiblings(siblings);
        assertEquals("Bro", person.getSiblings().get(0).getName());
        assertEquals("Sis", person.getSiblings().get(1).getName());
    }

    @org.junit.jupiter.api.Test
    void getChildren() {
        Person son = new Person("Sonny", "Sonshine", Sex.MALE, 12);
        Person daughter = new Person("Tara", "Sweety", Sex.FEMALE, 11);
        ArrayList<Person> kids = new ArrayList<>();
        kids.add(son);
        kids.add(daughter);
        person.setChildren(kids);
        assertEquals("Sonny", person.getChildren().get(0).getName());
        assertEquals("Tara", person.getChildren().get(1).getName());
    }

    @org.junit.jupiter.api.Test
    void setChildren() {
        ArrayList<Person> kids = new ArrayList<>();
        kids.add(son);
        kids.add(daughter);
        person.setChildren(kids);
        assertEquals("Sonny", person.getChildren().get(0).getName());
        assertEquals("Tara", person.getChildren().get(1).getName());
    }

    @org.junit.jupiter.api.Test
    void getPets() {
        person.addPet(doggy);
        assertEquals("Bone", person.getPets().get(0).getName());
    }

    @org.junit.jupiter.api.Test
    void setPets() {
        person.addPet(doggy);
        assertEquals("Bone", person.getPets().get(0).getName());
    }

    @org.junit.jupiter.api.Test
    void addParents() {
        person.addParents(father, mother);
        assertEquals("Boris", person.getFather().getName());
        assertEquals("Dora", person.getMother().getName());
    }

    @org.junit.jupiter.api.Test
    void addChild() {
        person.addChild(son);
        assertEquals("Sonny", person.getChildren().get(0).getName());
    }

    @org.junit.jupiter.api.Test
    void addPet() {
        person.addPet(doggy);
        assertEquals("Bone", person.getPets().get(0).getName());
    }

    @org.junit.jupiter.api.Test
    void addSibling() {
        person.addSibling(brother);
        assertEquals("Bro", person.getSiblings().get(0).getName());
    }

    @org.junit.jupiter.api.Test
    void getGrandChildren() {
        person.addChild(daughter);
        daughter.addChild(grandDaughter);
        assertEquals("Happy", person.getGrandChildren().get(0).getName());
    }
}