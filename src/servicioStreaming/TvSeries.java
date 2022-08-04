package servicioStreaming;

public class TvSeries extends Video{
    private int temporadas;
    private String duracionCapitulos;

    public TvSeries(int temporadas, String duracionCapitulos) {
        this.temporadas = temporadas;
        this.duracionCapitulos = duracionCapitulos;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public String getDuracionCapitulos() {
        return duracionCapitulos;
    }

    public void setDuracionCapitulos(String duracionCapitulos) {
        this.duracionCapitulos = duracionCapitulos;
    }
}
