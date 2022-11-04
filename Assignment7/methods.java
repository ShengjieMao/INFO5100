import java.io.*;

public class methods {

    /*
     * function for reading file
     */
    public static String readIn(String path) {
        String res = null;
        StringBuilder sb = new StringBuilder();
        try{
            File file = new File(path);
            InputStreamReader br = new InputStreamReader(new FileInputStream(file));
            BufferedReader reader = new BufferedReader(br);
            String str;
            int i = 0;
            while ((str = reader.readLine()) != null && i < 6){
                sb.append(str + "\n");
                i += 1;
            }
            res = sb.toString();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return res;
    }

    /*
     * function for writing the input file to another
     */
    public static String writeIn(String strName, String content) {
        String path = "/Users/shengjiemao/Desktop/readFile/src/";
        String contentPath = "/Users/shengjiemao/Desktop/readFile/src/" + content;
        File file;
        String writer;
        StringBuilder sb;
        try {
            /*
             * create new file
             */
            file = new File(path + strName);
            file.createNewFile();

            /*
             * update the content from file input to new file
             */
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            InputStreamReader br = new InputStreamReader(new FileInputStream(contentPath));
            BufferedReader reader = new BufferedReader(br);

            InputStreamReader br2 = new InputStreamReader(new FileInputStream(file));
            BufferedReader reader2 = new BufferedReader(br);
            sb = new StringBuilder();

            int i = 0;
            while ((writer = reader.readLine()) != null) {
                String[] sep = writer.split(",");
                bw.append(sep[0] + "," + sep[1] + "," + sep[2] + "\n");

                /*
                 * store the updated first five lines
                 */
                if (i < 6) {
                    sb.append(sep[0] + "," + sep[1] + "," + sep[2] + "\n");
                    i++;
                }
            }
            writer = sb.toString();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return writer;
    }
}
