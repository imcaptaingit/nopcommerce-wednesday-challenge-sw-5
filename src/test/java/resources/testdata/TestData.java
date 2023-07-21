package resources.testdata;

import org.testng.annotations.DataProvider;

/**
 * Created by Jay
 */

public class TestData {
    @DataProvider(name = "Job Search")
    public Object [] [] getData(){
        Object [] [] data = new Object[][]{
                {"Tester","Harrow on the Hill, Greater London","5 miles","30000","50000","Per annum","Permanent","Permanent Tester jobs in Harrow on the Hill"},
                {"Software","Pitsea, Essex","15 miles","35000","55000","Per annum","Permanent","Permanent Software jobs in Pitsea"},
                {"Manager","Ilford, Greater London","2 miles","35000","55000","Per annum","Permanent","Permanent Manager jobs in Ilford"},
                {"Bookkeeper","Bishops Hatfield, Hertfordshire","10 miles","35000","55000","Per annum","Permanent","Permanent Bookkeeper jobs in Hatfield"},
                {"Sales Manager","Lincoln, Lincolnshire","15 miles","35000","55000","Per annum","Permanent","Permanent Sales Manager jobs in Lincoln"},
                {"Software Developer","Kingswood, South Gloucestershire","100 miles","35000","55000","Per annum","Permanent","Permanent Software Developer jobs in Kingswood"},
        };
        return data;
        }

}
