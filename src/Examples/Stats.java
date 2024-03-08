package Examples;

public class Stats {
    public static void main(String[] args) {
        double[] nbaHeights = {1.80, 1.87, 1.90, 2.10, 2.12, 2.06, 2.03, 2.20, 2.32};
        double[] nbaHeights2 = {1.80};
        System.out.println("min:"+min(nbaHeights));
        System.out.println("max:"+max(nbaHeights));
        System.out.println("avg:"+avg(nbaHeights));
        //jugador pequeño (min)
        //jugador grande (max)
        //media de altura (media)


        //desviación stándard
        //suma
        //varianza
        //exists => exists(nbaHeights,1.40)=> falso exists(nbaHeights,1.80) => true

    }

    private static double min(double[] data) {
        if (data.length==0) {
            throw new IllegalArgumentException("No se puede calcular el mínimo de un array vacío");
        }
        double minDataUntilNow = data[0];
        for (int i = 1; i < data.length; i++) {
            double currentData = data[i];
            if (currentData < minDataUntilNow) {
                minDataUntilNow = currentData;
            }
        }
        return minDataUntilNow;
    }

    private static double max(double[] data) {
        if (data.length==0) {
            throw new IllegalArgumentException("No se puede calcular el máximo de un array vacío");
        }
        double maxDataUntilNow = data[0];
        for (int i = 1; i < data.length; i++) {
            double currentData = data[i];
            if (currentData > maxDataUntilNow) {
                maxDataUntilNow = currentData;
            }
        }
        return maxDataUntilNow;
    }

    private static double avg(double[] data) {
        if (data.length==0) {
            throw new IllegalArgumentException("No se puede calcular la media de un array vacío");
        }
        double sum = data[0];
        for (int i = 1; i < data.length; i++) {
            double currentData = data[i];
            sum=sum+currentData;
        }
        return sum/data.length;
    }


}