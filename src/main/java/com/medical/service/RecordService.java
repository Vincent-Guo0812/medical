package com.medical.service;

import com.medical.pojo.Record;
import com.medical.pojo.RecordDTO;
import com.medical.pojo.RecoveryDTO;

import java.util.Date;
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

     /**
      * @Description  查询所有已经归档的病历
      * @Date  2019/1/19 11:20
      * @Param
      * @return
      **/
     public List<RecoveryDTO> recoveryList();

     /**
      * @Description  按照日期或病人ID查询病历
      * @Date  2019/1/19 16:21
      * @Param
      * @return
      **/
     public List<RecoveryDTO> recoveryByIdOrDate(Integer id, Date date1,Date date2);
}
