package question;

import java.util.Stack;

/**
 * question
 * ShiYanLou
 * 2018.04.16.上午10:38
 *
 * @author : rick
 */
public class Decimal2Binary {



    public static void main(String[] args) {

        Stack<Integer>  binary = decimal2Binary(33);

        while (!binary.empty()){

            System.out.print(binary.pop());
        }
    }

    private static Stack<Integer> decimal2Binary(int input){

        Stack<Integer>  binary = new Stack<>();

        int x,temp = input;

        do {

            x = temp % 2;

            binary.push(x);
            temp = temp / 2;

            if (temp == 0 || temp == 1) {
                binary.push(temp);
                break;
            }
        } while (true);

        return binary;
    }

}
