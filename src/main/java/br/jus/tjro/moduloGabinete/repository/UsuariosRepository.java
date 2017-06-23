package br.jus.tjro.moduloGabinete.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.jus.tjro.moduloGabinete.model.Usuario;

public interface UsuariosRepository extends JpaRepository<Usuario, Long>{

}
