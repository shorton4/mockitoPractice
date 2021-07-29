import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class Listest {

    @Mock
    List l;


    @Test
    public void listsize(){

        when(l.size()).thenReturn(2);
        assertEquals(2,l.size());

    }

    @Test
    public void listsizemul(){

        when(l.size()).thenReturn(2).thenReturn(3);
        assertEquals(2,l.size());
        assertEquals(3,l.size());

    }

    @Test
    public void listsizeget(){
        when(l.get(0)).thenReturn("Hey");
        assertEquals("Hey",l.get(0));
        assertEquals(null,l.get(1));

    }


    @Test
    public void listsizeget2(){
        //argument matchers
        when(l.get(anyInt())).thenReturn("Hey");
        assertEquals("Hey",l.get(0));

    }


    @Test
    public void listsizeget3(){
        //runtime exception
        when(l.get(anyInt())).thenThrow(new RuntimeException("Something"));

        Assertions.assertThrows(RuntimeException.class, () -> {
            l.get(0);
        });





    }



}


