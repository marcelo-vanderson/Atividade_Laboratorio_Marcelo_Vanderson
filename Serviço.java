package AtividadeJava;

public class Servi�o {

	private int id;
	private String nome;
	private double valor;
	private String descri�ao;

	public Servi�o(int id, String nome, double valor, String descri�ao) {
		super();
		this.id = id;
		this.nome = nome;
		this.valor = valor;
		this.descri�ao = descri�ao;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id > 0) {

			this.id = id;
		}
	}

	@Override
	public String toString() {
		return "Servi�o [id=" + id + ", nome=" + nome + ", valor=" 
				+ valor + ", descri�ao=" + descri�ao + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length() > 5) {
			this.nome = nome;

		}

	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
	if (valor>0) {
		this.valor = valor;
		
	}
		
	}

	public String getDescri�ao() {
		return descri�ao;
	}

	public void setDescri�ao(String descri�ao) {
		if (descri�ao.length()>10) {
			this.descri�ao = descri�ao;
			
		}
		
	}
}