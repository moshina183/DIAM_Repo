package com.diam.app.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.diam.app.esb.IConstants;
import com.diam.app.model.TXNAuditLogs;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@Component
public class BaseInterceptor implements HandlerInterceptor{
	
	private static final Logger logger = LoggerFactory.getLogger(BaseInterceptor.class);
	
	
	@Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("4i-Pre Handle method is Calling");
        return true;
	}
	
	@Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("4i-Post Handle method is Calling");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
   
		System.out.println("after completion"+response.getStatus());
		
		TXNAuditLogs audit = (TXNAuditLogs) request.getAttribute(IConstants.CURRENT_AUDIT);
		//AuditLogProcessor auditLogProcessor = new AuditLogProcessor();
		//auditLogProcessor.process(audit);

		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);

    	System.out.println("4i-Request and Response is completed");
    }


}
