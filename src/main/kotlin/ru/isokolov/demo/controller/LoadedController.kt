package ru.isokolov.demo.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import ru.isokolov.demo.model.Country

@RestController
class LoadedController {
    val list = mutableListOf<Country>()

    @GetMapping("/set")
    fun set(@RequestParam size: Long): String {
        for (i in 1..size) {
            list.add(
                Country(
                    code = "RU",
                    name = "Russia",
                    size = 1000
                )
            )
        }

        return "done"
    }

    @GetMapping("/get")
    fun get(): List<Country> {
        val ret = list.toList()

        list.clear()

        return ret
    }
}