package com.bora.queue_backend.service;

import com.bora.queue_backend.model.Player;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class QueueService {
    private final List<Player> queue = new LinkedList<>();

    public void addPlayer(Player player){
        queue.add(player);
    }
    public List<Player> getQueue(){
        return queue;
    }
    public void clearQueue(){
        queue.clear();
    }
}

