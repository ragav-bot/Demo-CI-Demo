package com.example.SampleConsumer.controller;

        import com.example.SampleConsumer.service.NumberTypeCheckService;
        import org.junit.Before;
        import org.junit.Test;
        import org.junit.runner.RunWith;
        import org.mockito.InjectMocks;
        import org.mockito.Mock;
        import org.mockito.Mockito;
        import org.mockito.MockitoAnnotations;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
        import org.springframework.boot.test.context.SpringBootTest;
        import org.springframework.test.context.junit4.SpringRunner;
        import org.springframework.test.web.servlet.MockMvc;
        import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
        import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
        import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class NumberTypeCheckerControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Mock
    private NumberTypeCheckService numberTypeCheckService;

    @InjectMocks
    private NumberTypeCheckerController numberTypeCheckerController;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
        this.mockMvc = MockMvcBuilders.standaloneSetup(numberTypeCheckerController).build();
    }


    @Test
    public void shouldReturnResponseAsEvenForPathParam() throws Exception {
        Mockito.when(numberTypeCheckService.checkNumberType(2)).thenReturn("Even");
        this.mockMvc.perform(MockMvcRequestBuilders.post("/validate/numberType/2")).andExpect(MockMvcResultMatchers.status().isOk()).andExpect(MockMvcResultMatchers.content().string("Even"));
    }

    @Test
    public void shouldReturnResponseAsOddForPathParam() throws Exception {
        Mockito.when(numberTypeCheckService.checkNumberType(1)).thenReturn("Odd");
        this.mockMvc.perform(MockMvcRequestBuilders.post("/validate/numberType/1")).andExpect(MockMvcResultMatchers.status().isOk()).andExpect(MockMvcResultMatchers.content().string("Odd"));
    }

    @Test
    public void shouldReturnResponseAsEvenForQueryParam() throws Exception {
        Mockito.when(numberTypeCheckService.checkNumberType(2)).thenReturn("Even");
        this.mockMvc.perform(MockMvcRequestBuilders.post("/validate/numberType").param("number","2")).andExpect(MockMvcResultMatchers.status().isOk()).andExpect(MockMvcResultMatchers.content().string("Even"));
    }

    @Test
    public void shouldReturnResponseAsOddForQueryParam() throws Exception {
        Mockito.when(numberTypeCheckService.checkNumberType(1)).thenReturn("Odd");
        this.mockMvc.perform(MockMvcRequestBuilders.post("/validate/numberType").param("number","1")).andExpect(MockMvcResultMatchers.status().isOk()).andExpect(MockMvcResultMatchers.content().string("Odd"));
    }

    @Test
    public void shouldReturnResponseBadRequestForQueryParam() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.post("/validate/numberType").param("number","abc")).andExpect(MockMvcResultMatchers.status().isBadRequest());
    }

    @Test
    public void shouldReturnResponseBadRequestForPathParam() throws Exception {
        this.mockMvc.perform(MockMvcRequestBuilders.post("/validate/numberType/abc")).andExpect(MockMvcResultMatchers.status().isBadRequest());
    }


}
