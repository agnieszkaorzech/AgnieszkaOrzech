package AgnieszkaOrzech;

public class AppInheritance2 {

    public static void main (String [] args) {
        Shape2[] shapes2 = new Shape2[2];

        shapes2[0] = new Circle2(2.5);
        shapes2[1] = new Rectangle2(3,5);

        for (Shape2 sh: shapes2)
            System.out.println (sh.napisz2()+ " with area =" + sh.area2());
    }
}

