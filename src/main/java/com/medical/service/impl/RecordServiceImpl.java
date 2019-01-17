package com.medical.service.impl;

import com.medical.dao.RecordMapper;
import com.medical.pojo.Record;
import com.medical.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

}
