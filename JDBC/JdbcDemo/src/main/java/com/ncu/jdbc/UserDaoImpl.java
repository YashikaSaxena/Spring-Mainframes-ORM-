package com.ncu.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;
import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;
import com.ncu.model.ModelDemo;

class StudentRowMapper implements RowMapper {

	public ModelDemo mapRow(ResultSet rs, int rowNum) throws SQLException {
		ModelDemo modeldemo = new ModelDemo();
		modeldemo.setFname(rs.getString(1));
		modeldemo.setLname(rs.getString(2));
		modeldemo.setRollnumber(rs.getString(3));
		modeldemo.setEmail(rs.getString(4));
		modeldemo.setPassword(rs.getString(5));
		   
        return modeldemo;
	}

	@Override
	public int[] getRowsForPaths(TreePath[] path) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private JdbcTemplate jdbc;
	
	public UserDaoImpl(DataSource ds)
	{
		jdbc=new JdbcTemplate(ds);
	}
	

	@Override
	public void delete(String rollnumber) {
		// TODO Auto-generated method stub
		String sql = "delete from student_info where rollnumber=?";
        jdbc.update(sql, new Object[]{rollnumber});
	}	


	
	@Override
	public void add(ModelDemo modeldemo) {
		// TODO Auto-generated method stub
		String insertquery="insert into student_info values(?,?,?,?,?)";
		jdbc.update(insertquery,new Object[] {modeldemo.getFname(),modeldemo.getLname(),modeldemo.getRollnumber(),modeldemo.getEmail(),modeldemo.getPassword()});
	}


	@Override
	public void update(ModelDemo modeldemo) {
		// TODO Auto-generated method stub
		String sql = "update student_info set email=?,password=?,fname=?,lname=? where rollnumber=?";
		jdbc.update(sql,new Object[] {modeldemo.getEmail(),modeldemo.getPassword(),modeldemo.getFname(),modeldemo.getLname(),modeldemo.getRollnumber()});
		
	}


	@Override
	public List<ModelDemo> showall() {
		// TODO Auto-generated method stub
		String sql = "select * from student_info";

        List<ModelDemo> studentlist = jdbc.query(sql, new ResultSetExtractor<List<ModelDemo>>(){
		public List<ModelDemo> extractData(ResultSet rs) throws SQLException, DataAccessException {
			 List<ModelDemo> list = new ArrayList<ModelDemo>();
               while (rs.next())
               {
                   ModelDemo modeldemo = new ModelDemo();
                   modeldemo.setFname(rs.getString(1));
                   modeldemo.setLname(rs.getString(2));
                   modeldemo.setRollnumber(rs.getString(3));
                   modeldemo.setEmail(rs.getString(4));
                   modeldemo.setPassword(rs.getString(5));
                   
                   list.add(modeldemo);
               }
               return list;
		}
	});
   return studentlist;
	}

   
   } 




