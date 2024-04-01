public class Exam {
    public static void main(String[] args) {
        String XX = "127.0.0.1 - frank [10/Oct/2000:13:55:36 -0700] \"GET /apache_pb.gif HTTP/1.0\" 200 2326 \"http://www.example.com/start.html\" \"Mozilla/4.08 [en] (Win98; I ;Nav)\"";
        System.out.println(XX.indexOf(" "));
        System.out.println(XX.substring(0, XX.indexOf(" ")));
        System.out.println(XX.indexOf("-"));
        int a = XX.indexOf("\"");
        int b = XX.indexOf(" /", a);
        System.out.println(XX.substring(a + 1, b));
    }
}