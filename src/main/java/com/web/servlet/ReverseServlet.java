package com.web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import com.utils.HttpUtils;
import com.utils.ReverseUtils;

public class ReverseServlet extends HttpServlet{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        response.setStatus(HttpServletResponse.SC_OK);
        
        String requestBody = HttpUtils.readRequestBody(request.getInputStream());
        JSONObject jsonObject = new JSONObject(requestBody);
        
        String message = jsonObject.getString("message");
        JSONObject responseObject = new JSONObject();
        responseObject.put("message", ReverseUtils.reverse(message));
        
        response.getWriter().print(responseObject.toString());
        response.getWriter().flush();
    }
	
}
