package cn.edu.cust.rbac;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;

//import cn.edu.cust.eduxm.group.domain.Group;
import cn.edu.cust.commerce.util.PageFactory;
import cn.edu.cust.rbac.dao.UserDAO;
import cn.edu.cust.rbac.domain.User;
import cn.edu.cust.util.Page;
import cn.edu.cust.util.action.CommonAction2;
import cn.edu.cust.util.db.JdbcTool;
import cn.edu.cust.util.db.Worker;

public class UserAction extends CommonAction2 {
	
	private static UserDAO dao = new UserDAO();
	private UserInfoSearch search;
	private User obj;
    private Page mlpage = PageFactory.getPage();
	private int page;
	private List<User> users;
    private int[] ids;    
    private String[] username;	
    public int getTotal(){
		return mlpage.getRowCount();
	}
	public String[] getUsername() {
		return username;
	}
	public void setUsername(String[] username) {
		this.username = username;
	}
	public int[] getIds() {
		return ids;
	}
	public void setIds(int[] ids) {
		this.ids = ids;
	}
	public static UserDAO getDao() {
		return dao;
	}
	public static void setDao(UserDAO dao) {
		UserAction.dao = dao;
	}
	public UserInfoSearch getSearch() {
		return search;
	}
	public void setSearch(UserInfoSearch search) {
		this.search = search;
	}
	public User getObj() {
		return obj;
	}
	public void setObj(User obj) {
		this.obj = obj;
	}
	public Page getMlpage() {
		return mlpage;
	}
	public void setMlpage(Page mlpage) {
		this.mlpage = mlpage;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}

	public void setRows(int rows) {
		mlpage.setRecordNum(rows);
	}
	public List<User> getRows() {
		return users;
	}
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public String list(){
		success = JSON_SUCCESS;
		error = JSON_ERROR;
		return work(new Worker() {
			public void doWork() {
				List<Object> params = null;
				String sql = null;

				sql = search.buildSQL();
				log.info("usersql: ----------{}", sql);
				params = search.getParams();

				log.info("params:-------------{}",
						Arrays.toString(params.toArray()));

				final ArrayList<User> result = new ArrayList<User>();

				if (mlpage == null) {
					mlpage = PageFactory.getPage();
				}

				mlpage.setPageNum(page);
				log.info("page:-------{}",page);
				mlpage.getOnePage(sql, params,
						new ResultSetExtractor<Object>() {
							public Object extractData(ResultSet rs)
									throws SQLException, DataAccessException {
								log.info("jh", "jh");
								while (rs.next()) {
									User user = new User();
									user.setFields(rs);
									result.add(user);
								    log.info("x", user.getUsername());
							        //log.info("专家用户名:{}",expert.getUsername());
								}
								return null;
							}
						}, JdbcTool.getJdbcTemplate());

				users = result;
			}
		});
	}
	

	public String add(){
		//System.out.println("hello");
		log.info("sql: ----------{}", "hello");
		successmsg = "添加成功";		
		return work(new TransactionCallback<Object>(){

			@Override
			public Object doInTransaction(TransactionStatus status) {
				// TODO Auto-generated method stub
				/*obj=dao.load(obj);
				String add_username = obj.getUsername();
				if(add_username.equals(null)){
					log.info("add_username{}","为空");
				}*/
				//log.info("add_username{}",add_username);
				dao.insert(obj);
				return null;
			}
			
		});
	}
	
	/**
	 * 根据id删除专家分组
	 * @return
	 */
	public String delete(){
		successmsg = "删除成功";
		return work(new Worker() {
			
			@Override
			public void doWork() {
				for (int i = username.length - 1; i >= 0; i--) {
					//log.info("{}",ids[i]);
					dao.delete(username[i]);
					//udao.delete(usernames[i]);
				}
			}
		});
		
	}
	
    public String load(){
		
		return work(new Worker() {
			
			@Override
			public void doWork() {
				// TODO Auto-generated method stub
				//log.info("用户信息修改1：{}",username);
				obj=dao.load(username[0]);
				//log.info("用户信息修改2：{}",username);
				//log.info("{}",obj.getUsername());
			}
		});
		
	}
    /**
     * 修改用户密码
     * author chr
     * @return
     */
    public String updatePass(){
    	
    	return work(new Worker() {
    		
    		@Override
    		public void doWork() {
    			obj=dao.load(username[0]);
    		}
    	});
    	
    }
    
//    public String update(){
//		successmsg = "修改成功";
//		
//		return work(new TransactionCallback<Group>() {
//
//			@Override
//			public Group doInTransaction(TransactionStatus arg0) {
//				// TODO Auto-generated method stub
//				
//				dao.update(obj);
//				
//				return null;
//				
//			}
//			
//		},"psfz");
//		
//	}

}
