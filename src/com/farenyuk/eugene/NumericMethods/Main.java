package com.farenyuk.eugene.NumericMethods;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Pi();
        // compInt();
    }
        public static void Pi(){
            double Pi = 0;
            int j = 1;
            for(int i=0; i<=100; i++){
                Pi+=Math.pow((-1), i)/j;
                j+=2;
            }
            System.out.println(4*Pi);
        }

        public static void compInt(){
            double P = 10000.0;
            double I = 0.0;
            double r = 0.05;
            int y= 0;
            double SV = 2.0*P;
            while(P<SV){
                y+=1;
                I=P*r;
                P+=I;
                System.out.printf("year: %d p: %.2f\n", y, P);
            }
        }

    }



