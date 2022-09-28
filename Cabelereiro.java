package AtividadeJava;

public class Cabelereiro {

	private String nome;
	private int id;
	private String CPF;

	public Cabelereiro(String nome, String cPF) {
		super();
		this.nome = nome;
		CPF = cPF;
	}

	@Override
	public String toString() {
		return "Cabelereiro [nome=" + nome + ", CPF=" + CPF + "]";
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

}
