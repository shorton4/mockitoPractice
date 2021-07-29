import java.util.Arrays;
import java.util.List;

public class BookStub implements BooksService{
    @Override
    public List<String> retrievebooks(String user) {
        return Arrays.asList("PHP","Java for Dummies","Java for Experts","HTML");
    }

    @Override
    public void deletebooks(String book) {

    }
    //return a dummy data




}

