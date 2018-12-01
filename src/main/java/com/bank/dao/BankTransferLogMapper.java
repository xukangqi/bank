package com.bank.dao;

import com.bank.pojo.BankTransferLog;
import com.bank.pojo.BankTransferLogExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface BankTransferLogMapper {
    int countByExample(BankTransferLogExample example);

    int deleteByExample(BankTransferLogExample example);

    int deleteByPrimaryKey(String transferId);

    int insert(BankTransferLog record);

    int insertSelective(BankTransferLog record);

    List<BankTransferLog> selectByExample(BankTransferLogExample example);

    BankTransferLog selectByPrimaryKey(String transferId);

    int updateByExampleSelective(@Param("record") BankTransferLog record, @Param("example") BankTransferLogExample example);

    int updateByExample(@Param("record") BankTransferLog record, @Param("example") BankTransferLogExample example);

    int updateByPrimaryKeySelective(BankTransferLog record);

    int updateByPrimaryKey(BankTransferLog record);
}