import java.util.ArrayList;

public class Concessionaria {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(new Carro("ABC1234", "Toyota", "Corolla", 2020, 95000, 4));
        veiculos.add(new Carro("DEF5678", "Honda", "Civic", 2021, 110000, 4));
        veiculos.add(new Carro("GHI9012", "Fiat", "Argo", 2019, 65000, 4));
        veiculos.add(new Moto("JKL3456", "Yamaha", "MT-03", 2022, 28000, 321));
        veiculos.add(new Moto("MNO7890", "Honda", "CG 160", 2023, 18000, 162));
        veiculos.add(new Caminhao("PQR1122", "Volvo", "FH 540", 2018, 380000, 7));

        System.out.println("=== Concessionária - Lista de Veículos ===");
        for (Veiculo v : veiculos) {
            System.out.println(v.toString());
        }
    }
}
