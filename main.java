import Carro.Carro;

public class main {

    public static void main(String[] args){
        Carro parts = new Carro(4,91908,
                2022, "Flex", 2.2, 16, 4);
        Carro.setColor(Carro.GRAY);
        Carro.setTire(Carro.ARO);
        Carro.printValue();
    }

}

