// Клас для представлення файлів
public class File extends FileSystemElement {
    private int size; // Розмір файлу

    public File(String name, int size) {
        super(name);
        this.size = size;
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + "- " + name + " (" + size + " bytes)");
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void delete() {
        System.out.println("Deleting file: " + name);
    }
}
