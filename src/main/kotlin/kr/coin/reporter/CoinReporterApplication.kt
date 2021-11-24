package kr.coin.reporter

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
class CoinReporterApplication

fun main(args: Array<String>) {
    runApplication<CoinReporterApplication>(*args)
}
