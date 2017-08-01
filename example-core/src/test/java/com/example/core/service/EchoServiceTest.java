package com.example.core.service;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class EchoServiceTest {

	@Test
    public void enableEcho() {
		EchoService service = new EchoService();
		assertThat(service, is(notNullValue()));
    }
}
