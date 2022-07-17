package com.bridgelabz.line.comparison;

import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation");
        Point point1 = new Point(1,2);
        Point point2 = new Point(4,3);

        Line line1=new Line(point1,point2);
        double line1Len=line1.getLength();

        System.out.println(line1Len);


        Point point3 = new Point(2,1);
        Point point4 = new Point(3,4);

        Line line2 = new Line(point3,point4);
        double line2Len=line2.getLength();

        System.out.println(line2Len);



        if(line2.equals(line1))
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not Equal");
        }
    }
}
