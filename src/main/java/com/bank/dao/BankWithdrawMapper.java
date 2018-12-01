package com.bank.dao;

import com.bank.pojo.BankWithdraw;
import com.bank.pojo.BankWithdrawExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface BankWithdrawMapper {
    int countByExample(BankWithdrawExample example);

    int deleteByExample(BankWithdrawExample example);

    int deleteByPrimaryKey(String withdrawId);

    int insert(BankWithdraw record);

    int insertSelective(BankWithdraw record);

    List<BankWithdraw> selectByExample(BankWithdrawExample example);

    BankWithdraw selectByPrimaryKey(String withdrawId);

    int updateByExampleSelective(@Param("record") BankWithdraw record, @Param("example") BankWithdrawExample example);

    int updateByExample(@Param("record") BankWithdraw record, @Param("example") BankWithdrawExample example);

    int updateByPrimaryKeySelective(BankWithdraw record);

    int updateByPrimaryKey(BankWithdraw record);
}