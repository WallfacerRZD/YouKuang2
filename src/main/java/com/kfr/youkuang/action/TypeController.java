package com.kfr.youkuang.action;

import com.kfr.youkuang.entity.Type;
import com.kfr.youkuang.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TypeController {
    private TypeService typeService;

    @Autowired
    public TypeController(TypeService typeService) {
        this.typeService = typeService;
    }

    @GetMapping("/selecttype")
    public Type selecttype(final String typename) {
        return typeService.selecttype(typename);
    }

}
