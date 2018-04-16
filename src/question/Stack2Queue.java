package question;

import struct.MyQueue;

/**
 * question
 * ShiYanLou's Question
 * 2018.04.16.下午3:22
 *
 * @author : rick
 */
public class Stack2Queue {

    public static void main(String[] args) {

        MyQueue queue = new MyQueue();

        queue.push(0);
        queue.print();
        System.out.println("===============");

        queue.push(1);
        queue.print();
        System.out.println("===============");


        queue.push(2);
        queue.print();
        System.out.println("===============");


        queue.push(3);
        queue.print();
        System.out.println("===============");


        queue.push(4);
        queue.print();
        System.out.println("===============");


        queue.push(5);
        queue.print();
        System.out.println("===============");


        System.out.println("queue.pop() = " + queue.pop());
        queue.print();
        System.out.println("===============");

        System.out.println("queue.pop() = " + queue.pop());
        queue.print();
        System.out.println("===============");

        System.out.println("queue.pop() = " + queue.pop());
        queue.print();
        System.out.println("===============");

        System.out.println("queue.pop() = " + queue.pop());
        queue.print();
        System.out.println("===============");

        System.out.println("queue.pop() = " + queue.pop());
        queue.print();
        System.out.println("===============");
    }
}
