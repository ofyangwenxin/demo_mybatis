package test.dao;

import test.model.MngSysLog;

import java.util.List;

public interface MngSysLogMapper {
    int deleteByPrimaryKey(Short logId);

    int insert(MngSysLog record);

    MngSysLog selectByPrimaryKey(Short logId);

    List<MngSysLog> selectAll();

    int updateByPrimaryKey(MngSysLog record);
}