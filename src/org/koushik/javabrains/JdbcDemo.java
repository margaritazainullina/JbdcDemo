package org.koushik.javabrains;

import org.koushik.javabrains.dao.JdbcDaoImpl;
import org.koushik.javabrains.model.Circle;

public class JdbcDemo {

    public static void main(String[] args) {
        Circle circle = new JdbcDaoImpl().getCircle(1);
        System.out.println(circle.getName());
    }
}
