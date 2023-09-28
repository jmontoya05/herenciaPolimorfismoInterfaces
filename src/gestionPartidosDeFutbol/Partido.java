package gestionPartidosDeFutbol;

import java.util.Date;

public class Partido {
    private final Equipo EQUIPO_LOCAL;
    private final Equipo EQUIPO_VISITANTE;
    private Date fechaHoraPartido;
    private final int[] resultadoDelPartido;

    public Partido(Equipo EQUIPO_LOCAL, Equipo EQUIPO_VISITANTE, Date fechaHoraPartido) {
        this.EQUIPO_LOCAL = EQUIPO_LOCAL;
        this.EQUIPO_VISITANTE = EQUIPO_VISITANTE;
        this.fechaHoraPartido = fechaHoraPartido;
        this.resultadoDelPartido = new int[2];
    }

    public Equipo getEQUIPO_LOCAL() {
        return EQUIPO_LOCAL;
    }

    public Equipo getEQUIPO_VISITANTE() {
        return EQUIPO_VISITANTE;
    }

    public Date getFechaHoraPartido() {
        return fechaHoraPartido;
    }

    public void setFechaHoraPartido(Date fechaHoraPartido) {
        this.fechaHoraPartido = fechaHoraPartido;
    }

    public void registrarResultado(int golesLocal, int golesVisitante){
        resultadoDelPartido[0] = golesLocal;
        resultadoDelPartido[1] = golesVisitante;
    }

    public String calcularGanador(){
        if (resultadoDelPartido[0] < resultadoDelPartido[1]){
            return "\nGanó el equipo visitante: " + getEQUIPO_VISITANTE().getNombreEquipo();
        } else if (resultadoDelPartido[0] > resultadoDelPartido[1]) {
            return "\nGanó el equipo local: " + getEQUIPO_LOCAL().getNombreEquipo();
        } else {
            return "\nEl partido quedó empatado";
        }
    }
}
