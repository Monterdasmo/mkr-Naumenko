public class Main {
    public static void main(String[] args) {
        // 1. Створення кореневої папки
        Folder root = new Folder("Root");
        root.addElement(new File("File1.txt", 120)); // Додаємо файл
        root.addElement(new File("File2.txt", 200)); // Додаємо ще один файл

        // 2. Додавання підпапки
        Folder subFolder = new Folder("SubFolder");
        subFolder.addElement(new File("SubFile1.txt", 300)); // Додаємо файл у підпапку
        subFolder.addElement(new File("SubFile2.txt", 150)); // Ще один файл у підпапку

        // 3. Додавання вкладеної папки у підпапку
        Folder nestedFolder = new Folder("NestedFolder");
        nestedFolder.addElement(new File("NestedFile.txt", 400)); // Файл у вкладеній папці
        subFolder.addElement(nestedFolder);

        root.addElement(subFolder); // Додаємо підпапку до кореневої папки

        // 4. Виведення структури файлової системи
        System.out.println("Initial Directory Structure:");
        root.display("");

        // 5. Обчислення загального розміру кореневої папки
        System.out.println("\nTotal Size of Root Folder: " + root.getSize() + " bytes");

        // 6. Перейменування файлу
        System.out.println("\nRenaming SubFile1.txt to RenamedFile.txt...");
        subFolder.removeElement(subFolder.getElements().get(0)); // Видаляємо старий файл
        subFolder.addElement(new File("RenamedFile.txt", 300)); // Додаємо новий з новим іменем

        // 7. Видалення файлу
        System.out.println("\nDeleting File2.txt...");
        root.removeElement(root.getElements().get(1)); // Видаляємо файл з кореневої папки

        // 8. Повторне виведення структури
        System.out.println("\nUpdated Directory Structure:");
        root.display("");

        // 9. Повторний розрахунок розміру
        System.out.println("\nUpdated Total Size of Root Folder: " + root.getSize() + " bytes");
    }
}
