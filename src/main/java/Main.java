/**
 * Start up class for the project
 */
public class Main {
    public static void main(String[] args) {
        Pet kitty = new Pet("Garfield", 2, "RedHairKat");
        Person jan = new Person("Jan", "Janssen", Sex.MALE, 23);

        jan.addPet(kitty);

        System.out.println(jan.getLastName());
        for (Pet p: jan.getPets()) {
            System.out.println(p.getName());
        }
    }
}
