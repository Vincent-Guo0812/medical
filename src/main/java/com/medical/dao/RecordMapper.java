package com.medical.dao;

import com.medical.pojo.Record;
import com.medical.pojo.RecordDTO;
import com.medical.pojo.RecordExample;

import java.util.Date;
import java.util.List;

import com.medical.pojo.RecoveryDTO;
import org.apache.ibatis.annotations.Param;

public interface RecordMapper {
    long countByExample(RecordExample example);

    int deleteByExample(RecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Record record);

    int insertSelective(Record record);

    List<Record> selectByExample(RecordExample example);

    Record selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Record record, @Param("example") RecordExample example);

    int updateByExample(@Param("record") Record record, @Param("example") RecordExample example);

    int updateByPrimaryKeySelective(Record record);

    int updateByPrimaryKey(Record record);

    List<RecordDTO> recordList();
    List<RecoveryDTO> fileManage();
    List<RecoveryDTO> recoveryByIdOrDate(@Param("id")Integer id, @Param("date1")Date date1,@Param("date2")Date date2);
    List<RecoveryDTO> recordForOne(@Param("id")Integer id);
}