package Carro;

public class Carro {
    private static Integer quantidadeRodas;
    private static Integer quantidadeValvulas;
    private static double tipoMotor;
    private static Integer quantidadePortas;
    private static Integer quantidadeCalotas;
    private static Integer quantidadeParafusosRoda;
    private static Integer numeroChassi;
    private static Integer anoFabricacao;
    private static String tipoCombustivel;



    public Carro (Integer quantidadeRodas, Integer numeroChassi, Integer anoFabricacao,
                   String tipoCombustivel, double tipoMotor,
                   Integer quantidadeValvulas, Integer quantidadePortas){
        setQuantidadeRodas(quantidadeRodas);
        setAnoFabricacao(anoFabricacao);
        setNumeroChassi(numeroChassi);
        setTipoCombustivel(tipoCombustivel);
        setTipoMotor(tipoMotor);
        setQuantidadeValvulas(quantidadeValvulas);
        setQuantidadePortas(quantidadePortas);
    }
    public static Integer getQuantidadeRodas(){
        return quantidadeRodas + 1;
    }

    public void setQuantidadeRodas(Integer quantidadeRodas){
        quantidadeCalotas = quantidadeRodas;
        quantidadeParafusosRoda = quantidadeRodas * 4;
        this.quantidadeRodas = quantidadeRodas;
    }

    public static Integer getQuantidadeCalotas() {
        return quantidadeCalotas;
    }
    public void setQuantidadeCalotas(){
        this.setQuantidadeCalotas();
    }

    public static Integer getQuantidadeParafusosRoda(){
        return quantidadeParafusosRoda;
    }

    public void setQuantidadeParafusosRoda(){
        this.setQuantidadeParafusosRoda();
    }

    public static final String ARO = "Pneus aro 22''";
    public static void setTire(String tire){
        System.out.println(tire);
    }

    public static final String GRAY = "Vermelho";

    public static void setColor(String color) {
        System.out.println("-----CARROCERIA-----");
        System.out.println(color);
    }

    public static Integer getQuantidadeValvulas() {
        return quantidadeValvulas;
    }

    public static void setQuantidadeValvulas(Integer quantidadeValvulas) {
        Carro.quantidadeValvulas = quantidadeValvulas;
    }

    public static double getTipoMotor() {
        return tipoMotor;
    }

    public static void setTipoMotor(double tipoMotor) {
        Partes.tipoMotor = tipoMotor;
    }

    public static Integer getQuantidadePortas() {
        return quantidadePortas;
    }

    public static void setQuantidadePortas(Integer quantidadePortas) {
        Partes.quantidadePortas = quantidadePortas;
    }

    public static void setQuantidadeCalotas(Integer quantidadeCalotas) {
        Partes.quantidadeCalotas = quantidadeCalotas;
    }

    public static void setQuantidadeParafusosRoda(Integer quantidadeParafusosRoda) {
        Partes.quantidadeParafusosRoda = quantidadeParafusosRoda;
    }

    public static Integer getNumeroChassi() {
        return numeroChassi = numeroChassi;
    }

    public static void setNumeroChassi(Integer numeroChassi) {
        Partes.numeroChassi = numeroChassi;
    }

    public static Integer getAnoFabricacao() {
        return anoFabricacao = anoFabricacao;
    }

    public static void setAnoFabricacao(Integer anoFabricacao) {
        Partes.anoFabricacao = anoFabricacao;
    }

    public static String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public static void setTipoCombustivel(String tipoCombustivel) {
        Partes.tipoCombustivel = tipoCombustivel;
    }

    public static void printValue(){


        System.out.println("Quantidade de portas: " + quantidadePortas);
        System.out.println("Quantidade de rodas: " + quantidadeRodas);
        System.out.println("Calotas: " + getQuantidadeCalotas());
        System.out.println("Parafusos: " + getQuantidadeParafusosRoda());
        System.out.println("Número de chassi: " + numeroChassi);
        System.out.println("Ano de fabricação: " + anoFabricacao);

        System.out.println("-----ESPECIFICAÇÕES DO MOTOR------");
        System.out.println("Tipo do motor: " + tipoMotor);
        System.out.println("Combustível: " + tipoCombustivel);
        System.out.println("Quantidade de valvulas: " + quantidadeValvulas);

    }

}