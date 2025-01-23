package ut4ejerc1;

public class Fecha {

    private int dia;
    private final EnumMes.enumMes mes;
    private int annio;

    public Fecha(EnumMes.enumMes mes) {
        this.mes = mes;
    }

    public Fecha(int dia, EnumMes.enumMes mes, int annio) {
        this.dia = dia;
        this.mes = mes;
        this.annio = annio;
    }

    public int getDia(){
        return dia;
    }

    public void setDia(int dia){
        this.dia = dia;
    }


    public int getAnnio(){
        return annio;
    }

    public void setAnnio(int annio){
        this.annio = annio;
    }

    public boolean isSummer(){
        return mes == EnumMes.enumMes.JUNIO
                || mes == EnumMes.enumMes.JULIO
                || mes == EnumMes.enumMes.AGOSTO
                || mes == EnumMes.enumMes.SEPTIEMBRE;
    }

    public String toString(){
        return dia + " de " + mes.name().toLowerCase() + " del " + annio;
    }
}
