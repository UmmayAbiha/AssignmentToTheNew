//Question3


package com.example.StackImplement;

import java.util.Stack;

class SpecialStack extends Stack<Integer> {
    Stack<Integer> min = new Stack<>();

    void push(int x)
    {
        if (isEmpty() == true) {
            super.push(x);
            min.push(x);
        }
        else {
            super.push(x);
            int y = min.pop();
            min.push(y);
            if (x < y)
                min.push(x);
            else
                min.push(y);
        }
    }

    public Integer pop()
    {
        int x = super.pop();
        min.pop();
        return x;
    }

    int getMin()
    {
        int x = min.pop();
        min.push(x);
        return x;
    }

    public static void main(String[] args)
    {
        SpecialStack stk = new SpecialStack();
        stk.push(30);
        stk.push(80);
        stk.push(60);
        stk.push(4);
        System.out.println(stk.getMin());
        stk.push(9);
        System.out.println(stk.getMin());
    }
}

