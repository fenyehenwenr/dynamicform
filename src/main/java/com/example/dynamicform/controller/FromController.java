package com.example.dynamicform.controller;

import com.example.dynamicform.model.DyFrom;
import com.example.dynamicform.service.DyFromService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YINPAN on 2020/3/7
 */
@RestController
public class FromController {


     @Autowired
     DyFromService dyFromService;


    /**
     * 查询所有的标签属性
     * @param mv
     * @return
     */
    @GetMapping("/from")
    public ModelAndView home(ModelAndView mv) {
        List<DyFrom> dyFroms = dyFromService.selecAll();
        List<DyFrom> dy=new ArrayList<>();//返回给前台的数据
        mv.setViewName("from_index");
        for (int i=0;i<dyFroms.size();i++){
            DyFrom dyFrom =new DyFrom();
            int type =dyFroms.get(i).getFrom_type();//类型id
            String ftext = ""; //类型文本
            switch (type){
                case 0: ftext = "文本";break;
                case 1: ftext = "密码文本";break;
                case 2: ftext = "时间日期";break;
                case 3: ftext = "选择框";break;
            }
            dyFrom.setId(dyFroms.get(i).getId());
            dyFrom.setFrom_text(dyFroms.get(i).getFrom_text());
            dyFrom.setFrom_state(dyFroms.get(i).getFrom_state());
            dyFrom.setFtext(ftext);
            dy.add(dyFrom);
        }
        mv.addObject("dyFroms",dy);
        return mv;
    }

    /**
     * 添加表单标签
     * @param dyFrom
     * @return
     */
    @PostMapping("/from")
    public ResponseEntity<?> InsertPrint(@RequestBody DyFrom dyFrom){
            int code= dyFromService.insert(dyFrom);
            if (code==1){
            return ResponseEntity.ok(code);
        }
        return new ResponseEntity<>("添加失败", HttpStatus.BAD_REQUEST);
    }


    @GetMapping("/preview")
    public ModelAndView selecView(ModelAndView mv) {
        List<DyFrom> dyFroms = dyFromService.selecAll();
        mv.setViewName("from_view");
        mv.addObject("fromview",dyFroms);
        return mv;
    }
}
