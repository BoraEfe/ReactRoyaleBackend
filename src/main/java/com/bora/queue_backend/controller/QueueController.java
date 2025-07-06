package com.bora.queue_backend.controller;

import com.bora.queue_backend.model.Player;
import com.bora.queue_backend.service.QueueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/queue")
public class QueueController {
    @Autowired
    private QueueService queueService;

    @PostMapping("/join")
    public String voegToe(@RequestBody Player player){
        queueService.addPlayer(player);
        return "Speler toegevoegd: " + player.getUsername();
    }

    @GetMapping
    public List<Player> status(){
        return queueService.getQueue();
    }
}
