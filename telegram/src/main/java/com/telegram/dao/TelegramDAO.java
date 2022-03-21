package com.telegram.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.telegram.entity.TelegramUser;
import com.telegram.entity.TimelineDetails;

public class TelegramDAO implements TelegramDAOInterface {
	
	Connection con = null;
	
	public TelegramDAO() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","oracle");
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	public int createProfileDAO(TelegramUser tu) {
		
		int i = 0;
		
		try {
			
			PreparedStatement ps = con.prepareStatement("insert into TelegramUser values(?,?,?,?)");
			ps.setString(1, tu.getName());
			ps.setString(2, tu.getPassword());
			ps.setString(3, tu.getEmail());
			ps.setString(4, tu.getAddress());
			
			i = ps.executeUpdate();
			System.out.println(i);
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return i;
		
	}

	public int deleteProfileDAO(TelegramUser tu) {

		int i = 0;
		
		try {
			
			PreparedStatement ps = con.prepareStatement("delete from TelegramUser where email=?");
			ps.setString(1, tu.getEmail());
			
			i = ps.executeUpdate();
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return i;
		
	}

	public TelegramUser viewProfileDAO(TelegramUser tu) {

		TelegramUser t = null;
		
		try {
			
			PreparedStatement ps = con.prepareStatement("select * from TelegramUser where email=?");
			ps.setString(1, tu.getEmail());
			
			ResultSet  res = ps.executeQuery();
			
			if(res.next()) {
				
				String n = res.getString(1);
				String p = res.getString(2);
				String e = res.getString(3);
				String a = res.getString(4);
				
				t = new TelegramUser();
				t.setName(n);
				t.setPassword(p);
				t.setEmail(e);
				t.setAddress(a);
				
			}
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return t;
		
	}

	
	public List<TelegramUser> viewAllProfilesDAO() {
		
		TelegramUser t = null;
		List<TelegramUser> l = new ArrayList<TelegramUser>();
		
		try {
			
			PreparedStatement ps = con.prepareStatement("select * from TelegramUser");
			
			ResultSet res = ps.executeQuery();
			
			while(res.next()) {
				
				String n = res.getString(1);
				String p = res.getString(2);
				String e = res.getString(3);
				String a = res.getString(4);
				
				t = new TelegramUser();
				t.setName(n);
				t.setPassword(p);
				t.setEmail(e);
				t.setAddress(a);
				
				l.add(t);
				
			}
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return l;
		
	}

	
	public List<TelegramUser> searchProfilesDAO(TelegramUser tu) {
		
		TelegramUser t = null;
		List<TelegramUser> l = new ArrayList<TelegramUser>();
		
		try {
			
			PreparedStatement ps = con.prepareStatement("select * from TelegramUser where name=?");
			ps.setString(1, tu.getName());
			
			ResultSet res = ps.executeQuery();
			
			while(res.next()) {
				
				String n = res.getString(1);
				String p = res.getString(2);
				String e = res.getString(3);
				String a = res.getString(4);
				
				t = new TelegramUser();
				t.setName(n);
				t.setPassword(p);
				t.setEmail(e);
				t.setAddress(a);
				
				l.add(t);
				
			}
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return l;
		
	}

	public int editProfileDAO(TelegramUser tu) {
		
		int i = 0;
		
		try {
			
			PreparedStatement ps = con.prepareStatement("update TelegramUser set name=?, password=?, address=? where email=?");
			ps.setString(1, tu.getName());
			ps.setString(2, tu.getPassword());
			ps.setString(3, tu.getAddress());
			ps.setString(4, tu.getEmail());
			
			i = ps.executeUpdate();
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return i;
	}

	public TelegramUser signINDAO(TelegramUser tu) {

		
		TelegramUser t = null;
		
		try {
			
			PreparedStatement ps = con.prepareStatement("select * from TelegramUser where email=? and password=?");
			ps.setString(1, tu.getEmail());
			ps.setString(2, tu.getPassword());
			
			ResultSet  res = ps.executeQuery();
			
			if(res.next()) {
				
				String n = res.getString(1);
				String p = res.getString(2);
				String e = res.getString(3);
				String a = res.getString(4);
				
				t = new TelegramUser();
				t.setName(n);
				t.setPassword(p);
				t.setEmail(e);
				t.setAddress(a);
				
			}
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return t;

	}

	public int createTimelineDAO(TimelineDetails tld) {
		
		int i = 0;
		
		try {
			
			PreparedStatement ps = con.prepareStatement("insert into TimelineDetails values(?,?,?,?,?)");
			ps.setString(1, tld.getMessageid());
			ps.setString(2, tld.getSender());
			ps.setString(3, tld.getMessage());
			ps.setString(4, tld.getDate());
			ps.setString(5, tld.getReciever());
			
			i = ps.executeUpdate();
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return i;
		
	}

}
