package com.example.service;

import com.example.dto.RequestDTO;
import com.example.dto.WebTwoRequestDTO;
import com.example.dto.WebTwoResponseDTO;
import com.example.util.JsonNodeConverter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class WebTwoCommonServiceImpl implements CommonService {

    private final JsonNodeConverter<WebTwoRequestDTO> converter;

    @Override
    public String getMessage() {
        return "Hello from web-two injected service";
    }

    @Override
    @SuppressWarnings("unchecked")
    public WebTwoResponseDTO getMessageFromBody(RequestDTO dto) {
        WebTwoRequestDTO converted = converter.convert(dto.getNode(), WebTwoRequestDTO.class);
        return new WebTwoResponseDTO(converted.getWebTwoMessage());
    }
}
