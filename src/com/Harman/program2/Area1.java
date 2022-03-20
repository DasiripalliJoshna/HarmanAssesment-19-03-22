package com.Harman.program2;

public class Area1 {

    abstract class Shape {

        abstract void RectangleArea(int a , int b);
        abstract void SquareArea(int b);
        abstract void CircleArea(int a);

    }
    class Area extends Shape{
        void RectangleArea(int a, int b){
            System.out.println(" area of the rectangle  :"+(a*b));
        }
        void SquareArea(int s){
            System.out.println(" area of the square  :"+(s*s));
        }
        void CircleArea(int r){
            System.out.println(" area of the square  :"+(3.14*r*r));
        }

        public static void main(String[] args) {
            Shape obj=new Area1();
            int a=7,b=9;
            obj.RectangleArea(a,b);
            obj.CircleArea(a);
            obj.SquareArea(b);
        }
    }
}
