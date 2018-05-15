package com.warehouse.mapper.branch;

import com.warehouse.pojo.branch.BsBranchCampusGoods;

public interface BsBranchCampusGoodsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BsBranchCampusGoods record);

    int insertSelective(BsBranchCampusGoods record);

    BsBranchCampusGoods selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BsBranchCampusGoods record);

    int updateByPrimaryKey(BsBranchCampusGoods record);
}