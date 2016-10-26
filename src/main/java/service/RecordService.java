package service;

import java.util.List;

import model.Record;

public interface RecordService {
	public long createRecord(Record record);
    public List<Record> getAllRecords();
    public Record getRecord(long id);	
}
