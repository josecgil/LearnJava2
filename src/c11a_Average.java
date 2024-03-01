public class c11a_Average {
    private static double sum(double[] data) {
        if (data == null) return 0.0;
        double sum = 0.0;
        for (double dato : data) {
            sum = sum + dato;
        }
        return sum;
    }

    private static double avg(double[] data) {
        return sum(data) / data.length;
    }

    private static double max(double[] data) {
        if (data.length == 1) return data[0];
        double max = Double.MIN_VALUE;
        for (double dato : data) {
            if (dato > max) {
                max = dato;
            }
        }
        return max;
    }

    private static double min(double[] data) {
        if (data.length == 1) return data[0];
        double min = Double.MAX_VALUE;
        for (double dato : data) {
            if (dato < min) {
                min = dato;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        //Create functions to:
        //1-Calculate the sum of an array of data with decimals
        //2-Calculate the average of an array of data with decimals
        //3-Calculate the max of an array of data with decimals
        //4-Calculate the min of an array of data with decimals
        double[] data = new double[10];
        data[0] = 8.8;
        data[1] = 9.3;
        data[2] = 5.1;
        data[3] = 2.7;
        data[4] = 5.3;
        data[5] = 1.8;
        data[6] = 7.2;
        data[7] = 5.1;
        data[8] = 1.4;
        data[9] = 7.3;

        double sum = sum(data);
        double avg = avg(data);
        double max = max(data);
        double min = min(data);

        System.out.println("Sum:" + sum);
        System.out.println("Average:" + avg);
        System.out.println("Max:" + max);
        System.out.println("Min:" + min);
    }
}
