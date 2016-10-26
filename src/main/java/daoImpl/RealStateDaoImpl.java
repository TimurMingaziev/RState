package daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dao.RealStateDao;
import model.RealState;
import util.HibernateUtil;

public class RealStateDaoImpl implements RealStateDao{

	@Autowired
    private HibernateUtil hibernateUtil;
	
	@Override
	public long createRealState(RealState realState) {
		String query = "SELECT e.* FROM e.RealState e "
				+ "WHERE e.name like '%"+ realState.getName() +"%'";
		List<Object[]> result = hibernateUtil.fetchAll(query);
		if(result.size()==0)
			return (Long) hibernateUtil.create(realState);
		else 
			return 0;
	}

	@Override
	public List<RealState> getAllRealStates() {
		return hibernateUtil.fetchAll(RealState.class);
	}

	@Override
	public RealState getRealState(long id) {
		return hibernateUtil.fetchById(id, RealState.class);
	}

}
