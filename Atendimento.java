package AtividadeJava;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Atendimento {

	private String cliente;
	private Calendar Data;
	private String cabelereiro;

	private ArrayList<Servi�o> lista = new ArrayList<Servi�o>();

	public void adicionaservi�o(Servi�o servi�o) {
		this.lista.add(servi�o);
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

	public ArrayList<Servi�o> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Servi�o> lista) {
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
