package com.back.boundedContext.member.app;

import com.back.boundedContext.member.domain.Member;
import com.back.boundedContext.member.out.MemberRepository;
import com.back.global.exception.DomainException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class MemberFacade {
    private final MemberRepository memberRepository;
    private final MemberJoinUseCase memberJoinUseCase;

    public MemberFacade(MemberRepository memberRepository, MemberJoinUseCase memberJoinUseCase) {
        this.memberRepository = memberRepository;
        this.memberJoinUseCase = memberJoinUseCase;
    }

    @Transactional(readOnly = true)
    public long count() {
        return memberRepository.count();
    }

    @Transactional
    public Member join(String username, String password, String nickname) {
        findByUsername(username).ifPresent(m -> {
            throw new DomainException("409-1", "이미 존재하는 username 입니다.");
        });

        return memberJoinUseCase.join(username, password, nickname);
    }

    @Transactional(readOnly = true)
    public Optional<Member> findByUsername(String username) {
        return memberRepository.findByUsername(username);
    }


    @Transactional(readOnly = true)
    public Optional<Member> findById(int id) {
        return memberRepository.findById(id);
    }
}