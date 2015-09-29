package AgnieszkaOrzech.task1;


public class Tree {

    String outstr;
    private int rr;
    String jj;

    public Tree(int r, String j) {
        rr = r;
        jj = j;
        outstr = "A " + j + " " + r + "m";
    }
    public Tree(int r) {
        rr = r;
        outstr = "A tree of " + r + "m";
    }
    public Tree() {
        outstr = "A tree";
    }
    public Tree(String j) {
        jj = j;
        outstr = "An " + j;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (jj=="Oak")
            sb.append("An ");
        else
            sb.append("A ");
        if (jj == null)
            sb.append("tree");
        else
            sb.append(jj);

        if (rr > 0)
            sb.append(" has ").append(rr).append(" metros");
        return sb.toString();
    }
    //public String toString(){
    // return outstr;
    //}
    //public int getR(){
    // return rr;
    // }
    ///public String getJ(){
    //return jj;
    //}

}
