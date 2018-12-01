package com.bank.dao;

import com.bank.pojo.BankFundLog;
import com.bank.pojo.BankFundLogExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface BankFundLogMapper {
    int countByExample(BankFundLogExample example);

    int deleteByExample(BankFundLogExample example);

    int deleteByPrimaryKey(String fundTxId);

    int insert(BankFundLog record);

    int insertSelective(BankFundLog record);

    List<BankFundLog> selectByExample(BankFundLogExample example);

    BankFundLog selectByPrimaryKey(String fundTxId);

    int updateByExampleSelective(@Param("record") BankFundLog record, @Param("example") BankFundLogExample example);

    int updateByExample(@Param("record") BankFundLog record, @Param("example") BankFundLogExample example);

    int updateByPrimaryKeySelective(BankFundLog record);

    int updateByPrimaryKey(BankFundLog record);
}