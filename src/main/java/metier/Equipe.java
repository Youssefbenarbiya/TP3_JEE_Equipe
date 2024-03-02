package metier;
import java.io.Serializable;

public class Equipe implements Serializable{

	private Long idEquipe;
	private String nomEquipe;
	private double rank;
	public Equipe() {
	super();
	}
	public Equipe(String nomEquipe, double rank) {
	super();
	this.nomEquipe = nomEquipe;
	this.rank = rank;
	}
	public Long getIdEquipe() {
	return idEquipe;
	}
	public void setIdEquipe(Long idEquipe) {
	this.idEquipe = idEquipe;
	}
	public String getNomEquipe() {
	return nomEquipe;
	}
	public void setNomEquipe(String nomEquipe) {
	this.nomEquipe = nomEquipe;
	}
	public double getRank() {
	return rank;
	}
	public void setRank(double rank) {
		this.rank = rank;
		}
}
