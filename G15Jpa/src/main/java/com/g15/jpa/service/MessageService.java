package com.g15.jpa.service;

import com.g15.jpa.entity.Message;
import com.g15.jpa.repository.MessageRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author desaextremo
 */
@Service
public class MessageService {
    @Autowired
    private MessageRepository messageRepository;
    
    public List<Message> getMessageList(){
        return messageRepository.findAll();
    }
    
    public Message getMessageById(Long id){
        return messageRepository.findById(id).get();
    }
    
    public Message insertMessage(Message finca){
        return messageRepository.save(finca);
    }
}
