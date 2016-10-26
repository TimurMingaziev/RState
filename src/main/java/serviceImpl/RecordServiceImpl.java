package serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dao.RecordDao;
import model.Record;
import service.RecordService;

public class RecordServiceImpl implements RecordService{

	public RecordServiceImpl() {
		System.out.println("RecordServiceImpl()");
	}
	
    @Autowired
    private RecordDao recordDao;
    
	@Override
	public long createRecord(Record record) {
		return recordDao.createRecord(record);
	}

	@Override
	public List<Record> getAllRecords() {
		return recordDao.getAllRecords();
	}

	@Override
	public Record getRecord(long id) {
		return recordDao.getRecord(id);
	}

}
