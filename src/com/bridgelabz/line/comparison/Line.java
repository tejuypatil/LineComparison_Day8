package com.bridgelabz.line.comparison;

public class Line {
    Point point1;
    Point point2;

    Line(Point point1,Point point2)
    {
        this.point1 = point1;
        this.point2 = point2;
    }

    public boolean equals(Line line2)
    {
        if(this.getLength() == line2.getLength())
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    public double getLength()
    {
        double length =Math.sqrt(
                Math.pow( (point2.x - point1.x),2)  +
                Math.pow( (point2.y - point1.y),2)   );
        return length;
    }
}
