class MyQueue {
  private final Stack<Integer> values = new Stack<>();

    public void push(int x) {
        Stack<Integer> tmpValues = new Stack<>();

        
        while (!this.values.isEmpty()) {
            tmpValues.push(values.pop());
        }

        
        this.values.push(x);
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