package com.medical.service;

import com.medical.pojo.Record;
import com.medical.pojo.RecordDTO;

import java.util.List;

/**
 * ClassName:   RecordService
 * Description:
 * Author:    wenqi.guo
 * Date:      2019/1/15 21:50
 */
public interface RecordService {
    /**
     * @Description  新增病历
     * @Date  2019/1/15 21:58
     * @Param
     * @return
     **/
    public void addRecord(Record record);

    /**
     * @Description  找出未归档的病历
     * @Date  2019/1/18 19:52
     * @Param
     * @return
     **/
     public List<RecordDTO> recordList();
}
