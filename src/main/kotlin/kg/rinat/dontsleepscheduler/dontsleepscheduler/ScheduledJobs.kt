package kg.rinat.dontsleepscheduler.dontsleepscheduler

import org.springframework.scheduling.annotation.EnableScheduling
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate

@EnableScheduling
@Component
class ScheduledJobs {
    @Scheduled(fixedDelay = 15 * 60 * 1000)
    fun scheduleSubscriptionTypeChangingJob() {
        val restTemplate = RestTemplate()
        restTemplate.getForObject("https://rinats-translator-bot.herokuapp.com/dont-sleep", String::class.java)
        println("Запрос отправлен на rinats_translator_bot")
        restTemplate.getForObject("http://app-for-joy.herokuapp.com/", String::class.java)
        println("Запрос отправлен на app-for-joy")
    }
}