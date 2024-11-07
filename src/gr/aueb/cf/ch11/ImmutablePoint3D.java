package gr.aueb.cf.ch11;

public class ImmutablePoint3D {
    private final ImmutablePoint point;
    private final int z;

    public ImmutablePoint3D() {
        point = new ImmutablePoint();
        z = 0;
    }

    public ImmutablePoint3D (ImmutablePoint point , int z) {
        this.point = point;
        this.z = z;
    }

    public ImmutablePoint getPoint() {
        return point;
    }

    public int getZ() {
        return z;
    }
}
