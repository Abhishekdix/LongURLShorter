package com.UrlShorter.URLShorterApplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.UrlShorter.URLShorterApplication.constants.EndPoints.SHORTER_URL;

@RestController
public class URLShorter {

    @RequestMapping(SHORTER_URL)
    public String shortenURL(){
        return "";
    }


}
