abstract class shape{
    abstract void numberOfSides();
}
class rectangle extends shape{
    void numberOfSides(){
        int sides=4;
        System.out.println(" The number of sides of a rectangle are:"+sides);
    }
}
class triangle extends shape{
    void numberOfSides(){
        int sides=3;
        System.out.println("The number of sides of a trianlge are:"+sides);
    }
}
class hexagon extends shape{
    void numberOfSides(){
        int sides=6;
        System.out.println("The number of  sides of an hexagon is:"+sides);
    }
}

public class shapes {
    public static void main(String args[]){
        shape s=new rectangle();
        shape t=new triangle();
        shape h=new hexagon();
        s.numberOfSides();
        t.numberOfSides();
        h.numberOfSides();


    }
    
}
