package mainFolder.model.menu;

import mainFolder.model.Position;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class LoaderMenuBuilder extends MenuBuilder{

    private final List<String> lines = new ArrayList<>();

    public LoaderMenuBuilder() throws IOException{
        URL resource = LoaderMenuBuilder.class.getResource("/Menus/MainMenu");
        assert resource != null;
        BufferedReader br = new BufferedReader(new FileReader(resource.getFile()));
        for ( String line;(line= br.readLine())!= null;)
            lines.add(line);
    }
    public List<Position> createWhite() {
        List<Position> White = new ArrayList<>();
        for (int y = 0; y< lines.size();y++){
            String line = lines.get(y);
            for(int x = 0; x<line.length();x++){
                if (line.charAt(x) == '@')
                    White.add(new Position(x,y));
            }
        }
        return White;
    }
    public List<Position> createBlue() {
        List<Position> Blue = new ArrayList<>();
        for (int y = 0; y< lines.size();y++){
            String line = lines.get(y);
            for(int x = 0; x<line.length();x++){
                if (line.charAt(x) == '$')
                    Blue.add(new Position(x,y));
            }
        }
        return Blue;
    }
    public List<Position> createGreen() {
        List<Position> Green = new ArrayList<>();
        for (int y = 0; y< lines.size();y++){
            String line = lines.get(y);
            for(int x = 0; x<line.length();x++){
                if (line.charAt(x) == '-')
                    Green.add(new Position(x,y));
            }
        }
        return Green;
    }
    public List<Position> createBrown() {
        List<Position> Brown = new ArrayList<>();
        for (int y = 0; y< lines.size();y++){
            String line = lines.get(y);
            for(int x = 0; x<line.length();x++){
                if (line.charAt(x) == '#')
                    Brown.add(new Position(x,y));
            }
        }
        return Brown;
    }
    public List<Position> createBorder() {
        List<Position> Border = new ArrayList<>();
        for (int y = 0; y< lines.size();y++){
            String line = lines.get(y);
            for(int x = 0; x<line.length();x++){
                if (line.charAt(x) == '*')
                    Border.add(new Position(x,y));
            }
        }
        return Border;
    }


    public List<Position> createYellow() {
        List<Position> Yellow = new ArrayList<>();
        for (int y = 0; y< lines.size();y++){
            String line = lines.get(y);
            for(int x = 0; x<line.length();x++){
                if (line.charAt(x) == '?')
                    Yellow.add(new Position(x,y));
            }
        }
        return Yellow;
    }
}
