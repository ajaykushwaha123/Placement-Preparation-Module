class MyQueue {
  private final Stack<Integer> values = new Stack<>();

    public void push(int x) {
        Stack<Integer> tmpValues = new Stack<>();

        //read all stored elements and put all in new stack in reverse order:
        // a) read from top to tail (where on top stored newest elements)
        // b) write all values in new order (where on top stored oldest elements)
        // * delete all readed values from stack
        while (!this.values.isEmpty()) {
            tmpValues.push(values.pop());
        }

        // add new value on the top on a stack (it will ne first value on stored stack)
        this.values.push(x);

        // Move all elements back from the tmp stack to the stored, where:
        // a) new value x will be on the tail of stored values
        // b) all stored values will store like FIFO
        while (!tmpValues.isEmpty()) {
            this.values.push(tmpValues.pop());
        }
    }

    public int pop() {
        return values.pop();
    }

    public int peek() {
        return values.peek();
    }

    public boolean empty() {
        return values.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */