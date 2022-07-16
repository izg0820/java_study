package com.example.exception;

import com.example.model.Member;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class CleanExceptionSample {

    //오류코드보다는 예외를 사용하라
    public void useErrorCode() {
        Member member = new Member("김나박이", 11);
        if (member.isValidateErrorCode() != Member.ERROR.LENGTH_OVER) {
            if (member.doSomething() != Member.ERROR.FAILURE) {
                //...
            } else {
                System.out.printf("Wrong action");
            }
        } else {
            System.out.printf("Invalid Member Name");
        }
    }

    public void useException() {
        try{
            createMember("김나박이", 11);
        } catch (MemberException e) {
            //...
        }
    }

    public Member createMember(String name, int age) {
        Member member = new Member(name, age);
        if(member.isValidateException()) {
            throw new MemberException("Invalid Member Name");
        }
        return member;
    }

    //Unchecked 예외를 사용해라
    public void checked() {
        try {
            A();
        } catch (SQLException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public void A() throws SQLException, FileNotFoundException {
        B();
    }

    public void B() throws SQLException {
        //do something
    }
}
