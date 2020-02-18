package org.lestergarcia.ws.core.bean;

import javax.ejb.Stateless;
import javax.jws.WebService;

@Stateless
@WebService(endpointInterface = "org.lestergarcia.ws.core.bean.ServicioSumarWS")
public class ServicioSumarWSImpl implements ServicioSumarWS{
    @Override
    public int sumar(int x, int y) {
        return (x+y);
    } 
}
