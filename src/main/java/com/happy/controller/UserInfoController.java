package com.happy.controller;

import com.happy.entity.UserInfo;
import com.happy.service.IUserInfoService;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by houxiurong on 2017/6/2.
 */
public class UserInfoController implements Controller {

    private IUserInfoService userInfoService;


    public ModelAndView handleRequest(HttpServletRequest request,
                                      HttpServletResponse response) throws Exception {
        String uname = request.getParameter("name");
        Integer uage = Integer.valueOf(request.getParameter("age"));
        String uemail= request.getParameter("email");

        UserInfo info = new UserInfo();
        info.setAge(uage);
        info.setName(uname);
        info.setEmail(uemail);

        userInfoService.add(info);

        return new ModelAndView(new RedirectView("/index.jsp",true));
    }

    public IUserInfoService getUserInfoService() {
        return userInfoService;
    }

    public void setUserInfoService(IUserInfoService userInfoService) {
        this.userInfoService = userInfoService;
    }
}
