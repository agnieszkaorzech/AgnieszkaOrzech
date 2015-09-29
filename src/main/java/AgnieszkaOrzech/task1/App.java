package AgnieszkaOrzech.task1;
public class App {
    public static void main(String args[]) {

        Tree[] trees = new Tree[4];

        trees[0] = new Tree(4);
        trees[1] = new Tree("Oak");
        trees[2] = new Tree();
        trees[3] = new Tree(5, "Pine");

        for (Tree t : trees)
            System.out.println(t);

        //System.out.println("The tree of "+ sb.append()+"m");
        //System.out.println("The tree of "+trees[1].getJ()+"m");
        //System.out.println("The tree of "+trees[2].getR()+"m");
        //System.out.println("The tree of "+trees[3].getR()+"m");



    }
}
