package com.medical.service.impl;

import com.medical.dao.RecordMapper;
import com.medical.pojo.Record;
import com.medical.pojo.RecordDTO;
import com.medical.pojo.RecoveryDTO;
import com.medical.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * ClassName:   RecordServiceImpl
 * Description:
 * Author:    wenqi.guo
 * Date:      2019/1/15 21:52
 */
@Service
public class RecordServiceImpl implements RecordService {
    @Autowired
    private RecordMapper recordMapper;
    @Override
    public void addRecord(Record record){
        recordMapper.insert(record);

    }

    @Override
    public List<RecordDTO> recordList(){
        return recordMapper.recordList();
    }

    @Override
    public List<RecoveryDTO> recoveryList(){
        return recordMapper.fileManage();
    }

    @Override
    public List<RecoveryDTO> recoveryByIdOrDate(Integer id, Date date1, Date date2){
        return recordMapper.recoveryByIdOrDate(id,date1,date2);
    }



}
