package com.example.spring4.member.service;

import com.example.spring4.member.dao.MemberMapper;
import com.example.spring4.member.vo.MemberVO;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service //싱글톤객체 생성 + 비즈니스 레이어(층)로 등록
@RequiredArgsConstructor //@Autowired
//아래 선언된 멤버변수에 객체 주소를 찾아서 다 넣어줌.
public class MemberService {

    //요청하나 당 함수 하나
    //처리내용
    // - 전처리하고 나서
    // - dao에 데이터를 넘기면서 db 처리해줘 요청
    // - 후처리도 담당

    //db 처리할 것은 무조건!!!!!!! 서비스를 거쳐서 dao를 호출!!!
    //front controller --> controller(login())
    // --> service(login()) --> dao(selectMemberById())


    private final MemberMapper memberMapper; //200번 (dependency Injection, DI) --> @Autowired
    private final PasswordEncoder passwordEncoder; //300 (dependency Injection, DI)
    public boolean login(MemberVO memberVO) {
        //전처리하고
        //dao를 찾아서 --> @Autowired
        //dao를.메서드 호출
        MemberVO memberVO1 = memberMapper.selectMemberById(memberVO.getId());
        if(memberVO1 != null) {
            if(memberVO1.getPw().equals(memberVO.getPw())) { //db의 pw랑 내가 입력한 pw랑 같은지)
                return true; //로그인성공
            }else{
                return false; //로그인실패
            }
        } else{
            return false; //로그인실패
        }
        //후처리
    }

    public int create2(MemberVO memberVO) {
        //mapper에게 주고 db처리하자
        String pw2 = passwordEncoder.encode(memberVO.getPw());
        memberVO.setPw(pw2);
        System.out.println("vo에 암호화된 pw >>> " + memberVO.getPw());
        int result = memberMapper.insertMember(memberVO);

        return result;
    }


    public MemberVO read(String id) {
        return memberMapper.selectMemberById(id);
    }

    public int delete(String id) {
        return memberMapper.deleteMember(id);
    }


    public int update(MemberVO memberVO) {
        return memberMapper.updateMember(memberVO);
    }
}
