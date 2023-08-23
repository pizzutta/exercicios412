package pizzutti.exercicios.model;

public class Conta {

    private String nomeTitular;
    private int numero;
    private String agencia;
    private double saldo;
    private Data dataAbertura;

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Data getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(Data dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public void saca(double valor) {
        this.saldo -= valor;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public double calculaRendimento() {
        return this.saldo * 0.1;
    }

    public String recuperaDadosParaImpressao() {
        return "Conta{\n"
                + "\tnomeTitular='" + this.nomeTitular + "',\n"
                + "\tnumero=" + this.numero + "',\n"
                + "\tagencia='" + this.agencia + "',\n"
                + "\tsaldo=" + this.saldo + ",\n"
                + "\tdataAbertura='" + this.dataAbertura.formatada() + "'"
                + "}";
    }
}
