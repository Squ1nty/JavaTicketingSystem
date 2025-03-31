package src;

public abstract class Manager<T> {
    // necessary instance variables and methods

    public abstract T[] getAll();

    public abstract boolean book(T item, int qty, boolean online);

    public abstract T[] getBookedItems();

    public abstract boolean removeBookedItem(T item);
}