import java.util.List;

public interface BooksService {

    public List<String> retrievebooks(String user);

    public void deletebooks(String book);


}
