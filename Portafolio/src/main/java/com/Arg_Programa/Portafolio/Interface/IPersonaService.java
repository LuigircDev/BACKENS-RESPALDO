package com.Arg_Programa.Portafolio.Interface;

import com.Arg_Programa.Portafolio.Entity.Persona;

import java.util.List;

public interface IPersonaService {
    // Traer una Lista de Personas
    public List<Persona> getpersona ();

    public void savePersona (Persona persona);

    public void deletePersona (Long id);

    public Persona findPersona (Long id);
}
