package com.chong.mcspcgoodsservice.dao;

import com.chong.mcspcgoodsservice.entity.McMember;
import java.util.List;

public interface McMemberMapper {
    int deleteByPrimaryKey(Long id);

    int insert(McMember record);

    McMember selectByPrimaryKey(Long id);

    List<McMember> selectAll();

    int updateByPrimaryKey(McMember record);
}