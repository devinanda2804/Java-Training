//Program showing methods to print exception information

import java.util.*;
import java.io.*;
class EH{
    public static void main(String[] args){
        int a=5;
        int b=0;
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }
    }
}
