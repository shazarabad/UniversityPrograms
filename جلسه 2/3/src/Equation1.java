public class Equation1 {
    double a,b,e;
    double c,d,f;

    public void Solve(){
        double r = a*d - b*c;
        if (r ==0){
            System.out.println("Cant Solve");
        }
        else {
            double x= (e*d - b*f)/r;
            double y= (a*f - e*c)/r;

            System.out.println("x= " + x +"y= "+ y);
        }
    }
}
