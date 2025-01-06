package com.example.spring4.reply.controller;

import com.example.spring4.reply.service.ReplyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
@RequestMapping("reply")
public class ReplyController {

    private final ReplyService replyService;


    @DeleteMapping("delete/{id}") //replyVO에 id 변수값 설정
    @ResponseBody //컨트롤러왔다가 template으로 안넘어가고 데이터만 전달하고자 하는 경우
    public boolean deleteReply(@PathVariable int id) {
        System.out.println("서버로 전달된 replyId" + id);
        int result = replyService.deleteReply(id);
        return result == 1;
    }


}
