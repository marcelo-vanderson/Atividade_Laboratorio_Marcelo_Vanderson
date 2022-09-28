package AtividadeJava;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* questao 1 */
		/* instaciar tres objetos de cada classe */
		
		
		/* classe cliente */
		Cliente c1 = new Cliente("123.456.789-60");
		Cliente c2 = new Cliente("546.378.452-16");
		Cliente c3 = new Cliente("345.765.289-30");

		/* classe atendimento */
		Atendimento a1 = new Atendimento("maria");
		Atendimento a2 = new Atendimento("mariana");
		Atendimento a3 = new Atendimento("marina");

		Calendar data = Calendar.getInstance();
		data.set(2022, 10, 2, 12, 45);
		a1.setData(data);

//		Calendar data = Calendar.getInstance();
		data.set(2022, 11, 3, 14, 46);
		a2.setData(data);

//		Calendar data = Calendar.getInstance();
		data.set(2022, 9, 4, 17, 47);
		a3.setData(data);
		/* classe serviço */

		Serviço s1 = new Serviço(2, "marta", 12, "corte");
		Serviço s2 = new Serviço(4, "marie", 34, "alisamento");
		Serviço s3 = new Serviço(6, "curie", 50, "banho");

		/* classe agendamento */
		Agendamento ag1 = new Agendamento("bete", "tiao");
		Agendamento ag2 = new Agendamento("bete", "tiao");
		Agendamento ag3 = new Agendamento("bete", "tiao");

		Calendar data2 = Calendar.getInstance();
		data.set(2022, 3, 3, 14, 46);
		ag1.setData(data);

		data.set(2022, 4, 3, 14, 46);
		ag2.setData(data);

		data.set(2022, 4, 3, 14, 46);
		ag3.setData(data);

		/* classe Cabelereiro */
		Cabelereiro ca1 = new Cabelereiro("Piere", "002.345.654-87");
		Cabelereiro ca2 = new Cabelereiro("tiao", "002.345.654-87");
		Cabelereiro ca3 = new Cabelereiro("tito", "002.345.654-87");

		/* questao 2 */

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("--- cliente --- :");
		System.out.println("informe o cpf do cliente:");
		c1.setCPF(entrada.next());
		
		System.out.println(Calendar.getInstance().getTime());

		System.out.println("digite o nome do cliente :");
		a1.setCliente(entrada.next());
		
		System.out.println(c1.toString());
		System.out.println(a1.toString());

		System.out.println(" ---Serviço--- :");

		System.out.println("informe o id do serviço");
		s1.setId(entrada.nextInt());

		System.out.println("digite o nome :");
		s1.setNome(entrada.next());
		
		System.out.println("digite a descriçao :");
		s1.setDescriçao(entrada.next());
		
		System.out.println("digite o valor :");
		s1.setValor(entrada.nextDouble());

		System.out.print(s1.toString());

		
		System.out.println(" ---Agendamento---");
		
		System.out.println("informe o nome do cliente");
		ag1.setCliente(entrada.next());
		
		System.out.println("informe o nome do profissional");
		ca1.setNome(entrada.next());
		
		System.out.println("informe o cpf do profissional");
		ca1.setCPF(entrada.next());
		System.out.println(Calendar.getInstance().getTime());
		System.out.println(ca1.toString());
	
	
	
	}

}
