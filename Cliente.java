package AtividadeJava;

public class Cliente {

	private int id;
	private String nome;
	private String CPF;

	public Cliente(String cPF) {
		super();
		CPF = cPF;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length() > 3) {
			this.nome = nome;

		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id > 0) {
			this.id = id;

		}

	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	@Override
	public String toString() {
		return "Cliente [CPF=" + CPF + "]";
	}

}
