public class Pet {
    private int id;
    private String name;
    private String type;
    private int age;
    private boolean adopted;
    public Pet(int id, String name, String type, int age) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.age = age;
        this.adopted = false;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getType() {
        return type;
    }
    public int getAge() {
        return age;
    }
    public boolean isAdopted() {
        return adopted;
    }
    public void setAdopted(boolean adopted) {
        this.adopted = adopted;
    }
    public void displayInfo() {
        System.out.println("Pet ID: " + id +
                ", Name: " + name +
                ", Type: " + type +
                ", Age: " + age +
                ", Adopted: " + adopted);
    }
}
