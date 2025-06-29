public class Main {
    public static void main(String[] args) {
        MyList<Integer> liste = new MyList<>();
        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());

        liste.add(20);
        liste.add(30);
        liste.add(40);
        liste.add(50);

        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());

        liste.add(60);
        liste.add(70);
        liste.add(80);
        liste.add(90);
        liste.add(100);
        liste.add(110);
        liste.add(120);

        System.out.println("Dizideki Eleman Sayısı : " + liste.size());
        System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
    }
}

class MyList<T> {
    private T[] array;
    private int size;

    @SuppressWarnings("unchecked")
    public MyList() {
        array = (T[]) new Object[10];
        size = 0;
    }

    @SuppressWarnings("unchecked")
    public MyList(int capacity) {
        array = (T[]) new Object[capacity];
        size = 0;
    }

    public void add(T data) {
        if (size == array.length) {
            resize();
        }
        array[size++] = data;
    }

    @SuppressWarnings("unchecked")
    private void resize() {
        T[] temp = (T[]) new Object[array.length * 2];
        System.arraycopy(array, 0, temp, 0, array.length);
        array = temp;
    }

    public int size() {
        return size;
    }

    public int getCapacity() {
        return array.length;
    }
}
