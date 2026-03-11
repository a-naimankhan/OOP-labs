package lab2.task1.TaskA;

public class App {
    static void main(String args[] ) {
        runApp();
    }

    public static void runApp() {

        Shape3D sph = new Sphere(4);
        Shape3D cub = new Cube(5);
        Shape3D cyl = new Cylinder(5 , 5);

        System.out.println(sph.Volume() + " " + sph.SurfaceArea());

        System.out.println(cub.Volume() + " " + cub.SurfaceArea());


        System.out.println(cyl.Volume() + " " + cyl.SurfaceArea());
    }


}


