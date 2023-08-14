package com.sportsworld.login.security;

import com.sportsworld.login.model.Usuario;
import com.sportsworld.login.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 *
 * @author miltonquiroz
 */

@Service
public class UserDetailServiceImpl  implements UserDetailsService{
    
    @Autowired
    private UsuarioRepository  usuarioRepository;
    
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepository
            .findOneByEmail(email)
            .orElseThrow(() -> new UsernameNotFoundException("El usuario con email" + email + "no existe"));
        
        return new UserDetailsImpl(usuario);
    }
}
