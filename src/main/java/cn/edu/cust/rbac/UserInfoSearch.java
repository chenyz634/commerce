package cn.edu.cust.rbac;

import java.util.HashMap;
import java.util.Map;

import cn.edu.cust.util.search.ColumnType;
import cn.edu.cust.util.search.Search;

public class UserInfoSearch extends Search{
	
	private static Map<String, ColumnType> columnsSet;
	
	static{
		columnsSet = new HashMap<String, ColumnType>();
		columnsSet.put("-", ColumnType.STRING);
		columnsSet.put("C_USERNAME", ColumnType.STRING);
		columnsSet.put("C_PASSWORD", ColumnType.STRING);
		columnsSet.put("C_ROLES", ColumnType.STRING);
		columnsSet.put("C_ORGCODE", ColumnType.STRING);		
	}

	@Override
	protected Map<String, ColumnType> getColumnsSet() {
		// TODO Auto-generated method stub
		return columnsSet;
	}

	@Override
	protected String getTables() {
		// TODO Auto-generated method stub
		return "C_USER";
	}

	@Override
	protected String getProjections() {
		// TODO Auto-generated method stub
		return "*";
	}

	
	
	
	
	
}
