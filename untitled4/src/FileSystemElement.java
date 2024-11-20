// Абстрактний клас для файлів та папок
public abstract class FileSystemElement {
    protected String name;

    public FileSystemElement(String name) {
        this.name = name;
    }

    // Метод для виведення структури
    public abstract void display(String indent);

    // Метод для обчислення загального розміру
    public abstract int getSize();

    // Метод для видалення елемента
    public abstract void delete();

    public String getName() {
        return name;
    }
}
