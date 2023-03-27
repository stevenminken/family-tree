import java.util.ArrayList;

public class Person {
    private String name;
    private String middleName;
    private String lastName;
    private Sex sex;
    private int age;
    private Person mother;
    private Person father;
    private ArrayList<Person> siblings;
    private ArrayList<Person> children;
    private ArrayList<Pet> pets;

    public Person(String name, String lastName, Sex sex, int age) {
        this.name = name;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    public Person(String name, String middleName, String lastName, Sex sex, int age) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person getMother() {
        return mother;
    }

    public void setMother(Person mother) {
        this.mother = mother;
    }

    public Person getFather() {
        return father;
    }

    public void setFather(Person father) {
        this.father = father;
    }

    public ArrayList<Person> getSiblings() {
        return siblings;
    }

    public void setSiblings(ArrayList<Person> siblings) {
        this.siblings = siblings;
    }

    public ArrayList<Person> getChildren() {
        return children;
    }

    public void setChildren(ArrayList<Person> children) {
        this.children = children;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

    public void setPets(ArrayList<Pet> pets) {
        this.pets = pets;
    }

    public void addParents(Person father, Person mother) {
        setFather(father);
        setMother(mother);
    }

    public void addChild(Person child) {
        if (children == null) {
            children = new ArrayList<Person>();
        }
        children.add(child);
    }

    public void addPet(Pet pet) {
        if (pets == null) {
            pets = new ArrayList<Pet>();
        }
        pets.add(pet);
    }

    public void addSibling(Person sibling) {
        if (siblings == null) {
            siblings = new ArrayList<Person>();
        }
        siblings.add(sibling);
    }

    public ArrayList<Person> getGrandChildren() {
        ArrayList<Person> temp = new ArrayList<>();
        if (children != null && children.size() > 0) {
            for (Person p : children) {
                ArrayList<Person> kids = p.getChildren();
                temp.addAll(kids);
            }
        }
        return temp;
    }

}
