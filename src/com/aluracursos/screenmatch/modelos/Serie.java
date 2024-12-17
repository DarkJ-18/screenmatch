package com.aluracursos.screenmatch.modelos;

public class Serie extends Titulo{
    int temporadas;
    int epidodiosPorTemporada;
    int minutosPorEpisodio;

    @Override
    public int getDuracionEnMinutos() {
        return temporadas * epidodiosPorTemporada * minutosPorEpisodio;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpidodiosPorTemporada() {
        return epidodiosPorTemporada;
    }

    public void setEpidodiosPorTemporada(int epidodiosPorTemporada) {
        this.epidodiosPorTemporada = epidodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }
}
