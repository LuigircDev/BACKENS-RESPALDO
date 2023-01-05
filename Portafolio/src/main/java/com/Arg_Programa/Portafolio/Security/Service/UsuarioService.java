package com.Arg_Programa.Portafolio.Security.Service;

import com.Arg_Programa.Portafolio.Security.Entity.Usuario;
import com.Arg_Programa.Portafolio.Security.Repository.iUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
public class UsuarioService {
    @Autowired
    iUsuarioRepository iusuarioRepository;

    public Optional<Usuario> getByNombreUsuario(String nombreUsuario){
        return iusuarioRepository.findByNombreUsuario(nombreUsuario);
    }

    public Boolean existsByNombreUsuario(String nombreUsuario){
        return iusuarioRepository.existsByNombreUsuario(nombreUsuario);
    }

    public Boolean existsByEmail(String email){
        return iusuarioRepository.existsByEmail(email);
    }

    public  void save(Usuario usuario){
        iusuarioRepository.save(usuario);
    }
}
