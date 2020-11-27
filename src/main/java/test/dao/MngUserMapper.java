package test.dao;

import test.model.MngUser;

import java.util.List;

public interface MngUserMapper {
    int deleteByPrimaryKey(String userName);

    int insert(MngUser record);

    MngUser selectByPrimaryKey(String userName);

    List<MngUser> selectAll();

    int updateByPrimaryKey(MngUser record);
}