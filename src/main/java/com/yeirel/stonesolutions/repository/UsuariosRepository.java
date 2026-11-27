package com.yeirel.stonesolutions.repository;

import com.yeirel.stonesolutions.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuariosRepository extends JpaRepository<Usuario,Long> {
}
