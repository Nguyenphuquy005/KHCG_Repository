import java.util.Arrays;

public class MyArarryList<E> {
    // Số lượng pt có trong MyArr
    private int size = 0;
    // Sức chứa
    public static final int DEAFAULT_CAPACITY = 10;
    // mảng chứa
    Object elements[];

    // Sức chứa mặc định..contructor không tham số
    public MyArarryList() {
        elements = new Object[DEAFAULT_CAPACITY];
    }

    // contructor có tham số , lấy swucs chứa là capacity
    public MyArarryList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("capacity:" + capacity + "có vấn đề");
        }
    }

    // phương thức trả về số luowngj pt
    public int size() {
        return this.size;
    }

    // pt clear 1 arr list
    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    /**
     * pt add
     *
     * @param element
     * @return
     */
    public boolean add(E element) throws IllegalAccessException {
        if (elements.length == size){
            this.ensureCapacity(5);
        }
        elements[size] = element;
        size++;
        return true;
    }

    public void delete(int index) throws IllegalAccessException {
        if (index > elements.length) {
            throw new IllegalAccessException("Index: " + index);
        } else {
            for (int i = index; i < elements.length - 1; i++) {
                elements[i] = elements[i + 1];
            }
            size--;
        }
    }

    public void add(E element, int index) throws IllegalAccessException {
        if (index > elements.length) {
            throw new IllegalAccessException("index: " + index);
        } else if (elements.length == size) {
            this.ensureCapacity(5);
        }
        if (elements[index] == null) {
            elements[index] = element;
            size++;
        } else {
            for (int i = size + 1; i >= index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }
    }

    public MyArarryList Clone() throws IllegalAccessException {
        MyArarryList<Object> listS = new MyArarryList<>();
        for (Object item : elements) {
                listS.add(item);
        }
        return listS;
    }

    /**
     * pt tăng kt arr
     *
     * @param minCapacity
     * @throws IllegalAccessException
     */

    public void ensureCapacity(int minCapacity) throws IllegalAccessException {
        if (minCapacity >= 0) {
            int newsize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newsize);
        } else {
            throw new IllegalAccessException("newcapcity: " + minCapacity + "vô lý vậy");
        }
    }

    public  E get(int index) {
        return (E) this.elements[index];
    }

}
