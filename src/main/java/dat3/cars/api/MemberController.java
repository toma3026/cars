package dat3.cars.api;

import dat3.cars.dto.MemberResponse;
import dat3.cars.service.MemberService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/members")
class MemberController {

    MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping
    List<MemberResponse> getMembers(){
        return memberService.getMembers();
    }

}
