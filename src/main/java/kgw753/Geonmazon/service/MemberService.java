package kgw753.Geonmazon.service;

import kgw753.Geonmazon.model.Member;
import kgw753.Geonmazon.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    /**
     * 회원 가입
     */
    @Transactional
    public Long join(Member member){
        // 중복 확인 로직 추가
        memberRepository.save(member);
        return member.getId();
    }
}
