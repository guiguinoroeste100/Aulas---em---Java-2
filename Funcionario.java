package entities;

public class Funcionario extends Pessoa{
	private String cargo;
	private double salario;
	public Funcionario() {
		super();
		cargo = null;
		salario = 0.0;
	}
	public Funcionario(int id, String nome, String email, String sexo, String cargo, double salario) {
		super(id, nome, email, sexo);
		this.cargo = cargo;
		this.salario = salario;
	}

	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	

}
