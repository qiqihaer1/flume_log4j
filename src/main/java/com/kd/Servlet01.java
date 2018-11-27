package com.kd;

import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "Servlet01",urlPatterns = "/Servlet01")
public class Servlet01 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("+++++++++++++++++++++++++++=");
        //产生logger数据,logger的import一定是 org.apache.log4j.Logger!
        Logger logger=Logger.getLogger("Servlet01");
        UserActionUtil instance = UserActionUtil.getInstance();
        String nowDate = instance.getNowDate();

        for (int i=0;i<10;i++){
            int userId = instance.getUserId();
            logger.info(nowDate+"\t"+userId);
        }

    }
}
