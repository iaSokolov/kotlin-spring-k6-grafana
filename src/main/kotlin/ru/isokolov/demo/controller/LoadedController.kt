package ru.isokolov.demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class LoadedController {
    @GetMapping
    fun get(): String {
        return "done"
    }
}