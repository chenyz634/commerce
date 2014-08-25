package cn.edu.cust.commerce.util;

import cn.edu.cust.util.OraclePage;
import cn.edu.cust.util.Page;

public class PageFactory {
	
	public static Page getPage(){
		return new OraclePage();
	}

}
