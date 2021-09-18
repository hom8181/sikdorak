package kr.jhpark.sikdorak.controller;

import kr.jhpark.sikdorak.domain.MemberDto;
import kr.jhpark.sikdorak.util.ServiceMessage;
import kr.jhpark.sikdorak.util.TextUtils;
import lombok.extern.slf4j.Slf4j;


import javax.servlet.http.HttpServletRequest;

@Slf4j
public class ControllerExtension {

    public ServiceMessage createServiceMessage(HttpServletRequest request) {
        ServiceMessage serviceMessage = new ServiceMessage();
        serviceMessage.setLoginMember(getLoginUser(request));

        String realIp = request.getHeader("X-Real-IP");
        if (TextUtils.isEmpty(realIp))
            realIp = request.getRemoteAddr();

        serviceMessage
                .addData("ipAddress", realIp)
                .addData("userAgent", request.getHeader("user-agent"));

        return serviceMessage;
    }

    public MemberDto getLoginUser(HttpServletRequest request) {

        Object userObject = request.getSession().getAttribute("LOGIN_SESSION");
        if (userObject instanceof MemberDto) return (MemberDto) userObject;
        else return null;
    }

}
