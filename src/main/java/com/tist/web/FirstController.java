package com.tist.web;

import com.tist.domain.Player;
import com.tist.service.PlayerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/test")
public class FirstController {

    @Resource
    private PlayerService playerService;

    @RequestMapping
    public String test() {
        return "homework.html";
    }

    @RequestMapping(value = "players", method = RequestMethod.GET)
    @ResponseBody
    public List<Player> players() {
        return playerService.findAll();
    }


}
