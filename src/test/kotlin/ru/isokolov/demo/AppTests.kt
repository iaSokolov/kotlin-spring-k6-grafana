package ru.isokolov.demo

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import ru.isokolov.demo.controller.LoadedController

@SpringBootTest
@WebMvcTest(LoadedController::class)
class AppTests {

    @Autowired
    private lateinit var mvc: MockMvc

    @Test
    fun contextLoads() {

    }

    @Test
    fun `get() return 200 status`() {
        mvc.perform(get("/")).andExpect(status().isOk())
    }
}
