package com.imooc.controller;

import com.imooc.course.dto.CourseDTO;
import com.imooc.course.service.ICourseService;
import com.imooc.thrift.user.dto.UserDTO;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/course")
public class CourseController {

    @Reference
    private ICourseService iCourseService;

    @RequestMapping(value = "/courseList", method = RequestMethod.GET)
    @ResponseBody
    public List<CourseDTO> courseDTOList(HttpServletRequest request) {
        UserDTO user = (UserDTO)request.getAttribute("user");
        System.out.print(user);
        return iCourseService.courseList();
    }
}
