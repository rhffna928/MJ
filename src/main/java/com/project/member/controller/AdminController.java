package com.project.member.controller;

import com.project.member.dto.MemberDTO;
import com.project.member.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class AdminController {

    private AdminService adminService;

    @GetMapping("/memberList.do")
    public String memberListForm(Model model, HttpServletRequest request){
        List<MemberDTO> memberDTO = adminService.memberlist();

        model.addAttribute("m_list"+memberDTO);

        return "/member/memberList";
    }
}