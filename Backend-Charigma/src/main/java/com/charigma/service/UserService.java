package com.charigma.service;

import com.charigma.model.Charade;
import com.charigma.model.UserAnswer;

public interface UserService {
    UserAnswer verifyAnswer();
    void restartGame();
    String getResult();
    String getClue();
}
