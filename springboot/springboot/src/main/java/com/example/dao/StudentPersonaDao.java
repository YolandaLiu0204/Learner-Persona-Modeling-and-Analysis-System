package com.example.dao;

import com.example.entity.Params;
import com.example.entity.StudentPersona;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Repository
public interface StudentPersonaDao extends Mapper<StudentPersona> {
    @Select("select studentpersona.*,learningtimetype.name as learningtimetypeName from studentpersona left join learningtimetype on studentpersona.learningtime = learningtimetype.id")
    List<StudentPersona> findAll();
    @Select("select studentpersona.*,resourcepreferencetype.name as resourcepreferencetypeName from studentpersona left join resourcepreferencetype on studentpersona.resourcepreference = resourcepreferencetype.id")
    List<StudentPersona> findAll2();
    @Select("select studentpersona.*,interactiontype.name as interactiontypeName from studentpersona left join interactiontype on studentpersona.interaction = interactiontype.id")
    List<StudentPersona> findAll3();
    @Select("select studentpersona.*,timepreferencetype.name as timepreferencetypeName from studentpersona left join timepreferencetype on studentpersona.timepreference = timepreferencetype.id")
    List<StudentPersona> findAll4();
    @Select("select studentpersona.*,dedicationtype.name as dedicationtypeName from studentpersona left join dedicationtype on studentpersona.dedication = dedicationtype.id")
    List<StudentPersona> findAll5();
    @Select("select studentpersona.*,gradestype.name as gradestypeName from studentpersona left join gradestype on studentpersona.grades = gradestype.id")
    List<StudentPersona> findAll6();

    List<StudentPersona> findBySearch(@Param("params") Params params);
}
