package com.khomotso.Springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudent(){
        return List.of(
                new Student("jerry",
                        "thulare",
                        LocalDate.of(2019, Month.OCTOBER,27),
                        "jerry@gmail.com",
                        20),
                new Student("katli",
                        "thulare",
                        LocalDate.of(2019, Month.OCTOBER,27),
                        "jerry@gmail.com",
                        14)
        );
    }
}
