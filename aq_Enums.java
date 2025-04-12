enum Planet {
    MERCURY(3.303e+23, 2.4397e6),
    EARTH(5.976e+24, 6.37814e6);

    private final double mass;
    private final double radius;

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public double getMass() { return mass; }
    public double getRadius() { return radius; }
}
public class aq_Enums{
    public static void main(String[] args) {
        Planet p = Planet.EARTH;
        System.out.println(p);
        System.out.println(p.getMass());
        System.out.println(Planet.EARTH.getMass());
    }
}
