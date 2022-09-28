package AtividadeJava;

import java.util.Calendar;

public class Agendamento {

	@Override
	public String toString() {
		return "Agendamento [cliente=" + cliente + ", Cabelereiro=" + Cabelereiro + "]";
	}

	private int id;
	private String cliente;
	private  String Cabelereiro;
	private Calendar Data;
	public Agendamento( String cliente,String Cabelereiro) {
		super();
		this.cliente = cliente;
		this.cliente = Cabelereiro;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Calendar getData() {
		return Data;
	}

	public Calendar setData(Calendar Data) {
		Calendar data = null;
		return Data = data;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}


}
