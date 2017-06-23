package br.jus.tjro.moduloGabinete.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.jus.tjro.moduloGabinete.model.Usuario;
import br.jus.tjro.moduloGabinete.model.enums.PerfilAcesso;
import br.jus.tjro.moduloGabinete.repository.UsuariosRepository;

@Controller
@RequestMapping("usuario")
public class UsuarioController {

	@Autowired
	private UsuariosRepository usuariosRepository;
	
	@RequestMapping("/inicial")
	public void criaUsuarioInicial(){
		
		Usuario usuario = new Usuario();
		Usuario usuario2 = new Usuario();

		usuario.setLogin("assessor");
		usuario.setSenha("assessor");
		usuario.setPerfilAcesso(PerfilAcesso.ASSESSOR);

		usuario2.setLogin("magistrado");
		usuario2.setSenha("magistrado");
		usuario2.setPerfilAcesso(PerfilAcesso.MAGISTRADO);
		
		usuariosRepository.save(usuario);
		usuariosRepository.save(usuario2);
	}
	
}
