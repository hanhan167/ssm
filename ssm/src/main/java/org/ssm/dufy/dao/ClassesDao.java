package org.ssm.dufy.dao;

import java.util.List;

import org.ssm.dufy.entity.Classes;

public interface ClassesDao {
	
	/**
	 * 根据cid查询班级信息和班级老师信息
	 * @param id
	 * @return
	 */
	public Classes getClass(int id);
	
	public Classes getClass2(int id);
	
	public Classes getClass3(int id);

	public List<Classes> getClass4();
}
