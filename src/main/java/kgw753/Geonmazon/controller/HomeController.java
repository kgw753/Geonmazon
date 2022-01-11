package kgw753.Geonmazon.controller;

import kgw753.Geonmazon.model.Address;
import kgw753.Geonmazon.model.Member;
import kgw753.Geonmazon.model.MemberLevel;
import kgw753.Geonmazon.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
@RequiredArgsConstructor
public class HomeController {

    private final MemberService memberService;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/loginForm")
    public String loginForm(){
        return "loginForm";
    }

    @GetMapping("/joinForm")
    public String joinForm(){
        return "joinForm";
    }

    @PostMapping("/join")
    public String join(@Valid MemberJoinDTO dto, BindingResult result){

        if(result.hasErrors()){
            return "joinForm";
        }

        Address address = new Address(dto.getCity(), dto.getStreet(), dto.getZipcode());

        Member member = new Member();
        member.setName(dto.getName());

        member.setAddress(address);
        member.setMemberLevel(MemberLevel.CUSTOMER);

        String rawPassword = dto.getPassword();
        String encPassword = bCryptPasswordEncoder.encode(rawPassword);

        member.setPassword(encPassword);

        memberService.join(member);

        return "redirect:/";
    }

}
