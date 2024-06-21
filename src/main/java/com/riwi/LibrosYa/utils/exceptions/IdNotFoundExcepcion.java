package com.riwi.LibrosYa.utils.exceptions;

public class IdNotFoundExcepcion extends RuntimeException {
    
    private static final String ERROR_MESSGE = "No hay registros en la entidad %s con el id suministrado";

    public IdNotFoundExcepcion(String nameEntity) {
        super(String.format(ERROR_MESSGE, nameEntity));
    }
}
