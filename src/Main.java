import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = getAnimals();
        // Old approach
        List<Animal> predators = new ArrayList<>();
        for (Animal animal : animals) {
            if (animal.getClassification().equals(Classification.PREDATOR)) {
                predators.add(animal);
            }
        }
        predators.forEach(System.out::println);
        System.out.println();

        // Approach using streams

        //Filter
        List<Animal> predators1 =
                animals.stream()
                        .filter(animal -> animal.getClassification().equals(Classification.PREDATOR))
                        .collect(Collectors.toList());
        predators1.forEach(System.out::println);
        System.out.println();

        //Sort
        List<Animal> sortedPredators =
                animals.stream()
                        .filter(animal -> Objects.equals(animal.getClassification(), Classification.PREDATOR))
                        .sorted(Comparator.comparing(Animal::getAge))
                        .collect(Collectors.toList());
        sortedPredators.forEach(System.out::println);
        System.out.println();

        //All match
        boolean allMatch = animals.stream()
                .allMatch(animal -> animal.getAge() > 10);
        System.out.println(allMatch);
        System.out.println();

        //Any match
        boolean anyMatch = animals.stream()
                .anyMatch(animal -> animal.getName().equals("���"));
        System.out.println(anyMatch);
        System.out.println();

        //None match
        boolean noneMatch = animals.stream()
                .noneMatch(animal -> animal.getClassification().equals(Classification.OMNIVOROUS));
        System.out.println(noneMatch);
        System.out.println();

        //Max
        animals.stream()
                .max(Comparator.comparing(Animal::getAge))
                .ifPresent((System.out::println));
        System.out.println();

        //Min
        animals.stream()
                .min(Comparator.comparing(Animal::getAge))
                .ifPresent((System.out::println));
        System.out.println();

        //Group
        Map<Classification, List<Animal>> collect = animals.stream()
                .collect(Collectors.groupingBy(Animal::getClassification));
        collect.forEach((classification, animals1) -> {
            System.out.println(classification);
            animals1.forEach(System.out::println);
            System.out.println();
        });

        //Name of oldest predator
       Optional<String> oldestPredator = animals.stream()
                .filter(animal -> animal.getClassification().equals(Classification.PREDATOR))
                .max(Comparator.comparing(Animal::getAge))
                .map(Animal::getName);
        oldestPredator.ifPresent(System.out::println);
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
                new Animal("��������", 200, Classification.PREDATOR)
        );
    }
}
