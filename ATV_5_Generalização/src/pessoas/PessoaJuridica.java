package pessoas;

public class PessoaJuridica extends Pessoa{
	
	//ATRIBUTOS
	private String cnpj;
	private String tipoEmpresa;
	
	//CONSTRUTORES
	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(String nome, String endereco) {
		super(nome, endereco);
	}
	
	public PessoaJuridica(String nome, String endereco, String cnpj, String tipoEmpresa) {
		super(nome, endereco);
		setCnpj(cnpj);
		setTipoEmpresa(tipoEmpresa);
	}
	
	//GETTERS E SETTERS
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		if(cnpj.length() > 0) {
			this.cnpj = cnpj;
		}
	}
	
	public String getTipoEmpresa() {
		return tipoEmpresa;
	}
	public void setTipoEmpresa(String tipoEmpresa) {
		if(tipoEmpresa.length() > 0) {
			this.tipoEmpresa = tipoEmpresa;
		}
	}

	//TO_STRING
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PessoaJuridica [cnpj=");
		builder.append(cnpj);
		builder.append(", tipoEmpresa=");
		builder.append(tipoEmpresa);
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
