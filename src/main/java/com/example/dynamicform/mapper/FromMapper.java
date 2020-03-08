package com.example.dynamicform.mapper;

import org.apache.ibatis.annotations.*;
import com.example.dynamicform.model.DyFrom;

import java.util.List;

/**
 * Created by YINPAN on 2020/3/7
 */
public interface FromMapper {

    @Select("select * from dy_from")
    List<DyFrom> selectAll();

    @Insert({"insert into dy_from(from_text, from_type, from_state) values(#{from_text},#{from_type},#{from_state} )"})
    int insert(DyFrom dyFrom);


    @Update("")
    int update(DyFrom dyFrom);

}
