package com.devopsapp;

import java.sql.Connection;

public class TestDB {
    public static void main(String[] args) {
        try (Connection conn = DBConnection.getConnection()) {
            if (conn != null) {
                System.out.println("✅ Connected to the database!");
            } else {
                System.out.println("❌ Failed to connect.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

