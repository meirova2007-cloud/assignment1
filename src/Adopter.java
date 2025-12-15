public class Adopter {
    private int adopterId;
    private String fullName;
    private String phoneNumber;
    public Adopter(int adopterId, String fullName, String phoneNumber) {
        this.adopterId = adopterId;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
    }
    public int getAdopterId() {
        return adopterId;
    }
    public String getFullName() {
        return fullName;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void adoptPet(Pet pet) {
        if (!pet.isAdopted()) {
            pet.setAdopted(true);
            System.out.println(fullName + " adopted " + pet.getName());
        } else {
            System.out.println("Pet is already adopted.");
        }
    }
}
