import Partes.Partes;

public class main {

    public static void main(String[] args){
        Partes parts = new Partes(4,91908,
                2022, "Flex", 2.2, 16, 4);
        Partes.setColor(Partes.GRAY);
        Partes.setTire(Partes.ARO);
        Partes.printValue();
    }

}

