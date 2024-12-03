package com.microservice.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.microservice.model.Microservice;

@Mapper
public interface IMicroserviceRepository {

    @Select("select * from microservice")
    @Results({
            @Result(property = "name", column = "user_name"),
            @Result(property = "emailId", column = "email_Id")

    })
    List<Microservice> getAll();




}
