package com.example.web.person;

import java.text.DateFormat;
import java.text.SimpleDateFormat;


import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
@Component
public class PersonInit implements ApplicationRunner {
    private PersonRepository personRepository;
    private static final DateFormat df = new SimpleDateFormat("yyyy-MM-dd");


    public PersonInit(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    @Override
    public void run(ApplicationArguments args) throws Exception {
        long count = personRepository.count();
        if (count == 0) {
            Person person = null;
            String[][] mtx = {{ "hong", "1", "홍길동", "1980-01-01" },
                                { "kim", "1", "김유신", "1980-01-05" },
                                { "park", "1", "박지성", "1983-11-15" },
                                { "you", "1", "유관순", "1930-11-15" }};
            for (String[] arr : mtx) {


                person = new Person();
                person.setUserid(arr[0]);
                person.setPasswd(arr[1]);
                person.setName(arr[2]);
                person.setBirthday(df.parse(arr[3]));
                personRepository.save(person);


            }
            
        }
    }


}
