package com.example.adithya.ZuulStudentService;

import javax.servlet.http.HttpServletRequest;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

class SamplePreFilter extends ZuulFilter {
	
	public SamplePreFilter() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean shouldFilter() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Object run() throws ZuulException {
		HttpServletRequest request = RequestContext.getCurrentContext().getRequest();
		
		System.out.println("Request in PRE filter, request method "+request.getMethod() +"  Request URL "+ request.getRequestURI());
		// TODO Auto-generated method stub
		return "IN PRE ZUUL FILTER";
	}

	@Override
	public String filterType() {
		// TODO Auto-generated method stub
		return "pre";
	}

	@Override
	public int filterOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

}
