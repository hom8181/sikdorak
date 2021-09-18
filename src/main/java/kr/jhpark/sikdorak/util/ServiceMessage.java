package kr.jhpark.sikdorak.util;

import kr.jhpark.sikdorak.domain.MemberDto;

public class ServiceMessage extends DataMessage {

    public ServiceMessage setLoginMember(MemberDto user) {
        addData("loginMember", user);
        return this;
    }

    public MemberDto getLoginMember() {
        return getObject("loginMember", MemberDto.class);
    }

    @Override
    public ServiceMessage addData(String key, Object object) {
        super.addData(key, object);
        return this;
    }

    public ServiceMessage setResult(Object object) {
        put("result", object);
        return this;
    }

    public Object getResult() {
        return get("result");
    }

}
