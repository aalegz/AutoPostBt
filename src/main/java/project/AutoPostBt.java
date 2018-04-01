package project;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AutoPostBt {
    public static void main(String[] args) {
        /*XMLFeedParser xmlFeedVovo = new XMLFeedParser("https://www.anekdot.ru/rss/tag/2.xml");
        xmlFeedVovo.xmlParse();
        XMLFeedParser xmlFeedBlond = new XMLFeedParser("https://www.anekdot.ru/rss/tag/23.xml");
        xmlFeedBlond.xmlParse();*/
        DBWorker dbWorker = new DBWorker();
        Statement statement;

        String query = "SELECT * FROM content";

        try {
            statement = dbWorker.getConnection().createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String des = resultSet.getString("description");
                String ttle = resultSet.getString("title");
                Content content = new Content(id, des, ttle);
                System.out.println(content);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
