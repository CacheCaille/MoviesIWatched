package com.moviesiwatched.Initializer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;
import static org.mockito.BDDMockito.willThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
class BootstrapTest {

    private Bootstrap bootstrap;

    @Mock
    private InitializationService initializationService;


    @BeforeEach
    void setUp() {
        bootstrap = new Bootstrap(initializationService);

    }

    @Test
    public void testInitMethodInvokeInitializationService() {
        // given a non null boostrap
        assertNotNull(bootstrap);

        // When init is triggered
        bootstrap.init();

        // Then the initialization of movies is triggered on the initialization service
        verify(initializationService).initMovies();
    }

    @Test
    public void testWillThrowRuntimeException() {
        // given bootstrap and initialization throwing an exception
        willThrow(RuntimeException.class).given(initializationService).initMovies();
        // When the init is triggered
        bootstrap.init();
        // Then no exception is thrown (due to the catch in the method)
    }
}