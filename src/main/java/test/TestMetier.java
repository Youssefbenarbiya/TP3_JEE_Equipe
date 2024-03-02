package test;
import java.util.List;

import metier.Equipe;
import metier.MetierImpl;
public class TestMetier {
public static void main(String[] args) {
MetierImpl metier= new MetierImpl();
List<Equipe> prods = metier.getEquipesParMotCle("Real");
for (Equipe E : prods)
System.out.println(E.getNomEquipe());
}
}