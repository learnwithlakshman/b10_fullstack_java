package com.careerit.cbookapp.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.careerit.cbookapp.dto.ContactDTO;
import com.careerit.cbookapp.util.ConnectionUtil;

public class ContactDaoImpl implements ContactDao {

	private ConnectionUtil util = ConnectionUtil.getInstance();
	private String GET_CONTACT_BY_UID = "select cid,name,email,dob,mobile,uid from user_contact where uid = ?";
	private String ADD_CONTACT = "insert into user_contact(name,email,dob,mobile,uid) values(?,?,?,?,?)";

	public ContactDTO addContact(ContactDTO contactDTO) {
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			con = util.getConnection();
			st = con.prepareStatement(ADD_CONTACT, Statement.RETURN_GENERATED_KEYS);
			st.setString(1, contactDTO.getName());
			st.setString(2, contactDTO.getEmail());
			st.setDate(3, Date.valueOf(contactDTO.getDob()));
			st.setString(4, contactDTO.getMobile());
			st.setLong(5, contactDTO.getUid());
			st.executeUpdate();
			rs = st.getGeneratedKeys();
			if (rs.next()) {
				long cid = rs.getLong(1);
     			contactDTO.setCid(cid);
			}

		} catch (SQLException e) {
			System.out.println("While adding contact :" + e);
		} finally {
			util.close(rs, st, con);
		}
		return contactDTO;
	}

	public ContactDTO editContact(Long cid) {
		// TODO Auto-generated method stub
		return null;
	}

	public ContactDTO deleteContact(Long cid) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<ContactDTO> getContacts(Long uid) {
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		List<ContactDTO> list = new ArrayList<ContactDTO>();
		try {
			con = util.getConnection();
			st = con.prepareStatement(GET_CONTACT_BY_UID);
			st.setLong(1, uid);
			rs = st.executeQuery();
			while (rs.next()) {
				long cid = rs.getLong("cid");
				String name = rs.getString("name");
				LocalDate dob = rs.getDate("dob").toLocalDate();
				String mobile = rs.getString("mobile");
				String email = rs.getString("email");
				uid = rs.getLong("uid");
				ContactDTO obj = new ContactDTO(cid, name, email, mobile, dob, uid);
				list.add(obj);
			}
		} catch (SQLException e) {
			System.out.println("While getting contacts of user :" + uid + " got " + e);
		}
		return list;
	}

	public List<ContactDTO> search(Long uid, String str) {
		// TODO Auto-generated method stub
		return null;
	}

}
