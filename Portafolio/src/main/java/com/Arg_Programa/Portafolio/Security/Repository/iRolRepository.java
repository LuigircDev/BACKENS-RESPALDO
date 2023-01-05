package com.Arg_Programa.Portafolio.Security.Repository;

import com.Arg_Programa.Portafolio.Security.Entity.Rol;
import com.Arg_Programa.Portafolio.Security.Enums.RolNombre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface iRolRepository extends JpaRepository<Rol, Long> {
    Optional<Rol> findByRolNombre (RolNombre rolNombre);
}
