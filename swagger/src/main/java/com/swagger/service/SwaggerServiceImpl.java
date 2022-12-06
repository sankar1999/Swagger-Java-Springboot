package com.swagger.service;

import com.swagger.model.SwaggerModel;
import org.springframework.stereotype.Service;

@Service
public class SwaggerServiceImpl implements SwaggerService {
    @Override
    public SwaggerModel saveData(SwaggerModel swaggerModel) {
        return swaggerModel;
    }
}
