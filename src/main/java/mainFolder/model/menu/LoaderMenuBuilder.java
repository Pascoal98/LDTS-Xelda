package mainFolder.model.menu;

import java.io.IOException;
import java.net.URL;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class LoaderMenuBuilder extends MenuBuilder{

    private final List<String> lines = new ArrayList<>();

    public LoaderMenuBuilder() throws IOException{
        URL resource = LoaderMenuBuilder.class.getResource("/Menus/MainMenu");
    }
}
