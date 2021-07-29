import java.util.ArrayList;
import java.util.List;

public class BookImpl {

    private BooksService bk;

    public BookImpl(BooksService bk) {
        this.bk = bk;
    }

    public List<String> retrievebooks(String user){

        List<String> filtered = new ArrayList<String>();
        List<String> books = bk.retrievebooks(user);

        for(String bks:books){
            if(bks.contains("Java")){
                filtered.add(bks);

            }


        }


        return filtered;



    }


    public void deletebooks(String user){

        List<String> books = bk.retrievebooks(user);

        for(String bks:books) {
            if (!bks.contains("Java")) {
                bk.deletebooks(bks);

            }

        }
    }

}

