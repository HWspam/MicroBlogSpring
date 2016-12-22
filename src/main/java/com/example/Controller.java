package com.example;

/* Created by erikjakubowski on 12/20/16.
 */


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;

@org.springframework.stereotype.Controller
public class Controller {

    ArrayList<Message> submitted = new ArrayList<Message>();

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String home(Model model, HttpSession session) {
        model.addAttribute("id", session.getAttribute("id"));
        return "home";
    }

    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public String each(HttpSession session, String userName) {

        session.setAttribute("userName", user);
        return "redirect:/";
    }

    @RequestMapping(path = "/add-message", method = RequestMethod.POST)
    public String sub(String messageText) {
        Message mess = new Message();
        mess.text = messageText;
        submitted.add(mess); //
        return "redirect:/";
    }


    @RequestMapping(path = "/delete", method = RequestMethod.POST)
    public String deleteMess(Integer deleteMessage) {
        submitted.remove(deleteMessage - 1);

        return "redirect:/";
    }
}

