public class CirleVaCylinder {
    public double radius;
    public String color;

    @Override
    public String toString() {
        return "CirleVaCylinder{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public static void main(String[] args) {

    }

    public class Cylinder extends CirleVaCylinder {
        private double h;

        public double getV() {
            return Math.PI * Math.pow(radius, 2) * h;
        }

        @Override
        public String toString() {
            return "Cylinder{" +
                    "h=" + h +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }
    }
}
