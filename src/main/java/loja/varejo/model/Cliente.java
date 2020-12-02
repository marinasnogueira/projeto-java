package loja.varejo.model;

import java.util.Date;
import java.util.List;

import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

public class Cliente {
	
	private ObjectId id;
	
	@BsonProperty(value = "nomeCompleto")
	private String nomeCompleto;
	@BsonProperty(value = "dataNascimento")
	private Date dataNascimento;
	@BsonProperty(value = "email")
	private String email;
	@BsonProperty(value = "cpf")
	private String cpf;
	@BsonProperty(value = "sexo")
	private char sexo;
	@BsonProperty(value = "tipoPessoa")
	private String tipoPessoa;
	private List<Endereco> enderecos;
	private List<Telefone> telefones;
	
	
	public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public String getTipoPessoa() {
		return tipoPessoa;
	}
	public void setTipoPessoa(String tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}
	public List<Endereco> getEnderecos() {
		return enderecos;
	}
	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}
	public List<Telefone> getTelefones() {
		return telefones;
	}
	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
	public Object criaId() {
		setId(new ObjectId());
		return this;
	}
	
}