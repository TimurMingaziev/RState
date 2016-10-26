package daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dao.RecordDao;
import model.Record;
import util.HibernateUtil;

public class RecordDaoImpl implements RecordDao {

	@Autowired
    private HibernateUtil hibernateUtil;
	
	@Override
	public long createRecord(Record record) {
		String query = "SELECT e.* FROM e.Record e "
				+ "WHERE e.date like '%"+ record.getDate() +"%'"
						+ " AND e.realState like '%"+ record.getRealState().getId() +"%'";
		List<Object[]> result = hibernateUtil.fetchAll(query);
		if(result.size()==0)
			return (Long) hibernateUtil.create(record);
		else 
			return 0;
	}

	@Override
	public List<Record> getAllRecords() {
		return hibernateUtil.fetchAll(Record.class);
	}

	@Override
	public Record getRecord(long id) {
		return hibernateUtil.fetchById(id, Record.class);
	}

}
