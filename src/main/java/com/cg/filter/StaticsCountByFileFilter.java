package com.cg.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class StaticsCountByFileFilter implements Filter {
    private Properties properties = null;

    @Override
    public void init(FilterConfig arg0) throws ServletException {
       // TODO Auto-generated method stub
        //web应用开启后运行
//        String path = arg0.getServletContext().getRealPath("/WEB-INF");
//        File file = new File(path, "index.jsp");
//        properties =  new Properties();
//        try{
//           properties.load(new FileReader(file));
//       }catch (Exception e) {
//            e.printStackTrace();
//        }
    }
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain arg2) throws IOException, ServletException {
        synchronized (this) {
            HttpServletRequest requestt = (HttpServletRequest)request;
            String url = requestt.getRequestURI();
            if(properties.getProperty(url)!=null){
                String str = (String)properties.get(url);
                int count = Integer.parseInt(str);
                properties.put(url, String.valueOf(++count));
                request.setAttribute("url", url);
                request.setAttribute("count", count);
            }else{
                properties.put(url, "1");
                request.setAttribute("url", url);
                request.setAttribute("count", "1");
            }
        }
        //必须运行拦截链才会继续
        arg2.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
