package gr.aueb.cf.ch15;

public class Point2D extends Point {
    private int y;

    public Point2D() {
        super(); // και να μη το διναμε θα τον καλουσε αυτοματα πρεπει ο constructor της απο πανω κλαση να μην ειναι private η final
        y = 0; // και αυτο ειναι περριτο
    }

    public Point2D(int x, int y) {
        super(x); // καλείται ο υπερφορωτμένος constructor της superclass (αρκει να υπάρχει)
        // setX(x) αν δεν εβαζες τον υπερφορτωμενο και καλουνταν ο default
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    //@Override
    //public String convertToString() {
        //return super.convertToString() + "(" + y + ")";
        ////return "(" + getX() + "," + y + ")";
   // }


    @Override
    public String toString() {
        return "(" + getX() + "," + y + ")";
    }

    @Override
    protected void movePlusOne() {
        super.movePlusOne();
        y += 1;
    }

    @Override
    public void movePlusTen() {
        super.movePlusTen();
        y += 10;
    }
}
