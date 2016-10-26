package dao;

import java.util.List;

import model.RealState;

public interface RealStateDao {
	public long createRealState(RealState realState);
    public List<RealState> getAllRealStates();
    public RealState getRealState(long id);	
}
