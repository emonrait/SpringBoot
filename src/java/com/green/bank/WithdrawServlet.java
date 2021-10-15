package com.green.bank;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.green.bank.database.JDBC_Connect;
import com.green.bank.model.AccountModel;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class WithdrawServlet extends HttpServlet {

    String account_no, username, password;
    Connection conn;
    Statement stmt;
    boolean pass_wrong = false;
    int current_amount, withdraw_amount;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        account_no = request.getParameter("account_no");
        username = request.getParameter("username");
        password = request.getParameter("password");
        withdraw_amount = Integer.parseInt(request.getParameter("amount"));

        try {
            JDBC_Connect connect = new JDBC_Connect();
            conn = connect.getConnection();

            stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery("select * from account where id='" + account_no + "' and username='"
                    + username + "' and password='" + password + "'");

            if (!rs.isBeforeFirst()) {
                request.setAttribute("isPassOK", "No");
                RequestDispatcher rd = request.getRequestDispatcher("withdraw.jsp");
                rd.forward(request, response);
            } else {
                System.out.println("I am in");
                ResultSet rs1 = stmt.executeQuery("select * from amount where id ='" + account_no + "'");

                while (rs1.next()) {
                    current_amount = rs1.getInt(2);

                    System.out.println(current_amount);
                }

                if (current_amount >= withdraw_amount) {
                    current_amount -= withdraw_amount;

                    PreparedStatement ps = conn.prepareStatement("update amount set amount=? where id= ?");
                    ps.setInt(1, current_amount);
                    ps.setString(2, account_no);
                    ps.executeUpdate();

                    //GET EMAIL
                    String ema = null;
                    ResultSet rs2 = stmt.executeQuery("select * from account where id='" + account_no + "'");
                    while (rs2.next()) {
                        ema = rs2.getString("email");
                    }

                    //For Send Email
                    Properties props = new Properties();
                    props.put("mail.smtp.auth", "true");
                    props.put("mail.smtp.starttls.enable", "true");
                    props.put("mail.smtp.host", "smtp.gmail.com");
                    props.put("mail.smtp.port", "587");

                    javax.mail.Session session = javax.mail.Session.getInstance(props,
                            new javax.mail.Authenticator() {
                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication("sujon01764@gmail.com", "aman8321");
                        }
                    });

                    try {
                        Message message = new MimeMessage(session);
                        message.setFrom(new InternetAddress("GreenBank@gmail.com"));
                        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(ema));
                        message.setSubject("Account Withdraw");
                        message.setText("Your Withdraw operation is complete. " + "\n Account Number: " + account_no + " \n Withdraw Amount: " + withdraw_amount + " \n Avabileable Balance: " + current_amount);
                        Transport.send(message);
                        System.out.println("Send Ok");
                    } catch (MessagingException e) {
                        throw new RuntimeException(e);
                    }

                    conn.close();

                    RequestDispatcher rd = request.getRequestDispatcher("Withdraw_process.jsp");
                    rd.forward(request, response);
                } else {
                    conn.close();
                    request.setAttribute("EnoughMoney", "No");
                    RequestDispatcher rd = request.getRequestDispatcher("withdraw.jsp");
                    rd.forward(request, response);
                }

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
