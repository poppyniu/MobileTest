package constants;

import org.apache.http.entity.StringEntity;

/**
 * Created by ecovacsqa on 2018/8/23.
 */
public class test {
    public static void main(String[] args) {
        try {
            test();
        } catch (Exception e
                ) {
        }
    }

    public static void test() throws Exception {
        StringEntity inputBody1 = new StringEntity("{\"errors\":\"104\"}");
        JsonUtility.postJsonContent("http://localhost:3000/error", inputBody1);
    }
}
