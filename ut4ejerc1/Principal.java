package ut4ejerc1;

import java.time.LocalDate;

public class Principal {
    public static void main(String[] args) {

        Fecha objFecha1 = new Fecha(EnumMes.enumMes.FEBRERO);
        objFecha1.setDia(20);
        objFecha1.setAnnio(2000);

        System.out.println("Fecha en formato largo para objFecha1: " + objFecha1);
        System.out.println(objFecha1.isSummer() ? "Es verano" : "No es verano");

        Fecha objFecha2 = new Fecha(15, EnumMes.enumMes.JULIO, 2015);
        System.out.println("\nAño del objFecha2: " + objFecha2.getAnnio());
        System.out.println("Fecha en formato largo para objFecha2: " + objFecha2);
        System.out.println(objFecha2.isSummer() ? "Es verano" : "No es verano");
    }
}
