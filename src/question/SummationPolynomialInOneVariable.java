package question;

import java.util.ArrayList;
import java.util.List;

import struct.Polynomial;

/**
 * question
 * ShiYanLou
 * 2018.04.13.下午4:27
 *
 * @author : rick
 */
public class SummationPolynomialInOneVariable {

    public static List<Polynomial> summationPolynomialInOneVariable(List<Polynomial> polynomial1,List<Polynomial> polynomial2){

        List<Polynomial> result = new ArrayList<>();

        int lenght1 = result.size(),
                lenght2 = result.size();

        int flag1 = 0,flag2 = 0;

        while (flag1 < lenght1 &&
                flag2 < lenght2){

            Polynomial temp = new Polynomial();

            if(polynomial1.get(flag1).getIndex() > polynomial2.get(flag2).getIndex()){

                temp = polynomial1.get(flag1);

                flag1 ++;
            } else if(polynomial1.get(flag1).getIndex() < polynomial2.get(flag2).getIndex()){
                temp = polynomial1.get(flag2);

                flag2 ++;
            } else {
                temp.setIndex(polynomial1.get(flag1).getIndex());
                temp.setRatio(polynomial1.get(flag1).getRatio() +polynomial2.get(flag2).getRatio());

                flag1 ++;
                flag2 ++;
            }

            result.add(temp);
        }


        if(flag1 == lenght1){

            for (int i = flag2; i < polynomial2.size(); i++) {
                result.add(polynomial2.get(i));
            }

        } else if(flag2 == lenght2){
            for (int i = flag1; i < polynomial1.size(); i++) {
                result.add(polynomial1.get(i));
            }
        }


        return result;
    }

}
