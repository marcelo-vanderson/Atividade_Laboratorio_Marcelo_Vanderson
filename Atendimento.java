package AtividadeJava;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Atendimento {

	private String cliente;
	private Calendar Data;
	private String cabelereiro;

	private ArrayList<Serviço> lista = new ArrayList<Serviço>();

	public void adicionaserviço(Serviço serviço) {
		this.lista.add(serviço);
	}

	public Atendimento(String cliente) {
		super();
		this.cliente = cliente;
//		Data = data;
//		this.lista = lista;
//		this.cabelereiro = cabelereiro;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public Calendar getData() {
		return Data;
	}

	public void setData(Calendar data) {
		Data = data;
	}

	public ArrayList<Serviço> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Serviço> lista) {
		this.lista = lista;
	}

	public String getCabelereiro() {
		return cabelereiro;
	}

	public void setCabelereiro(String cabelereiro) {
		this.cabelereiro = cabelereiro;
	}

	@Override
	public String toString() {
		return "Atendimento [cliente=" + cliente + "]";
	}

}
