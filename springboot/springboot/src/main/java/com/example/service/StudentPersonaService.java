package com.example.service;

import com.example.dao.StudentPersonaDao;
import com.example.entity.Params;
import com.example.entity.StudentPersona;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class StudentPersonaService {
    @Resource
    private StudentPersonaDao studentPersonaDao;
    public List<StudentPersona> findAll(){
        return studentPersonaDao.findAll();
    }

    public List<StudentPersona> findAll2(){
        return studentPersonaDao.findAll2();
    }

    public List<StudentPersona> findAll3(){
        return studentPersonaDao.findAll3();
    }
    public List<StudentPersona> findAll4(){
        return studentPersonaDao.findAll4();
    }
    public List<StudentPersona> findAll5(){
        return studentPersonaDao.findAll5();
    }
    public List<StudentPersona> findAll6(){
        return studentPersonaDao.findAll6();
    }

    public PageInfo<StudentPersona> findBySearch(Params params) {
        //开启分页查询
        PageHelper.startPage(params.getPageNum(),params.getPageSize());
        //接下来的查询会自动按照当前开启的分页设置来查询
        List<StudentPersona> list = studentPersonaDao.findBySearch(params);
        return PageInfo.of(list);
    }
}
