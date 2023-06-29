package com.project.member.service;

import com.project.member.dto.MemberDTO;
import com.project.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;

    public int save(MemberDTO memberDTO) {
        return memberRepository.save(memberDTO);
    }
    //로그인
    public MemberDTO login(MemberDTO memberDTO) {

        return memberRepository.login(memberDTO);

    }
}
