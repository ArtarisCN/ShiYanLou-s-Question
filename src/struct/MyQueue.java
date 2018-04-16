package struct;

import java.util.Stack;

/**
 * struct
 * ShiYanLou's Question
 * 2018.04.16.下午3:23
 *
 * @author : rick
 */
public class MyQueue {

    private Stack<Integer> firstStack = new Stack<>(),secondStack = new Stack<>();


    public MyQueue push(int item){

        firstStack.push(item);

        return this;
    }


    public int pop(){

        if(firstStack.isEmpty() && secondStack.isEmpty()){
            return -23333;
        }


        int item;

        if(secondStack.isEmpty()){

            while (!firstStack.isEmpty()){
                secondStack.push(firstStack.pop());
            }



        }

        item = secondStack.pop();

        return item;

    }

    public void print(){

        for (int i = secondStack.size() - 1; i >= 0; i--) {
            System.out.println(secondStack.get(i));
        }

        for (Integer integer : firstStack) {
            System.out.println(integer);
        }

    }

}
