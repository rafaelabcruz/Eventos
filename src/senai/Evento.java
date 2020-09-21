package senai;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public abstract class Evento implements Agendamento {

	private String nome;
	private LocalDate data;
	private Usuario organizador;
	private List<Usuario> participantes;
	
	/**
	 * Construtor padrão
	 * @param nome nome do evento
	 * @param data data do evento
	 * @param organizador organizador do evento
	 */
	public Evento(String nome, LocalDate data, Usuario organizador) {
		this.nome = nome;
		this.data = data;
		this.organizador = organizador;
		this.participantes = new ArrayList<Usuario>();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public LocalDate getData() {
		return data;
	}
	
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	public void setData(String data) {
		String format = "dd/MM/yyyy";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
		this.data = LocalDate.parse(data, formatter);
	}
	
	
	public Usuario getOrganizador() {
		return organizador;
	}
	
	public void setOrganizador(Usuario organizador) {
		this.organizador = organizador;
	}
	
	public void addParticipante(Usuario participante) {
		this.participantes.add(participante);
	}

	@Override
	public String toString() {
		return "Evento [nome=" + nome + ", data=" + data + ", organizador=" + organizador + "]";
	}
	
		
}
