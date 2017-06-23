package br.jus.tjro.moduloGabinete.model.enums;

public enum PerfilAcesso {

	ASSESSOR("Assessor"), MAGISTRADO("Magistrado");

	private String descricao;

	PerfilAcesso(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
}
