package com.profile.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "ProfileServlet", urlPatterns = {"/ProfileServlet"})
public class ProfileServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String name = "Nurzalifah binti Mohd Zulkefli";
        String studentId = "2024486082";
        String program = "Bachelor of Information Technology";
        String email = "2024486082@student.uitm.edu.my";
        String hobbies = "Listening to music and sleeping";
        String intro = 
                "Hello, my name is Nurzalifah binti Mohd Zulkefli."
                + "I am an IT student. In my free time, I enjoy "
                + "listening to music and sleeping.";
            
            request.setAttribute("name", name);
            request.setAttribute("studentId", studentId);
            request.setAttribute("program", program);
            request.setAttribute("email", email);
            request.setAttribute("hobbies", hobbies);
            request.setAttribute("intro", intro);
            
            RequestDispatcher rd = 
                    request.getRequestDispatcher("profile.jsp");
            
            rd. forward(request, response);
                  
        }
    }