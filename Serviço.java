package AtividadeJava;

public class Serviço {

	private int id;
	private String nome;
	private double valor;
	private String descriçao;

	public Serviço(int id, String nome, double valor, String descriçao) {
		super();
		this.id = id;
		this.nome = nome;
		this.valor = valor;
		this.descriçao = descriçao;
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
		return "Serviço [id=" + id + ", nome=" + nome + ", valor=" 
				+ valor + ", descriçao=" + descriçao + "]";
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

	public String getDescriçao() {
		return descriçao;
	}

	public void setDescriçao(String descriçao) {
		if (descriçao.length()>10) {
			this.descriçao = descriçao;
			
		}
		
	}
}