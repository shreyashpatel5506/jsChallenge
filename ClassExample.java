class Circle {
      double radius;

      Circle(double radius) {
            this.radius = radius;
      }

      public String toString() {
            return "Circle Radius is:-" + this.radius;
      }

}

class Area extends Circle {
      double area;

      Area(double radius) {
            super(radius);
            this.area = Math.PI * radius * radius;
      }

      public String toString() {
            return "Area of Circle is:-" + this.area;
      }
}

public class ClassExample {

      public static void main(String[] args) {

            Circle c = new Circle(45.2);
            System.out.println(c);
            Area a = new Area(45.2);
            System.out.println(a);

      }
}