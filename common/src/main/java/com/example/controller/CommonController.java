package com.example.controller;

import com.example.dto.RequestDTO;
import com.example.dto.ResponseDTO;
import com.example.service.CommonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {

    private final CommonService commonService;

    public CommonController(CommonService commonService) {
        this.commonService = commonService;
    }

    @GetMapping("/message")
    public String getMessage() {
        return commonService.getMessage();
    }

    @PostMapping
    public ResponseEntity<? extends ResponseDTO> getMessageFromBody(@RequestBody RequestDTO dto) {
        return ResponseEntity.ok(commonService.getMessageFromBody(dto));
    }
}
