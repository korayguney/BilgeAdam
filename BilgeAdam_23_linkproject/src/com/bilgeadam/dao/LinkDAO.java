package com.bilgeadam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bilgeadam.models.UserLink;
import com.bilgeadam.utils.DBUtils;

public class LinkDAO {

	public List<UserLink> getAllLinks() {

		List<UserLink> arr = new ArrayList<>();

		Connection conn = DBUtils.getConnection();
		try {
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM user_links ORDER BY viewcount DESC");

			while (rs.next()) {

				arr.add(new UserLink(rs.getString("username"), rs.getString("postedlink"), rs.getString("title"),
						rs.getDate("postdate"), rs.getInt("viewcount")));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (!conn.isClosed())
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return arr;
	}

	public void incrementViewCount(String link, int count) {

		Connection conn = DBUtils.getConnection();

		try {
			PreparedStatement psmt = conn.prepareStatement("UPDATE user_links SET viewcount=? WHERE postedlink=?");
			psmt.setInt(1, count + 1);
			psmt.setString(2, link);
			psmt.execute();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (!conn.isClosed())
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public List<UserLink> getSearchedLinks(String searchedtext) {
		Connection conn = DBUtils.getConnection();
		List<UserLink> arr = new ArrayList<>();

		try {
			PreparedStatement psmt = conn
					.prepareStatement("SELECT * FROM user_links WHERE postedlink LIKE '%" + searchedtext + "%'");
			ResultSet rs = psmt.executeQuery();

			while (rs.next()) {
				arr.add(new UserLink(rs.getString("username"), rs.getString("postedlink"), rs.getString("title"),
						rs.getDate("postdate"), rs.getInt("viewcount")));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (!conn.isClosed())
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return arr;
	}

	public List<UserLink> getSelectedUserLinks(String username) {
		List<UserLink> arr = new ArrayList<>();

		Connection conn = DBUtils.getConnection();
		try {
			PreparedStatement psmt = conn
					.prepareStatement("SELECT * FROM user_links WHERE username=? ORDER BY viewcount DESC");
			psmt.setString(1, username);
			ResultSet rs = psmt.executeQuery();

			while (rs.next()) {

				arr.add(new UserLink(rs.getString("username"), rs.getString("postedlink"), rs.getString("title"),
						rs.getDate("postdate"), rs.getInt("viewcount")));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (!conn.isClosed())
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return arr;
	}

	public boolean isURLonDB(String url) {
		Connection conn = DBUtils.getConnection();
		try {
			PreparedStatement psmt = conn.prepareStatement("SELECT * FROM user_links WHERE postedlink=?");
			psmt.setString(1, url);
			ResultSet rs = psmt.executeQuery();

			while (rs.next()) {
				return true;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (!conn.isClosed())
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return false;
	}

	public void saveLink(UserLink userLink) {
		Connection conn = DBUtils.getConnection();
		
		try {
			PreparedStatement psmt = conn.prepareStatement("INSERT INTO user_links VALUES (?,?,?,now(),?)");
			psmt.setString(1, userLink.getUsername());
			psmt.setString(2, userLink.getPostedlink());
			psmt.setString(3, userLink.getTitle());
			psmt.setInt(4, 0);
			psmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (!conn.isClosed())
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	public List<UserLink> getCurrentUserLinks(String username) {
		List<UserLink> arr = new ArrayList<>();

		Connection conn = DBUtils.getConnection();
		try {
			PreparedStatement psmt = conn
					.prepareStatement("SELECT * FROM user_links WHERE username=? ORDER BY viewcount DESC");
			psmt.setString(1, username);
			ResultSet rs = psmt.executeQuery();

			while (rs.next()) {

				arr.add(new UserLink(rs.getString("username"), rs.getString("postedlink"), rs.getString("title"),
						rs.getDate("postdate"), rs.getInt("viewcount")));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (!conn.isClosed())
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return arr;
	}

}
