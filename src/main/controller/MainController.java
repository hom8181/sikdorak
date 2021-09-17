package com.example.demo.controller;

import com.example.demo.service.MainService;
import com.example.demo.util.ServiceMessage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@Slf4j
@RequiredArgsConstructor
public class MainController extends ControllerExtension {

    private final MainService mainService;

    @GetMapping(value = "/")
    public Strirng getMainPage(HttpServletRequest request, ModelMap modelMap, HttpServletResponse response) {
        ServiceMessage message = createServiceMessage(request);

        return "index";

    }

}
