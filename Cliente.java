package entities;

public class Cliente extends Pessoa {
	private double limite;
	
	public Cliente() {
		super();
		limite = 0.0;
	}
	
	public Cliente(int id, String nome, String email, String sexo, double limite) {
		super(id, nome, email, sexo);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	


	
}
