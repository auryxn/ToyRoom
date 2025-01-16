import java.util.Arrays;

//здесь просто выводит все, я только сейчас посмотрел что это пункт




class ToyRoom {
    public static void displayToys(Toy[] toys) {
        System.out.println("Игрушки, отсортированные по категории:");
        Arrays.sort(toys, (a, b) -> a.getCategory().compareTo(b.getCategory()));
        for (Toy toy : toys) {
            System.out.println(toy);
        }
    }

    public static void displayZones() {
        System.out.println("\nРаспределение игрушек по зоне:");
        System.out.println("Левая часть комнаты — активные игры (мячи, машины).");
        System.out.println("Правая часть комнаты — ролевые игры (куклы).");
        System.out.println("Центр комнаты — зона строительства (кубики).");
    }

    public static void checkConvenience() {
        System.out.println("\nПроверка удобства:");
        System.out.println("Полки и ящики должны быть на уровне роста детей.");
        System.out.println("Сортировка должна быть очевидной и удобной для уборки.");
    }
}