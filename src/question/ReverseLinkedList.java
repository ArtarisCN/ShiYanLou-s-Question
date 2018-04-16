package question;

import struct.LinkedStruct;

/**
 * question
 * ShiYanLou
 * 2018.04.13.下午4:53
 *
 * @author : rick
 */
public class ReverseLinkedList {

    public static void main(String[] args) {

        LinkedStruct linked,index;

        linked = new LinkedStruct();
        linked.setIndex(0);

        index = linked;

        for (int i = 1; i <= 100; i++) {

            LinkedStruct temp = new LinkedStruct();


            temp.setIndex(i);

            index.setNext(temp);

            index = temp;

        }

        index = linked;

        while (index.getNext() != null){


            System.out.println("index = " + index.getIndex());

            index = index.getNext();
        }

        System.out.println("=================");

        index = ReverseLinkedList.reverseLinkedList(linked);

        while (index != null){


            System.out.println("index = " + index.getIndex());

            index = index.getNext();
        }
    }

    public static LinkedStruct reverseLinkedList(LinkedStruct linked){

        LinkedStruct temp,result = null;

        LinkedStruct x = linked;

        while (x.getNext() != null){

            temp = result;

            result = x;

            x = x.getNext();

            result.setNext(temp);

        }

        return result;
    }

}
