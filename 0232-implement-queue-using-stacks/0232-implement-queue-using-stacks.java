class MyQueue {

    Stack<Integer> i = new Stack();
    Stack<Integer> o = new Stack();

    public void push(int x) {
        i.push(x);
    }

    public int pop() {
        peek();
        return o.pop();
    }

    public int peek() {
        if (o.empty())
            while (!i.empty())
                o.push(i.pop());
        return o.peek();
    }

    public boolean empty() {
        return i.empty() && o.empty();
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