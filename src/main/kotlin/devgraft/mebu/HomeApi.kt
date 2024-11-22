package devgraft.mebu

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
internal class HomeApi {

    @GetMapping("api/home")
    fun home(): String {
        return "Welcome to MenuMate"
    }
}
