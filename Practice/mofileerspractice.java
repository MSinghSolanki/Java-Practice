package Practice;



class Cylinder{
    private int radius;
    private int height;
    private double length;
    private double breadth;


    public Cylinder(int radius,int height){

        this.radius=radius;
        this.height=height;

    }
    public Cylinder(double length,double breadth){

        this.length=length;
        this.breadth=breadth;

    }

    public double SurfaceArea(){
        return 2*Math.PI*radius*height;

    }
    public double Volume(){
        return Math.PI*radius*height;
    }
    public int getRadius(){
        return radius;
    }

    public void setRadius(int r){
        radius=r;
    }
    public int getHeight(){
        return height;
    }

    public void setHeight(int h){
        height=h;
    }
}

public class mofileerspractice {

    public static void main(String[] args) {

        Cylinder c = new Cylinder(12,9);
        // c.setRadius(12);
        // c.setHeight(9);
        System.out.println(c.getHeight());
        System.out.println(c.getRadius());
      System.out.println( c.SurfaceArea()); 
      System.out.println( c.Volume()); 
        
    }
    
}
