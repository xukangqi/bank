package com.bank.dao;

import com.bank.pojo.BankRemitLog;
import com.bank.pojo.BankRemitLogExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface BankRemitLogMapper {
    int countByExample(BankRemitLogExample example);

    int deleteByExample(BankRemitLogExample example);

    int deleteByPrimaryKey(String remitId);

    int insert(BankRemitLog record);

    int insertSelective(BankRemitLog record);

    List<BankRemitLog> selectByExample(BankRemitLogExample example);

    BankRemitLog selectByPrimaryKey(String remitId);

    int updateByExampleSelective(@Param("record") BankRemitLog record, @Param("example") BankRemitLogExample example);

    int updateByExample(@Param("record") BankRemitLog record, @Param("example") BankRemitLogExample example);

    int updateByPrimaryKeySelective(BankRemitLog record);

    int updateByPrimaryKey(BankRemitLog record);
}