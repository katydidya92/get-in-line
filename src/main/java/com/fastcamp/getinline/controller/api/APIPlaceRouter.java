package com.fastcamp.getinline.controller.api;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

import java.util.List;

import static org.springframework.web.servlet.function.RouterFunctions.route;

//@Configuration
public class APIPlaceRouter {

    // 함수형으로 만든 방식
//    @Bean
    public RouterFunction<ServerResponse> placeRouter() {
        return route()
                .GET("/api/places", req -> ServerResponse.ok().body(List.of("place1", "place2")))
                .POST("/api/places", req -> ServerResponse.ok().body(true))
                .GET("/api/places/{placeId}", req -> ServerResponse.ok().body("place" + req.pathVariable("placeId")))
                .PUT("/api/places/{placeId}", req -> ServerResponse.ok().body(true))
                .GET("/api/places", req -> ServerResponse.ok().body(true))
                .build();
    }
}
