package metier;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class MetierImpl implements ImetierCatalogue {
@Override
public List<Equipe> getEquipesParMotCle(String mc) {
List<Equipe> prods= new ArrayList<Equipe>();
Connection conn=SingletonConnection.getConnection();
try {
PreparedStatement ps= conn.prepareStatement("select * from equipe where NOM_equipe LIKE ?");
ps.setString(1, "%"+mc+"%");
ResultSet rs = ps.executeQuery();
while (rs.next()) {
	Equipe E = new Equipe();
E.setIdEquipe(rs.getLong("ID_equipe"));
E.setNomEquipe(rs.getString("NOM_equipe"));
E.setRank(rs.getDouble("rank"));
prods.add(E);
}
} catch (SQLException e) {
e.printStackTrace();
}
return prods;
}
@Override
public void addEquipe(Equipe E) {
// TODO Auto-generated method stub
}
}
