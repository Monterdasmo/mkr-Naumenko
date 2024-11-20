import java.util.ArrayList;
import java.util.List;

// Клас для представлення папок
public class Folder extends FileSystemElement {
    private List<FileSystemElement> elements; // Список елементів папки

    public Folder(String name) {
        super(name);
        elements = new ArrayList<>();
    }

    // Додавання елементів до папки
    public void addElement(FileSystemElement element) {
        elements.add(element);
    }

    // Видалення елементів з папки
    public void removeElement(FileSystemElement element) {
        elements.remove(element);
    }

    // Геттер для доступу до елементів папки
    public List<FileSystemElement> getElements() {
        return elements;
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "+ " + name);
        for (FileSystemElement element : elements) {
            element.display(indent + "  ");
        }
    }

    @Override
    public int getSize() {
        int totalSize = 0;
        for (FileSystemElement element : elements) {
            totalSize += element.getSize();
        }
        return totalSize;
    }

    @Override
    public void delete() {
        System.out.println("Deleting folder: " + name);
        for (FileSystemElement element : elements) {
            element.delete();
        }
    }
}
