package com.valentine.springboot_heroku.controller;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.valentine.springboot_heroku.dao.EmployeeService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.io.IOException;
import java.util.List;

import static com.valentine.springboot_heroku.controller.ControllerTest.TestUtil.convertObjectToJsonBytes;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(EmployeeController.class)
public class ControllerTest {

    private static final Logger LOGGER = LogManager.getLogger();

    @Autowired
    private EmployeeController employeeController;

    @MockBean
    private EmployeeService employeeService;

    @Autowired
    private MockMvc mockMvc;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.standaloneSetup(employeeController).
            setMessageConverters(new MappingJackson2HttpMessageConverter()).
            build();
    }

    @Test
    public void getEmployee_FromRest() throws Exception {
        LOGGER.debug("test: getEmployee_FromRest() ");

        mockMvc.perform(get("/employees").contentType(MediaType.APPLICATION_JSON_UTF8).
            content( convertObjectToJsonBytes(List.class)).
            accept(MediaType.APPLICATION_JSON_UTF8_VALUE)).
            andDo(print()).andExpect(status().isOk());
        Mockito.verify(employeeService).getEmployees();
    }

    public  static class TestUtil {
          static byte[] convertObjectToJsonBytes(Object object) throws IOException {
            ObjectMapper mapper = new ObjectMapper();
            mapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
            return mapper.writeValueAsBytes(object);
        }
    }

}
