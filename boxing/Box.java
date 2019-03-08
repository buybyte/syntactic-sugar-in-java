/**
 * Generic version of the Box class.
 * @param <T> the type of the value being boxed
 */
public class Box<T> {
    // T stands for "Type"
    private T t;

    public void set(T t) { this.t = t; }
    public T get() { return t; }


    public static void main(String[] args) {
        Box<Integer> box = new Box<Integer>();
        box.set(1);
        System.out.println(box.get() + 1);
    }
}