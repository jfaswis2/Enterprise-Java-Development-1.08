package servicioStreaming;

public class Movie extends Video{
    private String duracion;

    public Movie(String duracion) {
        this.duracion = duracion;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }
}
