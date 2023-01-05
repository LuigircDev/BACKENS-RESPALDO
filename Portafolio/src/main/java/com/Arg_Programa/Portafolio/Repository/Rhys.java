package com.Arg_Programa.Portafolio.Repository;

import java.util.Optional;

import com.Arg_Programa.Portafolio.Entity.hys;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Usuario
 */
public interface Rhys extends JpaRepository<hys, Integer>{
    Optional<hys> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}
