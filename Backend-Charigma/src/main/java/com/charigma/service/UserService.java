package com.charigma.service;

import com.charigma.model.Charade;
import com.charigma.model.UserAnswer;

public interface UserService {
    UserAnswer sendAnswer();
    void restartGame();
    String getResult();
}
