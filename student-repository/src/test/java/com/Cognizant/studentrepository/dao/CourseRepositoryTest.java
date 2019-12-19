package com.Cognizant.studentrepository.dao;

import com.Cognizant.studentrepository.models.Course;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CourseRepositoryTest {
    @Autowired
    CourseRepository repository;
    @Before
    public void setUp() throws Exception {
        repository.deleteAll();
    }
    @Test
    public void ShouldAddGetGetAllDeleteRoom() {
        //arrange
        Course course = new Course(100,"Algebra", 98);
        //act
        course = repository.save(course);

        assertEquals(course.toString(),repository.getOne(course.getId()).toString());
        repository.deleteById(course.getId());
        assertEquals(0, repository.findAll().size());
    }
//    @Test
//    public void shouldUpdate(){
//        Room room = new Room(200, "Roxana");
//        room = repository.save(room);
//        room.setNumber(400);
//        repository.save(room);
//        assertEquals(room, repository.getOne(room.getId()));
//    }
}
