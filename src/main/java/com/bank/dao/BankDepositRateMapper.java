package com.bank.dao;

import com.bank.pojo.BankDepositRate;
import com.bank.pojo.BankDepositRateExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface BankDepositRateMapper {
    int countByExample(BankDepositRateExample example);

    int deleteByExample(BankDepositRateExample example);

    int deleteByPrimaryKey(String updateDate);

    int insert(BankDepositRate record);

    int insertSelective(BankDepositRate record);

    List<BankDepositRate> selectByExample(BankDepositRateExample example);

    BankDepositRate selectByPrimaryKey(String updateDate);

    int updateByExampleSelective(@Param("record") BankDepositRate record, @Param("example") BankDepositRateExample example);

    int updateByExample(@Param("record") BankDepositRate record, @Param("example") BankDepositRateExample example);

    int updateByPrimaryKeySelective(BankDepositRate record);

    int updateByPrimaryKey(BankDepositRate record);
}