package metier;

import java.util.List;
public interface ImetierCatalogue {
public List<Equipe> getEquipesParMotCle(String mc);
public void addEquipe(Equipe E);
}