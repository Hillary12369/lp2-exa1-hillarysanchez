package pe.edu.pe.lp2exa1hillarysanchez.service;

import pe.edu.pe.lp2exa1hillarysanchez.entity.Usuario;

import java.util.List;
import java.util.Map;

public interface UsuarioService {
	int create(Usuario u);
    int update(Usuario u);
    int delete(int id);
    Usuario read(String nomuser);
    List<Map<String, Object>> readAll();

}
