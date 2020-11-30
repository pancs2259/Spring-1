package com.luban.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {

	@Insert("insert into t1 values(1,1,1,1,'1')")
	void insert1();

	@Insert("insert into t1 values(2,2,2,2,'2')")
	void insert2();

}
