package com.ncu.jdbc;

import java.util.List;

import com.ncu.model.ModelDemo;

public interface UserDao {
	
	public void update(ModelDemo modeldemo);
	
	public void delete(String rollnumber);
	
	public List<ModelDemo> showall();

	public void add(ModelDemo modeldemo);
}
