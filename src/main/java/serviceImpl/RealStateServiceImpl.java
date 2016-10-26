package serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dao.RealStateDao;
import model.RealState;
import service.RealStateService;

public class RealStateServiceImpl implements RealStateService {
	public RealStateServiceImpl() {
		System.out.println("RealStateServiceImpl()");
	}
	
    @Autowired
    private RealStateDao realStateDao;
    
	@Override
	public long createRealState(RealState realState) {
		return realStateDao.createRealState(realState);
	}

	@Override
	public List<RealState> getAllRealStates() {
		return realStateDao.getAllRealStates();
	}

	@Override
	public RealState getRealState(long id) {
		return realStateDao.getRealState(id);
	}

}
