package kg.rinat.dontsleepscheduler.dontsleepscheduler

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MainController {
    @GetMapping("/dont-sleep")
    fun dontSleep(): String {
        return "i am not sleeping"
    }
}