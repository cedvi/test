package Aufgabe2KlausurInfo2WS1718;

public class Aufgabe2KlausurInfo2WS1718 {

    public static void main(String[] args) {
        
    	double x = 6/4; //6/4=1 -> 1.0
    	
          int zufallszahl;
        double kehrwert;

        for(int i=1; i<=6; i++){

            // Erzeugen einer integer Zufallszahl zwischen [-5, +5)
            zufallszahl = (int)(10*Math.random() - 5);            

            try {
                kehrwert = 1 / zufallszahl; // 1 / 4 = 0
                System.out.println(1./zufallszahl);
//                System.out.println(kehrwert);

            } catch (ArithmeticException e) {
                System.out.println("...oops, das geht nicht !");
            }

        }

    }

}
