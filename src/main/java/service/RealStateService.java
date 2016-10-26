package service;

import java.util.List;

import model.RealState;

public interface RealStateService {
	public long createRealState(RealState realState);
    public List<RealState> getAllRealStates();
    public RealState getRealState(long id);	
}
