package com.sun.hitech.shooping_cart;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.hitect.shooping_cart.dto.orderDTO;

/**
 * Servlet implementation class OrderSummery
 */
@WebServlet("/OrderSummery")
public class OrderSummery extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Connection con=null;
		Statement stmt=null;
		ResultSet rst=null;
		ArrayList<orderDTO> arraylist=new ArrayList<>();
		orderDTO orderdto=null;
		PrintWriter out = response.getWriter();
		StringBuilder sb= new StringBuilder();
	
		try{
		con=connectionDB.getconnetion();
		stmt=con.createStatement();
		rst=stmt.executeQuery(CommanSQLConstants.CHECK_ORDER);
		}catch(SQLException e)
		{
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
		}
		
		try {
			while(rst.next())
			{
				orderdto=new orderDTO();
				orderdto.setOrder_id(rst.getInt("order_id"));
				orderdto.setOrder_name(rst.getString("order_name"));
				orderdto.setOrder_persion(rst.getString("order_person"));
				orderdto.setOrder_person_contect(rst.getString("order_contect"));
				orderdto.setOrder_date(rst.getDate("order_date"));
				orderdto.setOrder_deleverd(rst.getDate("order_deleverd"));
				orderdto.setOrder_address(rst.getString("order_address"));
				orderdto.setOrder_bill_address(rst.getString("order_bill_address"));
				orderdto.setOrder_price(rst.getDouble("order_price"));
				arraylist.add(orderdto);
			}
			sb.append("<table border=1px><tr><td>Order ID</td>"
					+"<td>Product Name</td>"
					+"<td>Order Person Name</td>"
					+"<td>Order Contect Number:</td>"
					+"<td>Order Date</td>"
					+"<td>Order Deleverd Date</td>"
					+"<td>Order Address</td>"
					+"<td>Order Bill Address</td>"
					+"<td>Order Price</td></tr>");
			for(orderDTO order: arraylist)
			{
				sb.append("<tr><td>"+order.getOrder_id()+"</td><td>"+order.getOrder_name()+"</td>"
						     +"<td>"+order.getOrder_persion()+"</td><td>"+order.getOrder_person_contect()+"</td>"
						     +"<td>"+order.getOrder_date()+"</td><td>"+order.getOrder_deleverd()+"</td>"
						     +"<td>"+order.getOrder_address()+"</td><td>"+order.getOrder_bill_address()+"</td>"
						     +"<td>"+order.getOrder_price()+"</td></tr>");
				}
			
			out.println(sb.toString());
			out.println("</table>");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
			rst.close();
			} catch (SQLException e) {
			e.printStackTrace();
			}
			try {
			stmt.close();
			} catch (SQLException e) {
			e.printStackTrace();
			}
			try {
			con.close();
			} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
