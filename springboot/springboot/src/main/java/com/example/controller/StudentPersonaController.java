package com.example.controller;

import cn.hutool.core.collection.CollectionUtil;
import cn.hutool.core.util.ObjectUtil;
import com.example.common.Result;
import com.example.entity.Params;
import com.example.entity.StudentPersona;
import com.example.service.StudentPersonaService;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@CrossOrigin
@RestController
@RequestMapping("/studentpersona")
public class StudentPersonaController {

    @Resource
    private StudentPersonaService studentPersonaService;

    @GetMapping("/getWarning")
    public Result findAll(){
        List<StudentPersona> list = studentPersonaService.findAll();
        return Result.success(list);
    }

    @GetMapping("/search")
    public Result findBySearch(Params params){
        PageInfo<StudentPersona> info = studentPersonaService.findBySearch(params);
        return Result.success(info);
    }

    @GetMapping("/echarts/pie")
    public Result pie(){
        //查询所有学生画像结果
        List<StudentPersona> list = studentPersonaService.findAll();
        Map<String,Long> collect = list.stream()
                .filter(x -> ObjectUtil.isNotEmpty(x.getLearningtimetypeName()))
                .collect(Collectors.groupingBy(StudentPersona::getLearningtimetypeName,Collectors.counting()));
        List<Map<String,Object>> maplist = new ArrayList<>();
        if(CollectionUtil.isNotEmpty(collect)){
            for(String key:collect.keySet()){
                Map<String ,Object> map = new HashMap<>();
                map.put("name",key);
                map.put("value",collect.get(key));
                maplist.add(map);
            }
        }
        return Result.success(maplist);
    }

    @GetMapping("/echarts/pie2")
    public Result pie2(){
        //查询所有学生画像结果
        List<StudentPersona> list = studentPersonaService.findAll2();
        Map<String,Long> collect = list.stream()
                .filter(x -> ObjectUtil.isNotEmpty(x.getResourcepreferencetypeName()))
                .collect(Collectors.groupingBy(StudentPersona::getResourcepreferencetypeName,Collectors.counting()));
        List<Map<String,Object>> maplist = new ArrayList<>();
        if(CollectionUtil.isNotEmpty(collect)){
            for(String key:collect.keySet()){
                Map<String ,Object> map = new HashMap<>();
                map.put("name",key);
                map.put("value",collect.get(key));
                maplist.add(map);
            }
        }
        return Result.success(maplist);
    }

    @GetMapping("/echarts/pie3")
    public Result pie3(){
        //查询所有学生画像结果
        List<StudentPersona> list = studentPersonaService.findAll3();
        Map<String,Long> collect = list.stream()
                .filter(x -> ObjectUtil.isNotEmpty(x.getInteractiontypeName()))
                .collect(Collectors.groupingBy(StudentPersona::getInteractiontypeName,Collectors.counting()));
        List<Map<String,Object>> maplist = new ArrayList<>();
        if(CollectionUtil.isNotEmpty(collect)){
            for(String key:collect.keySet()){
                Map<String ,Object> map = new HashMap<>();
                map.put("name",key);
                map.put("value",collect.get(key));
                maplist.add(map);
            }
        }
        return Result.success(maplist);
    }

    @GetMapping("/echarts/pie4")
    public Result pie4(){
        //查询所有学生画像结果
        List<StudentPersona> list = studentPersonaService.findAll4();
        Map<String,Long> collect = list.stream()
                .filter(x -> ObjectUtil.isNotEmpty(x.getTimepreferencetypeName()))
                .collect(Collectors.groupingBy(StudentPersona::getTimepreferencetypeName,Collectors.counting()));
        List<Map<String,Object>> maplist = new ArrayList<>();
        if(CollectionUtil.isNotEmpty(collect)){
            for(String key:collect.keySet()){
                Map<String ,Object> map = new HashMap<>();
                map.put("name",key);
                map.put("value",collect.get(key));
                maplist.add(map);
            }
        }
        return Result.success(maplist);
    }

    @GetMapping("/echarts/pie5")
    public Result pie5(){
        //查询所有学生画像结果
        List<StudentPersona> list = studentPersonaService.findAll5();
        Map<String,Long> collect = list.stream()
                .filter(x -> ObjectUtil.isNotEmpty(x.getDedicationtypeName()))
                .collect(Collectors.groupingBy(StudentPersona::getDedicationtypeName,Collectors.counting()));
        List<Map<String,Object>> maplist = new ArrayList<>();
        if(CollectionUtil.isNotEmpty(collect)){
            for(String key:collect.keySet()){
                Map<String ,Object> map = new HashMap<>();
                map.put("name",key);
                map.put("value",collect.get(key));
                maplist.add(map);
            }
        }
        return Result.success(maplist);
    }

    @GetMapping("/echarts/pie6")
    public Result pie6(){
        //查询所有学生画像结果
        List<StudentPersona> list = studentPersonaService.findAll6();
        Map<String,Long> collect = list.stream()
                .filter(x -> ObjectUtil.isNotEmpty(x.getGradestypeName()))
                .collect(Collectors.groupingBy(StudentPersona::getGradestypeName,Collectors.counting()));
        List<Map<String,Object>> maplist = new ArrayList<>();
        if(CollectionUtil.isNotEmpty(collect)){
            for(String key:collect.keySet()){
                Map<String ,Object> map = new HashMap<>();
                map.put("name",key);
                map.put("value",collect.get(key));
                maplist.add(map);
            }
        }
        return Result.success(maplist);
    }
}
