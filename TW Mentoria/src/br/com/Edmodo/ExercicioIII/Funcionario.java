package br.com.Edmodo.ExercicioIII;

public class Funcionario {
	private String nome;
	private String departamento;
	private double salario;
	private Data dataDeAdmissao;
	private String rg;
	private int identificador;

    
    public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Data getDataDeAdmissao() {
		return dataDeAdmissao;
	}

	public void setDataDeAdmissao(Data dataDeAdmissao) {
		this.dataDeAdmissao = dataDeAdmissao;
	}

	public String getRg(){
		return rg;
	}
	public void setRg(String rg){
		this.rg = rg;
	}

	public Funcionario(){
		super();
	}
	public Funcionario(String nome, String departamento, double salario,
			Data dataDeAdmissao, String rg, int identificador){
		super();
		this.nome = nome;
		this.departamento = departamento;
		this.salario = salario;
		this.dataDeAdmissao = dataDeAdmissao;
		this.rg = rg;
		this.identificador = identificador;
	}


	void recebeAumento(double valor){
		this.salario += valor;
	}

	double calculaGanhoAtual(){
		return this.salario * 12;
	}

	void mostra(){
		System.out.println("Nome" + this.nome);
		System.out.println("Nome" + this.departamento);
		System.out.println("Nome" + this.salario);
		System.out.println("Nome" + this.dataDeAdmissao);
		System.out.println("Nome" + this.rg);
	}

}
