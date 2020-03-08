package com.example.dynamicform.service.impl;

import com.example.dynamicform.mapper.FromMapper;
import com.example.dynamicform.model.DyFrom;
import com.example.dynamicform.service.DyFromService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by YINPAN on 2020/3/7
 */
@Service
public class DyFromServiceImpl implements DyFromService {

  @Autowired
  FromMapper fromMapper;


    @Override
    public List<DyFrom> selecAll() {

        return fromMapper.selectAll();
    }

  @Override
  public int insert(DyFrom dyFrom) {
    return fromMapper.insert(dyFrom);
  }
}
