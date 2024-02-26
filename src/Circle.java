public class Circle extends Shape{
    private double radius;

    public Circle(){}
    public Circle(double radius){
    this.radius=radius;
    }
    public Circle (String color,boolean filled,double radius){
        super(color, filled);
        this.radius=radius;
    }



    public double getRadius() {

        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return  3.14*(radius*radius);
    }
    public double getParameter(){
        return  3.14*radius*2;
    }

//    public String toString(){
//        return "the area of circle is \t"+getArea();
//    }

    @Override
    public String toString() {
        return "A circle with radius= "+radius+" the Area=  "+getArea()+"  and the Parameter = "+getParameter()+", which is subclass of " +super.toString();
    }
}
