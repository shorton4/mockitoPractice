import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookImplTest {

    @org.junit.jupiter.api.Test
    void retrievebooks() {
        BookStub bb = new BookStub();
        BookImpl bk = new BookImpl(bb);

        List<String> fl= bk.retrievebooks("Dummy");

        assertEquals(2,fl.size());










    }
}
