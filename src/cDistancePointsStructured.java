public class cDistancePointsStructured {

    /*
    distancia entre dos puntos
    (0,0) (x1=0, y1=0)
    (1,1) (x2=1, y2=1)

    distance=sqrt( (x2-x1)^2 + (y2-y1)^2

    function distance(x1,y1,x2,y2) {

    }
     */

    public static void main(String[] args) {
        Punto p1=new Punto(0,0);
        Punto p2=new Punto(1,1);
        double distanceBetween2Points=p2.distance(p1);
        System.out.println("P2 -> P1 = "+distanceBetween2Points);
        double distanceOfP1ToOrigin=p1.distanceToOrigin();
        System.out.println("P1 -> (0,0) = "+distanceOfP1ToOrigin);
    }
}
