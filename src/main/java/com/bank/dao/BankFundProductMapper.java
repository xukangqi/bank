package com.bank.dao;

import com.bank.pojo.BankFundProduct;
import com.bank.pojo.BankFundProductExample;
import com.bank.pojo.BankFundProductKey;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface BankFundProductMapper {
    int countByExample(BankFundProductExample example);

    int deleteByExample(BankFundProductExample example);

    int deleteByPrimaryKey(BankFundProductKey key);

    int insert(BankFundProduct record);

    int insertSelective(BankFundProduct record);

    List<BankFundProduct> selectByExample(BankFundProductExample example);

    BankFundProduct selectByPrimaryKey(BankFundProductKey key);

    int updateByExampleSelective(@Param("record") BankFundProduct record, @Param("example") BankFundProductExample example);

    int updateByExample(@Param("record") BankFundProduct record, @Param("example") BankFundProductExample example);

    int updateByPrimaryKeySelective(BankFundProduct record);

    int updateByPrimaryKey(BankFundProduct record);
}