public class Punto {

    public Punto(int x, int y) {
        this.x=x;
        this.y=y;
    }

    public int x;
    public int y;

    private double subtractionSquare(int a, int b) {
        return Math.pow(a-b,2);
    }

    public double distance(Punto p2) {
        return Math.sqrt(this.subtractionSquare(p2.x,this.x)+this.subtractionSquare(p2.y,this.y));
    }

    public double distanceToOrigin() {
        return this.distance(new Punto(0,0));
    }


}
