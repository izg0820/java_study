package com.example.model;

import com.example.exception.MemberException;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Member {
    private final static int MEMBER_NAME_MAX = 3;

    private String name;
    private int age;

    public enum ERROR {
        LENGTH_OVER, FAILURE
    }

    public static Member createMember(String name, int age) {
        Member member = new Member(name, age);
        if(member.isValidateException()) {
            throw new MemberException("Invalid Member Name");
        }
        return member;
    }

    public ERROR isValidateErrorCode() {
         if(this.name.length() > MEMBER_NAME_MAX){
             return ERROR.LENGTH_OVER;
         }
        return null;
    }

    public boolean isValidateException() {
        return this.name.length() > MEMBER_NAME_MAX;
    }

    public ERROR doSomething() {
        return null;
    }


}
