package gr.aueb.cf.ch11;

/**
 * Immutable 3D Point
 */
public final class Point3D {
    private final Point point; // ο δεικτης point ειναι final, τα πεδια χ, y μπορούν να μεταβληθούν γιατι
    // το point ειναι mutable και πρεπει να κανω τα παρακατω ολα
    private final int z;

    public Point3D() {
        point = new Point();
        z = 0;
    }

    public Point3D(Point point, int z) {
        // this.point = point; ετσι δεν ειναι immutable γιατι και η main δειχνει σ αυτο το point και μπορει να αλλαξει τα χ,y swallow copy
        this.point = new Point(point.getX(), point.getY()); // deep copy κανουμε ενα αντιγραφο η main δεν μπορει να το πεηρεασει
        this.z = z;
    }

    public Point getPoint() {
        return new Point(this.point.getX(), this.point.getY()); // ΔΗΜΙΟΥΓΕΙΤΑΙ ΞΑΝΑ ΕΝΑ ΑΝΤΙΓΡΑΦΟ
    }

    public int getZ() {
        return z;
    }
}
