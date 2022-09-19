package entities;

public class Dados {

	private String nome;
	private String imc;

	public String getNome() {
		return nome;
	}

	public void setNome(String n1, String n2) {
		String n = n1 + " " + n2;
		this.nome = n.toUpperCase().trim().replaceAll("\\s+", " ");
	}

	public String getImc() {
		return imc;
	}

	public void setImc(String p1, String a1) {
		Double p = Double.parseDouble(p1.replaceAll(",", "."));
		Double a = Double.parseDouble(a1.replaceAll(",", "."));
		Double calculoImc = p / (a * a);

		Double imcCalc = Math.round(calculoImc * 100.0) / 100.0;

		this.imc = imcCalc.toString().replace(".", ",");
	}

	@Override
	public String toString() {
		return nome + " " + imc;
	}

}
