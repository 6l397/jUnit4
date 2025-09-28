package test;

import main.Cylinder;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/*
  @author   amina
  @project  jUnit4
  @class    CylinderTest
  @version  1.0.0
  @since    28.09.25 - 17.20
*/

public class CylinderTest {

    @Test
    public void testBaseArea() {
        Cylinder cylinder = new Cylinder(3, 5);
        double baseArea = cylinder.getBaseArea();
        Assert.assertEquals(Math.PI * 9, baseArea, 0.01);
    }

    @Test
    public void testLateralSurfaceArea() {
        Cylinder cylinder = new Cylinder(3, 5);
        double lateralArea = cylinder.getLateralSurfaceArea();
        Assert.assertEquals(2 * Math.PI * 3 * 5, lateralArea, 0.01);
    }

    @Test
    public void testTotalSurfaceArea() {
        Cylinder cylinder = new Cylinder(3, 5);
        double totalArea = cylinder.getTotalSurfaceArea();
        Assert.assertEquals(2 * Math.PI * 9 + 2 * Math.PI * 3 * 5, totalArea, 0.01);
    }

    @Test
    public void testVolume() {
        Cylinder cylinder = new Cylinder(3, 5);
        double volume = cylinder.getVolume();
        Assert.assertEquals(Math.PI * 9 * 5, volume, 0.01);
    }

    @Test
    public void testDiagonal() {
        Cylinder cylinder = new Cylinder(3, 5);
        double diagonal = cylinder.getDiagonal();
        Assert.assertEquals(Math.sqrt(25 + 36), diagonal, 0.01); // sqrt(61)
    }
}
