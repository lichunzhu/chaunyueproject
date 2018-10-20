package com.chunyue.project.controller;

import com.chunyue.project.model.Question;
import com.chunyue.project.model.UQ;
import com.chunyue.project.model.UserInfo;
import com.chunyue.project.service.Impl.QuestionServiceImpl;
import com.chunyue.project.service.Impl.UQServiceImpl;
import com.chunyue.project.service.Impl.UserInfoServiceImpl;
import com.chunyue.project.util.JsonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class AnswerController {
    @Autowired
    UQServiceImpl uqServiceImpl;

    @Autowired
    QuestionServiceImpl questionServiceImpl;

    @Autowired
    UserInfoServiceImpl userInfoServiceImpl;

    @RequestMapping(path = {"/answerPage"})
    @ResponseBody
    public String answerPage(HttpSession session, Model model) {
        if(session.getAttribute("uid") == null) {
            // session中没有uid，用户未登陆，返回404
            return "404Page";
        }
        String uid = (String) session.getAttribute("uid");
        model.addAttribute("uid", uid);
        return "answerPage";
    }

    @RequestMapping(path = {"/getQuestions"})
    @ResponseBody
    public String getQuestions(HttpSession session) {
//        if(session.getAttribute("uid") == null) {
//            // session中没有uid，用户未登陆，返回404
//            return "404Page";
//        }
        String uid = (String) session.getAttribute("uid");
        Map<String, Object> map = new HashMap<>();
        List<UQ>UQList = uqServiceImpl.getQuestionsByUserId(uid);
        List<Question>questionList = new ArrayList<>();
        for(UQ uq: UQList) {
            questionList.add(questionServiceImpl.selectByPrimaryKey(uq.getQid()));
        }
        UserInfo userInfo = userInfoServiceImpl.selectByPrimaryKey(UQList.get(0).getUid());
        Map<String, Object> userMap = new HashMap<>();
        userMap.put("nickname", userInfo.getNickname());
        userMap.put("uid", userInfo.getUid());
        // userMap.put("CP", userInfo.getCP()); 没有CP选项
        map.put("user", userMap);
        map.put("questions", questionList);
        map.put("msg", "OK");

        return JsonUtil.getJSONString(map);
    }
}
