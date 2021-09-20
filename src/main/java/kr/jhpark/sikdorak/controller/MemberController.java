package kr.jhpark.sikdorak.controller;

import kr.jhpark.sikdorak.service.MainService;
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
public class MemberController extends ControllerExtension {

    @GetMapping(value = "/logout")
    public String logout(HttpServletRequest request, ModelMap modelMap, HttpServletResponse response) {

        return "index";

    }

}
