package com.example.dynamicform.service;

import com.example.dynamicform.model.DyFrom;

import java.util.List;

/**
 * Created by YINPAN on 2020/3/7
 */
public interface DyFromService {


    List<DyFrom> selecAll();

    int insert(DyFrom dyFrom);
}
