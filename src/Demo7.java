import java.io.*;
import java.io.*;
class Box{
    int length;
    int breadth;
    /* @param l The length of the box.
            * @param b The breadth of the box.
            */
    Box(int l,int b){
        this.length=l;
        this.breadth=b;
    }
    Box(){
        length=breadth=0;
    }
/*
        * @return The area of the box, which is length * breadth.
     */

    int area(){
        return length*breadth;
    }

}
class Demo7{
    public static void main(String[] args){
        Box obj=new Box(10,20);
        Box obj1=new Box();
        int area;
        area=obj.area();
        System.out.println(area);
        area=obj1.area();
        System.out.println(area);
    }
}