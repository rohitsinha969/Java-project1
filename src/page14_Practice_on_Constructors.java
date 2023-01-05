import java.util.Scanner;

class cylinder {
    private double radius_of_cylinder;
    private double height_of_cylinder;

    public double getRadius_of_cylinder() {
        return radius_of_cylinder;
    }// getter

    public void setRadius_of_cylinder(double d) {
        this.radius_of_cylinder = d;
    }// setter

    public double getHeight_of_cylinder() {
        return height_of_cylinder;
    }// getter

    public void setHeight_of_cylinder(double d) {
        this.height_of_cylinder = d;
    }// setter

    public double volume_of_cylinder() {
        return (Math.PI * height_of_cylinder * radius_of_cylinder * radius_of_cylinder);
    }

    public double surface_area_of_cylinder() {
        return (2 * Math.PI * height_of_cylinder * radius_of_cylinder
                + 2 * Math.PI * Math.pow(radius_of_cylinder, 2));
    }

    public double lateral_surface_area_of_cylinder() {
        return (2 * Math.PI * height_of_cylinder * radius_of_cylinder);
    }
}

public class page14_Practice_on_Constructors {
    public static void main(String[] args) {
        cylinder myCylinder = new cylinder();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Height of Cylinder");
        myCylinder.setHeight_of_cylinder(scan.nextDouble());
        System.out.println("Enter Radius of Cylinder");
        myCylinder.setRadius_of_cylinder(scan.nextDouble());
        System.out.println("Volume of Cylinder");
        System.out.println(myCylinder.volume_of_cylinder());
        System.out.println("Total Surface Area of Cylinder");
        System.out.println(myCylinder.surface_area_of_cylinder());
        System.out.println("Lateral Surface Area of Cylinder");
        System.out.println(myCylinder.lateral_surface_area_of_cylinder());
        scan.close();
    }
}
