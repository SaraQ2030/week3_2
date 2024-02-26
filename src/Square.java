public class Square extends Rectangle{
private double side;

    public Square(double width,double length, String color,boolean filled,double side){
        super(width,length,color,filled);
        this.side=width;
    }
    public void setSide(double side){
        this.side=super.getWidth();
    }
public double getSide(){
        return side*side;
}


    public String toString(){
        return "the Square with side = "+side+" The area = "+getSide()+"  which is subclass of "+super.toString();
    }


}
