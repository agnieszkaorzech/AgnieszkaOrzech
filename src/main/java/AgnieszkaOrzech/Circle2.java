package AgnieszkaOrzech;
public class Circle2 extends ShapeString   {
    double area2;
    double r;
    String info;

    public double area2() {
        return area2=Math.PI*2*r;
    }
    public Circle2(double r){
        this.r=r;
    }
    @Override
    public String napisz2(){
        return "I am circle";
    }


}