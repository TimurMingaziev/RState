package dao;

import java.util.List;

import model.Record;


public interface RecordDao {

	public long createRecord(Record record);
    public List<Record> getAllRecords();
    public Record getRecord(long id);	
}
