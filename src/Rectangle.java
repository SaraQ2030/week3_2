public class Rectangle extends Shape {

    private double width;
    private double length;

    public Rectangle(){}

    public Rectangle (double width,double length,String color,boolean filled){
        super(color,filled);
        this.length=length;
        this.width=width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
       return length*width;
    }



public String toString(){
        return "the Rectangle with width = "+width+"  and length = "+length+"  the Area = "+getArea()+" ,which is subclass of "+super.toString();

    }
}
