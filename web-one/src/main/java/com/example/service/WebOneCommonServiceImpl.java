package com.example.service;

import com.example.dto.RequestDTO;
import com.example.dto.WebOneRequestDTO;
import com.example.dto.WebOneResponseDTO;
import com.example.util.JsonNodeConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WebOneCommonServiceImpl implements CommonService {

    private final JsonNodeConverter<WebOneRequestDTO> converter;

    @Override
    public String getMessage() {
        return "Hello from web-one injected service";
    }

    @Override
    @SuppressWarnings("unchecked")
    public WebOneResponseDTO getMessageFromBody(RequestDTO dto) {
        WebOneRequestDTO converted = converter.convert(dto.getNode(), WebOneRequestDTO.class);
        return new WebOneResponseDTO(converted.getWebOneMessage());
    }

}
