package com.exam.mapper.zjh;

import com.exam.entity.UserInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserInfoMapper {
    @Insert("insert into user_info VALUES (#{userId},#{userName},#{userSex},#{userPhone},#{userSchool},#{userImg})")
    public void infoInsert(UserInfo userInfo);
    @Select("select * from user_info where UserId=#{userId}")
    public UserInfo infoSelect(UserInfo userInfo);
    @Update("update user_info set UserName=#{userName},UserSex=#{userSex},UserPhone=#{userPhone},UserSchool=#{userSchool} where UserId = #{userId}")
    public void infoUpdate(UserInfo userInfo);

}
