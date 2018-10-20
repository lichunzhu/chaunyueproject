package com.chunyue.project.dao;

import com.chunyue.project.model.UQ;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UQMapper {
    List<UQ> selectByUserId(String uid);
}
