package myjavadevelopprogress.pildoras_informaticas.POO;

import java.util.Scanner;

public class Ex_10_ATS_facturas {
    public static void main(String[] args) {
        int[] codArti = new int[5];
        int ammountCounter = 0;
        float liSell, prizeLit, article1Ammount = 0, totalFactPerSell = 0, totalFact = 0;
        Scanner scKey = new Scanner(System.in);

        for (int i = 0; i < codArti.length; i++) {
            codArti[i] = i;
            System.out.println("Litros vendidos en la factura numero " + i + ":");
            liSell = scKey.nextFloat();
            System.out.println("A cuanto se vendio el litro:");// L x $
            prizeLit = scKey.nextFloat();
            totalFactPerSell = liSell * prizeLit;
            if (codArti[i] == codArti[1]) {
                article1Ammount = liSell;
            }
            totalFact += totalFactPerSell;
        }
        scKey.close();

        if (totalFactPerSell > 600) {
            ammountCounter++;
        }
        System.out.println(
                "Informacion: \n Facturacion total: " + totalFact + "$\n Cantidad de litros vendidos en el articulo 1: "
                        + article1Ammount + "\n Se han emitido " + ammountCounter + " factura/as de cantidades mayores a 600$");
    }
}
/**
 * Desinfectantes:
 * cada factura contiene:
 * codigo articulo (i)
 * cantidad vendida en litros (int)
 * precio por litro (float)
 * //////
 * se piden de 5 facturas: facturacion total, cantidad de litros en el articulo
 * 1 y cuantas facturas
 * de mas de 600 $ se emitieron
 */