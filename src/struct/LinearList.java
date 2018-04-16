package struct;

/**
 * struct
 * ShiYanLou
 * 2018.04.13.下午1:49
 *
 * @author : rick
 */
public class LinearList {

    public static final int OK = 0;


    public static Cell initList(){

        return new Cell();
    }



    private int DestroyList(Cell c) {
        c = null;
        return OK;
    }



}