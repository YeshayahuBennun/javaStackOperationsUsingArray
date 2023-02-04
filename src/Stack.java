public class Stack {
    public int[] arr;
    public int topOfStack;

    public Stack(int size) {
        this.arr = new int[size];
        this.topOfStack = -1;
        //System.out.println("Stack is created with size:" + size);
    }

    //isEmpty
    public boolean isEmpty() {
        return topOfStack == -1;
    }

    //isFull
    public boolean isFull() {
        return topOfStack == arr.length - 1;
    }

    //Push
    public void push(int value) {
        if (isFull()) {
            System.out.println("The Stack is full");
        } else {
            arr[topOfStack + 1] = value;
            topOfStack++;
            System.out.println("The value is successfully inserted");
        }
    }

    //Pop
    public int pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            return -1;
        } else {
            int topStack = arr[topOfStack];
            topOfStack--;
            return topStack;
        }
    }

    //Peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            return -1;
        } else {
            return arr[topOfStack];
        }
    }

    //Delete
    public void delete(){
        arr = null;
        System.out.println("The stack was successfully deleted");
    }
}
