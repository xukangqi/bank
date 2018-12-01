package com.bank.dao;

import com.bank.pojo.BankLoanType;
import com.bank.pojo.BankLoanTypeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface BankLoanTypeMapper {
    int countByExample(BankLoanTypeExample example);

    int deleteByExample(BankLoanTypeExample example);

    int deleteByPrimaryKey(String loanTypeName);

    int insert(BankLoanType record);

    int insertSelective(BankLoanType record);

    List<BankLoanType> selectByExample(BankLoanTypeExample example);

    BankLoanType selectByPrimaryKey(String loanTypeName);

    int updateByExampleSelective(@Param("record") BankLoanType record, @Param("example") BankLoanTypeExample example);

    int updateByExample(@Param("record") BankLoanType record, @Param("example") BankLoanTypeExample example);

    int updateByPrimaryKeySelective(BankLoanType record);

    int updateByPrimaryKey(BankLoanType record);
}