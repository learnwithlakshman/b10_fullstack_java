package com.careerit.cbookapp.domain;

import java.time.LocalDate;

public class Contact {

		private Long cid;
		private String name;
		private String email;
		private String mobile;
		private LocalDate dob;
		
		public Long getCid() {
			return cid;
		}
		public void setCid(Long cid) {
			this.cid = cid;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public LocalDate getDob() {
			return dob;
		}
		public void setDob(LocalDate dob) {
			this.dob = dob;
		}
		
		
}
