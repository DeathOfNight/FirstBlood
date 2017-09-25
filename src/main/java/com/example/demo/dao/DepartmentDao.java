package com.example.demo.dao;

import com.example.demo.data.Department;
import com.example.demo.data.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/9/16 0016.
 */
public interface DepartmentDao {
    /**
     * 查询
     * @param map
     * @return
     */
    List<UserInfo> selectDepartmentBypage(Map<String,Object> map);


    /**
     * 删除通过Id
     * @param id
     * @return
     */
    void delectById(@Param("id") String id);

}
