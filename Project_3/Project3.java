package Project_3;

public class Project3 {
    public static void main(String args[]) {
        //element type arrayRefVar[];
        double[] doublearray = new double[10];

        for(int i = 0; i < doublearray.length; i++) {
            doublearray[i] = i;
        }

        printArray(doublearray);
    }

    public static void printArray(double[] anyArray) {
        for(int i = 0; i < anyArray.length; i++) {
            System.out.println("Value of Array[" + i + "] is " + i);
        }
    }
}
