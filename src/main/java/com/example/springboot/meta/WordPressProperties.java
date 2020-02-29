package com.example.springboot.meta;

import com.example.springboot.vos.Server;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@ConfigurationProperties("wordpress")

public class WordPressProperties {

    private List<Server> servers = new ArrayList<>();

    //... getters and setters, toString()
}
