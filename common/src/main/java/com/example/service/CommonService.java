package com.example.service;

import com.example.dto.RequestDTO;
import com.example.dto.ResponseDTO;

public interface CommonService {

    String getMessage();

    <T extends ResponseDTO> T getMessageFromBody(RequestDTO dto);
}
