package com.cg.mapper.generate;

import com.cg.entity.generate.Goods;
import com.cg.entity.generate.GoodsExample;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface CoodsMapper{
    int countByExample(GoodsExample example);

    int deleteByExample(GoodsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Goods record);

    int insertSelective(Goods record);

    List<Goods> selectByExample(GoodsExample example);

    Goods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Goods record);

    int updateByPrimaryKey(Goods record);
}