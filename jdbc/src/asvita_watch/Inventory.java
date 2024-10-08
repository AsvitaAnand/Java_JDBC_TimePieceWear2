package asvita_watch;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
public class Inventory {
	List<watch>list=new ArrayList<>();
	Statement stmt;
	ResultSet rs;
	String qry=null;
	DBUtil db=new DBUtil();
	Connection con;
    public boolean add(watch emp)
    {
    	/*list.add(b);*/
    	boolean sts=false;
    	int count=0;
    	try {
    		Connection con=db.getDBConnection();
    		stmt=con.createStatement();
    		qry="insert into watch(id,name,price)values('"+emp.getId()+"','"+emp.getName()+"','"+emp.getCost()+"')";
    				count=stmt.executeUpdate(qry);
    		if(count==1)
    			sts=true;
    		else
    			throw new Exception();
    	}
    	catch(Exception ex) {
    		System.out.println(ex.getMessage());
    		return sts;
    	}
		return sts;
    	
    }
   public void show()
    {
    	/*for(watch b:list)
    	{
    		System.out.println(b);
    	}*/
	   try {
		   con=db.getDBConnection();
		   stmt=con.createStatement();
		   rs=stmt.executeQuery("select * from watch");
		   while(rs.next())
			   System.out.println(rs.getString(1)+""+rs.getString(2)+""+rs.getInt(3));
	   }
	   catch(Exception e) {
		   System.out.println(e.getMessage());
	   }
    }
  public watch search(String id)
   {
	  for(int i=0;i<list.size();i++)
	   {
		   if(id.equals(list.get(i).getId()))
		   {
			   return list.get(i);
		   }
	   }
	   return null;
   }
	public void update(watch emp)
	{
		int count;
		try {
			con=db.getDBConnection();
			stmt=con.createStatement();
			count=stmt.executeUpdate("update watch set name=('" +emp.getName()+"') where price=("+emp.getCost()+")");
			
		}catch(Exception e) {
			   System.out.println(e.getMessage());
		   }
		/*for (watch b:list) {
			if(b.getId().equals(id)) {
				b.setId(id2);
				System.out.println("updated successfully");
				return b;
			}
		}
		return null;*/
	}
	public void remove(String id)
	{
		int count;
		try {
			con=db.getDBConnection();
			stmt=con.createStatement();
			qry="delete from watch where id='"+id+"'";
			count=stmt.executeUpdate(qry);
		}
		catch(Exception e) {
			   System.out.println(e);
		   }
		/*for(int i=0;i<list.size();i++)
		{
			if(id.equals(list.get(i).getId()))
			{
				list.remove(i);
			}

		}*/

	}

}

