package org.crazymages;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Teacher {
    public Set<String> group;
    public String name;
    public String teacherClass;

    static class TeacherServiceTest {

        @Test
        public void test() {
            //given
            TeacherService teacherService = new TeacherService();
            Teacher excepted = new Teacher();
            excepted.group = Set.of("43e");
            excepted.name = "Даниил";
            excepted.teacherClass = "java";

            //when
            Teacher daniil = teacherService.createTeacherDaniil();

            //then
            Assertions.assertEquals(excepted, daniil);

            Assertions.assertEquals(excepted.group, daniil.group);
            Assertions.assertEquals(excepted.name, daniil.name);
            Assertions.assertEquals(excepted.teacherClass, daniil.teacherClass);

        }

    }
}
