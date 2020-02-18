package org.lestergarcia.ws.core.bean;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface ServicioSumarWS {
    @WebMethod
    public int sumar(int x, int y);
}
