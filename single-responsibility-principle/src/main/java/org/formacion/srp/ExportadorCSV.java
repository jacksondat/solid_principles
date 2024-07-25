package org.formacion.srp;

import java.util.List;
import java.util.stream.Collectors;

public class ExportadorCSV{

    String exportar(List<Pelicula> peliculas) {
        return peliculas.stream()
                .map(p -> (p.getTitulo() + "," + p.getDirector() + "," + p.getGenero()))
                .collect(Collectors.joining("\n"));
    }
}
