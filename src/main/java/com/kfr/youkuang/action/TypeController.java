package com.kfr.youkuang.action;

import com.kfr.youkuang.entity.Type;
import com.kfr.youkuang.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TypeController {
    private TypeService typeService;

    @Autowired
    public TypeController(TypeService typeService) {
        this.typeService = typeService;
    }

    @GetMapping("/recordTypes")
    public Type selecttypeByID(final int tID) {
        return typeService.selecttypeByID(tID);
    }

    @GetMapping("/recordTypes")
    public Type selecttypeByName(final String typename) {
        return typeService.selecttypeByName(typename);
    }

    @GetMapping("/recordTypes")
    public List<Type> getAlltype() {
        return typeService.getAlltype();
    }

}
