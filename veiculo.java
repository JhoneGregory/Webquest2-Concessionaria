// Integrantes:
// JACIELTON JHONE GREGORIO DA SILVA
// ERYCLISON DAVIDSON PEREIRA DA SILVA
// ISAAC GRABRIEL DE ALMEIDA GOMES
// CHRISTYAN FERNANDO MILANEZ LIMA
// ANDRE CLEBER PENA SILVA

public class Veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private int ano;
    private double valor;

    public Veiculo(String placa, String marca, String modelo, int ano, double valor) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
    }

    public String getPlaca() { return placa; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getAno() { return ano; }
    public double getValor() { return valor; }

    public void setPlaca(String placa) { this.placa = placa; }
    public void setMarca(String marca) { this.marca = marca; }
    public void setModelo(String modelo) { this.modelo = modelo; }
    public void setAno(int ano) { this.ano = ano; }
    public void setValor(double valor) { this.valor = valor; }

    public double calcularIpva() {
        return valor * 0.04;
    }

    public String toString() {
        return marca + " " + modelo + " (" + ano + ") - R$" + valor + " | IPVA: R$" + calcularIpva();
    }
}
