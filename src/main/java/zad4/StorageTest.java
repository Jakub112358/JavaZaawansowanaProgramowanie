package zad4;

public class StorageTest {
    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.addToStorage("1","mohito");
        storage.addToStorage("1","vodka");
        storage.addToStorage("2","beer");
        storage.addToStorage("2","wine");
        storage.addToStorage("3","beer");
        storage.addToStorage("4","gin");
        storage.printValues("1");
        storage.printValues("8");
        storage.findValues("beer");
        storage.findValues("mead");
    }
}
