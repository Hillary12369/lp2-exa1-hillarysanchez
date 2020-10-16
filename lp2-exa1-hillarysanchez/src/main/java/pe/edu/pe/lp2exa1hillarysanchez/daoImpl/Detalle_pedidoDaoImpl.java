package pe.edu.pe.lp2exa1hillarysanchez.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import pe.edu.pe.lp2exa1hillarysanchez.dao.Detalle_pedidoDao;
import pe.edu.pe.lp2exa1hillarysanchez.entity.Detalle_pedido;

@Repository

public class Detalle_pedidoDaoImpl implements Detalle_pedidoDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Detalle_pedido dp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Detalle_pedido dp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Detalle_pedido read(int id) {
		// TODO Auto-generated method stub
		String sql="select * from detalle_pedido where iddetalle_pedido=?";
		return jdbcTemplate.queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<Detalle_pedido>(Detalle_pedido.class));
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL = "select *from detalle_pedido";
		return jdbcTemplate.queryForList(SQL);
	}

}
