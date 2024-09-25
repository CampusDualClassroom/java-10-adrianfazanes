package com.campusdual.classroom;

import java.util.concurrent.ThreadLocalRandom;

public class Exercise10 {

    // Imprimir el color de las pelotas que salgan, hasta que salgan 2 de color azul
    // El mensaje a imprimir es → La bola es de color: COLOR_BOLA
    // COLOR_BOLA puede ser → rojo, azul, verde
    public static void main(String[] args) {
        int countBlue = 0; // Contador de pelotas azules

        while (countBlue < 2) {
            String ballColor = getBall();
            System.out.println("La bola es de color: " + ballColor);

            if (ballColor.equals("azul")) {
                countBlue++;
            }
        }
    }

    // Un método que devuelva una cadena de texto con el color de una pelota (en minúscula)
    public static String getBall() {
        int colorValue = randomWithRange(1, 4);
        switch (colorValue) {
            case 1:
                return "rojo";
            case 2:
                return "azul";
            case 3:
                return "verde";
            default:
                return null;
        }
    }

    public static int randomWithRange(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max);
    }
}
