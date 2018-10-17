package com.chunyue.project.controller;

import com.chunyue.project.model.UserInfo;
import com.chunyue.project.service.Impl.UserInfoServiceImpl;
import com.chunyue.project.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

@Controller
public class ViewInfoController {

    @Autowired
    UserInfoServiceImpl userInfoServiceImpl;

    @RequestMapping(path = {"/viewInfoPage"})
    @ResponseBody
    public String viewInfoPage(HttpSession session, Model model) {
        if(session.getAttribute("uid") == null) {
            // session中没有uid，用户未登陆，返回404
            return "404Page";
        }
        String uid = (String) session.getAttribute("uid");
        model.addAttribute("uid", uid);
        return "viewInfoPage";
    }
    @RequestMapping(path = {"/getUser"})
    @ResponseBody
    public String getUser(HttpSession session) {
//        Enumeration<String> str = session.getAttributeNames();
//        while (str.hasMoreElements()) {
//            System.out.println(str.nextElement());
//        }
//        if(session.getAttribute("uid") == null) {
//            // session中没有uid，用户未登陆，返回404
//            return "404Page";
//        }
        String uid = (String) session.getAttribute("uid");
        Map<String, Object> map = new HashMap<>();
        UserInfo userInfo = userInfoServiceImpl.selectByPrimaryKey(uid);
        try {
            map = userInfo.getAllInfo();
            map.put("msg", "OK");
        } catch (IllegalAccessException e) {
            map.put("msg", e.getMessage());
        }
        return JsonUtil.getJSONString(map);
    }
}
