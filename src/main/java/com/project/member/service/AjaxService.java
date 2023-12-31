package com.project.member.service;

import com.project.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import com.project.member.dto.MemberDTO;

@Service
@RequiredArgsConstructor
public class AjaxService {
    private MemberRepository memberRepository;
    private MemberDTO memberDTO;


    public String searchid(String mEmail) {
        String result;
        result = memberRepository.searchid(mEmail);
        System.out.println(result);
        return result;
    }
}
