package main;

/*
  @author   amina
  @project  jUnit4
  @class    Cylinder
  @version  1.0.0
  @since    28.09.25 - 17.20
*/

public class Cylinder {

    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    /** Площа основи */
    public double getBaseArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    /** Бічна поверхня */
    public double getLateralSurfaceArea() {
        return 2 * Math.PI * radius * height;
    }

    /** Повна поверхня */
    public double getTotalSurfaceArea() {
        return 2 * getBaseArea() + getLateralSurfaceArea();
    }

    /** Об’єм */
    public double getVolume() {
        return getBaseArea() * height;
    }

    /** Діагональ циліндра (від низу до верху через центр) */
    public double getDiagonal() {
        return Math.sqrt(Math.pow(height, 2) + Math.pow(2 * radius, 2));
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                ", height=" + height +
                '}';
    }
}
