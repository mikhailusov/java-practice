# java-practice
☕️  x 🧠  Algorithms and data structures implementations in Java

Algorithms
-

Data Structures
-
### MinStack
[java implementation](./data-structures/MinStack.java)

Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

* push(x) -- Push element x onto stack.
* pop() -- Removes the element on top of the stack.
* top() -- Get the top element.
* getMin() -- Retrieve the minimum element in the stack.

**Example:**
```
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> Returns -3
minStack.pop();
minStack.top();      --> Returns 0
minStack.getMin();   --> Returns -2
```