package com.imooc.filter;

import com.imooc.thrift.user.dto.UserDTO;
import com.imooc.user.client.LoginFilter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CourceFilter extends LoginFilter {
    @Override
    protected void login(HttpServletRequest request, HttpServletResponse response, UserDTO userDTO) {

        request.setAttribute("user", userDTO);
    }
}
