//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Shape shape=new Shape();
        shape.setColor("green"); shape.setFilled(false);

        Rectangle r1=new Rectangle(4,3,"blue",false);
        Rectangle r2=new Rectangle(5,3,"green",true);


        Circle c1=new Circle("purple",false,3);
        Circle c2=new Circle("red",false,4);


        Square q1=new Square(5,2,"orange",true,5);
        Square q2=new Square(3,3,"red",true,3);
        Square q3=new Square(2,3,"yellow",true,4);


//print the shape-------------------------------------------------------------------------------------------------------
        System.out.println(shape.toString());
//        System.out.println(c1.toString());

//print Recrangle ------------------------------------------------------------------------------------------------------
        System.out.println(r1.toString());
//        System.out.println(r2.toString());


 //print Circles ------------------------------------------------------------------------------------------------------
        System.out.println(c1.toString());
//        System.out.println(c2.toString());



 //print Square ------------------------------------------------------------------------------------------------------
        System.out.println(q1.toString());
//          System.out.println(q2.toString());
//        System.out.println(q3.toString());



    }
}