package main;

/*
  @author    amina
  @project   jUnit4
  @class     Main
  @version   1.0.0
  @since     28.09.25 - 17.20
*/

public class Main {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(3, 5);
        System.out.println("Base area: " + cylinder.getBaseArea());
        System.out.println("Lateral surface: " + cylinder.getLateralSurfaceArea());
        System.out.println("Total surface: " + cylinder.getTotalSurfaceArea());
        System.out.println("Volume: " + cylinder.getVolume());
        System.out.println("Diagonal: " + cylinder.getDiagonal());
    }
}