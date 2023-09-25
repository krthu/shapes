public class Triangle extends Shape {

    public Triangle(double height, double width){
        super(height, width);
    }
    @Override
    public double getArea(){
        return (super.getArea()/2);
    }

}
