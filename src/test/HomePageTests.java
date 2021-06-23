package com.treinando_java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class HomePageTests {
    
        @Test
        public void testSomarIdadesCachorros() {
            
            int somaIdadeCachorros = Cachorro.totalIdadeCachorro();
            assertThat(quantidadeCachorros, is(16));

        }
    }
    
