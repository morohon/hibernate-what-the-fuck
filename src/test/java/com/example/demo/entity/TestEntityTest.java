package com.example.demo.entity;

import com.example.demo.repository.TestEntityRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.HashSet;
import java.util.Set;

@SpringBootTest
class TestEntityTest {

    @Autowired
    private TestEntityRepository testEntityRepository;

    @Test
    public void testSaveEntity() {

        TestEntity testEntity = new TestEntity();
        Set<TestEntity> set = new HashSet<>();

        set.add(testEntity);
        testEntityRepository.save(testEntity);

        Assert.isTrue(set.contains(testEntity), "Entity not found in the set");

    }

}