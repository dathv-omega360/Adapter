package com.dat.controller;

import com.dat.load.TransRequest;
import com.dat.utill.ConvertAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/convert")
public class ConvertController {
    @Autowired
    ConvertAdapter convertAdapter;

    @PostMapping(value = "/convert-data")
    ResponseEntity<Object> convert(@RequestBody TransRequest transRequest) throws Exception {
        return ResponseEntity.ok().body(
                convertAdapter.convert(transRequest.getData(), transRequest.getFrom(), transRequest.getTo())
        );
    }
}
