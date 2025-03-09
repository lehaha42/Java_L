public class GenericStack<E> {
    private Object arr[] = (E[]) new Object[10];
    private int maxSize = 10, size = 0;
    
    public int getSize() {
        return size;
    }
    
    public E peek() {
        return (E) arr[size - 1];
    }
    
    public void push(E o) {
        if (size >= maxSize - 1){
            maxSize *= 2;
            E newArr[] = (E[]) new Object[maxSize];
            for (int i = 0; i<size; i++) newArr[i] = (E)arr[i];
            arr = newArr;
        }
        arr[size] = o;
        size++;
    }
    
    public E pop() {
        E o = (E)arr[size - 1];
        size--;
        return o;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        String s = "стек: [";
        for (int i = 0; i < size; i++){
            s += arr[i];
            if (i != size-1) s+=", ";
        }
        s += "]";
        return s;
    }
}
