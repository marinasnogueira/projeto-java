package loja.varejo.model;

import org.bson.codecs.pojo.annotations.BsonProperty;

public class Endereco {
	
	@BsonProperty(value = "cep")
	private String cep;
	@BsonProperty(value = "endereco")
	private String endereco;
	@BsonProperty(value = "numero")
	private String numero;
	@BsonProperty(value = "complemento")
	private String complemento;
	@BsonProperty(value = "bairro")
	private String bairro;
	@BsonProperty(value = "cidade")
	private String cidade;
	@BsonProperty(value = "estado")
	private String estado;
	@BsonProperty(value = "tipoEndereco")
	private String tipoEndereco;
	
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getTipoEndereco() {
		return tipoEndereco;
	}
	public void setTipoEndereco(String tipoEndereco) {
		this.tipoEndereco = tipoEndereco;
	}
	
}
