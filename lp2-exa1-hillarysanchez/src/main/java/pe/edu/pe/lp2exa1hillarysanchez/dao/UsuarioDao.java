package pe.edu.pe.lp2exa1hillarysanchez.dao;

import java.util.List;
import java.util.Map;

import pe.edu.pe.lp2exa1hillarysanchez.entity.Usuario;

public interface UsuarioDao {
	int create(Usuario u);
    int update(Usuario u);
    int delete(int id);
    Usuario read(String nomuser);
    List<Map<String, Object>> readAll();
}
