package pe.edu.pe.lp2exa1hillarysanchez.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.pe.lp2exa1hillarysanchez.dao.Detalle_pedidoDao;
import pe.edu.pe.lp2exa1hillarysanchez.entity.Detalle_pedido;
import pe.edu.pe.lp2exa1hillarysanchez.service.Detalle_pedidoService;

@Service

public class Detalle_pedidoServiceImpl implements Detalle_pedidoService{
	
	@Autowired
	private Detalle_pedidoDao detalle_pedidodao; 

	@Override
	public int create(Detalle_pedido dp) {
		// TODO Auto-generated method stub
		return detalle_pedidodao.create(dp);
	}

	@Override
	public int update(Detalle_pedido  dp) {
		// TODO Auto-generated method stub
		return detalle_pedidodao.update(dp);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return detalle_pedidodao.delete(id);
	}

	@Override
	public Detalle_pedido read(int id) {
		// TODO Auto-generated method stub
		return detalle_pedidodao.read(id);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return detalle_pedidodao.readAll();
	}
}