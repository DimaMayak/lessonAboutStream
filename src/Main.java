import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    private static List<Animal> getAnimals() {
        return (List<Animal>) List.of(
                new Animal("����", 20, Classification.HERBIVORE),
                new Animal("���", 10, Classification.PREDATOR),
                new Animal("�����", 11, Classification.PREDATOR),
                new Animal("�����", 7, Classification.HERBIVORE),
                new Animal("�����", 35, Classification.OMNIVOROUS),
                new Animal("������", 36, Classification.HERBIVORE),
                new Animal("����", 2, Classification.PREDATOR),
                new Animal("��������",200,Classification.PREDATOR)
                );
    }
}
