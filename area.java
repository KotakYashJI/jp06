class areaofcircle
{
    double length;
    double breadth;

   void setDim(double len,double bread)
    {
        length = len;
        breadth = bread;
    }
    double getArea()
    {
        return length*breadth;
    }
}
public class area 
{
    public static void main(String args[])
    {
        areaofcircle area = new areaofcircle();
        area.setDim(3.5,4.5);
        System.out.println("area of circle : "+area.getArea());
    }    
}
