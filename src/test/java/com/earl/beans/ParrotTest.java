/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.earl.beans;

import com.earl.config.ProjectConfig;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 *
 * @author earltstephens
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { ProjectConfig.class } )
public class ParrotTest {

    @Autowired
    private ApplicationContext context;

    @Test
    public void testKoKoIsInTheContext() {
        Parrot parrot = context.getBean(Parrot.class);
        
        assertEquals("Koko", parrot.getName());
    }
    
}
