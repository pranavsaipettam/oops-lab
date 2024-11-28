public class Demo {

    // Abstract Figure class
    abstract class Figure {
        // Attributes
        protected double r, a, v;
        protected final double pi = 3.1428; // Constant pi value

        // Abstract methods
        public abstract void calcArea();
        public abstract void calcVolume();
        public abstract void dispArea();
        public abstract void dispVolume();
    }

    // Cone class
    class Cone extends Figure {
        private double h; // Height of the cone
        private double s; // Slant height of the cone

        // Constructor
        public Cone(double r, double h, double s) {
            this.r = r;
            this.h = h;
            this.s = s;
        }

        // Calculate the surface area of the cone
        public void calcArea() {
            a = (pi * r * s) + (pi * r * r);
        }

        // Calculate the volume of the cone
        public void calcVolume() {
            v = (pi * r * r * h) / 3;
        }

        // Display the area
        public void dispArea() {
            System.out.println("Cone Area: " + a);
        }

        // Display the volume
        public void dispVolume() {
            System.out.println("Cone Volume: " + v);
        }
    }

    // Sphere class
    class Sphere extends Figure {

        // Constructor
        public Sphere(double r) {
            this.r = r;
        }

        // Calculate the surface area of the sphere      
        public void calcArea() {
            a = 4 * pi * r * r;
        }

        // Calculate the volume of the sphere    
        public void calcVolume() {
            v = (4 * pi * r * r * r) / 3;
        }

        // Display the area      
        public void dispArea() {
            System.out.println("Sphere Area: " + a);
        }

        // Display the volume      
        public void dispVolume() {
            System.out.println("Sphere Volume: " + v);
        }
    }

    // Cylinder class
    class Cylinder extends Figure {
        private double h; // Height of the cylinder

        // Constructor
        public Cylinder(double r, double h) {
            this.r = r;
            this.h = h;
        }

        // Calculate the surface area of the cylinder
        public void calcArea() {
            a = (2 * pi * r * r) + (2 * pi * r * h);
        }

        // Calculate the volume of the cylinder
        public void calcVolume() {
            v = pi * r * r * h;
        }

        // Display the area
        public void dispArea() {
            System.out.println("Cylinder Area: " + a);
        }

        // Display the volume
        public void dispVolume() {
            System.out.println("Cylinder Volume: " + v);
        }
    }

    // Main method
    public static void main(String[] args) {
        // Create an instance of the outer class (Demo)
        Demo demo = new Demo();

        // Create a cone object and display its properties
        Cone cone = demo.new Cone(5, 10, 8);
        cone.calcArea();
        cone.calcVolume();
        cone.dispArea();
        cone.dispVolume();

        // Create a sphere object and display its properties
        Sphere sphere = demo.new Sphere(7);
        sphere.calcArea();
        sphere.calcVolume();
        sphere.dispArea();
        sphere.dispVolume();

        // Create a cylinder object and display its properties
        Cylinder cylinder = demo.new Cylinder(6, 12);
        cylinder.calcArea();
        cylinder.calcVolume();
        cylinder.dispArea();
        cylinder.dispVolume();
    }
}