package org.example;

import java.util.ArrayList;

import static spark.Spark.*;


public class Collatz {



    public static void main(String... args){
        port(getPort());

        staticFiles.location("/public");

        get("/collatz", (req, res ) -> {
            String valor = req.queryParams("value");
            System.out.printf("Param Query " + valor);
            return getCollatzResponse(Integer.parseInt(valor));
        });
    }


    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 42000;
    }


    private static String getCollatzResponse(int n) {
        return "{ \"operation\" : \"collatzsequence\", \n" +
                " \"input\" : " + n + ", \n" +
                " \"output\" : \"" + convertToString(n) + "\" \n" +
                "}";
    }

    private static String convertToString(int numero) {
        String response = "";
        int size = Collatz(numero).size();
        for (int i=0; i<size; i++) {

            if (i != size - 1) {
                response += Collatz(numero).get(i) + " -> ";
            }
        }
        return response;
    }

    private static ArrayList<Integer> Collatz(int n) {
        ArrayList<Integer> secuencia = new ArrayList<>();
        secuencia.add(n);
        while (n > 1) {
            if (n%2 == 0) {
                n = n / 2;
            }
            else {
                n = n * 3 + 1;
            }
            secuencia.add(n);
        }
        return secuencia;
    }

}