package com.example.demo.login.domain.model;

import lombok.Data;

@Data
public class User {

	private String userId; // ユーザーID
	private String password; // パスワード
	private String userName; // ユーザー名
	private Data birthday; // 誕生日
	private int age; // 年齢
	private boolean marriage; // 結婚ステータス
	private String role; // ロール
}
