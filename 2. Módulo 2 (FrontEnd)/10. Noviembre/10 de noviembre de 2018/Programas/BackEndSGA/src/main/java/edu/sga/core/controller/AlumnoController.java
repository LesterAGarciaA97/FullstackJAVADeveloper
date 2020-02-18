package edu.sga.core.controller;

import edu.sga.core.bs.dao.AlumnoRepository;
import edu.sga.core.eis.bo.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api/v1/alumno")
public class AlumnoController {
    @Autowired
    private AlumnoRepository alumnoRepository;
    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Alumno> getAall(){
        return alumnoRepository.findAll();
    }
}
