import java.util.Arrays;
import java.util.Random;

public class MagicBox<T> {
    protected T[] boxItems;
    protected int boxSize;

    public MagicBox(int BoxSize) {
        this.boxSize = BoxSize;
        this.boxItems = (T[]) new Object[BoxSize];
    }

    public void getBoxItems() {
        System.out.println("В коробке:");
        System.out.println(Arrays.toString(this.boxItems));
    }

    public boolean add(T item) {
        for (int i = 0; i < this.boxItems.length; ++i) {
            if (this.boxItems[i] == null) {
                this.boxItems[i] = item;
                return true;
            }
        }

        return false;
    }

    public T pick() {
        int notFilled;
        for (int i = 0; i < this.boxItems.length; ++i) {
            if (this.boxItems[i] == null) {
                notFilled = this.boxItems.length - i;
                throw new BoxException(notFilled);
            }
        }

        Random random = new Random();
        notFilled = random.nextInt(this.boxSize);
        System.out.println("Random number: " + notFilled);
        System.out.println("Result:");
        return this.boxItems[notFilled];
    }
}
