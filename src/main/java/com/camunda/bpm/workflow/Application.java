package com.camunda.bpm.workflow;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication
@EnableProcessApplication
@CrossOrigin(origins ="*")
        public class Application {

  public static void main(String... args) {

    SpringApplication.run(Application.class, args);

    System.out.println("===================================================================================================================");
    System.out.println("===================================================================================================================");
    System.out.println("===================================================================================================================\n\n");

    System.out.println(" ____                                 _         ____  _       _    __                      \n" +
            "/ ___| __ _ _ __ ___  _   _ _ __   __| | __ _  |  _ \\| | __ _| |_ / _| ___  _ __ _ __ ___  \n" +
            "| |   / _` | '_ ` _ \\| | | | '_ \\ / _` |/ _` | | |_) | |/ _` | __| |_ / _ \\| '__| '_ ` _ \\ \n" +
            "| |__| (_| | | | | | | |_| | | | | (_| | (_| | |  __/| | (_| | |_|  _| (_) | |  | | | | | |\n" +
            "\\____/\\__,_|_| |_| |_|\\__,_|_| |_|\\__,_|\\__,_| |_|   |_|\\__,_|\\__|_|  \\___/|_|  |_| |_| |_|\n");


    System.out.println("\n\n===================================================================================================================");
    System.out.println("===================================================================================================================");
    System.out.println("===================================================================================================================\nthe server is started\n");




  }

}