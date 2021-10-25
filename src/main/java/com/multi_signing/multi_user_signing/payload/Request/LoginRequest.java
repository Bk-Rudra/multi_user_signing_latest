package com.multi_signing.multi_user_signing.payload.Request;

import com.sun.istack.NotNull;

public class LoginRequest {
		@NotNull
		private String username;

		@NotNull
		private String password;

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}
}
