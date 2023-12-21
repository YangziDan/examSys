package com.exam.mapper.zjh;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.exam.entity.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface AdminInfoMapper extends BaseMapper<Admin> {
    @Update("update admin set adminName=#{adminName}, tel=#{tel}, email=#{email}, pwd=#{pwd} where adminId=#{adminId}")
    public void updateManage(Admin admin);

    @Select("select * from admin where adminId=#{adminId}")
    public Admin selectAdmin(Admin admin);

}
