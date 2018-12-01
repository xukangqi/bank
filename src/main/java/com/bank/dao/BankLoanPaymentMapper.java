package com.bank.dao;

import com.bank.pojo.BankLoanPayment;
import com.bank.pojo.BankLoanPaymentExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface BankLoanPaymentMapper {
    int countByExample(BankLoanPaymentExample example);

    int deleteByExample(BankLoanPaymentExample example);

    int deleteByPrimaryKey(String paymentId);

    int insert(BankLoanPayment record);

    int insertSelective(BankLoanPayment record);

    List<BankLoanPayment> selectByExample(BankLoanPaymentExample example);

    BankLoanPayment selectByPrimaryKey(String paymentId);

    int updateByExampleSelective(@Param("record") BankLoanPayment record, @Param("example") BankLoanPaymentExample example);

    int updateByExample(@Param("record") BankLoanPayment record, @Param("example") BankLoanPaymentExample example);

    int updateByPrimaryKeySelective(BankLoanPayment record);

    int updateByPrimaryKey(BankLoanPayment record);
}