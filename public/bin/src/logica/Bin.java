package logica;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Bin {
    public static void main(String[] args) {
        // TODO code application logic here
        List<Auto> carro = Arrays.asList(
                new Auto("Juan", "Prada", 24),
                new Auto("Juan", "Ospina", 25),
                new Auto("Esteban", "Prada", 23),
                new Auto("Esteban", "Ospina", 22),
                new Auto("Juan", "Moreno", 21),
                new Auto("Esteban", "Moreno", 20)
        );
        List<Auto> precio = new ArrayList<Auto>(carro);
        precio.sort(Comparator.comparing(Auto::getCosto));
        precio.forEach(System.out::println);
        
        carro.stream()
                .sorted(Comparator
                .comparing(Auto::getMarca)
                .thenComparing(Auto::getCosto))
                .forEach(System.out::println);
        
        carro.stream()
                .filter(auto->auto.getCosto()<=23)
                .forEach(System.out::println);
    }
}