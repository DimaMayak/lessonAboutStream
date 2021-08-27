import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    private static List<Animal> getAnimals() {
        return (List<Animal>) List.of(
                new Animal("Слон", 20, Classification.HERBIVORE),
                new Animal("Лев", 10, Classification.PREDATOR),
                new Animal("Гиена", 11, Classification.PREDATOR),
                new Animal("Жираф", 7, Classification.HERBIVORE),
                new Animal("Гибон", 35, Classification.OMNIVOROUS),
                new Animal("Лошадь", 36, Classification.HERBIVORE),
                new Animal("Рысь", 2, Classification.PREDATOR),
                new Animal("Динозавр",200,Classification.PREDATOR)
                );
    }
}
