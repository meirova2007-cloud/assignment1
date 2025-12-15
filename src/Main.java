public class Main {
    public static void main(String[] args) {
        Shelter shelter = new Shelter("Happy Paws Shelter", "Astana");
        shelter.showShelterInfo();
        Pet pet1 = new Pet(1, "Buddy", "Dog", 3);
        Pet pet2 = new Pet(2, "Misty", "Cat", 2);
        pet1.displayInfo();
        pet2.displayInfo();
        Adopter adopter = new Adopter(101, "Zhansaya Armanovna", "+7 700 123 45 67");
        adopter.adoptPet(pet1);
        pet1.displayInfo();
        pet2.displayInfo();
        System.out.println("Are pets same age? " + (pet1.getAge() == pet2.getAge()));
    }
}