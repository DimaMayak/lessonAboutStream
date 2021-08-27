public class Animal {
    private final String name;
    private final int age;
    private final Classification classification;


    public Animal(String name, int age, Classification classification) {
        this.name = name;
        this.age = age;
        this.classification = classification;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Classification getClassification() {
        return classification;
    }
}
