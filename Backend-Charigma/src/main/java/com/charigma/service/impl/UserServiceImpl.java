package com.charigma.service.impl;

import com.charigma.model.UserAnswer;
import com.charigma.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserAnswer verifyAnswer() {
        return null;
    }

    @Override
    public void restartGame() {

    }

    @Override
    public String getResult() {
        return null;
    }

    @Override
    public String getClue() {
        return null;
    }
}
